package logica;

import excepciones.CorreoInvalidoException;

import java.util.Objects;

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
        if (correo.contains("@")) {
            this.correo = correo;
        }
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
    public void setCorreo(String correo) throws CorreoInvalidoException {
        if (!correo.contains("@")) {
            throw new CorreoInvalidoException("Correo no válido.");
        }
        this.correo = correo;

    }

    /**
     * Sobrescritura de equals.
     *
     * @param objeto Referencia del objeto con el que comparamos.
     * @return Valor booleano que depende de la igualdad de los objetos.
     */
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) return true;
        if (!(objeto instanceof Persona)) return false;

        Persona otraPersona = (Persona) objeto;
        //Comparación segura.
        return Objects.equals(this.nombre, otraPersona.nombre) &&
                Objects.equals(this.apellidos, otraPersona.apellidos);
    }

    /**
     * Override del hashCode como buena práctica.
     *
     * @return Identificador.
     */
    @Override
    public int hashCode() {
        return Objects.hash(this.nombre, this.apellidos);
    }

    /**
     * Entrega información representativa de Persona.
     *
     * @return Información básica de la persona.
     */
    @Override
    public String toString() {
        return "nombre: '" + this.nombre + "'" +
                ", apellidos: '" + this.apellidos + "'" +
                ", correo: '" + this.correo + "'";
    }
}
