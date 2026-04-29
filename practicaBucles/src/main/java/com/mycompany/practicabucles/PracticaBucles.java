
package com.mycompany.practicabucles;
import java.util.Scanner;

public class PracticaBucles {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        System.out.println(x);
        for (int i=0; x < 1000; i++) //tarea 1
        {
            x = x + 5;
            System.out.println(x);           
        }
        System.out.println(y);
        for (int i=0; y < 10000; i++) //tarea 2
        {
            y = y + 10;
            System.out.println(y);
        }
        
        String nombre; //tarea 3
        int veces;
        Scanner datospantalla = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre: ");
        nombre = datospantalla.next();
        
        System.out.println("Cuantas veces quieres imprimir el nombre: ");
        veces = datospantalla.nextInt();
        
        for (int i = 0; i < veces; i++)
        {
            System.out.println(nombre);
        }
        
        //tarea 4
        int notzero;
        
        do
        {
            System.out.println("Introduce un número. Introduce 0 para parar: ");
        notzero = datospantalla.nextInt();
        }
        while (notzero != 0);

        //tarea 5
        
        int tarea5 = 1;
        
        do
        {
            System.out.println(tarea5++);
        }
        while (tarea5 < 101);
        
        //tarea 6
        int tarea6 = 1;
        while (tarea6 < 101)
        {
            System.out.println(tarea6++);
        }
        datospantalla.close();
    }
}
