
package com.mycompany.practicaarraylist2;

public class Viaje {
    public String nombreDestino;
    public String pais;
    public double precio;
    public int duracion;
    public int plazasDisponibles;
    
    public Viaje(String nombreDestino, String pais, double precio, int duracion, int plazasDisponibles)
    {
        this.nombreDestino = nombreDestino;
        this.pais = pais;
        this.precio = precio;
        this.duracion = duracion;
        this.plazasDisponibles = plazasDisponibles;
        
    }
}
