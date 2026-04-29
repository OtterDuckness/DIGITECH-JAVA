
package com.mycompany.practicamath2;

import java.util.Scanner;

public class PracticaMath2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //tarea 1
        int radio = 0;
        
        System.out.println("Introduce un radio de un circulo: ");
        radio = input.nextInt();
        long area = Math.round(Math.pow(radio, 2)*Math.PI); //calculamos area
        System.out.println("Area: " + area);
        
        //tarea2
        int tarea2 = 0; //cantidad de numeros aleatorios
        //double tarea2al = 0; //numeros aleatorios
        
        System.out.println("Cuantos numeros aleatorios? ");
        tarea2 = input.nextInt();
        for (int i = 0; i < tarea2; i++)
        {
            System.out.println(Math.random());
        }
        
        //tarea3
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
            System.out.println((int)Math.floor(Math.random()*(num2-num1+1)+num1));
        }
        
        //tarea 4
        double b = 0;
        double a = 0;
        double c = 0;
        double x1 = 0;
        double x2 = 0;
        
        System.out.println("Introduce a: ");
        a = input.nextInt();
        System.out.println("Introduce b: ");
        b = input.nextInt();
        System.out.println("Introduce c: ");
        c = input.nextInt();
        
        x1 = (-b + Math.sqrt((b*b - 4*a*c)))/(2*a);
        x2 = (-b - Math.sqrt((b*b - 4*a*c)))/(2*a);
        
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

    }
}
