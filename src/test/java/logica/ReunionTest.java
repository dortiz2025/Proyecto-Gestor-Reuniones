package logica;

import excepciones.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ReunionTest {

    private Empleado organizador;
    private Reunion reunion;

    @BeforeEach
    public void setUp() throws Exception {
        organizador = new Empleado("Manuel", "Diaz", "mdiaz@mail.com", "EMP-01");

        reunion = new Reunion(null, LocalDate.now(), LocalTime.now(), Duration.ofHours(1), organizador) {};
    }

    //tests de inicio

    @Test
    public void testIniciarAsignaHoraCorrectamente() throws Exception {
        Instant ahora = Instant.now();
        reunion.iniciar(ahora);

        assertEquals(ahora, reunion.getHoraInicio(), "La hora de inicio debe guardarse exactamente igual");
    }
    @Test
    public void testIniciarDosVecesLanzaExcepcion() throws Exception {
        reunion.iniciar(Instant.now());
        assertThrows(ReunionIniciadaException.class, () -> {
            reunion.iniciar(Instant.now());
        }, "Deberia dar error al intentar iniciar una reunion ya iniciada");
    }

    //tests de fin

    @Test
    public void testFinalizarSinIniciarLanzaExcepcion() {
        assertThrows(ReunionNoIniciadaException.class, () -> {
            reunion.finalizar(Instant.now());
        }, "Debería dar error al finalizar una reunión que no ha empezado");
    }

    @Test
    public void testFinalizarConIncoherenciaLanzaExcepcion() throws Exception {
        Instant inicio = Instant.now();
        reunion.iniciar(inicio);
        Instant finIncoherente = inicio.minus(Duration.ofHours(1));

        assertThrows(IncoherenciaDuracionReunionException.class, () -> {
            reunion.finalizar(finIncoherente);
        }, "Debería dar error si la hora de fin es anterior a la de inicio");
    }
    @Test
    public void testCalcularTiempoReal() throws Exception {
        Instant inicio = Instant.now();
        Instant fin = inicio.plus(Duration.ofMinutes(45));

        reunion.iniciar(inicio);
        reunion.finalizar(fin);

        assertEquals(45.0f, reunion.calcularTiempoReal(), "El tiempo real calculado debe ser de 45 minutos");
    }

    //tests de invitaciones y notas

    @Test
    public void testAddNotaAumentaLaLista() {
        Nota nota = new Nota("Esta es una nota muy importante!!! Atentamente: yo", Instant.now());
        reunion.addNota(nota);

        assertEquals(1, reunion.getNotas().size(), "La lista de notas debe tener 1 elemento");
        assertEquals("Esta es una nota muy importante!!! Atentamente: yo", reunion.getNotas().get(0).getContenido());
    }

    @Test
    public void testInvitarDepartamentoInvitaATodosSusEmpleados() throws Exception {
        Departamento ventas = new Departamento("Ventas");
        Empleado emp1 = new Empleado("Juan", "Salazar", "jsalazar@mail.com", "EMP-03");
        Empleado emp2 = new Empleado("Lucas", "Vega", "lvega@mail.com", "EMP-04");
        ventas.agregarEmpleado(emp1);
        ventas.agregarEmpleado(emp2);

        reunion.invitarParticipante(ventas);

        assertEquals(2, reunion.getAusencias().size(), "Ambos deberian estar ausentes inicialmente");
    }

    //tests de asistencias

    @Test
    public void testAddAsistenciaATiempoSeRegistraComoAsistenciaNormal() throws Exception {
        Empleado invitado = new Empleado("Carlos", "Ruiz", "carlos@mail.com", "E1");
        reunion.invitarParticipante(invitado);

        Instant horaInicio = Instant.now();
        reunion.iniciar(horaInicio);

        reunion.addAsistencia(invitado, horaInicio);

        assertEquals(1, reunion.obtenerTotalAsistencia(), "Debe haber 1 asistente");
        assertEquals(0, reunion.obtenerRetrasos().size(), "No debería haber retrasos");
    }

    @Test
    public void testAddAsistenciaTardeSeRegistraComoRetraso() throws Exception {
        Empleado invitado = new Empleado("Carlos", "Ruiz", "carlos@mail.com", "E1");
        reunion.invitarParticipante(invitado);

        Instant horaInicio = Instant.now();
        reunion.iniciar(horaInicio);

        Instant horaLlegadaTarde = horaInicio.plus(Duration.ofMinutes(10));
        reunion.addAsistencia(invitado, horaLlegadaTarde);

        assertEquals(1, reunion.obtenerTotalAsistencia(), "Debe haber 1 asistente");
        assertEquals(1, reunion.obtenerRetrasos().size(), "Debe registrarse como 1 retraso");
        assertTrue(reunion.getAsistencias().get(0) instanceof Retraso, "El objeto debe ser de clase Retraso");
    }

    @Test
    public void testAddAsistenciaNoInvitadoLanzaExcepcion() throws Exception {
        Empleado intruso = new Empleado("Fernando", "Concha", "fconcha@mail.com", "X1");
        reunion.iniciar(Instant.now());

        assertThrows(VerificarInvitadoException.class, () -> {
            reunion.addAsistencia(intruso, Instant.now());
        }, "Debería lanzar error si entra alguien no invitado");
    }
}