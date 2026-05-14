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
     * Constructor de Reunion
     *
     * @param fecha Asigna fecha agendada de la reunión.
     * @param horaPrevista Asigna hora de inicio prevista.
     * @param duracionPrevista Asigna duración prevista de la reunión
     */
    public Reunion(Date fecha, Instant horaPrevista, Duration duracionPrevista) {
        this.fecha = fecha;
        this.horaPrevista = horaPrevista;
        this.duracionPrevista = duracionPrevista;
    }

}