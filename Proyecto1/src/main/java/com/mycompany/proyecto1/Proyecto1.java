
package com.mycompany.proyecto1;
import java.util.Scanner;

public class Proyecto1 {

    public static void main(String[] args) {
        System.out.println("Texto impreso en pantalla");
        
        int numero = 12;
        
        if (numero ==12)
        {
            System.out.println("El numero tecleado es 12");
        }
        else
        {
            System.out.println("El numero tecleado no es 12");
        }
        
        //pedir por pantalla un número, comprobamos tres cosas: que es igual a cero, mayor que cero o menor que cero
        int dato;
        Scanner datospantalla = new Scanner(System.in);
        
        System.out.println("Introduce un número entero:");
        dato = datospantalla.nextInt();
        
        if (dato==0)
        {
            System.out.println("La variable dato contiene el valor 0");
        }
        else if (dato > 0)
        {
            System.out.println("El valor de dato es mayor que cero");
        }
        else
        {
            System.out.println("El valor de dato es menor que cero");
        } //fin dato > 0
        
        
        // construimos una estructura condicional con operadores lógicos
        
        if (dato==0 || dato>0 || dato<0)
        {
            System.out.println("El dato tecleado cumple las condiciones");
        }
        else
        {
            System.out.println("El dato tecleado no cumple las condiciones");
        }
    }
    //
}
