

package com.mycompany.practicaclasesextendidas4diagrama;

public class Estudiante extends Persona{
    
    private int idEstudiante;
    
    public Estudiante(String nombre, int edad, int idEstudiante)
    {
        super(nombre,edad);
        this.idEstudiante = idEstudiante;
    }
    
    public int getIdEstudiante()
    {
        return idEstudiante;
    }

}
