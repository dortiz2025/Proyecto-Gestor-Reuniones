package logica;

public class Departamento{
    private String nombre;
    public int empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }
    public int obtenerCantidadEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombre= " + nombre + ", empleados=" + empleados + '}';
    }
}
