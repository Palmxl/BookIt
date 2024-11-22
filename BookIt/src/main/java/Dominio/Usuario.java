package Dominio;

import java.util.List;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String rol; //cliente o admin xd
    private List<Reserva> reservas; //un usuario puede tener varias reservas

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Usuario(int id, String nombre, String correo, String contrasena, String rol, List<Reserva> reservas) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.reservas = reservas;
    }


    public Usuario() {
    }

    /*public boolean registrar(String nombre, String correo, String contrasena, String rol) {
        if (nombre == null || correo == null || contrasena == null || rol == null) {
            return false;
        }
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        return true; // Registro exitoso
    }*/

    public boolean iniciarSesion(String correo, String contrasena) {
        if (correo == null || contrasena == null) {
            return false; // Maneja el caso donde alguno de los parámetros es null
        }
        return this.correo.equals(correo) && this.contrasena.equals(contrasena);
    }

    /*public boolean editarPerfil(String nuevoNombre, String nuevoCorreo, String nuevaContrasena) {
        if (nuevoNombre != null) this.nombre = nuevoNombre;
        if (nuevoCorreo != null) this.correo = nuevoCorreo;
        if (nuevaContrasena != null) this.contrasena = nuevaContrasena;
        return true;
    }*/
}

