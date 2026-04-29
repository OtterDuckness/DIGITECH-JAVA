
package com.mycompany.practicarunnable;

public class contador implements Runnable{

    private int contador;
    private String nombre;
    private int limite;
    
    public contador(String nombre, int limite) {
        this.contador = 0;
        this.nombre = nombre;
        this.limite = limite;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < limite; i++) {
            contador++;
            System.out.println(nombre + ": " + contador);
        }
        System.out.println("El hilo " + nombre + " ha finalizado");
    }

}
    

