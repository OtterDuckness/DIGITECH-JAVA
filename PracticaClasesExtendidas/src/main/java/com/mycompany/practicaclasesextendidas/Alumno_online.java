

package com.mycompany.practicaclasesextendidas;

public class Alumno_online extends Alumno {

    private Integer expediente;
    public Alumno_online(String nombre, String apellidos, Integer expediente)
    {
        super(nombre, apellidos);
        this.expediente = expediente;
    }
    
    public void mostrarInfo()
    {
        super.mostrarInfo();
        System.out.println("Expediente: " + this.expediente);
    }
}
