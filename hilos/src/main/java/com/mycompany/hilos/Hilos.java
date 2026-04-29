

package com.mycompany.hilos;


public class Hilos {

    public static void main(String[] args) {
        
    try{    
        //creamos las instancias de la clase MiHilo
        MiHilo hilo1 = new MiHilo();
        
        System.out.println("Activamos el hilo");
        
        //activamos el hilo
        hilo1.start();
        
        //lanzamos el hilo
        hilo1.run();
        
        System.out.println("Lanzamos el hilo");
        
        
    }catch(Exception e)
    {
        System.out.println("Error al lanzar el hilo");
    } finally
    {
        System.out.println("Fin del programa");
    }
    
    
    }
}
