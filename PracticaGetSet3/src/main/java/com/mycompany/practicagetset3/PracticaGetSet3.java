
package com.mycompany.practicagetset3;


public class PracticaGetSet3 {

    public static void main(String[] args) {
        
        Libro test = new Libro();
        
        test.setTitulo("La guerra y la paz"); //assignamos un titulo
        test.setPrecio(11.0); //assignamos un precio
        
        System.out.println("Titulo: " + test.getTitulo());
        
        test.oferta(); //llamamos al metodo que cambia el precio
        System.out.println("Metodo 1: " + test.getPrecio()); //imprimimos nuevo precio
        
        System.out.println("Metodo 2: " + test.total(10)); //llamamos al metodo que calcula la cantidad * precio
    }
}
