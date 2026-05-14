package logica;

public class Empleado extends Persona implements Invitable{
    private String id;
    private Departamento departamento;

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
