package logica;

import java.time.Instant;

/**
 * Clase que representa los retrasos de la asistencia a una reunión.
 * Hereda de Asistencia.
 */
public class Retraso extends Asistencia {
    private Instant horaLlegada;

    /**
     * Se crea una asistencia atrasada.
     *
     * @param persona Referencia de la persona.
     * @param horaLlegada Hora a la que llegó.
     */
    public Retraso(Persona persona, Instant horaLlegada) {
        super(persona);
        this.horaLlegada = horaLlegada;
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

    /**
     * Entrega información representativa de Retraso.
     *
     * @return Información acerca del retraso.
     */
    @Override
    public String toString() {
        return "Retraso{" +
                "asistente: '" + super.getAsistente() + "'" +
                ", horaLlegada: '" + horaLlegada + "'" +
                '}';
    }
}