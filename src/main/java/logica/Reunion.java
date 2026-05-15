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
     * Genera una invitación para un participante y la añade a la reunión.
     *
     * @param invitado La entidad que será invitada.
     */
    public void invitarParticipante(Invitable invitado) {
        //Caso en que el invitado es un Departamento
        if (invitado instanceof Departamento departamento){
            //Se notifica al departamento en general que ha sido invitado...
            departamento.invitar();
            //Se invita también a cada empleado por separado
            for (Empleado empleado : departamento.getEmpleados()) {
                invitarParticipante(empleado);
            }
        }//Caso en el que el invitado es una Persona (Empleado/InvitadoExterno)
        else {
            //Instante en que se está enviando
            Instant horaDeEnvio = Instant.now();
            //Se crea la invitación
            Invitacion nuevaInvitacion = new Invitacion(horaDeEnvio, invitado);
            //Se guarda en la lista de invitaciones para tener registro
            this.invitaciones.add(nuevaInvitacion);
            //Se invita a la entidad
            invitado.invitar();
        }
    }

    public List obtenerAsistencias() {
        return asistencias;
    }

    public List obtenerInvitaciones() {
        return null;
    }

    public List obtenerRetrasos() {
        return null;
    }
    public int obtenerTotalAsistencia() {
        return 0;
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