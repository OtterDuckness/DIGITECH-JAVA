package com.mycompany.oop;

import java.util.Scanner;


public class Oop {

    public static void main(String[] args) {
        //utilizamos la clausula new para crea la instancia y objeto de la clase scanner
        
        Scanner input=new Scanner(System.in);
        
        //creamos el objeto de tipo coche
        Coche micoche = new Coche("citroen","c3","blanco",2019,5);
        
        //mostrar todos los datos por pantalla
        //nombreobjeto.propiedad
        //micoche.marca
        //micoche.modelo
        System.out.println(micoche.marca);
        System.out.println(micoche.modelo);
        System.out.println(micoche.plazas);
    }
}
