

package com.mycompany.practicaclasesextendidas2;

public class Empleado_madrid extends Empleado {

    private double salario;
    private String departamento;
    
    public Empleado_madrid(String nombre, Integer edad, double salario, String departamento)
    {
        super (nombre, edad);
        this.salario = salario;
        this.departamento = departamento;
    }
    @Override
    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Salario: " + salario);
        System.out.println("Departamento: " + departamento);
    }
    
    public void subirSalario(double porcentaje)
    {
        salario = salario + salario * porcentaje;
    }
    
    public double getSalario()
    {
        return salario;
    }
}
