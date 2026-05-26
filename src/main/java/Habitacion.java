public class Habitacion {

    // ===== Atributos =====
    private int numeroHab;
    private String tipoHab;      // Ej: "Individual", "Doble", "Suite"
    private double precioNoche;
    private boolean disponible;

    // ===== Constructor =====
    public Habitacion(int numeroHab, String tipoHab, double precioNoche, boolean disponible) {
        this.numeroHab = numeroHab;
        this.tipoHab = tipoHab;
        this.precioNoche = precioNoche;
        this.disponible = disponible;
    }

    // ===== Getters y Setters =====
    public int getNumero() {
        return numeroHab;
    }

    public void setNumero(int numero) {
        this.numeroHab = numero;
    }

    public String getTipoHab() {
        return tipoHab;
    }

    public void setTipoHab(String tipoHab) {
        this.tipoHab = tipoHab;
    }

    public double getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // ===== Método útil =====

    // Mostrar información formateada
    @Override
    public String toString() {
        return "Habitación {" +
                "Número=" + numeroHab +
                ", Tipo='" + tipoHab + '\'' +
                ", Precio por noche=" + precioNoche +
                ", Disponible=" + disponible +
                '}';
    }
}
