package logica;

import java.time.Instant;

/**
 * Clase que representa la asistencia de una persona a una reunión.
 */
public class Asistencia {
    private Persona asistente;

    /**
     * Crea una asistencia.
     *
     * @param asistente Referencia de la persona asistente.
     */
    public Asistencia(Persona asistente) {
        this.asistente = asistente;
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
     * Entrega información representativa de Asistencia.
     *
     * @return Información de Asistencia.
     */
    @Override
    public String toString() {
        return "Asistencia {\n" +
                "  Asistente: " + this.asistente.toString().replace("\n", "\n  ") + "\n" +
                "}";
    }
}