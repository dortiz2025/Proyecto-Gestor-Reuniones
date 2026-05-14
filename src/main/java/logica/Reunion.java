package logica;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa una reunión con su respectiva información.
 */
public abstract class Reunion {

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
     * Se crea una Reunion
     *
     * @param fecha Fecha agendada de la reunión.
     * @param horaPrevista Hora de inicio prevista.
     * @param duracionPrevista Duración prevista de la reunión
     * @param organizador Organizador de la reunión (debe ser un empleado).
     */
    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
        this.organizador = organizador;

        this.invitaciones = new ArrayList<>();
        this.asistencias = new ArrayList<>();
        this.notas = new ArrayList<>();
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