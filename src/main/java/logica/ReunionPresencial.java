package logica;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase que representa una reunión presencial.
 * Hereda de Reunión
 */
public class ReunionPresencial extends Reunion{
    private String sala;

    /**
     * Constructor de ReunionPresencial
     *
     * @param fecha Asigna fecha agendada de la reunión.
     * @param horaPrevista Asigna hora de inicio prevista.
     * @param duracionPrevista Asigna duración prevista de la reunión.
     * @param sala Asigna la sala en la que se realizará la reunión.
     */
    public ReunionPresencial(Date fecha, Instant horaPrevista, Duration duracionPrevista, String sala){
        super(fecha, horaPrevista, duracionPrevista);
        this.sala = sala;
    }
}
