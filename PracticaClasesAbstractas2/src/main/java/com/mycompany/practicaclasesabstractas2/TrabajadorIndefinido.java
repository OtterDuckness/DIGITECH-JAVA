

package com.mycompany.practicaclasesabstractas2;

public class TrabajadorIndefinido extends Trabajador{
    
    private double plusMensual;
    
    public TrabajadorIndefinido(String nombre, String dni, double salarioBase, String area, double plusMensual)
    {
        super(nombre, dni, salarioBase, area);
        this.plusMensual = plusMensual;
    }
    
    @Override
    public double calcularSalarioFinal()  //un metodo para salario final
    {
        double salarioFinal = getSalario() + plusMensual;
        return salarioFinal;
    }
    
    @Override
    public String getTipoTrabajador() //devuelve el tipo de trabajador
    {
        return "Trabajador indefinido";
    }

}
