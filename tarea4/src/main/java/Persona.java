/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Persona {


    private int id;
    private String nombre;
    private String apellido;
    private String titulacion;
    private String curso;
    private String nombre_instituto;
    
    public Persona(int id, String nombre, String apellido, String titulacion, String curso, String nombre_instituto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulacion = titulacion;
        this.curso = curso;
        this.nombre_instituto = nombre_instituto;
    }
    
    
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre_instituto() {
        return nombre_instituto;
    }

    public void setNombre_instituto(String nombre_instituto) {
        this.nombre_instituto = nombre_instituto;
    }
    
}
