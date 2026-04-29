
package com.mycompany.practicapoo2;

public class Cuenta {
    
    
    String titular;
    double cantidad;
    
    public Cuenta(String titular, double cantidad) 
    {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    
    public Cuenta(String titular) //cantidad opcional
    {
        this.titular = titular;
    }
    
    public void ingresar(double cantidad) //metodo para ingresar dinero
    {
        if (cantidad > 0)
        {
            this.cantidad += cantidad;
        }
        else
            System.out.println("La cantidad tiene que ser positivo");
    }
    
    public void retirar(double cantidad)  //metodo para retirar dinero
    {
        this.cantidad -= cantidad;
        if (this.cantidad < 0)
        {
            this.cantidad = 0;
        }
    }
}
