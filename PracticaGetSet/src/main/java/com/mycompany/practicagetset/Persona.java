
package com.mycompany.practicagetset;

public class Persona {
    
    private String nombre;  //propiedad privada
    public String apellido; //propiedad publica
    private Integer edad;
    private String email;
    
    public Persona(String nombre, String apellido, Integer edad, String email)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }
    
    //creamos setters y getters
    public String getNombre() 
    {
        return nombre;
    }
    
    public void setNombre(String newNombre)
    {
        this.nombre = newNombre;
    }
    
    public String getApellido()
    {
        return apellido;
    }
    
    public void setApellido(String newApellido)
    {
        this.apellido = newApellido;
    }
    
    public Integer getEdad()
    {
        return edad;
    }
    
    public void setEdad(Integer newEdad)
    {
        this.edad = edad;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String newEmail)
    {
        this.email = email;
    }
}
