package com.mycompany.practicastring;

import java.util.Scanner;


public class PracticaString {

    public static void main(String[] args) {
        
        //tarea 1
        System.out.println("  ");
        System.out.println("Tarea 1");
        String password = "";
        Scanner input = new Scanner(System.in);

        do 
        {
            System.out.println("Introduce la contrasena: ");
            password = input.next();
        
        if (password.length() > 25)
        {
            System.out.println("la contrasena tiene que contener menos de 25 caracteres");
        }
        if ((password.indexOf('@') >= 0) || (password.indexOf('.') >= 0) || 
            (password.indexOf('$') >= 0) || (password.indexOf('#') >= 0) || 
            (password.indexOf('&') >= 0) || (password.indexOf('/') >= 0))
        {
            System.out.println("la contrasena no tiene que contener caracteres especiales");
        }
        
        if (Character.isUpperCase(password.charAt(0)) == false || 
            Character.isUpperCase(password.charAt(password.length()-1)) == false)
        {
            System.out.println("La primera y la ultima letras tiene que ser mayusculas");
        }

        }
        while ((password.length() > 25) || ((password.indexOf('@') >= 0) || 
              (password.indexOf('.') >= 0) || (password.indexOf('$') >= 0) || 
              (password.indexOf('#') >= 0) || (password.indexOf('&') >= 0) || 
              (password.indexOf('/') >= 0)) || (Character.isUpperCase(password.charAt(0)) == false && 
               Character.isUpperCase(password.charAt(password.length() - 1)) == false));
        System.out.println("Buena contrasena ");
        
        
        //tarea 2
        input.nextLine();
        System.out.println("  ");
        System.out.println("Tarea 2");

        String tarea2 = "";
        String inverso = "";
        String guion = "";
        String mitad = "";
        
        System.out.println("Introduce dos o tres palabras: ");
        tarea2 = input.nextLine();
        
        //mitad
        mitad = tarea2.substring(0, tarea2.length()/2);
        System.out.println(mitad);
        
        //ultima caracter
        System.out.println("Ultimo caracter: " + tarea2.charAt(tarea2.length() - 1));
        
        //cadena inversa
        for (int i = 0; i < tarea2.length(); i++)
        {
            inverso = tarea2.charAt(i) + inverso;
        }
        System.out.println(inverso);
        if (inverso.equals(tarea2) == true)
        {
            System.out.println("Se lee igual de izquierda a derecha tanto como de derecha a izquierda");
        }
        else
        {
            System.out.println("No se lee igual de izquierda a derecha tanto como de derecha a izquierda");
        }
        
        //guion
        for (int i = 0; i < tarea2.length(); i++)
        {
            guion = guion + tarea2.charAt(i) + "-";
        }
        System.out.println(guion);
        
        //vocales
        int x = 0;
        String vocales = "";
        vocales = tarea2.toLowerCase();
        for (int i = 0; i < tarea2.length(); i++)
        {
            if (vocales.charAt(i) == 'a' || vocales.charAt(i) == 'e' || 
                vocales.charAt(i) == 'i' || vocales.charAt(i) == 'o' || 
                vocales.charAt(i) == 'u')
            {
                x++;
            }
        }
        System.out.println("Vocales: " + x);
        
        
        //tarea 3
        //input.nextLine();
        String tarea3;
        String tarea3_1 = "";
        System.out.println("  ");
        System.out.println("Tarea 3");
   
        char c;
        String resultado = "";
        boolean mayus = true;
       
       
        System.out.println("Introduce un texto: ");
        tarea3 = input.nextLine();
       
       for (int i= 0; i < tarea3.length(); i++) //cada palabra empieza con mayuscula
       {
       c = tarea3.charAt(i);
            if (!Character.isLetter(c)) //si caracter no es una letra, asignamos un boolean como true para siguiente letra como un sinal para un cambio
       {
           mayus = true; 
       }
       else if (mayus == true) // si boolean es true, tenemos que convertir la letra en mayuscula y asignamos boolean como false
       {
       c = Character.toUpperCase(c);
       mayus = false;
       }
       resultado += c;
       }
       

        for (int i = 0; i < tarea3.length(); i++)  //cada palabra de nueva linea
        {
            tarea3_1 = tarea3_1 + resultado.charAt(i);
            if (resultado.charAt(i) == ' ')
            {
                tarea3_1 = tarea3_1 + resultado.charAt(i) + "\n";
               
            }
        }
        System.out.println(tarea3_1);     
    }
}
