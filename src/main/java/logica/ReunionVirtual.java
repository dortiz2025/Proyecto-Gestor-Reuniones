package logica;

import enumeraciones.TipoReunion;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa una reunión virtual.
 * Hereda de Reunion
 */
public class ReunionVirtual extends Reunion{
    private String enlace;

    /**
     * Se crea una Reunion Virtual.
     *
     * @param tipoReunion Tipo de reunión.
     * @param fecha Fecha agendada de la reunión.
     * @param horaPrevista Hora de inicio prevista.
     * @param duracionPrevista Duración prevista de la reunión.
     * @param organizador Organizador de la reunión (debe ser un empleado).
     * @param enlace Enlace de la reunión virtual.
     */
    public ReunionVirtual(TipoReunion tipoReunion, LocalDate fecha, LocalTime horaPrevista, Duration duracionPrevista, Empleado organizador, String enlace){
        super(tipoReunion, fecha, horaPrevista, duracionPrevista, organizador);
        this.enlace = enlace;
    }

    /**
     * Getter de enlace.
     *
     * @return Enlace de la reunión virtual.
     */
    public String getEnlace() {
        return enlace;
    }

    /**
     * Setter de enlace.
     *
     * @param enlace Nuevo enlace de la reunión virtual.
     */
    public void setEnlace(String enlace) {
        this.enlace = enlace;
    }

    /**
     * Entrega información representativa de la reunión virtual.
     *
     * @return información de la reunión virtual.
     */
    @Override
    public String toString() {
        return "ReunionVirtual{" +
                super.toString() +
                ", Enlace: '" + enlace + "'" +
                '}';
    }
}
