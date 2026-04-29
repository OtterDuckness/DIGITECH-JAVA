/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.hilosjoin;

public class MiHilo extends Thread{

    
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println("Hilo en ejecucion! " + i);
            System.out.println("Hilo en ejecucion! " + Thread.currentThread().getName());
        }
    }
    
    public void dormir_hilo() throws InterruptedException
    {
        Thread.sleep(3000);
    }

}
