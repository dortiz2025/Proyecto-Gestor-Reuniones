package logica;

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
     * Setter de asistente.
     *
     * @param asistente Referencia de la persona que asiste a la reunión.
     */
    public void setAsistente(Persona asistente) {
        this.asistente = asistente;
    }
}