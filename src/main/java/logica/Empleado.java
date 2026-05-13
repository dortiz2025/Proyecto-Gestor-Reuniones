package logica;

/**
 * Clase que representa un empleado de una empresa invitado a una reunión.
 */
public class Empleado extends Persona{

    /**
     * Constructor de Empleado.
     *
     * @param nombre Asigna el nombre del empleado.
     * @param apellidos Asigna los apellidos del empleado.
     * @param correo Asigna el correo del empleado.
     */
    public Empleado(String nombre, String apellidos, String correo){
        super(nombre,apellidos,correo);
    }
}
