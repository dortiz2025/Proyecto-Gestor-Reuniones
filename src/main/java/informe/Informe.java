package informe;

import enumeraciones.*;
import excepciones.InformeNoGenerableException;
import logica.*;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


/**
 * Clase que se encarga de generar informe sobre la reunión.
 */
public class Informe {
    /**
     * Metodo que genera un archivo con toda la información recopilada acerca de la reunión.
     * @param reunion información sobre la reunion.
     */
    public void crearInforme(Reunion reunion) throws InformeNoGenerableException{
        /**
         *
         */
        if (reunion.getHoraInicio() == null && reunion.getHoraFin() == null) {
            throw new InformeNoGenerableException ("No es posible generar el informe.");
        }

        try (FileWriter fw = new FileWriter("InformeReunion.txt"); PrintWriter escritor = new PrintWriter(fw)) {

            escritor.println("Organizador: " + reunion.getOrganizador());

            escritor.println("Invitados:\n" + reunion.getInvitaciones());

            if (reunion instanceof ReunionPresencial) {
                escritor.println("Tipo de reunión: Presencial");

            } else if (reunion instanceof ReunionVirtual) {
                escritor.println("Tipo de reunión: Virtual");
            }

            escritor.println("Fecha: " + reunion.getFecha() + " | Hora: " + reunion.getHoraPrevista());

            if (reunion instanceof ReunionPresencial) {
                ReunionPresencial presencial = (ReunionPresencial) reunion;
                escritor.println("Sala: " + presencial.getSala());

            } else if (reunion instanceof ReunionVirtual) {
                ReunionVirtual virtual = (ReunionVirtual) reunion;
                escritor.println("Enlace: " + virtual.getEnlace());
            }

            escritor.println("      --REUNIÓN FINALIZADA--");
            escritor.println("Hora inicio: " + reunion.getHoraInicio() + " | Hora término: " + reunion.getHoraFin());
            //para la clase asistencia por favor colocar de inmediato los atrasos igual para que se incluyan aquí
            //utilicemos la lista completa para colocar ausentes/presentes(atraso o sin atraso)

            escritor.println("  -ASISTENCIA-\n" + "Total empleados presentes: " + reunion.obtenerTotalAsistencia() +
                    "\n" + reunion.getAsistencias());

            escritor.println("  -NOTAS-\n" + reunion.getNotas());

        } catch (IOException e) {

            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

}
