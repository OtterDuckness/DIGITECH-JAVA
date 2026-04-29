
package com.mycompany.practicaclasesabstractas1;


public class PracticaClasesAbstractas1 {

    public static void main(String[] args) {
        
        
        cactus test = new cactus("Test", 2);
        
        System.out.println("Nombre: " + test.getNombre());
        System.out.println("Edad: " + test.getEdad());
        
        System.out.println("Sistema de riego: " + test.sistemaDeRiego("interior"));
    }
}
