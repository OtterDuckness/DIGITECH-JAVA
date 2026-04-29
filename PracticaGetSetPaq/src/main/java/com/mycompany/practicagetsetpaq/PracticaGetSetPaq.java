
package com.mycompany.practicagetsetpaq;

import Vector.Vector1;
import Vector.Vector2;
import java.util.Scanner;


public class PracticaGetSetPaq {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int menu;
        Double num1, num2, resultado;
        Numero1 calcular = new Numero1();
        
        
        //tarea 2
        System.out.println("Tarea 2");
        Vector1 test = new Vector1(); //tarea 2, de vector1, para mostrarlo antes de menu principal de la tarea1
        test.rellenarVector();
        test.derecho();
        test.izq();
        
        //tarea 3
        System.out.println("Tarea 3");
        Vector2 test2 = new Vector2();
        test2.rellenar(test2.A);
        test2.rellenar(test2.B);
        test2.calcular();
        test2.visualizar();
        
        
        //Tarea 1
        do
        {
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            
            menu = input.nextInt();
            
            if (menu == 1)
            {
                num1 = calcular.pedirNumero();
                num2 = calcular.pedirNumero();
                resultado = calcular.sumar(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            else if (menu == 2)
            {
                num1 = calcular.pedirNumero();
                num2 = calcular.pedirNumero();
                resultado = calcular.restar(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            else if (menu == 3)
            {
                num1 = calcular.pedirNumero();
                num2 = calcular.pedirNumero();
                resultado = calcular.multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            else if (menu == 4)
            {
                num1 = calcular.pedirNumero();
                num2 = calcular.pedirNumero();
                resultado = calcular.dividir(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
        }
        while (menu != 5);
    }
    
}
