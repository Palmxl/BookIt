package Dominio;

public class Reserva {
    private int id;
    private Usuario usuario;
    private Evento evento;
    private int cantidadTickets;
    private String metodoPago;
    private String estado; //puede que sea confirmada cancelada o en espera algo asi

    /*posibles metdos
    public void crearReserva(); // Registra una reserva
    public void cancelarReserva(); // Cancela una reserva*/
}

