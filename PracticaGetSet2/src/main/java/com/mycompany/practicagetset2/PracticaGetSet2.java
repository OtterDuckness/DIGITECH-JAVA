

package com.mycompany.practicagetset2;


public class PracticaGetSet2 {

    public static void main(String[] args) {
        
        
        //Producto(String nombre, Double precio, Integer caduc) - perecedero
        //public Producto(String nombre, Double precio, String tipo) - no perecedero
        Producto test_pereced1 = new Producto("Leche", 1.00, 4); //perecedero no caducado
        Producto test_pereced2 = new Producto("Leche", 1.00, 3); //perecedero caducado en 3 dias
        Producto test_pereced3 = new Producto("Leche", 1.00, 1); //perecedero caducado en 1 dia
        
        Producto test_nopereced = new Producto("Chocolate", 2.50, "Negro");
        
        System.out.println("Cantidad: 10 unidades");
        System.out.println("Calculamos unidades*precio de un producto perecedero no caducado: " + test_pereced1.calcular(10));
        System.out.println("Calculamos unidades*precio de un producto perecedero caducado en 3 dias: " + test_pereced2.calcular(10));
        System.out.println("Calculamos unidades*precio de un producto perecedero caducado en 1 dia: " + test_pereced3.calcular(10));
    }
}
