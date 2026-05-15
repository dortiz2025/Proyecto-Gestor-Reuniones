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
    public void crearInforme(Reunion reunion, Empleado organizador, Asistencia empleadosPresentes, Retraso retrasos, Nota notas){

        try (FileWriter fw = new FileWriter("InformeReunion.txt");
             PrintWriter escritor = new PrintWriter(fw)) {



        } catch (IOException e) {

            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

}
