

package com.mycompany.practicaclasesabstractas2;

public abstract class PermisoAcceso {
    
    private String nivelPermiso;
    private String zonaAsignada;
    private boolean accesoActivo;
    private String idEmpleado;
    
    public PermisoAcceso(String nivelPermiso, String zonaAsignada, boolean accesoActivo, String idEmpleado)
    {
        this.nivelPermiso = nivelPermiso;
        this.zonaAsignada = zonaAsignada;
        this.accesoActivo = false;
        this.idEmpleado = idEmpleado;
    }
    
    public abstract boolean tieneAcceso();
    
    public abstract void activarAcceso();
    
    public void desactivarAcceso() //desactivamos el acceso
    {
        accesoActivo = false;
    }
    
    public void mostrarPermisos() //mostramos permisos
    {
        System.out.println("Permiso: " + nivelPermiso);
    }
    
    public void setAccesoActivo(boolean newAcceso)
    {
        accesoActivo = newAcceso;
    }
    
    public boolean getAccesoActivo()
    {
        return accesoActivo;
    }
    
    public String getZonaAsignada()
    {
        return zonaAsignada;
    }

}
