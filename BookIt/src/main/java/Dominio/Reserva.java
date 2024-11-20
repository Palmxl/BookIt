package Dominio;

public class Reserva {
    private int id;
    private Usuario usuario;
    private Evento evento;
    private int cantidadTickets;
    private String metodoPago; // "Tarjeta de crédito", "Tarjeta de débito", "PayPal"
    private String estado; // "Confirmada", "Pendiente", "Cancelada"

    /*// Métodos
    public void crearReserva(); // Registra una reserva
    public void cancelarReserva(); // Cancela una reserva*/
}

