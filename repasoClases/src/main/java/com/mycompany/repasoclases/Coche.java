

package com.mycompany.repasoclases;

public class Coche {
    
    //propiedades o atributos, almacenamos valores (texto, decimal, entero, lógico)
    //necesitamos crear la propiedad con el tipo de dato a almacenar
    
    String marca;
    String modelo;
    String color;
    String matricula;
    Boolean eco;
    Double cilindrada;
    
    //la función constructora, es la que permite crear objetos basados en esa clase. (Llamada a la clase)
    //una clase puede tener varios constructores
    //no es aconsejable xq a largo pzo genera problemas de rendimiento
    //el metodo constructor tiene el mismo nombre que la clase
    //como parametros de entrada, tiene los nombres de los atributos o propiedades que tiene la clase
    
    public Coche(String marca, String modelo, String color, String matricula, Boolean eco, Double cilidrada)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.eco = eco;
        this.cilindrada = cilindrada;
        
        System.out.println("La instancia se ha creado de forma correcta!");
    }
    
    //creamos otro constructor para crear la instancia solamente con tres propiedades
    public Coche(String marca, String modelo, String matricula)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }
    
    public void imprimir()
    {
        System.out.println("Los datos del objeto son:");
        System.out.println("Propiedad marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Eco: " + this.eco);
        System.out.println("Cilindrada: " + this.cilindrada);
        
    }
    //métodos
    //nos permiten agrupar instrucciones, para automatizar tareas
    
    
    //metodos coid, que no reciben ni devuelven valores simplemente ejecutan instrucciones
    //metodos que reciben y devuelven valores(recibir, recibir y devolver)
    //metodos estaticos, que pertenecen a una clase y se utilizan directamente: Math.ceil()
    
    //ejemplo de metodo void
    public void imprimir2()
    {
        System.out.println("Los datos del objeto son:");
        System.out.println("Propiedad marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Eco: " + this.eco);
        System.out.println("Cilindrada: " + this.cilindrada);
        
    }
    
    //ejemplo de un metodo que recibe valores
    public String mostrar_nombre(String nombre)
    {
        System.out.println("Has tecleado el valor: " + nombre);
        return nombre;
    }
    
    //ejemplo de un metodo que recibe y devuelve valores
    public int sumar(int p1, int p2)
    {
        int resultado = p1 + p2;
        return resultado;
    }

}
