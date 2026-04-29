package com.mycompany.oop;

public class Coche {
    
    //declarar los atributos o propiedades
    //aplicamos el ámbito de acceso(public)
    
    public String marca;
    public String modelo;
    public String color;
    public int annoMatriculacion;
    public int plazas;
    
    //si queremos crear objetos basados en esta clase, se tiene definir
    //la función constructora
    //tiene el mismo nombre que la clase, si creamos esta función, new Coche
    //CONSTRUCTOR
    public Coche(String marca, String modelo, String color, int annoMatriculacion, int plazas)
    {
        //associación entre el valor al crear el objeto y el nombre de la propiedad
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.annoMatriculacion = annoMatriculacion;
        this.plazas = plazas;
    }
    
    
            
    
    
}
