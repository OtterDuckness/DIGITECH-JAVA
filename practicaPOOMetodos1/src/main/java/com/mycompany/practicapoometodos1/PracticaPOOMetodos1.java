

package com.mycompany.practicapoometodos1;

import java.util.Scanner;


public class PracticaPOOMetodos1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Animal perro = new Animal ("Perro", 4, "Hogar", 15);  //creamos animales
        Animal pez = new Animal ("Pez", 0, "Mar", 2);
        Animal cocodrilo = new Animal ("Cocodrilo", 3, "Rio", 10);
        
        
        perro.imprimir(); //un metodo para imprimir los datos del perro
        
        System.out.println("\nPEZ:");
        System.out.println("Antes: \n");
        pez.imprimir();
        
        pez.patos(2); //un metodo para cambiar la cantidad de patos pel pez
        System.out.println("Despues: \n");
        pez.imprimir();
        
        System.out.println("Introduce el ano de hoy: ");
        int ano = input.nextInt(); 
        System.out.println("El ano de nacimiento del cocodrilo: " + cocodrilo.fecha(ano)); //un metodo para calcular el ano de nacimiento del cocdrilo
    }
}
