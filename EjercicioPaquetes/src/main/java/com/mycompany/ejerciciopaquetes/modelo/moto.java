
package com.mycompany.ejerciciopaquetes.modelo;

public class moto {
    
    public String marca;
    public String modelo;
    public int ano;
    public String color;
    public String seguro;
    
    public moto(String marca, String modelo, int ano, String color, String seguro)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.color = color;
        this.seguro = seguro;
    }
    
    public moto()
    {
        System.out.println("Vacio");
    }
    
}
