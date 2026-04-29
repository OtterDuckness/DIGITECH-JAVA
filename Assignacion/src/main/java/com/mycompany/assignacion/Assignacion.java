
package com.mycompany.assignacion;


public class Assignacion {

    public static void main(String[] args) {
    
        
        int hucha;
        hucha = 500;
        // +=, suma la cantidad de la derecha al valor que tiene la variable
        
        hucha += 50;
        System.out.println("Hucha contiene: " + hucha);
        
        //-=, resta la cantidad de la derecha al valor que tiene la variable
        
        hucha -= 10;
        System.out.println("Hucha ahora contiene: " + hucha);
        
        //*=, multiplica el valor de la derecha del igual a valor que contiene la variable
        
        hucha *= 20;
        System.out.println("Hucha ahora contiene: " + hucha);
        
        
        // /=, divide el valor de la derecha del igual a valor que contiene la variable
        hucha /= 20;
        System.out.println("Hucha ahora contiene: " + hucha);
        
         // %=2, divide el valor de la variable entre el valor de la derecha del igual, y guarda el rest dentro de la variable hucha
        hucha %= 2;
        System.out.println("Hucha ahora contiene: " + hucha);
        

    }
}
