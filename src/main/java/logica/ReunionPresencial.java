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
     * @param fecha Fecha agendada de la reunión.
     * @param horaPrevista Hora de inicio prevista.
     * @param duracionPrevista Duración prevista de la reunión.
     * @param organizador Organizador de la reunión (debe ser un empleado).
     * @param sala Sala en la que se realizará la reunión.
     */
    public ReunionPresencial(Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador, String sala){
        super(fecha, horaPrevista, duracionPrevista, organizador);
        this.sala = sala;
    }
}
