
package com.mycompany.practicaarray2;

import java.util.Scanner;

public class PracticaArray2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        //tarea 1
        System.out.println("Tarea 1");
        int [] tarea1 = new int[10];
        
        for (int i = 0; i < tarea1.length; i++)
        {
            tarea1[i] = i+1;
        }
        for (int i = tarea1.length - 1; i >= 0; i--) //imprimir el inverso del array
        {
            System.out.println(tarea1[i]);
        }
        
        //tarea 2
        System.out.println(" ");
        System.out.println("Tarea 2");
        System.out.println(" ");
        int ar_size1 = 0;
        int ar_size2 = 0;
        
        System.out.println("Introduce el tamano de array 1: "); //creamos el primer array
        ar_size1 = input.nextInt();

        int [] tarea2_1 = new int[ar_size1];
        for (int i = 0; i < tarea2_1.length; i++)
        {
            System.out.println("Rellenamos el array 1. Introduce numero " + (i+1) + ": "); //rellenamos array 1
            tarea2_1[i] = input.nextInt();
        }
        
        System.out.println("Introduce el tamano de array 2: "); //creamos el segundo array
        ar_size2 = input.nextInt();
        
        int [] tarea2_2 = new int[ar_size2];
        for (int i = 0; i < tarea2_2.length; i++)
        {
            System.out.println("Rellenamos el array 2. Introduce numero " + (i+1) + ": "); //rellenamos array 2
            tarea2_2[i] = input.nextInt();
        }
        
        int [] tarea2_3 = new int[ar_size1 + ar_size2]; //creamos el array 3
        
        for (int i = 0; i < tarea2_1.length; i++) //copiamos los datos del array 1 a array 3
        {
            tarea2_3[i] = tarea2_1[i];
        }
        for (int i = tarea2_1.length; i < tarea2_3.length; i++) //copiamos los datos del array 2 a array 3
        {
            tarea2_3[i] = tarea2_2[i-tarea2_1.length];
        }
        
        for (int i = 0; i < tarea2_3.length; i++) //imprimimos array 3
        {
            System.out.println("Valor " + (i+1) + " del array 3: " +tarea2_3[i]);
        }
        
        //tarea 3
        System.out.println(" ");
        System.out.println("Tarea 3");
        System.out.println(" ");
        
        String [] tarea3_1 = {"a", "e", "r", "t", "y", "u"}; //array 1
        int [] tarea3_2 = {1, 2, 3, 4, 5, 6};  //array 2
        
        int ar_size_t3 = tarea3_1.length + tarea3_2.length; //calculamos el tamano del array 3
        int [] tarea3_3 = new int[ar_size_t3]; //creamos arrary 3
        
        System.out.println("El tamano del array 3: " + tarea3_3.length);  //imprimimos el tamano del array 3
        
        //tarea 4
        System.out.println(" ");
        System.out.println("Tarea 4");
        System.out.println(" ");
        
        int tarea4_par = 0;
        int tarea4_impar = 0;
        int [] tarea4 = new int[57]; //crear un array
        for (int i = 0; i < tarea4.length; i++) //rellenar el array
        {
            tarea4[i] = i + 1;
            if (tarea4[i]%2 == 0)
            {
                tarea4_par++;
            }
            else
                tarea4_impar++;
        }
        System.out.println("Numero de celdas que contienen numeros pares: " + tarea4_par);
        System.out.println("Numero de celdas que contienen numeros impares: " + tarea4_impar);
        
        
        //tarea 5
        System.out.println(" ");
        System.out.println("Tarea 5");
        System.out.println(" ");
        
        int [] tarea5 = new int[6]; 
        double media = 0; //not media
        
        for (int i = 0; i < tarea5.length; i++) //rellenamos el array
        {
            System.out.println("Introduce calificacion " + (i+1) + ": ");
            tarea5[i] = input.nextInt();
        }
        
        for (int i = 0; i < tarea5.length; i++) //calculamos nota media
        {
            media = (double)(media + tarea5[i]);
        }
        media = media / tarea5.length;
        System.out.println("Nota media: " + media); //imprimimos resultados
        if (media >= 5)
        {
            System.out.println("La calificación es aprobado");
            if (media > 5 && media <= 6.5)
            {
                System.out.println("La calificación es bien");
            }
            else if (media > 6.5 && media <= 8.5)
            {
                System.out.println("La calificación es notable");
            }
            else if (media > 8.5 && media <= 9)
            {
                System.out.println("La calificación es saliente");
            }
            else if (media > 9)
            {
                System.out.println("La calificación es sobresaliente");
            }
        }
        else if (media < 5)
        {
            System.out.println("La calificación es suspenso");
        }
    }
}
