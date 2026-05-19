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
}