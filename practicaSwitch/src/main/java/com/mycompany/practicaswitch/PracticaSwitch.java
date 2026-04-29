

package com.mycompany.practicaswitch;

import java.util.Scanner;


public class PracticaSwitch {

    public static void main(String[] args) {
        double x = 0;
        double y = 0;
        double suma, resta, multi, div, mod;
        String operacion = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero 1 (maximo de tres cifras y positivo): ");
        x = input.nextInt();
        
        System.out.println("Introduce un numero 2 (maximo de tres cifras y positivo): ");
        y = input.nextInt();
        
        if (x>0 && y > 0 && x < 1000 && y < 1000)
        {
            System.out.println("Introduce un operacion (+,-,*,/,%): ");
            operacion = input.next();

            switch (operacion)
            {
                case "+":
                    suma = x + y;
                    System.out.println(suma);
                    break;
                case "-":
                    resta = x - y;
                    System.out.println(resta);
                    break;
                case "*":
                    multi = x * y;
                    System.out.println(multi);
                    break;
                case "/":
                    div = x / y;
                    System.out.println(div);
                    break;
                case "%":
                    mod = x % y;
                    System.out.println(mod);
                    break;
                default:
                    System.out.println("No has introducido una operacion valida");
            }
        }
        else 
        {
            System.out.println("No has introducido los numeros correctos");
        }
        input.close();
    }
}
