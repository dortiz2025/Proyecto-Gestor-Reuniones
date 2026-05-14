package logica;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase que representa una reunión con su respectiva información.
 */
public abstract class Reunion {

    private Date fecha;
    private Instant horaPrevista;
    private Duration duracionPrevista;
    private Empleado organizador;

    /**
     * Hora real en que inició la reunión.
     * Puede ser distinta a horaPrevista.
     */
    private Instant horaInicio;

    /**
     * Hora real en la que se finalizó la reunión.
     */
    private Instant horaFin;

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
    }

}