
package com.mycompany.practicaarray1;

import java.util.Scanner;


public class PracticaArray1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int celdas = 0;
        int x = 0;
        
        
        System.out.println("Introduce el numero de celdas: ");
        celdas = input.nextInt();
        
        int [] tabla = new int[celdas];
        
        for (int i = 0; i < tabla.length; i++)  //rellenamos el array
        {
            tabla[i] = i;
        }
     
        for (int i = 0; i < tabla.length; i++) //imprimir con for
        {
            System.out.println(tabla[i]);
        }
        System.out.println("\n");
        
        while (x < tabla.length)  //imprimir con while
        {
            System.out.println(tabla[x]);
            x++;
        }
        for (int z = 0; z < tabla.length; z++) //repetimos multiples veces
        {
            for (int i = 0; i < tabla.length-1; i++) //una fila
            {
                System.out.print(" -");

            }
            System.out.println("");
            for (int y = 0; y < tabla.length; y++) // una columna
                {
                    System.out.print("| ");
                }
            System.out.println("");
        }
    }
}
