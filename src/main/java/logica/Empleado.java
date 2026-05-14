package logica;

/**
 * Clase que representa un empleado de una empresa invitado a una reunión.
 */
public class Empleado extends Persona{

    private String id;
    private Departamento departamento;
    /**
     * Constructor de Empleado.
     *
     * @param nombre Asigna el nombre del empleado.
     * @param apellidos Asigna los apellidos del empleado.
     * @param correo Asigna el correo del empleado.
     * @param id Asigna el ID del empleado.
     * @param departamento Asigna el departamento del empleado.
     */
    public Empleado(String nombre, String apellidos, String correo, String id, Departamento departamento) {

        super(nombre, apellidos, correo);
        this.id = id;
        this.departamento = departamento;

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
     * Setter de Departamento
     *
     * @param departamento Departamento al que pertenece la persona
     */
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    /**
     * Getter del nombre del departamento y cantidad de empleados
     *
     * @return nombre del departamento
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Metodo que notifica al empleado que ha sido invitado a una reunión.
     */
    @Override
    public void invitar() {
        System.out.println("Invitación para " + getNombre());
    }

    /**
     * Metodo que entrega información acerca de la clase
     *
     * @return información de la clase
     */
    @Override
    public String toString() {
        return super.toString() + " id= " + id + departamento.toString();
    }
}
