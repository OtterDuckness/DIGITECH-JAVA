
package com.mycompany.practicapoo2;

import java.util.Scanner;


public class PracticaPOO2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        //tarea 1
        System.out.println("\nTarea 1\n");
        
        Cuenta ejemplo = new Cuenta("Pedro", 100.00);
        int menu;
        
        do //hacemos un menu
        {
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Mostrar la cuenta");
            System.out.println("4. Salir");
            menu = input.nextInt();
            
            if (menu == 1)
            {
                input.nextLine();
                System.out.println("Introduce la cantidad para ingresar:");
                double ingreso = input.nextDouble();
                ejemplo.ingresar(ingreso);
                System.out.println("La cantidad en la cuenta: " + ejemplo.cantidad);
            }
            
            if (menu == 2)
            {
                input.nextLine();
                System.out.println("Introduce la cantidad para ingresar:");
                double ingreso = input.nextDouble();
                ejemplo.retirar(ingreso);
                System.out.println("La cantidad en la cuenta: " + ejemplo.cantidad);
            }
            
            if (menu == 3)
            {
                System.out.println(ejemplo.cantidad);
            }
        
        }
        while (menu != 4);
        
        //tarea 2
        System.out.println("\nTarea 2\n");
        
        Libro libro1 = new Libro("9777888666", "Libro1", "Autor1", 392); //creamos objetos
        Libro libro2 = new Libro("9555444333", "Libro2", "Autor2", 564);
        
        libro1.toString1(); //llamamos a metodo toString1()
        libro2.toString1();
        
        libro1.comparar(libro2); //llamamos a metod para comparar paginas
        
        
        //tarea 3 
        System.out.println("\nTarea 3\n");
        
        Raices tarea3 = new Raices (10, -2, -1); //un ejemplo
        tarea3.calcular();
        
    }
}
