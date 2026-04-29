package com.mycompany.practicaarraylist;

import java.util.ArrayList;
import java.util.Scanner;


public class PracticaArrayList {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //tarea 1
        System.out.println("\nTarea 1\n");
        
        int tarea1_val = 0;
        int tarea1_med = 0;
        ArrayList<Integer> tarea1 = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) //rellenamos arraylist
        {
            System.out.println("Introduce valor " + i);
            tarea1_val = input.nextInt();
            tarea1.add(tarea1_val);
            tarea1_med = tarea1_med + tarea1_val; //calculamos la media
        }
        for (int i = 0; i < 5; i++) //imprimimos
        {
            System.out.println("valor " + i + " :" + tarea1.get(i));
        }
        tarea1_med = tarea1_med / 5;
        System.out.println("La media: " + tarea1_med);
        
        
        //tarea 2
        System.out.println("\nTarea 2\n");
        
        ArrayList<String> tarea2 = new ArrayList<>();
        String tarea2_cond = "";
        String tarea2_input = "";
        input.nextLine();
        
        System.out.println("Introduce un nombre de animal, teclea 'salir' para salir");
        
        do
        {
            tarea2_input = input.nextLine(); //rellenamos arraylist
            if (!tarea2_input.equals("salir"))
            {
                tarea2.add(tarea2_input);
            }
            
        }
        while (!tarea2_input.equals("salir")); //condicion de salida
        
        for (int i = 0; i < tarea2.size(); i++) //imprimimos
        {
            System.out.println("valor " + (i+1) + ": " + tarea2.get(i));
        }
        System.out.println("El tamano de la lista: " + tarea2.size());
        
        
        //tarea 3
        System.out.println("\nTarea 3\n");
        
        int tarea3_menu = 0;
        int tarea3_tamano = 0;
        int tarea3_3 = 0;
        
        ArrayList <String> tarea3 = new ArrayList<>();
        
  
        do //introducimos menu principal
        {
            System.out.println("1. Agregar Nombres");
            System.out.println("2. Modificar nombre");
            System.out.println("3. Borrar nombres");
            System.out.println("4. Visualizar un nombre");
            System.out.println("5. Visualizar todos nombres");
            System.out.println("6. Salir");
            tarea3_menu = input.nextInt();
            if (tarea3_menu == 1) //agregamos nombres
            {
                System.out.println("Cuantos nombres quieres introducir?");
                tarea3_tamano = input.nextInt();
                input.nextLine(); 
                for (int i = 0; i < tarea3_tamano; i++)
                {
                    System.out.println("Introduce nombre ");
                    tarea3.add(input.nextLine());
                }
            }
            else if (tarea3_menu == 2) //modificamos nombres
            {
                System.out.println("Cual posicion quieres modificar?");
                int x = input.nextInt();
                input.nextLine(); 
                if (x < tarea3.size()) //comprobamos si posicion esta correcta
                {
                    System.out.println("Introduce cambios de la posicion " + x);
                    tarea3.set(x, input.nextLine());
                }
                else 
                {
                    System.out.println("Esta posicion no existe\n");
                }
            }
            else if (tarea3_menu == 3) //borramos nombres
            {
                System.out.println("Quieres borrar por posicion(1) o por nombre(2)?"); 
                tarea3_3 = input.nextInt();
                if (tarea3_3 == 1) //borramos por posicion
                {
                    System.out.println("Cual posicion quieres borrar?");
                    int x = input.nextInt();
                    input.nextLine();  
                    if (x < tarea3.size()) //comprobamos si posicion esta correcta
                    {
                        tarea3.remove(x);
                    }
                    else 
                    {
                        System.out.println("Esta posicion no existe\n");
                    }
                }
                else if (tarea3_3 == 2)  //borramos por nombre
                {
                    input.nextLine();
                    System.out.println("Introduce el nombre:");
                    int x = tarea3.indexOf(input.nextLine()); //buscamos un nombre
                    if (x >= 0)
                    {
                        tarea3.remove(x); //borramos un nombre
                    }
                    else 
                    {
                        System.out.println("Este nombre no existe\n");
                    }
                }
                else 
                {
                    System.out.println("No has tecleado ni 1 ni 2\n");
                }
            }
            else if (tarea3_menu == 4) //visualizar un nombre
            {
                System.out.println("Introduce la posicion");
                int x = input.nextInt();
                if (x < tarea3.size()) //comprobamos si posicion esta correcta
                {
                    System.out.println(x + ". " + tarea3.get(x) + "\n");
                }
                else 
                {
                    System.out.println("Esta posicion no existe\n");
                }
            }
            else if (tarea3_menu == 5) //vizualizar todos nombres
            {
                System.out.println("Imprimo todos nombres:");
                for (int i = 0; i < tarea3.size(); i++)
                {
                    System.out.println(i + ". " + tarea3.get(i));
                }
                System.out.println();
            }
        }
        while (tarea3_menu != 6); //salimos
    }
}
