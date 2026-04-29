
package com.mycompany.clasesabstractos;


public class ClasesAbstractos {

    public static void main(String[] args) {
        
        //creamos dos objetos de dos clases extendidads de la misma clase abstracta
        //además de implementar el metodo hacer de diferente forma en cada una
        
        Perro test1 = new Perro("Lassie", "collie");
        Gato test2 = new Gato("Garfield", "rojo", 3);
        
        test1.hacer();
        test2.hacer();
    }
}
