
package com.mycompany.practicapoometodos1;


public class Animal {
    
    String nombre;
    int patos;
    String habitat;
    int edad;
    
    public Animal(String nombre, int patos, String habitat, int edad)
    {
        this.nombre = nombre;
        this.patos = patos;
        this.habitat = habitat;
        this.edad = edad;
    }
    
    public void imprimir() //un metodo para imprimir todos los datos
    {
        System.out.println("Nombre " + this.nombre);
        System.out.println("Patos " + this.patos);
        System.out.println("Habitat " + this.habitat);
        System.out.println("Edad " + this.edad);
        System.out.println();
    }
    
    public void patos(int numero) //un metodo para cambiar la cantidad de patos
    {
        this.patos = numero;
    }
    
    public int fecha(int ano) //un metodo para calcular el ao de nacimiento
    {
        int resultado = ano - this.edad;
        return resultado;
        
    }
}
