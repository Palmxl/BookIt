package Dominio;

import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String rol; // "Cliente" o "Administrador"
    private List<Reserva> reservas;

    /*// Métodos
    public void registrar(); // Registra un nuevo usuario
    public void iniciarSesion(); // Autentica al usuario
    public void editarPerfil(); // Modifica los datos del usuario*/
}

