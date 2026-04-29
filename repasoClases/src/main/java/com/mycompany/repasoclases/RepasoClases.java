
package com.mycompany.repasoclases;


public class RepasoClases {

    public static void main(String[] args) {
        
        //crear las instancias de las clase y objetos
        
        //Coche(String marca, String modelo, String color, String matricula, Boolean eco, Double cilidrada)
        
        //creamos el primer objeto
        Coche micoche = new Coche("Citroen", "C3", "Blanco", "4583KFB", false, 1.6);
        
        micoche.imprimir();
        
        Coche micoche2 = new Coche("Renault", "Clio", "4526FGH");
        micoche2.imprimir();
        
        
    }
}
