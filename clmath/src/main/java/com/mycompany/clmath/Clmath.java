
package com.mycompany.clmath;

import java.util.Scanner;

public class Clmath {

    public static void main(String[] args) {
                //mostramos el valor de las constantes y atributos de Math
        System.out.println("El valor de PI es" + Math.PI);
        
        //mostramos el valor de la constante y atributo E
        System.out.println("El valor de E es:" + Math.E);
        
        //creamos una variable de tipo Double
        
        double numero1, numero2, numero3;
        numero1 = 1.235262;
        numero2 = 5.12369;
        numero3 = 6.89512;
        
        //aplicamos el metodo ceil, redondeo en alta
        System.out.println("El numero redondeado con ceil es: " + Math.ceil(numero1));
        
        //aplicamos el metodo floor, redondeo a la baja
        System.out.println("El numero redondeado con floor es: " + Math.floor(numero2));
        
        //redondeo con round
        System.out.println("El numero redondeado con round es: " + Math.round(numero3));
        
        //calcular numero aleatorio con metodo Random
        double aleatorio;
        aleatorio = Math.random();
        System.out.println("Creamos un numero aleatorio con metodo Random: " + aleatorio);
        
        //metodo sqrt y pow, uno es la raiz cuadrad y otro la potencia
        System.out.println("Calculamos la raiz cuadrada: " + Math.sqrt(8));
        
        //Aplicamos las potencias
        System.out.println("Calculamos la potencia: " + Math.pow(3, 10));
        
        //metodo min
        System.out.println("Aplicamos metodo min: " + Math.min(10, 3));
        
        //metodo max
        System.out.println("Aplicamos metodo  max: " + Math.max(10, 3));
        
        
        //pedir por pantalla 2 valore y calcula el valor aleatorio
        int num1=0;
        int num2=0;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Introduce numero 1: ");
        num1 = input.nextInt();
        System.out.println("Introduce numero 2: ");
        num2 = input.nextInt();
        int numAleatorio=(int)Math.floor(Math.random()*(num2-num1+1)+num1);
        
        System.out.println(numAleatorio);
        
    }
}
