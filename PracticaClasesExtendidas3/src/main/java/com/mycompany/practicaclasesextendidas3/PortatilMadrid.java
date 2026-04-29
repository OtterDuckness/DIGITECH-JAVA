

package com.mycompany.practicaclasesextendidas3;

public class PortatilMadrid extends Portatil{
    
    private String serie;
    private String sede;
    private int unidades;
    
    public PortatilMadrid(String marca, String modelo, int ram, int capacidad, //constructor completo
            String pantalla, int npuertos, double precio, String serie,
            String sede, int unidades)
    {
        super(marca, modelo, ram, capacidad, pantalla, npuertos, precio);
        this.serie = serie;
        this.sede = sede;
        this.unidades = unidades;
    }
    
    //metodos
    
    public String getSerie()
    {
        return serie;
    }
    
    public void setSerie(String newSerie)
    {
        serie = newSerie;
    }
    
    public String getSede()
    {
        return sede;
    }
    
    public void setSede(String newSede)
    {
        sede = newSede;
    }
    
    public int getUnidades()
    {
        return unidades;
    }
    
    public void setUnidades(int newUnidades)
    {
        unidades = newUnidades;
    }
    
    @Override
    public void imprimir()
    {
        System.out.println("Imprimo todo...");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ram: " + ram);
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Pantalla: " + this.getPantalla());
        System.out.println("Npuertos: " + this.getNpuertos());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Serie: " + serie);
        System.out.println("Sede: " + sede);
        System.out.println("Unidades: " + unidades);
    }
}
