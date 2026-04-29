
package com.mycompany.nombreapellido;

//Se pide por pantalla el nombre, y los apellidos, debe aparecer impreso: Nombre + apellidos 
//en pantalla.

import java.util.Scanner;

public class NombreApellido {

    public static void main(String[] args) {
        
        Scanner datospantalla = new Scanner(System.in);
        
        String nombre;
        String apellidos;
        
        System.out.println("Introduce tu nombre: ");
        nombre = datospantalla.nextLine();
        
        System.out.println("Introduce tus apellidos: ");
        apellidos = datospantalla.nextLine();
        
        System.out.println("Tu nombre y apellidos: " + nombre + " " + apellidos);
        
        datospantalla.close();
        
    }
}
