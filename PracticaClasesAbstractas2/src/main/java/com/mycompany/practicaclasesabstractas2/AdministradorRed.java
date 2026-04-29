

package com.mycompany.practicaclasesabstractas2;

import java.util.Random;

public class AdministradorRed extends PermisoAcceso{
    
    Random r = new Random();
    
    public AdministradorRed(String nivelPermiso, String zonaAsignada, 
                            boolean accesoActivo, String idEmpleado)
    {
        super(nivelPermiso, zonaAsignada, accesoActivo, idEmpleado);
    }
    
    
    @Override
    public boolean tieneAcceso() 
    {
        return getAccesoActivo();
    }
    
    @Override
    public void activarAcceso() 
    {
        setAccesoActivo(true);
        System.out.println("Acceso activado");
    }

}
