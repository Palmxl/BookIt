package Controladores;

import Dominio.Usuario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginUsuarioController {

    @FXML
    private TextField usuarioTextField;

    @FXML
    private TextField contrasenaTextField;

    @FXML
    private Button loginButton;

    @FXML
    private Button administradorButton;

    /*private final String USUARIO_VALIDO = "xd";
    private final String CONTRASENA_VALIDA = "123";*/

    Usuario usuarioActivo = new Usuario();

    // Método que se ejecuta al hacer clic en el botón "Iniciar Sesión"
    @FXML
    private void LoginButtonClick(ActionEvent event) {
        String correo = usuarioTextField.getText();
        String contrasena = contrasenaTextField.getText();

        if (usuarioActivo.getCorreo() == null) {
            usuarioActivo.setCorreo("J@gmail.com");
            usuarioActivo.setContrasena("123");
            usuarioActivo.setNombre("Juan");
        }

        //validar usuario
        if (usuarioActivo.iniciarSesion(correo, contrasena)) {
            mostrarAlerta("Inicio de Sesión", "¡Bienvenido, " + usuarioActivo.getNombre() + "!", Alert.AlertType.INFORMATION);
            cambiarPantalla("Eventos.fxml");
        } else {
            mostrarAlerta("Error", "Correo o contraseña incorrectos", Alert.AlertType.ERROR);
        }
    }

    // Método que se ejecuta al hacer clic en el botón "Administrador"
    @FXML
    private void AdminButtonClick(ActionEvent event) {
        mostrarAlerta("Redirección", "Pantalla de inicio para administradores", Alert.AlertType.INFORMATION);
        cambiarPantalla("LoginAdmin.fxml"); // Redirige al login de administrador
    }

    // Mostrar alertas genéricas
    private void mostrarAlerta(String titulo, String mensaje, Alert.AlertType tipo) {
        Alert alerta = new Alert(tipo);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    private void cambiarPantalla(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/" + fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) loginButton.getScene().getWindow(); // Obtener la ventana actual
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarAlerta("Error", "No se pudo cargar la pantalla: " + fxmlFile, Alert.AlertType.ERROR);
        }
    }

    // Configurar el usuario activo para este controlador
    public void setUsuarioActivo(Usuario usuario) {
        this.usuarioActivo = usuario;
    }
}
