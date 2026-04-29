
package com.mycompany.practicastring3;

import java.util.Scanner;

public class PracticaString3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String correo = "";
        int x = 0; 
        int y = 0;
        
        System.out.println("Introduce un correo electronico: ");
        correo = input.nextLine();
        
        for (int i = 0; i < correo.length(); i++) //comprobamos si tiene @
        {
            if (correo.charAt(i) == '@')
            {
                x ++;
            }
        }
        if (x == 0)
            {
                System.out.println("Tiene que contener la @");
            }
        else if (x > 1)

        {
            System.out.println("Tiene que contener solo una @");
        }
        else
        {
            System.out.println("Contiene la @");
        }
        if (correo.charAt(correo.length()-1) != '.')    //compbrobamos si hay un punto al final
        {
            System.out.println("Necesitas un punto al final del correo");
        }
        else
        {
            System.out.println("Contiene un punto al final del correo electronico");
        }
        if (correo.length() < 20)  //combprobamos la longitud
        {
            System.out.println("La longitud minima debe que ser 20 caracteres");
        }
        else 
        {
            System.out.println("La longitud es mayor que 20 caracteres");
        }
        for (int i = 0; i < correo.length(); i++)  //comprobamos si todas las letras son minusculas
        {
            if (Character.isUpperCase(correo.charAt(i)) == true)
            {
                y ++;
            }
        }
        if (y > 0)
        {
            System.out.println("Todas las letras tienen que ser minusculas");
        }
        else
        {
            System.out.println("Todas las letras son minusculas");
        }
    }
}
