
package com.mycompany.progrsimul5;


public class ProgrSimul5 {

    public static void main(String[] args) {

        int n = 10;  //n=2
        int termino1 = 0;
        int termino2 = 1;
        int suma = 0;
        System.out.println(termino1); //System.out.println
        System.out.println(termino2);//System.out.println
        do {
            suma = termino1 * termino2; //tiene que ser termino1 + termino2
            System.out.println(suma); //System.out.println
            termino1 = termino2;
            termino2 = suma;
            n++;  
        } while (n< 2); //n<10
    }
}
