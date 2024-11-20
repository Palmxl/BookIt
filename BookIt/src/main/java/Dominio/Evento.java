package Dominio;

import java.util.List;

public class Evento {
    private int id;
    private String nombre;
    private String descripcion;
    private String fecha;
    private String lugar;
    private int capacidadTotal;
    private int capacidadDisponible;
    private List<Reserva> reservas; //un evento puede tener varias reservas

    /*posivles meotodos
    public void agregarEvento(); //crea un nuevo evento como admin
    public void modificarEvento(); //modifica datos del evento como admin
    public void eliminarEvento(); //elimina un evento como admin*/
}

