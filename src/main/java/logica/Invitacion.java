package logica;

import java.time.Instant;

/**
 * Clase que representa una invitación a una reunión
 */
public class Invitacion {
    /**
     * Hora de la reunión
     */
    private Instant hora;

    /**
     * Invitado a la reunión
     */
    private Invitable invitado;

    /**
     * Asigna la hora de la reunión y el invitado
     *
     * @param hora Hora de la invitación
     */
    public Invitacion(Instant hora){
        this.hora = hora;
    }

    /**
     * Setter de hora
     * Asigna hora de la invitación
     *
     * @param hora Hora de la invitación
     */
    public void setHora(Instant hora){
        this.hora = hora;
    }

    /**
     * Getter de hora
     *
     * @return Retorna la hora de la invitación
     */
    public Instant getHora(){
        return hora;
    }
}