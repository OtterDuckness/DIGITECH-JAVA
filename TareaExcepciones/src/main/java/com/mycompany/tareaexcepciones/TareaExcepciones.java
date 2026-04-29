
package com.mycompany.tareaexcepciones;

import java.util.Scanner;


public class TareaExcepciones {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1;
        int num2;
        int resultado;
        
        try
        {
            System.out.println("Introduce numero 1: ");
            num1 = input.nextInt();

            System.out.println("Introduce numero 2: ");
            num2 = input.nextInt();
            
            if (num1 <= 0)
            {
                throw new IllegalArgumentException("numero 1 tiene que ser > 0");
            }
            
            if (num1 < 100)
            {
                throw new IllegalArgumentException("numero 1 tiene que ser >= 100");
            }
            
            resultado = num1 / num2;
            System.out.println(resultado);
            
        }catch(ArithmeticException e) {
            System.out.println("No se puede dividir por 0");
   
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
