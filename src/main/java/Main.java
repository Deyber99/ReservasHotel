import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;


public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int option = 0;
        

        while (option != 7 ){
            LOGGER.info("\n=== MENÚ PRINCIPAL ===");
            LOGGER.info("1 - añadir reserva");
            LOGGER.info("2 - listar reservas");
            LOGGER.info("3 - facturar cliente");
            LOGGER.info("4 - añadir clientes");
            LOGGER.info("5 - listar clientes");
            LOGGER.info("6 - buscar cliente por DNI");
            LOGGER.info("7 - salir");
            LOGGER.info("Elige una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1 ->{ 
                agregarReservas();  
                }
                case 2 -> {
                listarReservas();   

                }
                case 3 -> { 
                facturarCliente();  

                }
                case 4 -> {   
                agregarClientes();
                
                }    
                case 5 -> {   

                listarClientes();

                }
                case 6 -> {

                BuscarCliente();

                }
                case 7 -> {
                    LOGGER.info("Hasta luego!");
                }
                default -> {
                    LOGGER.info("Opción no válida, inténtalo de nuevo.");
                }

            }
        }

        scanner.close();
    }

private static void agregarReservas() {
    Scanner sc = new Scanner(System.in);

    LOGGER.info("\n=== NUEVA RESERVA ===");

    // Generar ID automático
    int idReserva = Datos.getReserva().size() + 1;

    // ===== DNI del cliente =====
    Cliente cliente;
    while (true) {
        LOGGER.info("Introduce DNI del cliente: ");
        String dni = sc.nextLine();

        cliente = Datos.getCliente().get(dni);
        if (cliente != null) break;

        LOGGER.info("El DNI no está registrado. Intenta de nuevo.");
    }

    // ===== Habitación =====
    Habitacion habitacion;
    while (true) {
        LOGGER.info("Introduce número de habitación: ");
        String numeroHab = sc.nextLine();

        habitacion = Datos.getHabitacion().get(numeroHab);
        if (habitacion != null) break;

        LOGGER.info("La habitación no existe. Intenta de nuevo.");
    }

    // ===== Fecha de entrada =====
    LocalDate fechaEntrada;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    while (true) {
        LOGGER.info("Introduce fecha de entrada (DD-MM-YYYY): ");
        String fecha = sc.nextLine();

        try {
            fechaEntrada = LocalDate.parse(fecha, formatter);
            break;
        } catch (Exception e) {
            LOGGER.info("Formato incorrecto. Usa DD-MM-YYYY.");
        }
    }

    // ===== Fecha de salida =====
    LocalDate fechaSalida;
    while (true) {
        LOGGER.info("Introduce fecha de salida (DD-MM-YYYY): ");
        String fecha = sc.nextLine();

        try {
            fechaSalida = LocalDate.parse(fecha, formatter);
            if (fechaSalida.isAfter(fechaEntrada)) break;
            else LOGGER.info("La fecha de salida debe ser posterior a la de entrada.");
        } catch (Exception e) {
            LOGGER.info("Formato incorrecto. Usa DD-MM-YYYY.");
        }
    }

    // ===== Crear y guardar la reserva =====
    Reserva nueva = new Reserva(
            idReserva,
            cliente,
            habitacion,
            fechaEntrada,
            fechaSalida
    );

    Datos.getReserva().put(String.valueOf(idReserva), nueva);

    LOGGER.info("\n Reserva añadida correctamente.");
    LOGGER.info(String.valueOf(nueva));
}

private static void listarReservas() {
    // Mostrar todas las reservas
    int N= 0;
    Iterator<Map.Entry<String, Reserva>> it = Datos.getReserva().entrySet().iterator();
    
    while (it.hasNext()) {
    N++;

    Map.Entry<String, Reserva> entry = it.next();
    LOGGER.info(N + ", " +  entry.getValue());

    }
}

private static void facturarCliente() {
    // Facturar cliente por DNI
    Scanner sc = new Scanner(System.in);
    LOGGER.info("\nIngrese el DNI del cliente para facturar: ");
    String dniBuscado = sc.nextLine();

    boolean encontrado = false;
    double totalFacturado = 0.0;

    Iterator<Map.Entry<String, Reserva>> it = Datos.getReserva().entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry<String, Reserva> entry = it.next();
        Reserva reserva = entry.getValue();

        if (reserva.getCliente().getDni().equals(dniBuscado)) {
            encontrado = true;
            double precioReserva = reserva.getPrecioTotal();
            totalFacturado += precioReserva;
            LOGGER.info("Reserva ID: " + reserva.getIdReserva() +
                               ", Habitación: " + reserva.getHabitacion().getNumero() +
                               ", Precio Total: " + precioReserva);
        }
    }

    if (encontrado) {
        LOGGER.info("Total facturado al cliente " + dniBuscado + ": " + totalFacturado + "\n");
    } else {
        LOGGER.info("No se encontraron reservas para el DNI proporcionado.\n");
    }
}

private static void agregarClientes() {
        LOGGER.info("Por favor, introduce los datos del cliente:");
        Scanner sc = new Scanner(System.in);

        LOGGER.info("Introduce DNI: ");
        String dni = sc.nextLine();

        LOGGER.info("Introduce nombre: ");
        String nombre = sc.nextLine();

        LOGGER.info("Introduce apellido: ");
        String apellido = sc.nextLine();

        LOGGER.info("Introduce telefono: ");
        String telefono = sc.nextLine();

        LOGGER.info("Introduce email: ");
        String email = sc.nextLine();

        Datos.getCliente().put(dni, new Cliente(dni ,nombre, apellido, telefono, email));
        LOGGER.info("Cliente añadido correctamente.");

    }

    private static void listarClientes() {
        // Mostrar todos los clientes
        int N= 0;
        Iterator<Map.Entry<String, Cliente>> it = Datos.getCliente().entrySet().iterator();
        
        while (it.hasNext()) {
        N++;

        Map.Entry<String, Cliente> entry = it.next();
        LOGGER.info(N + ", " + entry.getValue());

        }

        // Mostrar todas las habitaciones
        /*
        Iterator<Map.Entry<String, Habitacion>> it2 = Datos.getHabitacion().entrySet().iterator();
            
        while (it2.hasNext()) {
                
        Map.Entry<String, Habitacion> entry2 = it2.next();
        System.out.println(entry2.getValue());
                    
        } */
    }

    private static void BuscarCliente() {
        
                //Opción de búsqueda
        Scanner sc = new Scanner(System.in);
        LOGGER.info("\nIngrese un DNI para buscar: ");
        String dniBuscado = sc.nextLine();

        if (Datos.getCliente().containsKey(dniBuscado)) {
            LOGGER.info("Cliente encontrado: " + Datos.getCliente().get(dniBuscado) + "\n");
        } else {
            LOGGER.info("El DNI no existe en el registro.");
        }

    }
}

