
package com.mycompany.arraymetodos;

import java.util.Arrays; //importamos libreria

public class Arraymetodos {

    public static void main(String[] args) {
        
        //creamos un array de numeros
        int [] numeros = {109, 7, 45, 6, 90};
        
        //mostramos el contenido original del array
        System.out.println("El array original contiene: " + Arrays.toString(numeros));
        
        //sort para ordenar
        Arrays.sort(numeros);
        System.out.println("El array ordenado: " + Arrays.toString(numeros));
        
        //buscamos un valor, si no exoste - valor negativo
        System.out.println("Contiene el valor 7? " + Arrays.binarySearch(numeros, 7));
        
        //hacemos una copia del array
        int [] copia_array = Arrays.copyOf(numeros, 6);
        System.out.println("Imprimimos copia: " + Arrays.toString(copia_array));
        
    }
}
