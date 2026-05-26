public class Cliente {

    // ====== Atributos ======
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    // ====== Constructor con parámetros (para crear el cliente de una vez) ======
    public Cliente(String dni, String nombre, String apellido, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }

    // ====== Getters y Setters ======
    public String getDni() {
    return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // ====== Métodos útiles ======

    // Devuelve el nombre completo del cliente
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    // Muestra la información del cliente
    @Override
    public String toString() {
        return  "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + " " + apellido + '\'' +
                ", Teléfono='" + telefono + '\'' +
                ", Email='" + email + '\'';
    }
}
