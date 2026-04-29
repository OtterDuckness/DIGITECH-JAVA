package com.mycompany.practicanot;
import java.util.Scanner;



public class PracticaNOT {

    public static void main(String[] args) {
        // tarea 1
        int numero1;
        Scanner datospantalla = new Scanner(System.in);
        
        System.out.println("Introduce un número");
        numero1 = datospantalla.nextInt();
        
       if (numero1 != 0 && numero1>0)
       {
           if (numero1%2!=0)
           {
               System.out.println("Es impar");
           }
           else 
           {
               System.out.println("Es par");
           }
       }
       else
       {
           System.out.println("Error");
       }
       
       //tarea 2
        System.out.println("Introduce un número");
        numero1 = datospantalla.nextInt();
        
        if (numero1 > 0)
        {
            if (numero1>9 && numero1 < 100)
            {
                if (numero1%2==0)
                {
                    System.out.println("Es par");
                }
                else
                {
                    System.out.println("Es impar");
                }
            }
            else if (numero1 < 1000 && numero1 > 99)
            {
                System.out.println(numero1 / 2);
            }
        }
        else
        {
            System.out.println("Error");
        }
        
    }
}
