package logica;

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
     * Metodo que notifica al invitadoExterno que ha sido invitado a una reunión.
     */
    @Override
    public void invitar() {
        System.out.println("Invitación para " + this.getNombre());
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
