
package com.mycompany.practicaclasesextendidas4diagrama;

public class Profesor extends Empleado{
    
    private String especialidad;
    
    public Profesor(String nombre, int edad, double salario, String especialidad)
    {
        super(nombre, edad, salario);
        this.especialidad = especialidad;
    }
    
    public String getEspecialidad()
    {
        return especialidad;
    }

}
