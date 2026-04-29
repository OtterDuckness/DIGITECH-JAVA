package es.dam.dual.mavenproject1;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class App extends Application {

    private TableView<Alumno> table;
    private TextField tfId, tfNombre, tfApellido, tfTitulacion, tfCurso, tfInstituto;
    private Connection conn;
    private ObservableList<Alumno> data;

    @Override
    public void start(Stage stage) {
        connectDB();
        createUI(stage);
        readAll();
    }

    private void connectDB() {
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dam_dual?useSSL=false&serverTimezone=UTC",
                "root", ""
            );
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, "Error DB: " + e.getMessage()).show();
        }
    }

    private void createUI(Stage stage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        tfId = new TextField(); tfId.setPromptText("ID para Update/Delete");
        tfNombre = new TextField(); tfNombre.setPromptText("Nombre");
        tfApellido = new TextField(); tfApellido.setPromptText("Apellido");
        tfTitulacion = new TextField(); tfTitulacion.setPromptText("DAM/ASIR/DAW/SMR");
        tfCurso = new TextField(); tfCurso.setPromptText("1º/2º/Dual");
        tfInstituto = new TextField(); tfInstituto.setPromptText("IES La Laboral");

        root.getChildren().addAll(
            new Label("CRUD Alumnos DAM Dual"),
            new Label("ID:"), tfId,
            new Label("Nombre:"), tfNombre,
            new Label("Apellido:"), tfApellido,
            new Label("Titulación:"), tfTitulacion,
            new Label("Curso:"), tfCurso,
            new Label("Instituto:"), tfInstituto
        );

        Button btnCreate = new Button("Crear");
        btnCreate.setOnAction(e -> create());
        Button btnRead = new Button("Leer Todos");
        btnRead.setOnAction(e -> readAll());
        Button btnUpdate = new Button("Actualizar");
        btnUpdate.setOnAction(e -> update());
        Button btnDelete = new Button("Eliminar");
        btnDelete.setOnAction(e -> delete());

        root.getChildren().addAll(btnCreate, btnRead, btnUpdate, btnDelete);

        table = new TableView<>();
        data = FXCollections.observableArrayList();
        table.setItems(data);

        TableColumn<Alumno, Integer> colId = new TableColumn<>("ID");
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Alumno, String> colNombre = new TableColumn<>("Nombre");
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        TableColumn<Alumno, String> colApellido = new TableColumn<>("Apellido");
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));

        TableColumn<Alumno, String> colTitulacion = new TableColumn<>("Titulación");
        colTitulacion.setCellValueFactory(new PropertyValueFactory<>("titulacion"));

        TableColumn<Alumno, String> colCurso = new TableColumn<>("Curso");
        colCurso.setCellValueFactory(new PropertyValueFactory<>("curso"));

        TableColumn<Alumno, String> colInstituto = new TableColumn<>("Instituto");
        colInstituto.setCellValueFactory(new PropertyValueFactory<>("instituto"));

        table.getColumns().addAll(colId, colNombre, colApellido, colTitulacion, colCurso, colInstituto);

        root.getChildren().add(table);

        stage.setScene(new Scene(root, 900, 650));
        stage.setTitle("DAM Dual CRUD");
        stage.show();
    }

    private void create() {
        String sql = "INSERT INTO alumnos (nombre, apellido, titulacion, curso, nombre_instituto) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tfNombre.getText());
            ps.setString(2, tfApellido.getText());
            ps.setString(3, tfTitulacion.getText());
            ps.setString(4, tfCurso.getText());
            ps.setString(5, tfInstituto.getText());
            ps.executeUpdate();
            readAll();
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, "Error crear: " + e.getMessage()).show();
        }
    }

    private void readAll() {
        data.clear();
        String sql = "SELECT * FROM alumnos";
        try (Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                data.add(new Alumno(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("titulacion"),
                    rs.getString("curso"),
                    rs.getString("nombre_instituto")
                ));
            }
        } catch (SQLException e) {
            new Alert(Alert.AlertType.ERROR, "Error leer: " + e.getMessage()).show();
        }
    }

    private void update() {
        String sql = "UPDATE alumnos SET nombre=?, apellido=?, titulacion=?, curso=?, nombre_instituto=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, tfNombre.getText());
            ps.setString(2, tfApellido.getText());
            ps.setString(3, tfTitulacion.getText());
            ps.setString(4, tfCurso.getText());
            ps.setString(5, tfInstituto.getText());
            ps.setInt(6, Integer.parseInt(tfId.getText()));
            ps.executeUpdate();
            readAll();
        } catch (SQLException | NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Error update: " + e.getMessage()).show();
        }
    }

    private void delete() {
        String sql = "DELETE FROM alumnos WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, Integer.parseInt(tfId.getText()));
            ps.executeUpdate();
            readAll();
        } catch (SQLException | NumberFormatException e) {
            new Alert(Alert.AlertType.ERROR, "Error delete: " + e.getMessage()).show();
        }
    }

    public static class Alumno {
        private final Integer id;
        private final String nombre;
        private final String apellido;
        private final String titulacion;
        private final String curso;
        private final String instituto;

        public Alumno(Integer id, String nombre, String apellido, String titulacion, String curso, String instituto) {
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.titulacion = titulacion;
            this.curso = curso;
            this.instituto = instituto;
        }

        public Integer getId() { return id; }
        public String getNombre() { return nombre; }
        public String getApellido() { return apellido; }
        public String getTitulacion() { return titulacion; }
        public String getCurso() { return curso; }
        public String getInstituto() { return instituto; }
    }

    public static void main(String[] args) {
        launch(args);
    }
}