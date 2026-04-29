module com.mycompany.basura {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.basura to javafx.fxml;
    exports com.mycompany.basura;
}
