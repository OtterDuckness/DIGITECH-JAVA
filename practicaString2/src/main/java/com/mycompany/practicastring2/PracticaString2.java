package com.mycompany.practicastring2;

import java.util.Scanner;

public class PracticaString2 {

    public static void main(String[] args) {
        String oracion = ""; //oracion introducida
        String oracion2 = ""; //oracion cambiada
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce una oracion: ");
        oracion = input.nextLine();
        
        
        for (int i = 0; i < oracion.length(); i++)  //cada palabra de nueva linea
        {
            oracion2 = oracion2 + oracion.charAt(i);
            if (oracion.charAt(i) == ' ')
            {
                oracion2 = oracion2 + oracion.charAt(i) + "\n";
               
            }
        }
        System.out.println(oracion2);    
    }
}
