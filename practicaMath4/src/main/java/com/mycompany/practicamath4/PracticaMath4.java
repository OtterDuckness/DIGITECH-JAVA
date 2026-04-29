
package com.mycompany.practicamath4;

import java.util.Scanner;


public class PracticaMath4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        //tarea 1
        System.out.println(" ");
        System.out.println("Tarea 1");
        System.out.println(" ");
        
        double radio = 0, volumen = 0;
        
        System.out.println("Introduce radio: ");
        radio = input.nextDouble();
        volumen = Math.PI*Math.pow(radio, 3)*4/3; //calculamos el volumen
        System.out.printf("Volumen : " + "%.2f%n", volumen);
        
        //tarea 2
        System.out.println(" ");
        System.out.println("Tarea 2");
        System.out.println(" ");
        
        double a = 0, b = 0, c = 0, area = 0, p = 0;
        
        System.out.println("Introduce a: ");
        a = input.nextDouble();
        System.out.println("Introduce b: ");
        b = input.nextDouble();
        System.out.println("Introduce c: ");
        c = input.nextDouble();
        
        p = (a + b + c) / 2; //calculamos perimetro
        System.out.println("P: " + p);
        
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c)); //calculamos area
        System.out.printf("Area: " + "%.2f%n", area);

    }
}
