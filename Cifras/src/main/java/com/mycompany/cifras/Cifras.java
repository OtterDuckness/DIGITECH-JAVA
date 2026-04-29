package com.mycompany.cifras;
import java.util.Scanner;

public class Cifras {

    public static void main(String[] args) {
        int dato;
        Scanner datospantalla = new Scanner(System.in);
        
        System.out.println("Introduce un número entero:");
        dato = datospantalla.nextInt();
        
        if (dato > -10 && dato < 10)
        {
            System.out.println("1 cifra");
        }
        else if (dato > -100 && dato < 100) 
        {
            System.out.println("2 cifras");
        }
        else if (dato > -1000 && dato < 1000)
        {
            System.out.println("3 cifras");
        }
        else
        {
            System.out.println("más de 3 cifras");
        }
    }
}
