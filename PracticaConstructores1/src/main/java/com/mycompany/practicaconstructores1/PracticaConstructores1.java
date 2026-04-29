
package com.mycompany.practicaconstructores1;

import java.util.Scanner;


public class PracticaConstructores1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double ingreso;
        
        CuentaCliente cliente1 = new CuentaCliente("Bobo", 15.99);
        
        System.out.println("Introduce el ingreso: ");
        ingreso = input.nextDouble();
        
        cliente1.Ingresar(ingreso);
        
        System.out.println("Introduce el retiro: ");
        ingreso = input.nextDouble();
        
        cliente1.Retirar(ingreso);

    }
}
