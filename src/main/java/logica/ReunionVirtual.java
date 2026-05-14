package logica;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

/**
 * Clase que representa una reunión virtual.
 * Hereda de Reunion
 */
public class ReunionVirtual extends Reunion{
    private String enlace;

    /**
     * Constructor de ReunionVirtual
     *
     * @param fecha Fecha agendada de la reunión.
     * @param horaPrevista Hora de inicio prevista.
     * @param duracionPrevista Duración prevista de la reunión.
     * @param organizador Organizador de la reunión (debe ser un empleado).
     * @param enlace Enlace de la reunión virtual.
     */
    public ReunionVirtual(Date fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador, String enlace){
        super(fecha, horaPrevista, duracionPrevista, organizador);
        this.enlace = enlace;
    }
}
