module com.example.bookit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookit to javafx.fxml;
    exports com.example.bookit;
    exports Controladores;
    opens Controladores to javafx.fxml;
}