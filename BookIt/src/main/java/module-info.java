module com.example.bookit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bookit to javafx.fxml;
    exports com.example.bookit;
}