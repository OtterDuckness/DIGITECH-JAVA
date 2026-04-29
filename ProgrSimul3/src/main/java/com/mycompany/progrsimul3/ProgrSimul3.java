

package com.mycompany.progrsimul3;

import java.util.Scanner;


public class ProgrSimul3 {

    public static void main(String[] args) {
        
        //Tarea 3
        
        Scanner input = new Scanner(System.in);
        
        int palabr, menu;
        int cont=0;

        System.out.println("Cuantas palabras quieres almacenar?");
        palabr = input.nextInt();
        
        String [] array = new String[palabr];
        String [] array2 = new String[palabr];
        
        do
        {
            System.out.println("\n1. Mostrar el contenido");
            System.out.println("2. Converir en mayusculas");
            System.out.println("3. Crear otra variable");
            System.out.println("4. Busca caracteres @, # .");
            System.out.println("5. Mostrar longitud");
            System.out.println("6. Primera mitad");
            System.out.println("7. Segunda mitad");
            System.out.println("8. Almacenar el texto");
            System.out.println("9. Salir");
            menu = input.nextInt();
            
            if (menu == 1)
            {
                for (int i = 0; i < array.length; i++) 
                {
                    System.out.println(array[i]);
                }
            }
            
            else if (menu == 2)
            {
                for (int i = 0; i < array.length; i++) 
                {
                    array2[i] = array[i].toUpperCase();
                    System.out.println(array2[i]);
                }
            }
            
            else if (menu == 3)
            {
                for (int i = 0; i < array.length; i++) 
                {
                    array2[i] = array[i];
                    System.out.println(array2[i]);
                }
           
            }
            else if (menu == 4)
            {
                cont = 0;
                for (int i = 0; i < array.length; i++) 
                {
                    if ((array[i].indexOf("@") != -1) || (array[i].indexOf("#") != -1) || (array[i].indexOf(".") != -1))
                    {
                        cont++;
                    }
                }
                if (cont>0)
                    System.out.println("Contiene al menos uno de los caractares mencionados");
                else
                {
                    System.out.println("No contiene");
                }
           
            }
            
            else if (menu == 5)
            {
                System.out.println("Longitud: " + array.length);
            }
            
            else if (menu == 6)
            {
                String [] array3 = new String[palabr/2];
                for (int i = 0; i < palabr/2; i++)
                {
                    array3[i] = array[i];
                    System.out.println(array3[i]);
                }
                
            }
            else if (menu == 7)
            {
                String [] array3 = new String[palabr/2];
                for (int i = 0; i < palabr/2; i++)
                {
                    array3[i] = array[i+palabr/2];
                    System.out.println(array3[i]);
                }
            }
            
            else if (menu == 8)
            {
                input.nextLine();
                for (int i = 0; i < array.length; i++) 
                {
                    System.out.println("Introduce palabra " + i + " :");
                    array[i] = input.nextLine();
                }
            }
                
            
        }
        while (menu != 9);
        
    }
}
