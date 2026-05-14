package logica;

/**
 * Clase que representa un empleado de una empresa invitado a una reunión.
 */
public class Empleado extends Persona implements Invitable{

    private String id;
    private Departamento departamento;
    /**
     * Constructor de Empleado.
     *
     * @param nombre Asigna el nombre del empleado.
     * @param apellidos Asigna los apellidos del empleado.
     * @param correo Asigna el correo del empleado.
     * @param id Asigna el id del empleado.
     * @param departamento Asigna el departamento del empleado.
     */
    public Empleado(String nombre, String apellidos, String correo, String id, Departamento departamento) {

        super(nombre, apellidos, correo);
        this.id = id;
        this.departamento = departamento;

    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Departamento getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " id='" + id + departamento.toString();
    }

    public void invitar() {
        System.out.println("Invitación para " + getNombre());
    }
}
