
package com.mycompany.practicaclasesabstractas2;

public abstract class Trabajador {
    
    private String nombre;
    private String dni;
    private double salarioBase;
    private String area;
    
    public Trabajador(String nombre, String dni, double salarioBase, String area)
    {
        this.nombre = nombre;
        this.dni = dni;
        this.salarioBase = salarioBase;
        this.area = area;
    }
    
    public abstract double calcularSalarioFinal();
    
    public abstract String getTipoTrabajador();
    
    public void mostrarDatos()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Salario base: " + salarioBase);
        System.out.println("Area: " + area);
    }
    
    public boolean dniValido()
    {
        if (dni.length() == 8)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double getSalario()
    {
        return salarioBase;
    }
}
