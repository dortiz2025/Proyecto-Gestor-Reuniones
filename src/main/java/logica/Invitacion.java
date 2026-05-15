package logica;

import java.time.Instant;

/**
 * Clase que representa una invitación a una reunión.
 */
public class Invitacion {

    private Instant horaEnvio;
    private Invitable invitado;

    /**
     * Constructor de la invitación.
     *
     * @param horaEnvio Hora de envío de la invitación.
     * @param invitado Entidad que recibirá la invitación.
     */
    public Invitacion(Instant horaEnvio, Invitable invitado){
        this.horaEnvio = horaEnvio;
        this.invitado = invitado;
    }

    /**
     * Getter de la hora de envío.
     *
     * @return Retorna la hora de envío de la invitación.
     */
    public Instant getHoraEnvio(){
        return horaEnvio;
    }

    /**
     * Setter de la hora de envío.
     *
     * @param horaEnvio Nueva hora de envío de la invitación.
     */
    public void setHoraEnvio(Instant horaEnvio){
        this.horaEnvio = horaEnvio;
    }

    /**
     * Getter del invitado.
     *
     * @return Entrega la referencia de la entidad invitada.
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
                "Hora de envío: '" + this.horaEnvio + "'" +
                ", Invitado: '" + this.invitado + "'" +
                '}';
    }
}