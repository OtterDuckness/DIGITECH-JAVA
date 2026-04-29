
package com.mycompany.practicaclasesextendidas2;

public class Empleado_bcn extends Empleado{
    
    private double salario;
    private String idioma;
    private String idconvenio;
    
     public Empleado_bcn(String nombre, Integer edad, double salario, String idioma, String idconvenio)
     {
         super (nombre, edad);
         this.salario = salario;
         this.idioma = idioma;
         this.idconvenio = idconvenio;
     }
     
    @Override
    public void mostrarDatos()
    {
        super.mostrarDatos();
        System.out.println("Salario: " + salario);
        System.out.println("Idioma: " + idioma);
        System.out.println("Idconvenio: " + idconvenio);
    }
    
    public void ajustarSalario(double porcentaje)
    {
        salario = salario - salario * porcentaje;
    }
    
    public double getSalario()
    {
        return salario;
    }
}
