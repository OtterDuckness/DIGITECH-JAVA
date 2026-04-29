
package com.mycompany.practicaarray3;

import java.util.Random;
import java.util.Scanner;


public class PracticaArray3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        //tarea1
        System.out.println(" ");
        System.out.println("Tarea 1");
        System.out.println(" ");
        
        int tarea1_length = 15; //cantidad de nombres para un cambio facil (!!!!!!!!)
        boolean repetir = false;  //condicion para un bucle de repeticion en caso del nombre repetido
        String [] tarea1 = new String[tarea1_length];

        for (int i = 0; i < tarea1.length; i++)
        {
            do //un bucle para repetir la introduccion del nombre en case de que este repetido
            {
                System.out.println("Introduce nombre " + (i+1) + ":");
                tarea1[i] = input.nextLine();

                for (int y = 0; y < i; y++) //un bucle para detectar si el nombre esta repetido
                {
                    if (tarea1[i].equals(tarea1[y]))
                    {
                        System.out.println("Usted ya fue inscrito");
                        repetir = true;
                        break;
                    }
                    else
                    {
                        repetir = false;
                    }
                }
            }
            while (repetir == true);
        }
        for (int i = 0; i < tarea1.length; i++) //imprimir el array
        {
            System.out.println("Nombre " + (i+1) + " : " + tarea1[i]);
        }
        
        
        //tarea 2
        System.out.println(" ");
        System.out.println("Tarea 2");
        System.out.println(" ");
        
        int tarea2_length = 20; //cantidad de posiciones para un cambio facil (!!!!!!!!)
        String [] tarea2 = new String[tarea2_length]; //array primario
        String [] tarea2_invert = new String[tarea2_length]; //array invertido
        boolean tarea2_cap = true;
        
        
        for (int i = 0; i < tarea2.length; i++) //rellenamos el array primario
        {
            System.out.println("Introduce posicion " + (i+1) + ":");
            tarea2[i] = input.nextLine();
            //System.out.println("t2: " + tarea2[i]);
        }
        for (int i = 0; i < tarea2_invert.length; i++) //rellenamos el array invertido
        {
            tarea2_invert[i] = tarea2[tarea2_length - 1 - i];
            //System.out.println("t2i: " + tarea2_invert[i]);
        }
        System.out.println("Array: ");
        for (int i = 0; i < tarea2.length; i++)
        {
            System.out.print(tarea2[i] + " ");
        }
        for (int i = 0; i < tarea2.length; i++) //comparamos dos arrays para comprobar si es capicua
        {
            if (!tarea2[i].equals(tarea2_invert[i]))
            {
                System.out.println("\nNo es capicua!");
                tarea2_cap = false;
                break;
            }
        }
        if (tarea2_cap == true)
        {
            System.out.println("\nEs capicua!");
        }
        
        //tarea 3
        System.out.println(" ");
        System.out.println("Tarea 3");
        System.out.println(" ");
        
        
        System.out.println("Introduce el tamano de los arrays: ");
        int tarea3_tamano = input.nextInt();
        int [] tarea3_1 = new int[tarea3_tamano]; //introducimos dos arrays
        int [] tarea3_2 = new int[tarea3_tamano];
        int [] tarea3_3 = new int[tarea3_tamano]; //un array temporal
        
        for (int i = 0; i < tarea3_1.length; i++) //rellenamos el array 1 con valores aleatorios
        {
            tarea3_1[i] = r.nextInt(1000);
        }
        System.out.println("\nArray 1: "); //imprimimos array 1
        for (int i = 0; i < tarea3_1.length; i++)
        {
            System.out.print(tarea3_1[i] + " ");
        }
        
        
        for (int i = 0; i < tarea3_2.length; i++) //rellenamos el array 2 con valores aleatorios
        {
            tarea3_2[i] = r.nextInt(1000);
        }
        System.out.println("\nArray 2: "); //imprimimos array 2
        for (int i = 0; i < tarea3_2.length; i++)
        {
            System.out.print(tarea3_2[i] + " ");
        }
        
        System.out.println(" ");
        System.out.println("\nCambiamos valores de dos arrays...");
        
        for (int i = 0; i < tarea3_3.length; i++) //copiamos array 1 a array 3
        {
            tarea3_3[i] = tarea3_1[i];
        }
        
        for (int i = 0; i < tarea3_1.length; i++) //copiamos array 2 a array 1
        {
            tarea3_1[i] = tarea3_2[i];
        }
        for (int i = 0; i < tarea3_2.length; i++) //copiamos array 3 a array 2
        {
            tarea3_2[i] = tarea3_3[i];
        }
        
        System.out.println("\nArray 1: "); //imprimimos array 1 despues del cambio
        for (int i = 0; i < tarea3_1.length; i++)
        {
            System.out.print(tarea3_1[i] + " ");
        }
        System.out.println("\nArray 2: "); //imprimimos array 2 despues del cambio
        for (int i = 0; i < tarea3_2.length; i++)
        {
            System.out.print(tarea3_2[i] + " ");
        }
        
        
        //tarea 4
        System.out.println("\n ");
        System.out.println("Tarea 4");
        System.out.println(" ");
        
        int tarea4_suma = 0;
        
        System.out.println("Introduce el tamano del array: "); //creamos un array
        int tarea4_tamano = input.nextInt();
        int [] tarea4 = new int[tarea4_tamano];
        
        for (int i = 0; i < tarea4.length; i++) //rellenamos el array
        {
            tarea4[i] = r.nextInt(10);
        }
        for (int i = 0; i < tarea4.length; i++)
        {
            System.out.println("Numero " + (i+1) + " : " + tarea4[i]);
            tarea4_suma = tarea4_suma + tarea4[i];
        }
        System.out.println("Suma: " + tarea4_suma);
        
        //tarea 5
        System.out.println(" ");
        System.out.println("Tarea 5");
        System.out.println(" ");
        
        
        int tarea5_mayor = 0; 
        boolean tarea5_primo = true; //condicion para un bucle
        System.out.println("Introduce el tamano del array: ");
        int tarea5_tamano = input.nextInt();
        int [] tarea5 = new int[tarea5_tamano];
        
        System.out.println("Introduce numero 1: "); 
        int tarea5_n1 = input.nextInt();
        
        System.out.println("Introduce numero 2: ");
        int tarea5_n2 = input.nextInt();
        
        for (int i = 0; i < tarea5.length; i++) //rellenamos el array
        {
            
            do
            {
                int tarea5_x = 0; //contador de divisiones
                int tarea5_r = r.nextInt(tarea5_n1, tarea5_n2); //generamos un numero aleatorio
                //System.out.println("random: " + tarea5_r);
                tarea5_primo = true;
                for (int y = 1; y <= tarea5_r; y++) //comprobamos si este numero es primo
                {
                    if (tarea5_r%y == 0)
                    {
                        tarea5_x ++;
                        //System.out.println("X: " + tarea5_x);
                    }
                }
                if (tarea5_x == 2)
                {
                tarea5[i] = tarea5_r; //si el numero es primo, lo anadimos a nuestro array
                tarea5_primo = false;
                }
            }
            while (tarea5_primo == true);
        }
        
        for (int i = 0; i < tarea5.length; i++) //elegimos el numero mayor
        {
            if (tarea5[i] >= tarea5_mayor)
            {
                tarea5_mayor = tarea5[i];
            }
        }
            
        System.out.println("Array: ");
        for (int i = 0; i < tarea5.length; i++)
        {
            System.out.print(tarea5[i] + " ");
        }
        System.out.println("\nEl numero mayor de los todos: " + tarea5_mayor);
        
        
        //tarea 6
        System.out.println(" ");
        System.out.println("Tarea 6");
        System.out.println(" ");
        
        
        System.out.println("Introduce el tamano de array 1: ");
        int tarea6_tamano1 = input.nextInt();
        
        System.out.println("Introduce el tamano de array 2: ");
        int tarea6_tamano2 = input.nextInt();
        int [] tarea6_1 = new int[tarea6_tamano1]; //introducimos dos arrays
        int [] tarea6_2 = new int[tarea6_tamano2];
        
        int tarea6_tamano3 = 0;
        
        if (tarea6_tamano1 <= tarea6_tamano2) //elegimos el menor tamano para array 3 para evitar errores de memoria
        {
            tarea6_tamano3 = tarea6_tamano1;
        }
        else
        {
            tarea6_tamano3 = tarea6_tamano2;
        }
        
        
        int [] tarea6_3 = new int[tarea6_tamano3]; //array 3
        
        for (int i = 0; i < tarea6_1.length; i++) //rellenamos el array 1 con valores aleatorios
        {
            tarea6_1[i] = r.nextInt(100);
        }
        System.out.println("\nArray 1: "); //imprimimos array 1
        for (int i = 0; i < tarea6_1.length; i++)
        {
            System.out.print(tarea6_1[i] + " ");
        }
        
        
        for (int i = 0; i < tarea6_2.length; i++) //rellenamos el array 2 con valores aleatorios
        {
            tarea6_2[i] = r.nextInt(100);
        }
        System.out.println("\nArray 2: "); //imprimimos array 2
        for (int i = 0; i < tarea6_2.length; i++)
        {
            System.out.print(tarea6_2[i] + " ");
        }
        
        for (int i = 0; i < tarea6_3.length; i++) //multiplicamos los valores de dos primeros arrays
        {
            tarea6_3[i] = tarea6_1[i] * tarea6_2[i];
        }
        
        System.out.println("\nArray 3 (multiplicacion): "); //imprimimos array 3
        for (int i = 0; i < tarea6_3.length; i++)
        {
            System.out.print(tarea6_3[i] + " ");
        }

    }
}
