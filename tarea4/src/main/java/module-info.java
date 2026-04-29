module com.mycompany.tarea4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tarea4 to javafx.fxml;
    exports com.mycompany.tarea4;
}
