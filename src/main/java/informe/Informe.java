package informe;

import enumeraciones.*;
import logica.*;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


/**
 * Clase que se encarga de generar informe sobre la reunión.
 */
public class Informe {
    /**
     * Genera un archivo con un informe de la reunión.
     * @param reunion Informe de la reunión.
     */
    public void crearInforme(Reunion reunion){
        try (FileWriter fw = new FileWriter("InformeReunion.txt");
             PrintWriter escritor = new PrintWriter(fw)) {

            escritor.println(" --- INFORME DE LA REUNIÓN ---");
            escritor.println(reunion.toString());
            escritor.println(" -----------------------------");

        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
