

package com.mycompany.practicaclasesextendidas3;

public class Portatil extends Ordenador{
    
    private String pantalla;
    private int npuertos;
    private double precio;
    
    public Portatil()  //constructor vacio
    {
        super();
    }
    
    public Portatil(String marca, String modelo, int ram, int capacidad, String pantalla, int npuertos, double precio)
    {
        super(marca, modelo, ram, capacidad);
        this.pantalla = pantalla;
        this.npuertos = npuertos;
        this.precio = precio;    
    }
    
    //metodos
    public void imprimir()
    {
        System.out.println("Imprimo todo...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ram: " + ram);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pantalla: " + pantalla);
        System.out.println("Npuertos: " + npuertos);
        System.out.println("Precio: " + precio);
    }
    
    public String getPantalla()
    {
        return pantalla;
    }
    
    public void setPantalla(String newPantalla)
    {
        pantalla = newPantalla;
    }
    
    public int getNpuertos()
    {
        return npuertos;
    }
    
    public void setNpuertos(int newNpuertos)
    {
        npuertos = newNpuertos;
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    public void setPrecio(double newPrecio)
    {
        precio = newPrecio;
    }
    
    
}
