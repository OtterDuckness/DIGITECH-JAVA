

package com.mycompany.clasesabstractos;

public class Gato extends Animal {

    public String color;
    public int nvidas;
    
    public Gato(String nombre, String color, int nvidas)
    {
        super(nombre);
        this.color = color;
        this.nvidas = nvidas;
    }
    
    @Override
    public void hacer()
    {
        System.out.println("El gato de color " + this.color + " tiene " + this.nvidas + " vidas");
    }
}
