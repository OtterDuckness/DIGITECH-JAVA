
package com.mycompany.practicaclasesabstractas2;

public class AnalistaSeguridad extends PermisoAcceso{
    
    public AnalistaSeguridad(String nivelPermiso, String zonaAsignada, 
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
        if (getZonaAsignada().equals("SOC") || getZonaAsignada().equals("Oficinas"))
        {
            setAccesoActivo(true);
            System.out.println("Acceso activado");
        }
        
    }

}
