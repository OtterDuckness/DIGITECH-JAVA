package com.mycompany.objetoscanner;
//pedir dos valores por pantalla y posteriormente imprimir esos valores en la consola
//importamos la libreria donde está definida la clase Scanner
import java.util.Scanner;


public class ObjetoScanner {

    public static void main(String[] args) {
        
        
        System.out.println("Hello World!");
        
    //creamos un objeto de tipo scanner para pedir los datos por pantalla
    Scanner datospantalla = new Scanner(System.in);
    
    int numero1;
    int numero2;
    String nombre;
    
    System.out.println("Introduce primer valor númerico entero: ");
    numero1 = datospantalla.nextInt();
    
    System.out.println("Introduce segundo valor númerico entero: ");
    numero2 = datospantalla.nextInt();
        
        
    System.out.println("El primer valor que se ha tecleado es: " + numero1);
    System.out.println("E5l segundo valor que se ha tecleado es: " + numero2);
    
    System.out.println("Escribe tu nombre: ");
    nombre = datospantalla.next();
    
    System.out.println("El usuario ha tecleado el nombre: " + nombre);
    
    //para liberar el objeto de la memoria
    datospantalla.close();
    
    
    }
}

