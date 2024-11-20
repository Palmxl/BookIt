package Dominio;

import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String rol; //cliente o admin xd
    private List<Reserva> reservas; //un usuario puede tener varias reservas

    /*posibles metodos
    public void registrar(); // Registra un nuevo usuario
    public void iniciarSesion(); // Autentica al usuario
    public void editarPerfil(); // Modifica los datos del usuario*/
}

