
package com.mycompany.practicamath5;

import java.util.Scanner;


public class PracticaMath5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //tarea 1
        System.out.println(" ");
        System.out.println("Tarea 1");
        System.out.println(" ");
        double radio = 0;
        
        System.out.println("Introduce un radio de un circulo: ");
        radio = input.nextDouble();
        long area = Math.round(Math.pow(radio, 2)*Math.PI); //calculamos area
        System.out.println("Area: " + area);
        
        //tarea2
        System.out.println(" ");
        System.out.println("Tarea 2");
        System.out.println(" ");
        
        
        int contador = 10;
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
        long lanz = 0;
        long tarea2 = -2;
        double promedio = 0;
        for (int i = 0; i < contador; i++) //hacemos 10 lanzamientos
        {
            do
            {
                tarea2 = Math.round(Math.random()*10); //primero lanzamiento
                if (tarea2 > 3 && tarea2 < 7) //si tenemos 4, 5 o6 en el primero lanzamiento, hacemos el secundo lanzamiento
                    //(el doble de probabilidad)
                {
                    tarea2 = Math.round(Math.random()*10);
                }
            }
            while (tarea2 < 1 || tarea2 > 6);
            if (tarea2 == 1)  //contamos cuantas veces salen cada numero
            {
                n1++;
            }
            else if (tarea2 == 2)
            {
                n2++;
            }
            else if (tarea2 == 3)
            {
                n3++;
            }
            else if (tarea2 == 4)
            {
                n4++;
            }
            else if (tarea2 == 5)
            {
                n5++;
            }
            else if (tarea2 == 6)
            {
                n6++;
            }
            
            System.out.println(tarea2);
            lanz = lanz + tarea2; 
 
        }
        System.out.println("1: " + n1);
        System.out.println("2: " + n2);
        System.out.println("3: " + n3);
        System.out.println("4: " + n4);
        System.out.println("5: " + n5);
        System.out.println("6: " + n6);
        promedio = (double)lanz/contador; //contamos el promedio
        System.out.printf("Promedio: " + "%.2f%n", promedio);
        
        
        //tarea 3
        System.out.println(" ");
        System.out.println("Tarea 3");
        System.out.println(" ");
        
        double x1 = 0, x2 = 0, y1 = 0, y2 = 0, distancia = 0, energia = 0;
        
        System.out.println("Introduce coordinates, x1: ");
        x1 = input.nextDouble();
        System.out.println("Introduce coordinates, y1: ");
        y1 = input.nextDouble();
        System.out.println("Introduce coordinates, x2: ");
        x2 = input.nextDouble();
        System.out.println("Introduce coordinates, y2: ");
        y2 = input.nextDouble();
        
        distancia = Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));  //calculamos la distancia
        System.out.printf("la distancia: " + "%.2f%n", distancia);
        energia = Math.pow(distancia, 3); //calculamos la energia
        System.out.printf("La energia gastada: " + "%.2f%n", energia);
        if (energia > 1000)
        {
            System.out.println("Energia demasiado alta: recorrido no recomendado");
        }
    }
}
