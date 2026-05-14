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
     * @param fecha Asigna fecha agendada de la reunión.
     * @param horaPrevista Asigna hora de inicio prevista.
     * @param duracionPrevista Asigna duración prevista de la reunión
     */
    public ReunionVirtual(Date fecha, Instant horaPrevista, Duration duracionPrevista, String enlace){
        super(fecha, horaPrevista, duracionPrevista);
        this.enlace = enlace;
    }
}
