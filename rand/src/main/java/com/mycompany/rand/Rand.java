
package com.mycompany.rand;

//importamos la clase Random del paquete util
import java.util.Random;

public class Rand {

    public static void main(String[] args) {
        
        //creamos un objeto de tipo clase random
        Random aleatorio = new Random();
        
        //usamos los métodos de la clase Random
        
        //guardamos un aleatorio entre 0-9
        int numero1 = aleatorio.nextInt(10);
        //mostramos por pantalla el valor aleatorio creado
        System.out.println("El valor aleatorio entre 0-9 es: " + numero1);
        
        //mostrar un valor aleatorio decimal
        System.out.println("El valor aleatorio decimal es: " + aleatorio.nextDouble());
        
        //creamos un valor aleatorio booleano
        System.out.println("El valor aleatorio boolean es: " + aleatorio.nextBoolean());
        
        
        
        
        
        
        
    }
}
