
package com.mycompany.metodos1;

public class Metodos1 {

    public static void main(String[] args) {
        
        //creamos el primer objeto
        vehiculo micoche = new vehiculo("citroen", "c3", "4583kfb", 2020, "blanco");
        vehiculo micoche2 = new vehiculo("seat", "ibiza", "4523FBB", 2021, "negro");
        
        //utilizamos los metodos
        //metodo void
        micoche.imprimir_datos();
        micoche2.imprimir_datos();
        
        //metodo que recibe y devuelve valores
        int resultado1 = micoche.calcular_annos(2020);
        int resultado2 = micoche.calcular_annos(2021);
        
        System.out.println("El valor que devuelve la funcion es: " + resultado1);
        System.out.println("El valor que devuelve la funcion es: " + resultado2);
        
        //metodo que solo tiene parametros de entrada
        micoche.dato_color("blanco");
        micoche2.dato_color("negro");
        
        
    }
}
