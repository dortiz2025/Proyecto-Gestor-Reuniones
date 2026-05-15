package logica;

import java.time.Instant;

/**
 * Clase que representa la asistencia de una persona a una reunión.
 */
public class Asistencia {
    private Persona asistente;
    private Instant horaLlegada;

    /**
     * Crea una asistencia.
     *
     * @param asistente Referencia de la persona asistente.
     * @param horaLlegada Hora en que la persona llegó a la reunión.
     */
    public Asistencia(Persona asistente, Instant horaLlegada) {
        this.asistente = asistente;
        this.horaLlegada = horaLlegada;
    }

    /**
     * Getter de asistente.
     *
     * @return Referencia de la persona asistente a la reunión.
     */
    public Persona getAsistente() {
        return this.asistente;
    }

    /**
     * Setter de asistente.
     *
     * @param asistente Referencia de la persona que asiste a la reunión.
     */
    public void setAsistente(Persona asistente) {
        this.asistente = asistente;
    }

    /**
     * Getter de horaLlegada.
     *
     * @return Hora de llegada a la reunión.
     */
    public Instant getHoraLlegada() {
        return this.horaLlegada;
    }

    /**
     * Setter de horaLlegada.
     *
     * @param horaLlegada Nueva hora de llegada a la reunión.
     */
    public void setHoraLlegada(Instant horaLlegada) {
        this.horaLlegada = horaLlegada;
    }
}