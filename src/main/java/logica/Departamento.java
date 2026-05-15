package logica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un departamento de una empresa.
 */
public class Departamento implements Invitable {

    private String nombre;
    private List<Empleado> empleados;

    /**
     * Constructor de Departamento.
     *
     * @param nombre asigna nombre al departamento
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
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
        return this.nombre;
    }

    /**
     * Metodo que entrega la cantidad de empleados del departamento.
     *
     * @return Cantidad de empleados del departamento.
     */
    public int getCantidadEmpleados() {
        return this.empleados.size();
    }

    /**
     * Metodo que agrega un empleado a la lista de empleados del departamento.
     *
     * @param empleado Empleado que será agregado.
     */
    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    /**
     * Getter de empleados.
     *
     * @return Entrega la lista de empleados del departamento.
     */
    public List<Empleado> getEmpleados() {
        return this.empleados;
    }

    /**
     * Metodo que notifica que el departamento ha sido invitado a una reunión.
     */
    @Override
    public void invitar() {
        System.out.println("Invitación para departamento " + this.getNombre());
    }

    /**
     * Metodo que entrega información sobre Departamento.
     *
     * @return Información del departamento.
     */
    @Override
    public String toString() {
        return "Departamento{" +
                "nombre: '" + this.nombre + "'" +
                ", empleados: '" + this.getCantidadEmpleados() + "'" +
                "'}";
    }
}
