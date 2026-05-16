package logica;

/**
 * Clase que representa un empleado de una empresa invitado a una reunión.
 */
public class Empleado extends Persona{
    private String id;

    /**
     * Constructor de Empleado.
     *
     * @param nombre Asigna el nombre del empleado.
     * @param apellidos Asigna los apellidos del empleado.
     * @param correo Asigna el correo del empleado.
     * @param id Asigna el ID del empleado.
     */
    public Empleado(String nombre, String apellidos, String correo, String id) {

        super(nombre, apellidos, correo);
        this.id = id;
    }

    /**
     * Setter de ID
     *
     * @param id Id del empleado
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter del id del empleado
     *
     * @return id del empleado
     */
    public String getId() {
        return id;
    }

    /**
     * Metodo que notifica al empleado que ha sido invitado a una reunión.
     */
    @Override
    public void invitar() {
        System.out.println("Invitación para " + this.getNombre());
    }

    /**
     * Entrega información representativa de Empleado.
     *
     * @return Información del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{\n" +
                "  id: '" + id + "',\n" +
                "  " + super.toString().replace("\n", "\n  ") +  "\n" +
                "}";
    }
}
