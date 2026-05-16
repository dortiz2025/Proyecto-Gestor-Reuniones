package interfaces;

import logica.Persona;
import java.util.List;

/**
 * Interfaz que define la capacidad de una entidad para ser invitada a una reunión.
 */
public interface Invitable {
    /**
     * Ejecuta la acción de invitar a una entidad.
     */
    public void invitar();

    /**
     * Responde si cierta persona está incluida en la entidad invitada.
     * @param persona Persona por la que se consulta.
     * @return True si está incluida, False si no.
     */
    public boolean incluyeA(Persona persona);

    /**
     * Obliga a una entidad a declarar a quienes incluye
     * en el caso de un grupo de personas representadas
     * por tal entidad.
     * @return Lista de personas
     */
    public List<Persona> obtenerPersonasRepresentadas();
}