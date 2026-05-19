package logica;

import interfaces.Invitable;
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
     * @param nombre asigna nombre al departamento
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    /**
     * Getter del nombre del departamento.
     * @return nombre del departamento
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Agrega un empleado a la lista de empleados del departamento.
     * @param empleado Empleado que será agregado.
     */
    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    /**
     * Getter de empleados.
     * @return Entrega la lista de empleados del departamento.
     */
    public List<Empleado> getEmpleados() {
        return java.util.Collections.unmodifiableList(this.empleados);
    }

    /**
     * Entrega la cantidad de empleados del departamento.
     * @return Cantidad de empleados del departamento.
     */
    public int getCantidadEmpleados() {
        return this.empleados.size();
    }

    /**
     * Metodo que notifica que el departamento ha sido invitado a una reunión.
     */
    @Override
    public void invitar() {
        for (Empleado empleado : this.empleados) {
            empleado.invitar(); //Se invita a cada empleado.
        }
    }

    /**
     * Responde si una persona pertenece al departamento.
     * @param persona Persona por la que se consulta.
     * @return True si pertenece, False si no.
     */
    @Override
    public boolean incluyeA(Persona persona){
        if (persona instanceof Empleado) {
            return this.empleados.contains((Empleado) persona);
        }
        return false;
    }

    /**
     * Entrega la lista de personas
     * que pertenecen al departamento.
     * @return Lista de empleados.
     */
    @Override
    public List<Persona> obtenerPersonasRepresentadas(){
        return new ArrayList<>(this.empleados);
    }

    /**
     * Entrega información representativa de Departamento.
     * @return Información del departamento.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Departamento {\n");
        sb.append("  nombre: '").append(this.nombre).append("',\n");
        sb.append("  cantidadEmpleados: ").append(this.getCantidadEmpleados()).append(",\n");

        sb.append("  empleados: [");
        // Verificamos si la lista está vacía o no.
        if (this.empleados.isEmpty()) {
            sb.append("]\n");
        } else {
            sb.append("\n");
            for (Empleado emp : this.empleados) {
                sb.append("    ").append(emp.toString().replace("\n", "\n    ")).append(",\n");
            }
            sb.append("  ]\n");
        }
        sb.append("}");

        return sb.toString();
    }
}
