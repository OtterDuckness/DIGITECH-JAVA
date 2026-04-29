

package com.mycompany.practicagetsetpaq;

import java.util.Scanner;

public class Numero1 {
    Scanner input = new Scanner(System.in);
    
    public Double pedirNumero() //metodo para introducir numeros
    {
        System.out.println("Introduce numero: ");
        Double num = input.nextDouble();
        return num;
    }
    
    public Double sumar(Double numero1, Double numero2)  //metodo para sumar
    {
        Double suma = numero1 + numero2;
        return suma;
    }
    
    public Double restar(Double numero1, Double numero2) //metodo para restar
    {
        Double resta = numero1 - numero2;
        return resta;
    }
    
    public Double multiplicar(Double numero1, Double numero2) //metodo para multiplicar
    {
        Double multi = numero1 * numero2;
        return multi;
    }
    
    public Double dividir(Double numero1, Double numero2) //metodo para dividir
    {
        Double divid = numero1 / numero2;
        return divid;
    }
    
    
}
