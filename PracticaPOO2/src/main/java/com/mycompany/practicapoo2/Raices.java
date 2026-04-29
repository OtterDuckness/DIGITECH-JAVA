
package com.mycompany.practicapoo2;

public class Raices {
    double a, b, c;
    
    public Raices( double a, double b, double c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getDiscriminante()
    {
        return ((b*b) - (4*a*c));  //calculamos un doscriminante
    }
    
    public boolean tieneRaices()
    {
        if (getDiscriminante() >= 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public boolean tieneRaiz()
    {
        if (getDiscriminante() == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public void obtenerRaices()
    {
        double discr = getDiscriminante();
        if (tieneRaices() == true) //si tiene 2 soluciones, calculamos 2 soluciones
        {
            double raiz1 = (-b + Math.sqrt(discr))/(2*a); 
            double raiz2 = (-b - Math.sqrt(discr))/(2*a);
            System.out.println(raiz1);
            System.out.println(raiz2);
        }
        else 
        {
            System.out.println("No hay soluciones");
        }
    }
    
    public void obtenerRaiz()
    {
        double discr = getDiscriminante();
        if (tieneRaiz() == true) //si tiene solo una solucion, calculamos 1 solucion
        {
            double raiz = (-b)/(2*a);
            System.out.println("Raiz: " + raiz);
        }
        else
        {
            System.out.println("No hay unica solucion (hay 2 o 0)");
        }
    }
    
    public void calcular()
    {
        if (tieneRaiz() == true)  //comprobamos si tiene unica solucion
        {
            obtenerRaiz();
        }
        else if (tieneRaices() == true)  //comprobamos si tiene 2 soluciones
        {
            obtenerRaices();
        }
        else
        {
            System.out.println("No hay soluciones");
        }
    }

}
