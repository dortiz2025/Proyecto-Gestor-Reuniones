package informe;

import enumeraciones.*;
import logica.*;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;




/**
 * Clase que se encarga de generar informe sobre la reunión.
 */
public class Informe {
    /**
     * Metodo que genera un archivo con toda la información recopilada acerca de la reunión.
     * @param reunion información sobre la reunion.
     */
    public void crearInforme(Reunion reunion){

        try (FileWriter fw = new FileWriter("InformeReunion.txt"); PrintWriter escritor = new PrintWriter(fw)) {

            escritor.println("Organizador: " + reunion.getOrganizador());
            escritor.println("Invitados: " + reunion.obtenerInvitaciones());

            if (reunion instanceof ReunionPresencial) {
                escritor.println("Tipo de reunión: Presencial");

            } else if (reunion instanceof ReunionVirtual) {
                escritor.println("Tipo de reunión: Virtual");
            }

            escritor.println(("Fecha: " + reunion.getFecha() + " | Hora: " + reunion.getHora();

            if (reunion instanceof ReunionPresencial) {
                escritor.println("Sala: " + reunion.getSala();

            } else if (reunion instanceof ReunionVirtual) {
                escritor.println("Enlace: " + reunion.getEnlace();
            }
            escritor.println("      --REUNIÓN FINALIZADA--");
            escritor.println("Hora inicio: " + reunion.getHoraIncio + " | Hora término: " + reunion.getHoraTermino();
            //para la clase asistencia por favor colocar de inmediato los atrasos igual para que se incluyan aquí
            //utilicemos la lista completa para colocar ausentes/presentes(atraso o sin atraso)
            escritor.println("  -ASISTENCIA-\n" + "Total empleados presentes: " + reunion.obtenerTotalAsistencia() +
                    "\n" + reunion.obtenerAsistencias());
            escritor.println("  -NOTAS-" + reunion.getNotas();

        } catch (IOException e) {

            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

}
