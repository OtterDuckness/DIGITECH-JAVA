

package com.mycompany.clasesabstractos;

//creamos laclase abstracta animal
public abstract class Animal {

    private String nombre;
    
    //creamos el constructor de la clase abstracta para poder crear las
    //clases extendidas a partir de ella
    public Animal(String nombre)
    {
        this.nombre = nombre;
    }
    
    //creamos un método abstracto
    public abstract void hacer();
    
    //creamos un método normal
    public void imprimir()
    {
        System.out.println("Los datos del animal son: " + this.nombre);
    }

    
}
