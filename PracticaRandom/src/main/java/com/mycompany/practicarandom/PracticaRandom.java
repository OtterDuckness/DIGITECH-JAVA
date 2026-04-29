
package com.mycompany.practicarandom;

import java.util.Random;
import java.util.Scanner;

public class PracticaRandom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        int longitud = 0;
        boolean min = true, may = true, num = true, esp = true; //booleans para elegir que tipo de caracter incluir
        char c = 0;
        int rn = 0; //un numero aleatorio para elegir el tipo de caracter
        int cn = 0; //numero de contrasenas
        String pregunta = "";
        
        String contrasena;
        
        System.out.println("Introduce la longitud de la contrasena: ");
        longitud = input.nextInt();
        
        System.out.println("Cuantas contrasenas? ");
        cn = input.nextInt();
        
        System.out.println("Incluir letras minusculas? Si/No ");
        pregunta = input.next();
        if (pregunta.equals("Si"))
        {
            min = true;
        }
        else
        {
            min = false;
        }
        System.out.println("Incluir letras mayusculas? Si/No ");
        pregunta = input.next();
        if (pregunta.equals("Si"))
        {
            may = true;
        }
        else
        {
            may = false;
        }
        System.out.println("Incluir numeros? Si/No ");
        pregunta = input.next();
        if (pregunta.equals("Si"))
        {
            num = true;
        }
        else
        {
            num = false;
        }
        System.out.println("Incluir letras caracteres especiales? Si/No ");
        pregunta = input.next();
        if (pregunta.equals("Si"))
        {
            esp = true;
        }
        else
        {
            esp = false;
        }
        
        
        for (int y = 0; y < cn; y++)
        {
            contrasena = "";
            for (int i = 0; i < longitud; i++)
            {
                rn = r.nextInt(4); //numero aleatorio 0-3
                if (rn == 0 && min == true)
                {
                    c = (char)(r.nextInt(26) + 'a'); //aleatoria letra minuscula
                }
                if (rn == 1 && may == true)
                {
                    c = (char)(r.nextInt(26) + 'A'); //aleatoria letra minuscula
                }
                if (rn == 2 && num == true)
                {
                    c = (char)(r.nextInt(10) + '0'); //aleatorio numero
                }
                if (rn == 3 && esp == true)
                {
                    c = (char)(r.nextInt(15) + '!'); //aleatorio caracter especial
                }

                contrasena += c; //anadimos cada caracter
            }
            System.out.println("La contrasena es: " + contrasena);
        }
    }
}
