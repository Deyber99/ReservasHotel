import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

class Datos {

    private Datos() {
        throw new IllegalStateException("Utility class");
    }

    // ==============================
    //        MAPAS ESTÁTICOS
    // ==============================
    private static final Map<String, Cliente> cliente = new HashMap<>();

    static {

        // ===================================
        //           CLIENTES (30)
        // ===================================
         cliente.put("12345678A", new Cliente("12345678A", "Luis", "Martínez", "600111111", "luis@example.com"));
         cliente.put("23456789B", new Cliente("23456789B", "Ana", "García", "600111112", "ana@example.com"));
         cliente.put("34567890C", new Cliente("34567890C", "Jorge", "López", "600111113", "jorge@example.com"));
         cliente.put("45678901D", new Cliente("45678901D", "María", "Santos", "600111114", "maria@example.com"));
         cliente.put("56789012E", new Cliente("56789012E", "Pedro", "Ramírez", "600111115", "pedro@example.com"));
         cliente.put("67890123F", new Cliente("67890123F", "Lucía", "Hernández", "600111116", "lucia@example.com"));
         cliente.put("78901234G", new Cliente("78901234G", "Raúl", "Torres", "600111117", "raul@example.com"));
         cliente.put("89012345H", new Cliente("89012345H", "Elena", "Jiménez", "600111118", "elena@example.com"));
         cliente.put("90123456J", new Cliente("90123456J", "Pablo", "Vargas", "600111119", "pablo@example.com"));
         cliente.put("01234567K", new Cliente("01234567K", "Sara", "Domínguez", "600111120", "sara@example.com"));

         cliente.put("11223344L", new Cliente("11223344L", "Diego", "Muñoz", "600111121", "diego@example.com"));
         cliente.put("22334455M", new Cliente("22334455M", "Claudia", "Reyes", "600111122", "claudia@example.com"));
         cliente.put("33445566N", new Cliente("33445566N", "Iván", "Cabrera", "600111123", "ivan@example.com"));
         cliente.put("44556677P", new Cliente("44556677P", "Marta", "Ortega", "600111124", "marta@example.com"));
         cliente.put("55667788Q", new Cliente("55667788Q", "Óscar", "Suárez", "600111125", "oscar@example.com"));
         cliente.put("66778899R", new Cliente("66778899R", "Julia", "Paredes", "600111126", "julia@example.com"));
         cliente.put("77889900S", new Cliente("77889900S", "Hugo", "Delgado", "600111127", "hugo@example.com"));
         cliente.put("88990011T", new Cliente("88990011T", "Nuria", "Rivas", "600111128", "nuria@example.com"));
         cliente.put("99001122V", new Cliente("99001122V", "David", "Molina", "600111129", "david@example.com"));
         cliente.put("10111213W", new Cliente("10111213W", "Patricia", "Rubio", "600111130", "patricia@example.com"));

         cliente.put("20212223X", new Cliente("20212223X", "Adrián", "Calvo", "600111131", "adrian@example.com"));
         cliente.put("30323334Y", new Cliente("30323334Y", "Rocío", "Benítez", "600111132", "rocio@example.com"));
         cliente.put("40434445Z", new Cliente("40434445Z", "Fernando", "Serrano", "600111133", "fernando@example.com"));
         cliente.put("50545556A", new Cliente("50545556A", "Verónica", "Peña", "600111134", "veronica@example.com"));
         cliente.put("60656667B", new Cliente("60656667B", "Javier", "Iglesias", "600111135", "javier@example.com"));
         cliente.put("70767778C", new Cliente("70767778C", "Irene", "Vega", "600111136", "irene@example.com"));
         cliente.put("80878889D", new Cliente("80878889D", "Sergio", "Flores", "600111137", "sergio@example.com"));
         cliente.put("90989990E", new Cliente("90989990E", "Natalia", "Campos", "600111138", "natalia@example.com"));
         cliente.put("01928374F", new Cliente("01928374F", "Álvaro", "Luna", "600111139", "alvaro@example.com"));
         cliente.put("91827364G", new Cliente("91827364G", "Beatriz", "Fuentes", "600111140", "beatriz@example.com"));



    }
    private static final Map<String, Habitacion> habitacion = new HashMap<>();

    static {

        // ===================================
        //         HABITACIONES (20)
        // ===================================
         habitacion.put("101", new Habitacion(101, "Individual", 50.0, true));
         habitacion.put("102", new Habitacion(102, "Doble", 80.0, true));
         habitacion.put("103", new Habitacion(103, "Suite", 150.0, true));
         habitacion.put("104", new Habitacion(104, "Individual", 50.0, true));
         habitacion.put("105", new Habitacion(105, "Doble", 80.0, true));
         habitacion.put("106", new Habitacion(106, "Suite", 150.0, true));
         habitacion.put("107", new Habitacion(107, "Individual", 50.0, true));
         habitacion.put("108", new Habitacion(108, "Doble", 80.0, true));
         habitacion.put("109", new Habitacion(109, "Suite", 150.0, true));
         habitacion.put("110", new Habitacion(110, "Individual", 50.0, true));

         habitacion.put("201", new Habitacion(201, "Doble", 80.0, true));
         habitacion.put("202", new Habitacion(202, "Suite", 150.0, true));
         habitacion.put("203", new Habitacion(203, "Individual", 50.0, true));
         habitacion.put("204", new Habitacion(204, "Doble", 80.0, true));
         habitacion.put("205", new Habitacion(205, "Suite", 150.0, true));
         habitacion.put("206", new Habitacion(206, "Individual", 50.0, true));
         habitacion.put("207", new Habitacion(207, "Doble", 80.0, true));
         habitacion.put("208", new Habitacion(208, "Suite", 150.0, true));
         habitacion.put("209", new Habitacion(209, "Individual", 50.0, true));
         habitacion.put("210", new Habitacion(210, "Doble", 80.0, true));

    }
    private static final Map<String, Reserva> reserva = new HashMap<>();

    static {

        // ===================================
        //           RESERVAS (1)
        // ===================================
        reserva.put("001", new Reserva(
        001,  // idReserva como entero
        cliente.get("12345678A"),             // Cliente object
        habitacion.get("101"),                // Habitación object
        LocalDate.parse("2024-07-01"),        // Formato ISO
        LocalDate.parse("2024-07-05")
        ));

    }

    // ==============================
    //     MÉTODOS AUXILIARES
    // ==============================

    public static Map<String, Cliente> getCliente() {
        return          cliente;
    }
    public static Map<String, Habitacion> getHabitacion() {
        return          habitacion;
    }
    public static Map<String, Reserva> getReserva() {
        return          reserva;
    }

}
