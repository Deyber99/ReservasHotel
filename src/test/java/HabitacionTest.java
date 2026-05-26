import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HabitacionTest {

    @Test
    void testConstructorYGetters() {
        Habitacion habitacion = new Habitacion(101, "Doble", 150.0, true);

        assertEquals(101, habitacion.getNumero());
        assertEquals("Doble", habitacion.getTipoHab());
        assertEquals(150.0, habitacion.getPrecioNoche());
        assertTrue(habitacion.isDisponible());
    }

    @Test
    void testSetters() {
        Habitacion habitacion = new Habitacion(101, "Doble", 150.0, true);

        habitacion.setNumero(102);
        habitacion.setTipoHab("Suite");
        habitacion.setPrecioNoche(250.0);
        habitacion.setDisponible(false);

        assertEquals(102, habitacion.getNumero());
        assertEquals("Suite", habitacion.getTipoHab());
        assertEquals(250.0, habitacion.getPrecioNoche());
        assertFalse(habitacion.isDisponible());
    }

    @Test
    void testToString() {
        Habitacion habitacion = new Habitacion(101, "Individual", 50.0, true);
        String resultado = habitacion.toString();

        assertTrue(resultado.contains("101"));
        assertTrue(resultado.contains("Individual"));
        assertTrue(resultado.contains("50.0"));
        assertTrue(resultado.contains("true"));
    }
}
