package logica;

import enumeraciones.TipoReunion;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;

/**
 * Clase que representa una reunión presencial.
 * Hereda de Reunión
 */
public class ReunionPresencial extends Reunion{
    private String sala;

    /**
     * Se crea una Reunion Presencial.
     *
     * @param tipoReunion Tipo de reunión.
     * @param fecha Fecha agendada de la reunión.
     * @param horaPrevista Hora de inicio prevista.
     * @param duracionPrevista Duración prevista de la reunión.
     * @param organizador Organizador de la reunión (debe ser un empleado).
     * @param sala Sala en la que se realizará la reunión.
     */
    public ReunionPresencial(TipoReunion tipoReunion, LocalDate fecha, Instant horaPrevista, Duration duracionPrevista, Empleado organizador, String sala){
        super(tipoReunion, fecha, horaPrevista, duracionPrevista, organizador);
        this.sala = sala;
    }
}
