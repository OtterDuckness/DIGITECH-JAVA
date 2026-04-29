
package com.mycompany.practicadosconstr2;

import java.util.Scanner;

public class PracticaDosConstr2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nombre;
        int edad;
        String sexo;
        int peso;
        double altura;
        
        //constructor completo: String nombre, Integer edad, String dni, String sexo, Integer peso, Integer altura
        //constructor 2: String nombre, Integer edad, String sexo

        
        
        System.out.println("Introduce el nombre 1 ");
        nombre = input.nextLine();
        System.out.println("Introduce la edad 1");
        edad = input.nextInt();
        System.out.println("Introduce el sexo (H/M) 1");
        sexo = input.next();
        System.out.println("Introduce el peso 1");
        peso = input.nextInt();
        System.out.println("Introduce la altura (en m) 1");
        altura = input.nextDouble();
        
        
        Persona test = new Persona(nombre, edad, sexo, peso, altura); //creamos primer objeto
        
        input.nextLine();
        System.out.println("Introduce el nombre 2 ");
        nombre = input.nextLine();
        System.out.println("Introduce la edad 2");
        edad = input.nextInt();
        System.out.println("Introduce el sexo (H/M) 2");
        sexo = input.next();
              
        Persona test2 = new Persona(nombre, edad, sexo); //creamos segundo objeto

        Persona test3 = new Persona(); //objeto vacio
 
        
        //imprimimos todo
        test.imc();
        test2.imc();
        test3.imc();
        
        test.esMayorDeEdad();
        test2.esMayorDeEdad();
        test3.esMayorDeEdad();
        
        test.comprobarSexo();
        test2.comprobarSexo();
        test3.comprobarSexo();
        
        test.toString1();
        test2.toString1();
        test3.toString1();
        
        test.generaDNI();
        test2.generaDNI();
        test3.generaDNI();
        
        
    }
}
