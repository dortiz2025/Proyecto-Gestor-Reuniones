package logica;

import enumeraciones.*;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa una reunión con su respectiva información.
 */
public abstract class Reunion {
    private TipoReunion tipoReunion;
    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Empleado organizador;

    private Instant horaInicio;
    private Instant horaFin;

    private List<Invitacion> invitaciones;
    private List<Asistencia> asistencias;
    private List<Nota> notas;

    /**
     * Se crea una Reunion.
     *
     * @param tipoReunion Tipo de reunión.
     * @param fecha Fecha agendada de la reunión.
     * @param horaPrevista Hora de inicio prevista.
     * @param duracionPrevista Duración prevista de la reunión
     * @param organizador Organizador de la reunión (debe ser un empleado).
     */
    public Reunion(TipoReunion tipoReunion, Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador) {
        this.tipoReunion = tipoReunion;
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.organizador = organizador;

        this.invitaciones = new ArrayList<>();
        this.asistencias = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

    /**
     * Metodo que invita a una entidad a la reunión.
     * La invitación se registra en la lista de invitaciones.
     *
     * @param invitado La entidad que será invitada.
     */
    public void invitarParticipante(Invitable invitado) {
        //Instante en que se está enviando
        Instant horaDeEnvio = Instant.now();
        //Se crea la invitación
        Invitacion nuevaInvitacion = new Invitacion(horaDeEnvio, invitado);
        //Se guarda en la lista de invitaciones para tener registro
        this.invitaciones.add(nuevaInvitacion);
        //Se invita a la entidad
        invitado.invitar();
    }

    /**
     * Getter de invitaciones.
     *
     * @return Entrega la lista de invitaciones.
     */
    public List obtenerInvitaciones() {
        return this.invitaciones;
    }

    /**
     * Metodo que registra la asistencia de una persona a la reunión.
     * Aquí horaLlegada se compara con horaPrevista y no con horaInicio.
     * En la vida real se debe ser puntual (hora acordada).
     *
     * @param asistente Persona que asiste a la reunión.
     * @param horaLlegada Hora en la que llega el asistente.
     */
    public void addAsistencia(Persona asistente, Instant horaLlegada){
        if (horaLlegada.compareTo(horaPrevista) <= 0 ) {
            asistencias.add(new Asistencia(asistente));
        }
        else {
            asistencias.add(new Retraso(asistente, horaLlegada));
        }
    }

    /**
     * Getter de asistencias.
     *
     * @return Entrega la lista de asistencias.
     */
    public List obtenerAsistencias() {
        return asistencias;
    }

    /**
     * Getter de retrasos (También es Asistencia)
     * Se obtiene de la lista de asistencias.
     *
     * @return Entrega una lista de asistentes atrasados.
     */
    public List obtenerRetrasos() {
        List<Retraso> retrasos = new ArrayList<>();
        for (Asistencia asistencia : asistencias){
            if(asistencia instanceof Retraso){
            retrasos.add((Retraso) asistencia);
            }
        }
        return retrasos;
    }

    public int obtenerTotalAsistencia() {
        return this.asistencias.size();
    }

    public float obtenerPorcentajeAsistencia() {
        return 0;
    }

    public float calcularTiempoReal() {
        return 0;
    }

    public void iniciar(){
        System.out.println("Iniciando Reunion");
        this.horaInicio = Instant.now();
    }

    public void finalizar(){
        System.out.println("Finalizando Reunion");
        this.horaFin = Instant.now();
    }

}