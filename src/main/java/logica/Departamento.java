package logica;

/**
 * Clase que representa un departamento de una empresa.
 */
public class Departamento{
    private String nombre;
    public int empleados;

    /**
     * Constructor de Departamento
     *
     * @param nombre
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter del nombre del departamento
     *
     * @param nombre Nuevo nombre del departamento
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del nombre del departamento
     *
     * @return nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de la cantidad de empleados
     *
     * @param empleados Nueva cantidad de empleados
     */
    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    /**
     * Getter de la cantidad de empleados
     *
     * @return cantidad de empleados
     */
    public int obtenerCantidadEmpleados() {
        return empleados;
    }

    /**
     * Metodo que entrega información sobre Departamento
     *
     * @return información de la clase
     */

    @Override
    public String toString() {
        return "Departamento{" + "nombre= " + nombre + ", empleados=" + empleados + '}';
    }
}
