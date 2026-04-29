

package com.mycompany.hilosjoin;


public class HilosJoin {

    public static void main(String[] args) {
        
        MiHilo hilo1 = new MiHilo();
        MiHilo hilo2 = new MiHilo();
        MiHilo hilo3 = new MiHilo();

        hilo1.start();
        
        
        //encemos el hilo
        try {
            Thread.sleep(3000);
            //lanzamos el primer hilo
            hilo1.join();
            
            //cuando finaliza el primer hilo lanzamos el segundo
            hilo2.start();
            hilo2.join(2000);
        } catch (InterruptedException ex) {
        System.getLogger(HilosJoin.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
        
    }
}
