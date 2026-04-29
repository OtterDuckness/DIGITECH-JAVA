

package com.mycompany.practicaclasesextendidas;

public class Alumno_madrid extends Alumno{
    
    private String normativa;
    
    public Alumno_madrid (String nombre, String apellidos,String normativa)
    {
        super(nombre, apellidos);
        this.normativa = normativa;
    }
    
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Normativa: " + this.normativa);
    }
    
}
