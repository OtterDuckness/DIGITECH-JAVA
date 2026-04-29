
package com.mycompany.practicadosconstr2;

import java.util.Random;

public class Persona {
    
    Random r = new Random();
    
    String nombre;
    Integer edad;
    String dni;
    String sexo;
    Integer peso;
    Double altura;
    
    public Persona ()  //constructor por defecto
    {
       this.nombre = "";
       this.edad = 0;
       this.dni = "";
       this.sexo = "H";
       this.peso = 0;
       this.altura = 0.0;
    }
    
    public Persona (String nombre, Integer edad, String sexo)  //constructor 2
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = "";
        this.peso = 0;
        this.altura = 0.0;
    }
    
    public Persona (String nombre, Integer edad, String sexo, Integer peso, Double altura) //constructor completo
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = "";
        this.peso = peso;
        this.altura = altura;
    }
    
    public double imc()  //calculamos imc
    {
        System.out.println("\nIMC:");
        System.out.print(nombre + ": " );
        double imc = peso/(altura * altura);
        if (peso == 0 || altura == 0)  //en caso de que no haya informacion
        {
            System.out.println("Necesito mas datos");
            return -2;
        }
        else
        {
            if (imc < 20)
            {
                System.out.println("Esta por debajo de su peso ideal");
                return -1;
            }
            else if (imc <= 25 && imc >= 20)
            {
                System.out.println("Esta ideal");
                return 0;
            }
            else 
            {
                System.out.println("Esta sobrepesado");
                return 1;
            }
        }
        
    }
    
    public boolean esMayorDeEdad() //comprobamos la edad
    {
        System.out.println("\nesMayorDeEdad:");
        System.out.print(nombre + ": " );
        if (edad >= 18)
        {
            System.out.println("Es mayor de edad");
            return true;
        }
        else if (edad == 0) //edad por defecto
        {
            System.out.println("Edad por defecto es 0");
            return false;
        }
        else
        {
            System.out.println("Es menor de edad");
            return false;
        }
    }
    
    public void comprobarSexo()
    {
        System.out.println("\nComprobarSexo:");
        System.out.print(nombre + ": " );
        if (sexo.equals("M") || sexo.equals("m") || sexo.equals("H") || sexo.equals("h"))
        {
            System.out.println("El sexo esta comprobado");
        }
        else  //si tenemos un valor malo
        {
            this.sexo = "H";
            System.out.println("El sexo no esta comprobado, assignamos H");
            System.out.println("Sexo actual: " + sexo);
        }
    }
    
    public void toString1()
    {
        System.out.println("\nToString:");
        System.out.print("Nombre: " + nombre);
        System.out.println("\nEdad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
    }
    
    public void generaDNI()
    {
        System.out.println("\nGeneraDNI:");
        System.out.print(nombre + ": " );
        if (dni.equals(""))  //si el campo DNI esta vacia, generamos nuevo
        {
            char x = (char)r.nextInt(65, 90);
            dni += x;
            for (int i = 0; i < 7; i++)
            {
                x = (char)(r.nextInt(10) + '0'); //aleatorio numero
                dni += x;
            }
            x = (char)r.nextInt(65, 90);
            dni += x;
            System.out.println(dni);
        }
        else  //si DNI ya existe, lo imprimimos
        {
            System.out.println("DNI ya existe: " + dni);
        }
        
        
    }
    
}
