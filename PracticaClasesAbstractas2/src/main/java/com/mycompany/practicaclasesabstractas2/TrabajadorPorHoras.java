

package com.mycompany.practicaclasesabstractas2;

public class TrabajadorPorHoras extends Trabajador{
    
    private int horas;
    private double precioHora;
    
    public TrabajadorPorHoras(String nombre, String dni, double salarioBase, 
                            String area, int horas, double precioHora)
    {
        super(nombre, dni, salarioBase, area);
        this.horas = horas;
        this.precioHora = precioHora;
    }
    
    @Override
    public double calcularSalarioFinal()  //un metodo para salario final
    {
        double salarioFinal = getSalario() + (horas * precioHora);
        return salarioFinal;
    }
    
    @Override
    public String getTipoTrabajador() //devuelve el tipo de trabajador
    {
        return "Trabajador por horas";
    }
}
