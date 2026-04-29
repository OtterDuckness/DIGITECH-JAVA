

package com.mycompany.practicaclasesabstractas2;

public class TrabajadorComision extends Trabajador{
    
    private int proyectosCompletados; //proyectos completados
    private double comisionPorProyecto; //comision
    
    public TrabajadorComision(String nombre, String dni, double salarioBase, 
                            String area, int proyectosCompletados, double comisionPorProyecto)
    {
        super(nombre, dni, salarioBase, area);
        this.proyectosCompletados = proyectosCompletados;
        this.comisionPorProyecto = comisionPorProyecto;
    }
    
    @Override
    public double calcularSalarioFinal()
    {
        double salarioFinal = getSalario() + (proyectosCompletados * comisionPorProyecto);
        return salarioFinal;
    }
    
    @Override
    public String getTipoTrabajador()
    {
        return "Trabajador comision";
    }

}
