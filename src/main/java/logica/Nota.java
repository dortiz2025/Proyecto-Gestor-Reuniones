package logica;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Clase que representa una nota que se puede tomar en una reunión.
 */
public class Nota {
    private String contenido;
    private Instant horaNota;

    /**
     * Crea una nueva nota acerca de la reunión.
     *
     * @param contenido Contenido de la nota.
     */
    public Nota(String contenido, Instant horaNota) {
        this.contenido = contenido;
        this.horaNota = horaNota;
    }

    /**
     * Getter de contenido.
     *
     * @return Contenido de la nota.
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Setter de contenido.
     * En caso de querer modificar anotaciones.
     *
     * @param contenido Nuevo contenido de la nota.
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Getter de horaNota.
     *
     * @return Hora en la que se escribió la nota.
     */
    public Instant getHoraNota() {
        return horaNota;
    }

    /**
     * Setter de nota.
     *
     * @param horaNota Nueva hora en la que se escribió la nota.
     */
    public void setHoraNota(Instant horaNota) {
        this.horaNota = horaNota;
    }

    /**
     * Entrega información representativa de la nota.
     *
     * @return Información de la nota.
     */
    @Override
    public String toString() {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        String horaNotaF = //Formato amigable
                formatter.format(this.horaNota);
        return "Nota {\n" +
                "  Contenido: '" + this.contenido + "',\n" +
                "  HoraNota: '" + horaNotaF + "'\n" +
                "}";
    }
}