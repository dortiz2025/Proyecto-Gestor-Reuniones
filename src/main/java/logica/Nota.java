package logica;

/**
 * Clase que representa una nota que se puede tomar en una reunión.
 */
public class Nota {
    private String contenido;

    /**
     * Crea una nueva nota acerca de la reunión.
     * @param contenido Contenido de la nota.
     */
    public Nota(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Getter de contenido.
     * @return Contenido de la nota.
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Setter de contenido.
     * En caso de querer modificar anotaciones.
     * @param contenido Nuevo contenido de la nota.
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}