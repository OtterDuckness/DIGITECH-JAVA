
package com.mycompany.practicaconstructores1;

public class CuentaCliente {

    String cliente;
    Double cantidad;
    
    public CuentaCliente (String cliente, Double cantidad)
    {
        this.cliente = cliente;
        this.cantidad = cantidad;
    }
    
    public CuentaCliente (String cliente)
    {
        this.cliente = cliente;
        this.cantidad = 0.0;
    }
    
    public void Ingresar(double ingreso)
    {
        this.cantidad = this.cantidad + ingreso;
        System.out.println("Cantidad actual: " + this.cantidad);
    }
    
    public void Retirar(double ingreso)
    {
        this.cantidad = this.cantidad - ingreso;
        System.out.println("Cantidad actual: " + this.cantidad);
    }
    
}
