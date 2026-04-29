
package com.mycompany.practicaclasesabstractas1;

public abstract class planta { //clase abstracto
    
    private String nombre;
    private int edad;
    
    public planta(String nombre, int edad) 
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract String sistemaDeRiego(String tipo); //metodo abstracto
    
    public String getNombre() //metodos para mostrar propiedades
    {
        return nombre;
    }
    
    public int getEdad()
    {
        return edad;
    }

}
