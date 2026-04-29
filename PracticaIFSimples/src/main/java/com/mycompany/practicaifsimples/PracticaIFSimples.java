package com.mycompany.practicaifsimples;
import java.util.Scanner;

public class PracticaIFSimples {

    public static void main(String[] args) {
        
        // tarea 1
        int numero1;
        int numero2;
        Scanner datospantalla = new Scanner(System.in);
        
        System.out.println("Introduce el primero número");
        numero1 = datospantalla.nextInt();
        
        System.out.println("Introduce el segundo número");
        numero2 = datospantalla.nextInt();
        
        if (numero1 > numero2)
        {
            System.out.println("El primero número es mayor que el segundo");
        }
        else if (numero1 < numero2)
        {
            System.out.println("El segundo número es mayor que el primero");
        }
        else 
        {
            System.out.println("Son iguales");
        }
        
        // tarea 2
        int numero3;
        int max;
        int min;
        
        System.out.println("Introduce número 1");
        numero1 = datospantalla.nextInt();
        
        System.out.println("Introduce número 2");
        numero2 = datospantalla.nextInt();
        
        System.out.println("Introduce número 3");
        numero3 = datospantalla.nextInt();
        
        max = numero1;
        if (max < numero2)
        {
            max = numero2;
        }
        if (max < numero3)
        {
            max = numero3;
        }
      

        System.out.println(max);
        
        min = numero1;
        
        if (min > numero2)
        {
            min = numero2;
        }
        if (min > numero3)
        {
            min = numero3;
        }
        
       
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        int resultado1 = max + numero3;
        int resultado2 = min * numero3;
        
        System.out.println("Max + numero 3: " + resultado1);
        System.out.println("Min * numero 3: " + resultado2);
        
  
        //tarea 3
        int numero4;
        
        System.out.println("Introduce número 1");
        numero1 = datospantalla.nextInt();
        
        System.out.println("Introduce número 2");
        numero2 = datospantalla.nextInt();
        
        System.out.println("Introduce número 3");
        numero3 = datospantalla.nextInt();
        
        System.out.println("Introduce número 4");
        numero4 = datospantalla.nextInt();
        
        
        max = numero1;
        if (max < numero2)
        {
            max = numero2;
        }
        if (max < numero3)
        {
            max = numero3;
        }
        if (max < numero4)
        {
            max = numero4;
        }

        System.out.println(max);
        
        min = numero1;
        
        if (min > numero2)
        {
            min = numero2;
        }
        if (min > numero3)
        {
            min = numero3;
        }
        if (min > numero4)
        {
            min = numero4;
        }

        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        
        resultado1 = max + numero2;
        resultado2 = min * numero1;
        
        System.out.println("Max + numero 2: " + resultado1);
        System.out.println("Min * numero 1: " + resultado2);

    }


}
