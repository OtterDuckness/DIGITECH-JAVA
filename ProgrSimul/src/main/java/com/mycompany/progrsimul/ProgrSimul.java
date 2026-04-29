
package com.mycompany.progrsimul;

import java.util.Scanner;


public class ProgrSimul {

    public static void main(String[] args) {
        
        
        //Tarea 1
        System.out.println("\n Tarea 1 \n");
        
        Scanner input = new Scanner(System.in);
        int x, y;
        String menu;
        
        System.out.println("Introduce numero 1");
        x = input.nextInt();
        System.out.println("Introduce numero 2");
        y = input.nextInt();
        
        System.out.println("Introduce la opercaion (+, -, *, /)");
        menu = input.next();
        
        switch (menu)
        {
            case "+":
            {
                int z = x + y;
                System.out.println("La suma: " + z);
                break;
            }
            case "-":
            {
                int z = x - y;
                System.out.println("La resta: " + z);
                break;
            }
            case "*":
            {
                int z = x * y;
                System.out.println("La multiplicacion: " + z);
                break;
            }
            case "/":
            {
                if (y == 0)
                {
                    System.out.println("La operacion no esta permitida");
                    break;
                }
                else
                {
                    int z = x / y;
                    System.out.println("La division: " + z);
                    break;
                }
                
            }
                    
        }
    }
}
