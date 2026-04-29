

package com.mycompany.javaexam2;

import java.util.ArrayList;
import java.util.Scanner;


public class JAVAEXAM2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> nombre = new ArrayList<>();
        ArrayList<Double> precio = new ArrayList<>();
        ArrayList<Integer> cantidad = new ArrayList<>();
        
        
        int menu;
        boolean creado = false; //condicion para ver si hemos creado un inventario

        do
        {
            System.out.println("\n1. Crear inventario");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Calcular valor del inventario");
            System.out.println("4. Mostrar inventario (con ArrayList)");
            System.out.println("5. Buscar un producto");
            System.out.println("6. Salir");
            menu = input.nextInt();
            int num = 3;
            
            if (menu == 1)
            {
                System.out.println("Introduce numero de productos (al menos 3): ");
                num = input.nextInt();
                if (num < 3)
                {
                    System.out.println("Minimo 3 productos");
                    num = 3;
                }

                for (int i=0; i < num; i++) //rellenamos nuestros arraylists
                {
                    input.nextLine();
                    System.out.println("Introduce nombre de producto " + i);
                    nombre.add(input.nextLine());
                    System.out.println("Introduce precio de producto " + i);
                    precio.add(input.nextDouble());
                    System.out.println("Introduce cantidad de producto " + i);
                    cantidad.add(input.nextInt());
                }
                creado = true;
            }
            
            if (menu == 2) //imprimimos
            {   
                if (creado == false)
                {
                    System.out.println("Tienes que crear inventario");
                }
                else
                {
                    for (int i=0; i < num; i++)
                    {
                        System.out.println("nombre: " + nombre.get(i));
                        System.out.println("precio: " + precio.get(i));
                        System.out.println("cantidad: " + cantidad.get(i));
                        System.out.println();
                    }
                }
            }
            
            if (menu == 3)
            {
                if (creado == false)
                {
                    System.out.println("Tienes que crear inventario");
                }
                else
                {
                    double valor = 0;
                    double valortotal = 0;
                    for (int i=0; i < num; i++)
                    {
                        valor = precio.get(i) * cantidad.get(i); //contamos valor de cada producto
                        System.out.println("Valor del producto " + nombre.get(i) + ": " + valor);
                        valortotal = valortotal + valor;  //contamos valor total
                    }
                    System.out.println("Valor total del inventario: " + valortotal);
                }
            }
            
            if (menu == 4) //imprimos todo otra vez
            {
                if (creado == false)
                {
                    System.out.println("Tienes que crear inventario");
                }
                else
                {
                    for (int i=0; i < num; i++)
                    {
                        System.out.println("nombre: " + nombre.get(i));
                        System.out.println("precio: " + precio.get(i));
                        System.out.println("cantidad: " + cantidad.get(i));
                        System.out.println();
                    }
                }
            }
            
            if (menu == 5)
            {
                if (creado == false)
                {
                    System.out.println("Tienes que crear inventario");
                }
                else
                {
                    input.nextLine();
                    System.out.println("Introduce el nombre de producto:");
                    String busq = input.nextLine();
                    boolean resultado = false; //condicion para el resultado de busqueda
                    
                    for (int i = 0; i < num; i++)
                    {
                        if (nombre.get(i).equals(busq))  //buscamos
                        {
                            System.out.println("He encontrado el producto");
                            System.out.println("nombre: " + nombre.get(i));
                            System.out.println("precio: " + precio.get(i));
                            System.out.println("cantidad: " + cantidad.get(i));
                            System.out.println();
                            resultado = true;
                        }
   
                    }
                    if (resultado == false)
                    {
                        System.out.println("El producto no encontrado");
                    }
                }
            }
        }
        while (menu != 6);
    }
}
