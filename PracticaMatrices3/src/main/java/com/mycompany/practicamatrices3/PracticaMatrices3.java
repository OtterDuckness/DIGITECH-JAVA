
package com.mycompany.practicamatrices3;

import java.util.Random;
import java.util.Scanner;

public class PracticaMatrices3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        //tarea 1
        System.out.println("\nTarea 1\n");
        
        int tarea1_col = 0;
        System.out.println("Introduce el numero de columnas: ");
        tarea1_col = input.nextInt();
        
        int [][] tarea1 = new int[5][tarea1_col];
        
        for (int i = 0; i < tarea1.length; i++)
        {
            for (int j = 0; j < tarea1[i].length; j++)
            {
                tarea1[i][j] = r.nextInt(0, 10);
                System.out.print(tarea1[i][j] + " ");
            }
            System.out.println();
        }
        
        //tarea 2
        System.out.println("\nTarea 2\n");
        
        
        int tarea2_fil = 0;
        int tarea2_col = 0;
        System.out.println("Introduce el numero de filas: ");
        tarea2_fil = input.nextInt();
        System.out.println("Introduce el numero de columnas: ");
        tarea2_col = input.nextInt();
        
        int [][] tarea2_1 = new int[tarea2_fil][tarea2_col];
        int [][] tarea2_2 = new int[tarea2_fil][tarea2_col];
        int [][] tarea2_3 = new int[tarea2_fil][tarea2_col];
        
        System.out.println("Rellenamos la matriz 1:"); //rellenamos matriz 1
        for (int i = 0; i < tarea2_1.length; i++)
        {
            for (int j = 0; j < tarea2_1[i].length; j++)
            {
                System.out.print("Matriz 1, posicion " + i + j + ": " );
                tarea2_1[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("Rellenamos la matriz 2:"); //rellenamos matriz 2
        for (int i = 0; i < tarea2_2.length; i++)
        {
            for (int j = 0; j < tarea2_2[i].length; j++)
            {
                System.out.print("Matriz 2, posicion " + i + j + ": " );
                tarea2_2[i][j] = input.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < tarea2_3.length; i++) //rellenamos la matriz 3
        {
            for (int j = 0; j < tarea2_3[i].length; j++)
            {
                tarea2_3[i][j] = tarea2_1[i][j] + tarea2_2[i][j];
            }
        }
        
        System.out.println("Matriz 1: ");  //imprimimos todo
        for (int i = 0; i < tarea2_1.length; i++)
        {
            for (int j = 0; j < tarea2_1[i].length; j++)
            {
                System.out.print(tarea2_1[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz 2: ");
        for (int i = 0; i < tarea2_2.length; i++)
        {
            for (int j = 0; j < tarea2_2[i].length; j++)
            {
                System.out.print(tarea2_2[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("\nMatriz 3 (la suma de las dos primeras): ");
        for (int i = 0; i < tarea2_3.length; i++)
        {
            for (int j = 0; j < tarea2_3[i].length; j++)
            {
                System.out.print(tarea2_3[i][j] + " ");
            }
            System.out.println();
        }
        
        
        //tarea 3
        System.out.println("\nTarea 3\n");
        
        
        int [][] tarea3 = new int [4][4];
        //int [][] tarea3 = {{00, 01, 02, 03},{10, 11, 12, 13},{20, 21, 22, 23},{30, 31, 32, 33}};
        int tarea3_pregunta = 0;
        boolean tarea3_rellenado = false;
        String tarea3_preg = "";
        int tarea3_fila = 0;  //no necesito tantas variables, pero es mas facil como asi
        int tarea3_suma_fila = 0;
        int tarea3_columna = 0;
        int tarea3_suma_columna = 0;
        int tarea3_diag1 = 0;
        int suma = 0;
        double media = 0;
        
        
        do
        {
            System.out.println("1. Rellenar TODA la matriz de numeros");
            System.out.println("2. Suma de una fila que se pedira al usuario ");
            System.out.println("3. Suma de una columna que se pedira al usuario");
            System.out.println("4. Sumar la diagonal principal");
            System.out.println("5. Sumar la diagonal inversa");
            System.out.println("6. La media de todos los valores de la matriz");
            System.out.println("7. Salir");
            tarea3_pregunta = input.nextInt();
            if (tarea3_pregunta == 1 && tarea3_rellenado == false) //rellenamos matriz
            {
                System.out.println("Rellenamos la matriz:");
                for (int i = 0; i < tarea3.length; i++)
                {
                    for (int j = 0; j < tarea3[i].length; j++)
                    {
                        System.out.print("Posicion " + i + j + ": " );
                        tarea3[i][j] = input.nextInt();
                    }
                    System.out.println();
                }
                tarea3_rellenado = true;
            }
            else if (tarea3_pregunta == 1 && tarea3_rellenado == true) //si ya tenemos valores
                    {
                        System.out.println("La matriz ya esta rellenada. Quieres rellenarla de nuevo? SI/NO");
                        tarea3_preg = input.next();
                        if (tarea3_preg.equals("SI"))
                        {
                            System.out.println("Rellenamos la matriz:");
                            for (int i = 0; i < tarea3.length; i++)
                            {
                                for (int j = 0; j < tarea3[i].length; j++)
                                {
                                    System.out.print("Posicion " + i + j + ": " );
                                    tarea3[i][j] = input.nextInt();
                                }
                                System.out.println();
                            }
                            tarea3_rellenado = true;
                        }
                    }
            else if (tarea3_pregunta == 2 && tarea3_rellenado == true) //suma de fila
            {
                System.out.println("Sumamos la fila.");
                System.out.println("Elige el numero de fila (0-3): ");
                tarea3_fila = input.nextInt();
                for (int i = 0; i < tarea3.length; i++)
                {
                    for (int j = 0; j < tarea3[i].length; j++)
                    {
                        if (i == tarea3_fila)
                        {
                            tarea3_suma_fila = tarea3_suma_fila + tarea3[i][j];
                        }
                    }
                }
                System.out.println("Suma de la fila elegida: " + tarea3_suma_fila);
                tarea3_suma_fila = 0; //si el usuario quiere sumar otra fila
            }
            else if (tarea3_pregunta == 2 && tarea3_rellenado == false) //si no tenemos matriz rellenada
            {
                System.out.println("Tienes que rellenar la matriz");
            }
            else if (tarea3_pregunta == 3 && tarea3_rellenado == true) //suma de columna
            {
                System.out.println("Sumamos la columna.");
                System.out.println("Elige el numero de columna (0-3): ");
                tarea3_columna = input.nextInt();
                for (int i = 0; i < tarea3.length; i++)
                {
                    for (int j = 0; j < tarea3[i].length; j++)
                    {
                        if (j == tarea3_columna)
                        {
                            tarea3_suma_columna = tarea3_suma_columna + tarea3[i][j];
                        }
                    }
                }
                System.out.println("Suma de la columna elegida: " + tarea3_suma_columna);
                tarea3_suma_columna = 0;
            }
            else if (tarea3_pregunta == 3 && tarea3_rellenado == false)
            {
                System.out.println("Tienes que rellenar la matriz");
            }
            else if (tarea3_pregunta == 4 && tarea3_rellenado == true) //sumar la diagonal principal
            {
                System.out.println("Sumamos la diagonal principal.");
                for (int i = 0; i < tarea3.length; i++)
                {
                    for (int j = 0; j < tarea3[i].length; j++)
                    {
                        if (j == i)
                        {
                            tarea3_diag1 = tarea3_diag1 + tarea3[i][j];
                        }
                    }
                }
                System.out.println("La suma de la diagonal principal: " + tarea3_diag1);
                tarea3_diag1 = 0;
            }
            else if (tarea3_pregunta == 4 && tarea3_rellenado == false)
            {
                System.out.println("Tienes que rellenar la matriz");
            }
            else if (tarea3_pregunta == 5 && tarea3_rellenado == true) //sumar la diagonal inversa
            {
                System.out.println("Sumamos la diagonal inversa.");
                for (int i = 0; i < tarea3.length; i++)
                {
                    for (int j = 0; j < tarea3[i].length; j++)
                    {
                        if ((j + i) == 3)
                        {
                            tarea3_diag1 = tarea3_diag1 + tarea3[i][j];
                        }
                    }
                }
                System.out.println("La suma de la diagonal inversa: " + tarea3_diag1);
                tarea3_diag1 = 0;
            }
            else if (tarea3_pregunta == 5 && tarea3_rellenado == false)
            {
                System.out.println("Tienes que rellenar la matriz");
            }
            else if (tarea3_pregunta == 6 && tarea3_rellenado == true)
            {
                System.out.println("Calculamos la media de todos los valores de la matriz.");
                for (int i = 0; i < tarea3.length; i++)
                {
                    for (int j = 0; j < tarea3[i].length; j++)
                    {
                        {
                            suma = suma + tarea3[i][j];
                        }
                    }
                }
                media = suma/16.0;
                System.out.printf("La media de todos los valores: " + "%.2f", media);
                System.out.println();
            }
            else if (tarea3_pregunta == 6 && tarea3_rellenado == false)
            {
                System.out.println("Tienes que rellenar la matriz");
            }
            
        }
        while (tarea3_pregunta != 7);
        
        //tarea 4
        System.out.println("\nTarea 4\n");
        
        int [][] tarea4 = new int [3][3];
        int numero = 0;
        boolean tarea4_existe = true; //condicion para parar el bucle
        
        
        for (int i = 0; i < tarea4.length; i++)
        {
            for (int j = 0; j < tarea4[i].length; j++)
            {
                do
                {
                    numero = r.nextInt(0, 10); //generamos numeros aleatorios
                    tarea4_existe = false; 
                    for (int x = 0; x < tarea4.length; x++) //buscamos y comparamos numeros
                    {
                        for (int y = 0; y < tarea4[x].length; y++)
                        {
                            if (tarea4[x][y] == numero) 
                            {
                                tarea4_existe = true;
                                break;
                            }
                        }
                    }
                }
                while (tarea4_existe == true);
                tarea4[i][j] = numero;  //assiganamos un numero
            }
        }
        for (int i = 0; i < tarea4.length; i++) //imprimimos
        {
            for (int j = 0; j < tarea4[i].length; j++)
            {
                System.out.print(tarea4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
