

package com.mycompany.practicaclasesextendidas3;

public class Ordenador {

    
    public String marca;
    public String modelo;
    public int ram;
    public int capacidad;
    public int utilizado;
    public boolean encendido;
    
    public Ordenador() //constructor vacio
    {
        this.ram = 4;
        this.capacidad = 50;
        this.encendido = false;
    }
    
    public Ordenador(int ram)
    {
        this.ram = ram;
        this.capacidad = 50;
        this.encendido = false;
    }
    
    public Ordenador(int ram, int capacidad)
    {
        this.ram = ram;
        this.capacidad = capacidad;
        this.encendido = false;
    }
    
    public Ordenador (String marca, String modelo, int ram, int capacidad)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.capacidad = capacidad;
        this.encendido = false;
        
    }
    
    
    //metodos
    public void encender()
    {
        encendido = true;
        System.out.println("Encendido");
    }
    
    public void apagar()
    {
        encendido = false;
        System.out.println("Apagado");
    }
    
    public void transferir(int gb)  //metodo de transferir
    {
        if (encendido == true)
        {
            System.out.println("Transferimos...");
            if ((capacidad - utilizado) > gb)
            {
                utilizado = utilizado + gb;
            }
            else
            {
                System.out.println("No hay bastante espacio disponible");
            }
        }
        else
        {
            System.out.println("El ordenador esta apagado");
        }
        System.out.println("Utilizado: " + utilizado);
    }
    
    public void eliminar(int gb)  //metodo de eliminar
    {
        if (encendido == true)
        {
            System.out.println("Eliminamos...");
            if (utilizado < gb)
            {
                utilizado = 0;
            }
            else
            {
                utilizado = utilizado - gb;
            }
        }
        else
        {
            System.out.println("El ordenador esta apagado");
        }
        System.out.println("Utilizado: " + utilizado);
    }
}
