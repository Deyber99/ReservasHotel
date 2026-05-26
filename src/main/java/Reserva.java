import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Reserva {


    // ===== Atributos =====
    private int idReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    

    // ===== Constructor =====
    public Reserva(int idReserva, Cliente cliente, Habitacion habitacion,
                   LocalDate fechaEntrada, LocalDate fechaSalida) {
        LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    // ===== Getters y Setters =====
    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    // ===== Métodos útiles =====

    // Calcula cuántos días se queda el cliente
    public int getNoches() {
        return (int) java.time.temporal.ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
    }

    // Calcula el precio total de la reserva
    public double getPrecioTotal() {
        return getNoches() * habitacion.getPrecioNoche();
    }

    @Override
    public String toString() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Reserva {" +
                "ID=" + idReserva +
                ", Cliente=" + cliente.getNombreCompleto() +
                ", Habitación=" + habitacion.getNumero() +
                ", Entrada=" + fechaEntrada.format(formato) +
                ", Salida=" + fechaSalida.format(formato) +
                ", Noches=" + getNoches() +
                ", Precio Total=" + getPrecioTotal() +
                "} \n";
    }
}

