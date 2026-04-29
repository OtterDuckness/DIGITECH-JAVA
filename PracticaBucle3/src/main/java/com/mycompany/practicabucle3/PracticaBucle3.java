
package com.mycompany.practicabucle3;

import java.util.Scanner;


public class PracticaBucle3 {

    public static void main(String[] args) {
        //tarea 1
        
        int tarea1 = 0;
        
        for (int i=1; i < 101; i++)
        {
            tarea1 ++;
            System.out.println(tarea1);
        }
        
        System.out.println("Ahora con bucle while");
        tarea1 = 0;
        while (tarea1 < 100)
        {
            tarea1 ++;
            System.out.println(tarea1);
        }
        
        //tarea 2
        
        int tarea2 = 1;
        int suma = 0;
        Scanner imp = new Scanner(System.in);
        
        while (tarea2 > 0)
        {
            System.out.println("Introduce numeros enteros postitivos. Introduce un número negativo para parar: ");
            tarea2 = imp.nextInt();
            suma = suma + tarea2;
            System.out.println("Suma: " + suma);
        }
        
        //tarea 3
        
        String tarea3;
        int suma3;
        int resta3;
        int mult3;
        int x;
        int y;
        System.out.println("Sumar dos números ");
        System.out.println("Restar dos números ");
        System.out.println("Multiplicar dos números ");
        System.out.println("Salir ");
        
        
        do 
                {
                    
                    tarea3 = imp.nextLine();
                            if (tarea3.equals("Sumar dos números"))
                            {
                                System.out.println("Introduce número 1: ");
                                x = imp.nextInt();
                                System.out.println("Introduce número 2: ");
                                y = imp.nextInt();
                                suma3 = x + y;
                                System.out.println("Suma: " + suma3);
                                System.out.println(" ");
                                System.out.println("Sumar dos números ");
                                System.out.println("Restar dos números ");
                                System.out.println("Multiplicar dos números ");
                                System.out.println("Salir ");
                                
                            }
                            else if (tarea3.equals("Restar dos números"))
                            {
                                System.out.println("Introduce número 1: ");
                                x = imp.nextInt();
                                System.out.println("Introduce número 2: ");
                                y = imp.nextInt();
                                resta3 = x - y;
                                System.out.println("Resta: " + resta3);
                                System.out.println(" ");
                                System.out.println("Sumar dos números ");
                                System.out.println("Restar dos números ");
                                System.out.println("Multiplicar dos números ");
                                System.out.println("Salir ");
                            }
                            else if (tarea3.equals("Multiplicar dos números"))
                            {
                                System.out.println("Introduce número 1: ");
                                x = imp.nextInt();
                                System.out.println("Introduce número 2: ");
                                y = imp.nextInt();
                                mult3 = x * y;
                                System.out.println("Mult: " + mult3);
                                System.out.println(" ");
                                System.out.println("Sumar dos números ");
                                System.out.println("Restar dos números ");
                                System.out.println("Multiplicar dos números ");
                                System.out.println("Salir ");
                            }
                }
                while (!tarea3.equals("Salir"));
              
    }
}
