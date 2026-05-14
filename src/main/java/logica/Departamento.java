package logica;

/**
 * Clase que representa un departamento de una empresa.
 */
public class Departamento{

    private String nombre;
    private int cantidadEmpleados;

    /**
     * Constructor de Departamento.
     *
     * @param nombre asigna nombre al departamento
     * @param cantidadEmpleados asigna número de empleados
     */
    public Departamento(String nombre, int cantidadEmpleados) {
        this.nombre = nombre;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    /**
     * Setter del nombre del departamento.
     *
     * @param nombre Nuevo nombre del departamento.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter del nombre del departamento.
     *
     * @return nombre del departamento
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de la cantidad de empleados.
     *
     * @param cantidadEmpleados Nueva cantidad de empleados.
     */
    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    /**
     * Getter de la cantidad de empleados.
     *
     * @return Cantidad de empleados.
     */
    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    /**
     * Metodo que entrega información sobre Departamento.
     *
     * @return Información de la clase.
     */

    @Override
    public String toString() {
        return "Departamento{" + "nombre= " + nombre + ", empleados=" + cantidadEmpleados + '}';
    }
}
