
package com.mycompany.hilos;

public class MiHilo extends Thread{
    //creamos un objeto de tipo hilo
    
    
    @Override
    public void run()
    {
        for(int contador = 0; contador < 100000000; contador++); 
        {
        System.out.println("El hilo se esta ejecutando");
        }
    }
    

    
    
}
