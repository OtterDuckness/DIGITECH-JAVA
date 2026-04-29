
package com.mycompany.objstring;

import java.util.Scanner;


public class Objstring {

    public static void main(String[] args) {
        String palabra = "Bienvenido";
        
        if (palabra.equals("bienvenido"))
        {
            System.out.println("El texto es igual a bienvenido");
        }
        else
        {
            System.out.println("El texto no es igual a bienvenido");
        }
        
        if (palabra.equalsIgnoreCase("bienvenido"))
        {
            System.out.println("Es igual");
            
        }
        else
        {
            System.out.println("No es igual");
        }
        
        //probamos el metodo length
        
        int longitud;
        longitud = palabra.length();
        System.out.println("El numero de caracteres es: " + longitud);
        
        //crear subcadena de texto a partir de una dada
        
        String mitad1;
        String mitad2;
        //lo pasamos metodo substring, la posicion del primer caracter
        //la posicion del ultimo caracter
        mitad1 = palabra.substring(0, 4);
        System.out.println(mitad1);
        
        mitad2 = palabra.substring(4, palabra.length());
        System.out.println(mitad2);
        
        //mayusculas
        String mayus;
        String minus;
        
        mayus = palabra.toUpperCase();
        minus = palabra.toLowerCase();
        
        System.out.println(mayus + "  " + minus);
        
        //Buscamos un caracter y devuelve -1 si no encuentra el caracter
        //pedimos por pantalla una direccion de correo y comprobamos si hay arroba
        String mail;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Teclea un correo electronico: ");
        mail = input.next();
        
        if (mail.indexOf('@') < 0)
        {
            System.out.println("No contiene @");
            
        }
        else 
        {
            System.out.println("contiene @");
        }
        
        
    }
}
