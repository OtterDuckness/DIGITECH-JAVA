

package com.mycompany.practicadosconstr3;

import java.util.Scanner;


public class PracticaDosConstr3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int tamano;
        
        System.out.println("Introduce la longitud");
        int longitud = input.nextInt();
        
        Password test = new Password(longitud);
        System.out.println(test.contrasena);
        
        test.esFuerte();
        System.out.println("Es fuerte: " + test.esFuerte());
        
        Password test2 = new Password(); //objeto por defecto
        test2.esFuerte();
        System.out.println(test2.contrasena); //contrasena por defecto
        System.out.println("Es fuerte: " + test2.esFuerte());
        test2.generarPassword();
        System.out.println(test2.contrasena); //contrasena generada
        test2.esFuerte();
        System.out.println("Es fuerte: " + test2.esFuerte());
        System.out.println();
        
        System.out.println("Introduce el tamano del array de contrasenas");
        tamano = input.nextInt();
        
        System.out.println("Introduce la longitud de contrasenas");
        longitud = input.nextInt();
        
        String [] passwords = new String[tamano]; //array de contrasenas
        Boolean [] fuerte = new Boolean[tamano]; //array de booleanos para ver si contrasena son fuertes
        for (int i=0; i < tamano; i++)
        {
            Password array = new Password(longitud);
            passwords[i] = array.contrasena;
            fuerte[i] = array.esFuerte();
        }
        
        for (int i=0; i < tamano; i++)
        {
            System.out.println("Password " + i + ": " + passwords[i] + ", fuerte: " + fuerte[i]);
        }
    }
}
