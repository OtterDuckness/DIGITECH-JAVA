
package com.mycompany.practicamath3;

import java.util.Scanner;
import java.math.BigDecimal;

public class PracticaMath3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //tarea 1
        System.out.println(" ");
        System.out.println("Tarea 1");
        System.out.println(" ");
        
        double tarea1 = 0; //segundos
        String t1 = "s"; 
        
        do
        {
            System.out.println("Introduce segundos: ");
            tarea1 = input.nextInt();
            tarea1 = Math.ceil(tarea1/60);
            System.out.println("El minuto es el " + (int)tarea1);
            
            System.out.println("¿Otro valor (s/n)?");
            t1 = input.next();
        }
        while (t1.equals("s") == true);
        
        //tarea 2
        //generar un valor aleatoreo, devolver un valor absoluto,
        //redondear un numero, calcular la potencia, 
        //elegir un valor maximo entre dos valores muy grandes
        
        System.out.println(" ");
        System.out.println("Tarea 2");
        System.out.println(" ");
        
        int x;
         double rand,y,z;
         float max;
         rand = Math.random(); //generar un valor aleatoreo,
         x = Math.abs( -123 ); //devolver un valor absoluto,
         y = Math.round( 123.567 ); //redondear un numero,
         z = Math.pow( 2,4 ); //calcular la potencia,
         max = Math.max( (float)1e10,(float)3e9 ); //elegir un valor maximo entre dos valores muy grandes

         System.out.println( rand ); //imprimir todo
         System.out.println( x );
         System.out.println( y );
         System.out.println( z );
         System.out.println( max );
         
         
         //tarea 3
        System.out.println(" ");
        System.out.println("Tarea 3");
        System.out.println(" ");
         
        //es una tarea para calcular la constant e (de Euler)
         BigDecimal e; //necesitamos un tipo de dato con muchos decimales para precision alta
         BigDecimal factor;
         e = new BigDecimal( "1" ).setScale(300,BigDecimal.ROUND_DOWN); //declaramos variables con 300 decimales
         factor = new BigDecimal( "1" ).setScale( 300,BigDecimal.ROUND_DOWN );
         // Se obtiene la expresión del paréntesis de la fórmula
         factor = factor.divide( new BigDecimal( 200 ),BigDecimal.ROUND_DOWN ); 
         factor = factor.add( new BigDecimal( 1 ) );
         for( int i=1; i < 200; i++ ) //calculamos el resultado
         e = e.multiply( factor );
         System.out.println( e );

    }
}
