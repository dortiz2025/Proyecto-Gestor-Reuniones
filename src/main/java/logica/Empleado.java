package logica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un empleado de una empresa invitado a una reunión.
 */
public class Empleado extends Persona{
    private String id;

    /**
     * Constructor de Empleado.
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
     * Getter del id del empleado
     * @return id del empleado
     */
    public String getId() {
        return this.id;
    }

    /**
     * Notifica al empleado que ha sido invitado a una reunión.
     */
    @Override
    public void invitar() {
        System.out.println("Invitación para " + this.getNombre());
    }

    /**
     * Responde si una persona es igual al empleado actual.
     * @param persona Persona por la que se consulta.
     * @return True si son la misma persona, False si no.
     */
    @Override
    public boolean incluyeA(Persona persona){
        return this.equals(persona);
    }

    /**
     * Declara las personas que están contenidas en esta entidad.
     * En este caso es la misma persona.
     * @return Lista con la persona como único elemento.
     */
    @Override
    public List<Persona> obtenerPersonasRepresentadas(){
        return List.of(this);
    }

    /**
     * Entrega información representativa de Empleado.
     * @return Información del empleado.
     */
    @Override
    public String toString() {
        return "Empleado {\n" +
                "  ID: '" + id + "',\n" +
                "  " + super.toString().replace("\n", "\n  ") +  "\n" +
                "}";
    }
}
