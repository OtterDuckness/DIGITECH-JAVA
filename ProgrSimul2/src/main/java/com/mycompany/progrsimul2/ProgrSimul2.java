
package com.mycompany.progrsimul2;

import java.util.Random;
import java.util.Scanner;

public class ProgrSimul2 {

    public static void main(String[] args) {
        
        //tarea 2
        
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int aleatorio, intento, menu;
        
        aleatorio = r.nextInt(1, 100);
        do
        {
            System.out.println("\nTienes que adivinar un numero (1-100)");
            System.out.println("1. Ingresar un numero");
            System.out.println("2. Ver el numero");
            System.out.println("3. Salir");
            menu = input.nextInt();
            
            if (menu == 1)
            {
                System.out.println("Introduce un numero");
                intento = input.nextInt();
                if (intento > 0 && intento < 101)
                {
                    if (intento == aleatorio)
                    {
                        System.out.println("Has adivinado!");
                        break;
                    }
                    else
                    {
                        System.out.println("No has adivinado.");
                        if (intento < aleatorio)
                        {
                            System.out.println("El numero adivinado es mayor que tuyo");
                        }
                        else 
                        {
                            System.out.println("El numero adivinado es menor que tuyo");
                        }
                    }
                }
                else
                {
                    System.out.println("El numero tiene que ser 1-100");
                }
            }
            
            if (menu == 2)
            {
                System.out.println("El numero adivinado es: " + aleatorio);
            }
            

        }
        while (menu !=3);
    }
}
