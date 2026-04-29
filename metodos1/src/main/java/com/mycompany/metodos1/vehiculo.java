
package com.mycompany.metodos1;

public class vehiculo {
    
    //atributos o propiedads
    String marca;
    String modelo;
    String matricula;
    int fmatriculacion;
    String color;
    
    //creamos el constructor
    public vehiculo(String marca, String modelo, String matricula, int fmatriculacion, String color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.fmatriculacion = fmatriculacion;
        this.color = color;
        
        System.out.println("El objeto se ha creado de forma correcta");
    }
    
    //crear el método void
    public void imprimir_datos()
    {
        System.out.println("Nombre: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Fecha de matriculacion: " + this.fmatriculacion);
        System.out.println("Color: " + this.color);
    }
    
    //método que recibe valores
    public void dato_color(String parametro)
    {
        System.out.println("Tu coche es de color: " + parametro + ", buena elección");
    }
    
    //método que recibe y devuelve
    public int calcular_annos(int parametro1)
    {
        int resultado = 2025 - parametro1;
        return resultado;
    }
}
