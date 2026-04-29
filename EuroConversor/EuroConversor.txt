
package com.mycompany.euroconversor;

import java.util.Scanner;

public class EuroConversor {

// Se pide por pantalla en importe en euros como tipo de dato decimal y se imprime en 
//pantalla la equivalencia en libras


    public static void main(String[] args) {
        
        Scanner datospantalla = new Scanner(System.in);
        
        
        double euro_libro = 0.87;
        double euro;
        double libra;
        
        System.out.println("Introduce la cantidad de euro: ");
        euro = datospantalla.nextDouble();
        
        libra = euro * euro_libro;
        
        System.out.println("La equivalencia en libras: " + libra);
        datospantalla.close();
    }
}
