
package com.mycompany.testpersona;

import java.util.Scanner;


public class TestPersona {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Persona calcular = new Persona();
        
        int edad;
        System.out.println("Introduce edad: ");
        edad = input.nextInt();
        
        System.out.println("Edad en dias: " + calcular.edad_dias(edad)); //imprmimos los resultados sin guardarlos en variables
        System.out.println("Edad en secundos: " + calcular.edad_sec(edad));
    }
}
