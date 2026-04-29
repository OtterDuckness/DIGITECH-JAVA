
package com.mycompany.practicamatrices;


public class PracticaMatrices {

    public static void main(String[] args) {
        
        int[][] numeros = {{3,4,5,78},
                           {0,0,0,0},
                           {1,1,1,1},
                           {6,6,6,-1}};
        int max = 0; //mayor valor
        int min = 0; //menor valor
        
        System.out.println("Tenemos una matriz: "); //imprimir la matriz completa
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                System.out.print(numeros[i][j] + " ");
                if(numeros[i][j] >= max )
                {
                    max = numeros[i][j];
                }
                else 
                {
                    min = numeros[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("El mayor valor: " + max);
        System.out.println("El menor valor: " + min);
        System.out.println();
        
        System.out.println("Imprimimos los valores de la primera y la ultima fila de la matriz: ");
        for (int i = 0; i < numeros.length; i = i + 3)
        {
            for (int j = 0; j < numeros[i].length; j++)
            {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }
    }
}
