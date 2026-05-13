package logica;

import java.time.Instant;

/**
 * Clase que representa una invitación a una reunión.
 */
public class Invitacion {
    /**
     * Hora en que se envió la invitación.
     */
    private Instant hora;

    /**
     * Entidad a la que va dirigida la invitación.
     */
    private Invitable invitado;

    /**
     * Constructor de la invitación.
     *
     * @param hora Hora de envío de la invitación.
     * @param invitado Entidad que recibirá la invitación.
     */
    public Invitacion(Instant hora, Invitable invitado){
        this.hora = hora;
        this.invitado = invitado;
    }

    /**
     * Getter de la hora de envío.
     *
     * @return Retorna la hora de la invitación.
     */
    public Instant getHora(){
        return hora;
    }

    /**
     * Setter de la hora de envío.
     *
     * @param hora Nueva hora de la invitación.
     */
    public void setHora(Instant hora){
        this.hora = hora;
    }

    /**
     * Getter del invitado.
     *
     * @return Retorna la entidad invitada.
     */
    public Invitable getInvitado(){
        return invitado;
    }

    /**
     * Setter del invitado.
     *
     * @param invitado Nueva entidad invitada.
     */
    public void setInvitado(Invitable invitado){
        this.invitado = invitado;
    }

    /**
     * Metodo que entrega información representativa de la clase actual.
     *
     * @return Retorna la información de la clase.
     */
    @Override
    public String toString(){
        return "Invitación {" +
                "Hora de envío: " + hora +
                ", Invitado: " + invitado +
                '}';
    }
}