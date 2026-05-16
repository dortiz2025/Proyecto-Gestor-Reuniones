package logica;

import enumeraciones.TipoReunion;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

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
    public ReunionPresencial(TipoReunion tipoReunion, LocalDate fecha, LocalTime horaPrevista, Duration duracionPrevista, Empleado organizador, String sala){
        super(tipoReunion, fecha, horaPrevista, duracionPrevista, organizador);
        this.sala = sala;
    }

    /**
     * Getter de sala.
     *
     * @return Sala en la que se hará la reunión.
     */
    public String getSala() {
        return sala;
    }

    /**
     * Setter de sala.
     *
     * @param sala Nueva sala en la que se hará la reunión.
     */
    public void setSala(String sala) {
        this.sala = sala;
    }

    /**
     * Entrega información representativa de la reunión presencial.
     *
     * @return información de la reunión presencial.
     */
    @Override
    public String toString() {
        return "Reunión Presencial {\n" +
                "  Sala: '" + this.sala + "',\n" +
                super.toString() +
                "}";
    }
}
