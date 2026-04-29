

package com.mycompany.examen3;

import java.util.Scanner;


public class Examen3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int menu;
        boolean creado = false; //condicion para ver si hemos creado los arrays
        int tamano = 3; //tamano de dos arrays
        int [] array1 = new int[tamano];
        int [] array2 = new int[tamano];
        int [] array3 = new int[tamano*2];
        int suma1 =0, suma2 = 0, suma3 = 0;
        
        do
        {
            System.out.println("1. Crear y rellenar arrays");
            System.out.println("2. Combinar arrays");
            System.out.println("3. Calcular la suma del array combinado");
            System.out.println("4. Calcular la suma de los elementos en cada uno de los array por separado");
            System.out.println("5. Mostrar todo");
            System.out.println("6. Salir");
            menu = input.nextInt();
            
            
            if (menu == 1) //creamos y rellenamos los arrays
            {

                System.out.println("Rellenamos los arrays con numeros");

                for (int i = 0; i < array1.length; i++)
                {
                    System.out.println("Array 1, elemento " + i);
                    array1[i] = input.nextInt();
                }
                for (int i = 0; i < array2.length; i++)
                {
                    System.out.println("Array 2, elemento " + i);
                    array2[i] = input.nextInt();
                }
                
                creado = true;
            }
            
            if (menu == 2)
            {
                if (creado == false)
                {
                    System.out.println("Tienes que crear arrays");
                }
                else
                {
                    System.out.println("Combinamos los arrays");
                    
                    
                    for (int i = 0; i < array3.length; i = i + 2)
                    {
                        array3[i] = array1[i/2];  //valores del array 1
                    }
                    for (int i = 1; i < array3.length; i = i + 2)
                    {
                        array3[i] = array2[(i-1)/2]; //valores del array 2
                    }
                    
                }
            }
            
            if (menu == 3) //suma del array combinado
            {
                if (creado == false)
                {
                    System.out.println("Tienes que crear arrays");
                }
                else
                {
                    suma3 = 0;
                    System.out.println("Calculamos la suma del array combinado");
                    for (int i = 0; i < array3.length; i++)
                    {
                        suma3 = suma3 + array3[i];
                    }
                    System.out.println("La suma: " + suma3);
                }
                
            }
            
            if (menu == 4) //suma de los arrays separados
            {
                if (creado == false)
                {
                    System.out.println("Tienes que crear arrays");
                }
                else
                {
                    suma1 = 0;
                    System.out.println("Calculamos la suma de los arrays separados");
                    for (int i = 0; i < array1.length; i++)
                    {
                        suma1 = suma1 + array1[i];
                    }
                    System.out.println("La suma del array 1: " + suma1);
                    
                    suma2 = 0;
                    
                    for (int i = 0; i < array2.length; i++)
                    {
                        suma2 = suma2 + array2[i];
                    }
                    System.out.println("La suma del array 2: " + suma2);
                    
                }
            }
            
            if (menu == 5) //mostramos todo
            {
                if (creado == false)
                {
                    System.out.println("Tienes que crear arrays");
                }
                else
                {
                    System.out.println("Array 1: ");
                    for (int i = 0; i < array1.length; i++)
                    {
                        System.out.print(array1[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Array 2: ");
                    for (int i = 0; i < array2.length; i++)
                    {
                        System.out.print(array2[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Array 3: ");
                    for (int i = 0; i < array3.length; i++)
                    {
                        System.out.print(array3[i] + " ");
                    }
                    System.out.println();
                    System.out.println("Suma de los elementos del array 1: " + suma1);
                    System.out.println("Suma de los elementos del array 2: " + suma2);
                    System.out.println("Suma de los elementos del array 3: " + suma3);
                }
            }
            
        }
        while (menu != 6);
        
    }
}
