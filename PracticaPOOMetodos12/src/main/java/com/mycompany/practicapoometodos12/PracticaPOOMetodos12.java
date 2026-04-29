
package com.mycompany.practicapoometodos12;

import java.util.Scanner;


public class PracticaPOOMetodos12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Areas calcular = new Areas();
        double radius;
        double area1;
        int a, b, area2;
        
        System.out.println("Introduce radius");
        radius = input.nextDouble();
        
        area1 = calcular.circulo(radius); //llamamos el metodo de area de un circulo
        System.out.println("El area del circulo: " + area1);
        
        
        System.out.println("Introduce a: ");
        a = input.nextInt();
        System.out.println("Introduce b: ");
        b = input.nextInt();
        area2 = calcular.rectangulo(a, b); //llamamos el metodo de area de un rectangulo
        System.out.println("El area del rectangulo: " + area2);
    }
}
