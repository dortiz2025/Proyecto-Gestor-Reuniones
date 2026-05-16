package logica;

import enumeraciones.*;
import informe.Informe;

import java.time.Duration;  //Duración (con instantes)
import java.time.Instant;   //Instantes exactos
import java.time.LocalDate; //Fecha simple
import java.time.LocalTime; //Hora simple
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una reunión con su respectiva información.
 */
public abstract class Reunion {
    private TipoReunion tipoReunion;
    private LocalDate fecha;
    private LocalTime horaPrevista;
    private Duration duracionPrevista;
    private Empleado organizador;

    private Instant horaInicio;
    private Instant horaFin;

    private List<Invitacion> invitaciones;
    private List<Asistencia> asistencias;
    private List<Nota> notas;

    /**
     * Se crea una Reunion.
     * @param tipoReunion Tipo de reunión.
     * @param fecha Fecha agendada de la reunión.
     * @param horaPrevista Hora de inicio prevista.
     * @param duracionPrevista Duración prevista de la reunión
     * @param organizador Organizador de la reunión (debe ser un empleado).
     */
    public Reunion(TipoReunion tipoReunion, LocalDate fecha, LocalTime horaPrevista, Duration duracionPrevista, Empleado organizador) {
        this.tipoReunion = tipoReunion;
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.organizador = organizador;

        this.horaInicio = null;
        this.horaFin = null;

        this.invitaciones = new ArrayList<>();
        this.asistencias = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    /**
     * Getter de tipoReunion.
     * @return Tipo de reunión.
     */
    public TipoReunion getTipoReunion() {
        return tipoReunion;
    }

    /**
     * Getter de fecha.
     * @return Fecha de la reunión.
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Getter de horaPrevista.
     * @return Hora prevista de la reunión.
     */
    public LocalTime getHoraPrevista() {
        return horaPrevista;
    }

    /**
     * Getter de duracionPrevista.
     * @return Duración prevista de la reunión.
     */
    public Duration getDuracionPrevista() {
        return duracionPrevista;
    }

    /**
     * Getter de organizador.
     * @return Organizador de la reunión.
     */
    public Empleado getOrganizador() {
        return organizador;
    }

    /**
     * Getter de horaInicio.
     * @return Hora real de inicio de la reunión.
     */
    public Instant getHoraInicio() {
        return horaInicio;
    }

    /**
     * Getter de horaFin.
     * @return Hora en la que terminó la reunión.
     */
    public Instant getHoraFin() {
        return horaFin;
    }

    /**
     * Invita a una entidad a la reunión.
     * La invitación se registra en la lista de invitaciones.
     * @param invitado Entidad que será invitada.
     */
    public void invitarParticipante(Invitable invitado) {
        Instant horaDeEnvio = Instant.now(); //Instante en que se está enviando
        Invitacion nuevaInvitacion = new Invitacion(horaDeEnvio, invitado); //Se crea la invitación
        this.invitaciones.add(nuevaInvitacion); //Se guarda en la lista de invitaciones para tener registro
        invitado.invitar(); //Se invita a la entidad
    }

    /**
     * Getter de invitaciones.
     * @return Entrega la lista de invitaciones.
     */
    public List<Invitacion> getInvitaciones() {
        return this.invitaciones;
    }

    /**
     * Registra la asistencia de una persona a la reunión.
     * @param asistente Persona que asiste a la reunión.
     * @param horaLlegada Hora en la que llega el asistente.
     */
    public void addAsistencia(Persona asistente, Instant horaLlegada){
        if (this.horaInicio == null || horaLlegada.compareTo(this.horaInicio) <= 0) {
            asistencias.add(new Asistencia(asistente));
        }
        else asistencias.add(new Retraso(asistente, horaLlegada));
    }

    /**
     * Getter de asistencias.
     * @return Entrega la lista de asistencias.
     */
    public List<Asistencia> getAsistencias() {
        return asistencias;
    }

    /**
     * Getter de retrasos (También es Asistencia)
     * Se obtiene de la lista de asistencias.
     * @return Entrega una lista de asistentes atrasados.
     */
    public List<Retraso> obtenerRetrasos() {
        List<Retraso> retrasos = new ArrayList<>();
        for (Asistencia asistencia : this.asistencias){
            if(asistencia instanceof Retraso) retrasos.add((Retraso) asistencia);
        }
        return retrasos;
    }

    /**
     * Entrega la cantidad total de asistencia a la reunión.
     * @return Cantidad total de asistencia a la reunion.
     */
    public int obtenerTotalAsistencia() {
        return this.asistencias.size();
    }

    /**
     * Entrega una lista de ausentes
     * a una reunión (previamente invitados).
     * @return Lista de ausentes.
     */
    public List<Persona> getAusencias(){
        List<Persona> ausencias = new ArrayList<>();
        List<Persona> personasInvitadas = new ArrayList<>();

      //Se añaden todas las personas invitadas sin repetir.
        for (Invitacion invitacion : this.invitaciones) {
            Invitable invitado = invitacion.getInvitado();

            if (invitado instanceof Persona persona) {
                if (!personasInvitadas.contains(persona)) {
                    personasInvitadas.add(persona);
                }
            } else if (invitado instanceof Departamento departamento) {
                for (Empleado empleadoInvitado : departamento.getEmpleados()) {
                    if (!personasInvitadas.contains(empleadoInvitado)) {
                        personasInvitadas.add(empleadoInvitado);
                    }
                }
            }
        }//Ahora se añaden a ausencias los que no asistieron.
        for (Persona personaInvitada : personasInvitadas){
            boolean asistio = false;
            //Buscamos si el invitado asistio.
            for (Asistencia asistencia : this.asistencias) {
                Persona asistente = (Persona) asistencia.getAsistente();
                if (asistente.equals(personaInvitada)){
                    asistio = true;
                    break; //Se encontró, dejamos de buscar.
                }
            }//Si no estaba, es ausencia.
            if(!asistio){
                ausencias.add(personaInvitada);
            }
        }

        return ausencias; //Lista de personas ausentes.
    }

    /**
     * Entrega el porcentaje de asistencia de la reunión.
     * @return Porcentaje de asistencia (en decimal).
     */
    public float obtenerPorcentajeAsistencia() {
        int totalInvitados = this.asistencias.size() + this.getAusencias().size();
        return (float) this.asistencias.size() / totalInvitados; //Porcentaje en decimal.
    }

    /**
     * Añade una nota a la reunión.
     * @param nota Nueva nota sobre la reunión.
     */
    public void addNota(Nota nota){
        this.notas.add(nota);
    }

    /**
     * Getter de notas.
     * @return Lista de notas de la reunión.
     */
    public List<Nota> getNotas() {
        return notas;
    }

    /**
     * Inicia la reunión.
     * @param horaInicio Hora en la que inició la reunión.
     */
    public void iniciar(Instant horaInicio){
        if (this.horaInicio == null) {
            System.out.println("Iniciando Reunion");
            this.horaInicio = horaInicio;
        }
    }

    /**
     * Finaliza la reunión.
     * @param horaFin Hora en la que finalizó la reunión.
     */
    public void finalizar(Instant horaFin){
        if (this.horaFin == null) {
            System.out.println("Finalizando Reunion");
            this.horaFin = horaFin;
        }
        //AQUÍ SE DEBE GENERAR EL INFORME.
        Informe creadorInforme = new Informe();
        creadorInforme.crearInforme(this);
    }

    /**
     * Entrega la duración real de la reunión.
     * @return Duración de la reunión en minutos.
     */
    public float calcularTiempoReal() {
        Duration duracionReal = Duration.between(this.horaInicio, this.horaFin);
        return (float) duracionReal.toMinutes(); //Duración en minutos.
    }

    /**
     * Entrega información representativa de la reunión.
     *
     * @return Información de la reunión.
     */
    @Override
    public String toString() {
        return  "tipoReunion: '" + tipoReunion + "'" +
                "fecha: '" + fecha + "'" +
                "horaPrevista: '" + horaPrevista + "'" +
                "duracionPrevista: '" + duracionPrevista + "'" +
                "organizador: '" + organizador + "'";
    }
}