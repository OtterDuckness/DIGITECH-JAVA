

package com.mycompany.tareahilos;

import java.util.Scanner;

public class Hilo extends Thread{
    
    @Override
    public void run()
    {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 100000; i++)
        {
            System.out.print("Introduce numero 1: ");
            int num1 = input.nextInt();

            System.out.print("Introduce numero 2: ");
            int num2 = input.nextInt();

            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Resta: " + (num1 - num2));
            System.out.println("Multiplicacion: " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("Division: " + (num1 / num2));
            } else {
                System.out.println("No se puede dividir por 0");
            }
        }
    }

}
