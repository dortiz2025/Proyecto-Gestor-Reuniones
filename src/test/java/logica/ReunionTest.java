package logica;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ReunionTest {

    private Departamento depto;
    private Empleado organizador;
    private Reunion reunion;

    @BeforeEach
    public void setUp() {
        depto = new Departamento("departamento1", 15);
        organizador = new Empleado("Manuel", "Diaz", "mdiaz@mail.com", "EMP-01", depto);
        reunion = new Reunion(new Date(), Instant.now(), Duration.ofHours(1), organizador) {};
    }

    @Test
    public void testIniciarAsignaHoraDeInicio() {

        reunion.iniciar();

        //verificamos que la hora de inicio se haya guardado y no sea nula
        assertNotNull(reunion.getHoraInicio(), "La hora de inicio no debe ser nula después de iniciar la reunión");
    }

    @Test
    public void testFinalizarAsignaHoraDeFin() {

        //verificar que empiece nula
        assertNull(reunion.getHoraFin(), "Antes de finalizar, la hora de fin debería ser nula");

        reunion.finalizar();

        //comprobar
        assertNotNull(reunion.getHoraFin(), "La hora de fin no debe ser nula después de finalizar la reunión");
    }
}