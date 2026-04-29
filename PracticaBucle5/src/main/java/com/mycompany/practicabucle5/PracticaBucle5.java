
package com.mycompany.practicabucle5;

import java.util.Scanner;


public class PracticaBucle5 {

    public static void main(String[] args) {
        System.out.println("Tarea 1");
        //tarea1
        Scanner imp = new Scanner(System.in);
        int tarea1 = 1;

        while (tarea1 > 0)
        {
            System.out.println("Introduce un numero para comprobar si es primo: ");
            tarea1 = imp.nextInt();
            int x = 0; //contador de divisiones
            for (int i = 1; i < tarea1; i++)
            {
                if (tarea1%i == 0)
                {
                    x ++;
                }
            }
            if (x > 2)
            {
                 System.out.println("No es primo ");
            }
            else
            {
                 System.out.println("Es primo ");
            }

        }
        
        //tarea2
        System.out.println(" ");
        System.out.println("Tarea 2");
        int fib = 0;  //primeros valores
        int tarea2 = 1;
        int suma;
        System.out.println(fib);
        System.out.println(tarea2);
        
        for (int i = 2; i < 10; i++)
        {
            suma = fib + tarea2;
            fib = tarea2;
            tarea2 = suma;
            System.out.println(suma);
        }
        
        //tarea 3
        System.out.println(" ");
        System.out.println("Tarea 3");
        long tarea3 = 15;
        
        for (int i = 1; i < 15; i++)
        {
            tarea3 = tarea3 * (15 - i); //factorial
        }
        System.out.println(tarea3);
        
        //tarea 4
        System.out.println(" ");
        System.out.println("Tarea 4");
        
        int tarea4 = 1;
        
        while (tarea4 > 0)
        {
            System.out.println("Introduce un numero 0 - 999");
            tarea4 = imp.nextInt();
            if (tarea4 > 0 && tarea4 < 10)
            {
                System.out.println("Tiene 1 digito");
            }
            else if (tarea4 > 9 && tarea4 < 100)
            {
                System.out.println("Tiene 2 digitos");
            }
            else if (tarea4 > 99 && tarea4 < 1000)
            {
                System.out.println("Tiene 3 digitos");
            }
            else
            {
                System.out.println("Introduce un numero 0 - 999 ");
            }
        }
        System.out.println("Has tecleado 0 ");
        
        
        //tarea 5
        
        System.out.println(" ");
        System.out.println("Tarea 5");
        
        int tarea5 = 1;
        int mult5 = 1;
        
        while (tarea5 > 0)
        {

            System.out.println("Introduce un numero mayor que 0");
            tarea5 = imp.nextInt();
            if (tarea5 > 0)
            {
                mult5 = mult5 * tarea5; //guarda y multiplica los numeros
            }

        }
        System.out.println("Has tecleado 0. El multiplo de los numeros tecleados: " + mult5);
    }
}