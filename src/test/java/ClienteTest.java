import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void testConstructorYGetters() {
        Cliente cliente = new Cliente("12345678A", "Juan", "Perez", "600123456", "juan@example.com");

        assertEquals("12345678A", cliente.getDni());
        assertEquals("Juan", cliente.getNombre());
        assertEquals("Perez", cliente.getApellido());
        assertEquals("600123456", cliente.getTelefono());
        assertEquals("juan@example.com", cliente.getEmail());
    }

    @Test
    void testSetters() {
        Cliente cliente = new Cliente("12345678A", "Juan", "Perez", "600123456", "juan@example.com");

        cliente.setDni("87654321B");
        cliente.setNombre("Carlos");
        cliente.setApellido("Ruiz");
        cliente.setTelefono("600987654");
        cliente.setEmail("carlos@example.com");

        assertEquals("87654321B", cliente.getDni());
        assertEquals("Carlos", cliente.getNombre());
        assertEquals("Ruiz", cliente.getApellido());
        assertEquals("600987654", cliente.getTelefono());
        assertEquals("carlos@example.com", cliente.getEmail());
    }

    @Test
    void testGetNombreCompleto() {
        Cliente cliente = new Cliente("12345678A", "Ana", "Gomez", "600654321", "ana@example.com");

        assertEquals("Ana Gomez", cliente.getNombreCompleto());
    }

    @Test
    void testToString() {
        Cliente cliente = new Cliente("12345678A", "Ana", "Gomez", "600654321", "ana@example.com");
        String resultado = cliente.toString();

        assertTrue(resultado.contains("12345678A"));
        assertTrue(resultado.contains("Ana Gomez"));
        assertTrue(resultado.contains("600654321"));
        assertTrue(resultado.contains("ana@example.com"));
    }
}
