package ejercicio6.com.hotel.ejercicio6.model;

public class Reserva {
    private Long id;
    private String nombreCliente;
    private String numeroHabitacion;
    private String fechaEntrada;
    private String fechaSalida;
    private String estado;

    public Reserva() {}

    public Reserva(Long id, String nombreCliente, String numeroHabitacion, String fechaEntrada, String fechaSalida, String estado) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.numeroHabitacion = numeroHabitacion;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.estado = estado;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public String getNumeroHabitacion() { return numeroHabitacion; }
    public void setNumeroHabitacion(String numeroHabitacion) { this.numeroHabitacion = numeroHabitacion; }

    public String getFechaEntrada() { return fechaEntrada; }
    public void setFechaEntrada(String fechaEntrada) { this.fechaEntrada = fechaEntrada; }

    public String getFechaSalida() { return fechaSalida; }
    public void setFechaSalida(String fechaSalida) { this.fechaSalida = fechaSalida; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}