
package com.mycompany.practicamatrices2;

import java.util.Scanner;
import java.util.Random;

public class PracticaMatrices2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        //tarea 1
        System.out.println("\nTarea 1\n");
        
        int [][] tarea1 = new int [9][9];
        for (int i = 0; i < tarea1.length; i++)  //creamos y rellenamos una matriz
        {
            for (int j = 0; j < tarea1[i].length; j++)
            {
                tarea1[i][j] = j + 1;
                System.out.print(tarea1[i][j] + " ");
            }
            System.out.println();
        }
        
        //tarea 2
        System.out.println("\nTarea 2\n");
        
        int tarea2_cont = 0;
        int tarea2_col = 0;
        System.out.println("Cuantas columnas: ");
        tarea2_col = input.nextInt();
        
        int [][] tarea2 = new int[5][tarea2_col];
        
        for (int i = 0; i < tarea2.length; i++)
        {
            for (int j = 0; j < tarea2[i].length; j++)
            {
                tarea2[i][j] = r.nextInt(10, 1000); //rellenamos una matriz
                if (tarea2[i][j] == 10) //contamos 10s
                {
                    tarea2_cont++;
                }
                System.out.print(tarea2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("El numero 10 aparace " + tarea2_cont + " veces");
        
        
        //tarea 3
        System.out.println("\nTarea 3\n");
        
        int tarea3_fil = 0;
        int tarea3_celd = 0;
        String tarea3_preg = "";
        int [][] tarea3;
        
        System.out.println("Cuantas filas?");
        tarea3_fil = input.nextInt();
        
        System.out.println("Deseas que todas las filas tengan el mismo numero de celdas? SI/NO ");
        tarea3_preg = input.next();
        
        if (tarea3_preg.equals("SI")) //creamos una matriz regular
        {
            System.out.println("Cuantas celdas?");
            tarea3_celd = input.nextInt();
            tarea3 = new int [tarea3_fil][tarea3_celd]; 
            for (int i = 0; i < tarea3.length; i++)
            {
                for (int j = 0; j < tarea3[i].length; j++)
                {
                    tarea3[i][j] = r.nextInt(0, 10);
                }
            }
        }
        else //creamos una matriz irregular
        {
            tarea3 = new int[tarea3_fil][];
            
            for (int i = 0; i < tarea3.length; i++)
            {
                System.out.println("Cuantas celdas en fila " + i + " ?");
                tarea3_celd = input.nextInt();
                tarea3[i] = new int[tarea3_celd];
                for (int j = 0; j < tarea3[i].length; j++)
                {
                    tarea3[i][j] = r.nextInt(1, 5);
                }
            }
        }
        
        
        System.out.println("Desea imprimir la matriz? SI/NO");
        tarea3_preg = input.next();
        
        if (tarea3_preg.equals("SI")) //imprimimos la matriz
        {
            for (int i = 0; i < tarea3.length; i++)
            {
                for (int j = 0; j < tarea3[i].length; j++)
                {
                    System.out.print(tarea3[i][j] + " ");
                }
                System.out.println();
            }
        }
        else
        {
            System.out.println("Pues, me da igual, imprimo la matriz: ");
            for (int i = 0; i < tarea3.length; i++)
            {
                for (int j = 0; j < tarea3[i].length; j++)
                {
                    System.out.print(tarea3[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        //tarea 4
        System.out.println("\nTarea 4\n");

        
        String tarea4_preg = "";
        String password = "12345";
        String password_preg = "";
        int tarea4_cantidad = 10;
        int x = 0;
        int y = 0;
        String tarea4_pos = "";
        String[][] nombresGolosinas = {
         {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
         {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
         {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
         {"Lacasitos", "Crunch", "Milkybar", "KitKat"}};
        double[][] precio = {
         {1.1, 0.8, 1.5, 0.9},
         {1.8, 1, 1.2, 1},
         {1.8, 1.3, 1.2, 0.8},
         {1.5, 1.1, 1.1, 1.1}};
        
        int [][] cantidad = {
            {10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10},
            {10, 10, 10, 10, 10}};
        
        
        do
        {
            System.out.println("1. Quieres pedir golosina?");
            System.out.println("2. Quieres mostar golocina?");
            System.out.println("3. Quieres guardar los datos de golosinas?");
            System.out.println("4. Quieres salir del programa?");
            tarea4_preg = input.next();
            
            if (tarea4_preg.equals("1"))
                    {
                        System.out.println("Introduce la posicion de la golosina: "); //pedimos coordenadas
                        tarea4_pos = input.next();

                        x = Character.getNumericValue(tarea4_pos.charAt(0));  //convertimos char to int
                        y = Character.getNumericValue(tarea4_pos.charAt(1));
                        
                        System.out.println("Has pedido: " + nombresGolosinas[x][y]);
                        if (cantidad[x][y] > 0) //contamos cuantas golosinas quedan
                        {
                            cantidad[x][y]--;
                            System.out.println("Quiedan " + cantidad[x][y] + " golosinas de este tipo");
                        }
                        else 
                            System.out.println("No hay golosinas de este tipo");
                    }
            else if (tarea4_preg.equals("2")) 
            {
                for (int i = 0; i < nombresGolosinas.length; i++) //imprimimos datos de golosinas
                {
                    for (int j = 0; j < nombresGolosinas[i].length; j++)
                    {
                        System.out.println("Nombre: " + nombresGolosinas[i][j] + "; Precio: " + precio[i][j] + "; Codigo: " + i+j + "; ");
                    }
                    System.out.println();
                }
                
            }
            else if (tarea4_preg.equals("3"))
            {
                System.out.println("Contrasena: "); //preguntamos por contrasena
                password_preg = input.next();
                if (password_preg.equals(password) == true)
                {
                    System.out.println("Elige la posicion donde guardar los datos de golosina:"); //introducimos nuevos datos
                    tarea4_pos = input.next();
                    x = Character.getNumericValue(tarea4_pos.charAt(0));  //es lo mismo que antes
                    y = Character.getNumericValue(tarea4_pos.charAt(1));
                    
                    input.nextLine();
                    System.out.println("Introduce nueva golosina: ");
                    nombresGolosinas[x][y] = input.nextLine();

                    System.out.println("Introduce el precio: ");
                    precio[x][y] = input.nextDouble();
                    
                    System.out.println("Introduce la cantidad: ");
                    cantidad[x][y] = input.nextInt();
                }
                else
                {
                    System.out.println("Contrasena incorrecta");
                }
                
            }
            
        }
        while (!tarea4_preg.equals("4")); //un bucle para repetir el menu principal
        
    }
}
