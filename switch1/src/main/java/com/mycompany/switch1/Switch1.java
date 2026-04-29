

package com.mycompany.switch1;

import java.util.Scanner;


public class Switch1 {

    public static void main(String[] args) {
        //pedir por pantañña un numero 1-8
        int numero1;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un valor del 1-5 ");
        numero1 = input.nextInt();
        
        switch (numero1)
        {
            case 1:
                System.out.println("Has elegido el numero 1 ");
            break;
            
            case 2:
                System.out.println("Has elegido el numero 2 ");
            break;
            
            case 3:
                System.out.println("Has elegido el numero 3");
            break;
            
            case 4:
                System.out.println("Has elegido el numero 4");
            break;
            
            case 5:
                System.out.println("Has elegido el numero 5");
            break;
            
            default:
                System.out.println("Dato no valido, has elegido un valor que no está comprendido entre el 1-5");
                   
        }
    }
}
