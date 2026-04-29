

package com.mycompany.practicarandom2;

import java.util.Random;
import java.util.Scanner;

public class PracticaRandom2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        String end = "si";
        int intentos = 7; //numero total de intentos
        int adiv = 0; //intento actual del usuario
        boolean exito = true; //condicion para derrota
        

        do
        {
            int numero = r.nextInt(100) + 1; //numero secreto
            System.out.println("Numero secreto: " + numero);
            System.out.println("Adivina el numero. Tienes 7 intentos");
            for (int i=0; i < intentos; i++) //bucle para intentos
            {
                System.out.println("Intento " + (i+1) + " :");
                adiv = input.nextInt();
                if (i == 0 && adiv == numero)
                {
                    System.out.println("INCREIBLE! Lo acertaste a la primera."); //si adivina a la primera vez
                    exito = true;
                    break;
                }
                else if (adiv == numero)
                {
                    System.out.println("Correcto! Has ganado en " + (i+1) + " intentos"); //otros condiciones
                    exito = true;
                    break;
                }
                else if (adiv < numero)
                {
                    System.out.println("Demasiado bajo");
                    exito = false;
                }
                else if (adiv > numero)
                {
                    System.out.println("Demasiado alto");
                    exito = false;
                }
                
            }
            if (exito == false)
                {
                    System.out.println("Has perdido. El numero era: " + numero); //si no han adivinado dentro de 7 intentos
                }
            System.out.println("Quieres jugar otra vez? (si/no)"); 
            end = input.next();  //para jugar otra vez o salir
        }
        while (end.equals("si"));
        
        input.close();
    }
}
