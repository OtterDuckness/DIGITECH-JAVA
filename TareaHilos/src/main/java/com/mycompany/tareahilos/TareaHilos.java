

package com.mycompany.tareahilos;


public class TareaHilos {

    public static void main(String[] args) {
        Hilo test = new Hilo();
        Hilo test2 = new Hilo();
        Hilo test3 = new Hilo();
        Hilo test4 = new Hilo();
        test.start();
        test2.start();
        test3.start();
        test4.start();
    }
}
