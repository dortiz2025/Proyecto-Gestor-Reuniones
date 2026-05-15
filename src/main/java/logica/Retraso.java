package logica;

import java.time.Instant;

/**
 * Clase que representa los retrasos de la asistencia a una reunión.
 * Hereda de Asistencia.
 */
public class Retraso extends Asistencia {

    public Retraso(Persona persona, Instant horaLlegada) {
        super(persona, horaLlegada);
    }
}