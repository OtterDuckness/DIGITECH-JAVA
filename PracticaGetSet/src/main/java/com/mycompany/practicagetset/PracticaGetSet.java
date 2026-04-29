
package com.mycompany.practicagetset;

import java.util.Scanner;

public class PracticaGetSet {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //public Persona(String nombre, String apellido, Integer edad, String email)
        String nombre;
        String apellido;
        int edad;
        String email;
        
        
        //creamos una persona
        System.out.println("Creamos persona 1");
        System.out.println("Introduce nombre: ");
        nombre = input.nextLine();
        System.out.println("Introduce apellido: ");
        apellido = input.nextLine();
        System.out.println("Introduce edad: ");
        edad = input.nextInt();
        input.nextLine();
        System.out.println("Introduce email: ");
        email = input.nextLine();
        
        Persona persona1 = new Persona(nombre, apellido, edad, email);
    }
}
