package logica;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

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
     * Entrega información representativa de Retraso.
     *
     * @return Información acerca del retraso.
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        String horaLlegadaF = //Formato amigable
                formatter.format(this.horaLlegada);
        return "Retraso {\n" +
                "  Asistente: " + super.getAsistente().toString().replace("\n", "\n  ") + ",\n" +
                "  Hora de Llegada: '" + horaLlegadaF + "'\n" +
                "}";
    }
}