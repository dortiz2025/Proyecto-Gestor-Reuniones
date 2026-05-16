package logica;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una persona externa a una empresa, invitado a una reunión.
 */
public class InvitadoExterno extends Persona{

    /**
     * Constructor de InvitadoExterno.
     *
     * @param nombre Asigna el nombre del invitado.
     * @param apellidos Asigna los apellidos del invitado.
     * @param correo Asigna el correo del invitado.
     */
    public  InvitadoExterno(String nombre, String apellidos, String correo){
        super(nombre,apellidos,correo);
    }

    /**
     * Notifica al invitadoExterno que ha sido invitado a una reunión.
     */
    @Override
    public void invitar() {
        System.out.println("Invitación para " + this.getNombre());
    }

    /**
     * Responde si una persona es igual a la actual.
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
        List<Persona> lista = new ArrayList<>();
        lista.add(this);
        return lista;
    }

    /**
     * Metodo que entrega información de InvitadoExterno.
     *
     * @return Información del invitado.
     */
    @Override
    public String toString() {
        return "InvitadoExterno {\n" +
                "  " + super.toString().replace("\n, ", "\n  ") + "\n" +
                "}";
    }
}
