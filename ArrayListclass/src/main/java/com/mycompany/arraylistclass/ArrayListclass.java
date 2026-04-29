package com.mycompany.arraylistclass;

import java.util.ArrayList;

public class ArrayListclass {

    public static void main(String[] args) {
        
        //creamso el arraylist con datos de tipo string
        ArrayList<String> alumnos = new ArrayList<>();
        
        //añadir un elemento a mi arraylist
        alumnos.add("Manuel");
        alumnos.add("Pedro");
        alumnos.add("Maria");
        
        //imprimir los elementos por posicion
        System.out.println("El primer elemento es: " + alumnos.get(0));
        
        //imprimir el segundo elemento
        System.out.println("El segundo elemento es: " + alumnos.get(1));
        
        //imprimir un arraylist, utilizar un bucle for
        
        System.out.println("Se imprimen los dates del Arraylist");
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Lost datos del ArrayList son: " + alumnos.get(i));
        }
        
        
        
    }
}
