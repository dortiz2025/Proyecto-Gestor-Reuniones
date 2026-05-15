package logica;

/**
 * Clase que representa a una persona que puede ser invitada a una reunión.
 */
public abstract class Persona implements Invitable{
    private String nombre;
    private String apellidos;
    private String correo;
    /**
     * Constructor de Persona.
     *
     * @param nombre Asigna el nombre de la persona.
     * @param apellidos Asigna los apellidos de la persona.
     * @param correo Asigna el correo de la persona.
     */

    public Persona(String nombre, String apellidos, String correo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
    }

    /**
     * Getter de nombre.
     *
     * @return Retorna el nombre de la persona.
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Setter de nombre.
     *
     * @param nombre Nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de apellidos.
     *
     * @return Retorna los apellidos de la persona.
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Setter de apellidos.
     *
     * @param apellidos Nuevos apellidos de la persona.
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Getter de correo.
     *
     * @return Retorna el correo de la persona.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Setter de correo.
     *
     * @param correo Nuevo correo de la persona.
     */
    public void setCorreo(String correo) {
        if (correo.contains("@")) {
            this.correo = correo;
        }

    }

    /**
     * Metodo que entrega información de Persona.
     *
     * @return Información de la persona.
     */

    @Override
    public String toString() {
        return "nombre: '" + this.nombre + "'" +
                ", apellidos: '" + this.apellidos + "'" +
                ", correo: '" + this.correo + "'";
    }
}
