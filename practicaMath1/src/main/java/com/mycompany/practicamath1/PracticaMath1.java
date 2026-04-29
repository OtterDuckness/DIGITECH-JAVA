
package com.mycompany.practicamath1;

import java.util.Scanner;


public class PracticaMath1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0; //min
        int num2 = 0; //max
        int cant = 0; //cantidad
        int suma = 0; //suma
        
        System.out.println("Introduce valor minimo: ");
        num1 = input.nextInt();
        System.out.println("Introduce valor maximo: ");
        num2 = input.nextInt();
        System.out.println("Cuantos numeros aleatorios: ");
        cant = input.nextInt();
        
        for (int i = 0; i < cant; i++)
        {
            suma = suma + (int)Math.floor(Math.random()*(num2-num1+1)+num1);
            //System.out.println(suma);
        }
        
        System.out.println("Suma: " + suma);
        
    }
}
