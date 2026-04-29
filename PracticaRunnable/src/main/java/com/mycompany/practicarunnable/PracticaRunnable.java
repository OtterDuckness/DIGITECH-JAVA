
package com.mycompany.practicarunnable;


public class PracticaRunnable {

    public static void main(String[] args) {
        
        contador c1 = new contador("Hilo 1", 100);
        contador c2 = new contador("Hilo 2", 100);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
        
        
    }
}
