

package com.mycompany.practicaclasesextendidas2;

public class Empleado {
    
    private String nombre;
    private Integer edad;
    
    public Empleado(String nombre, Integer edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
    }
    public void cumplirAnnos(int annos) //cambiamos edad 
    {
        this.edad = this.edad + annos;
    }
}
