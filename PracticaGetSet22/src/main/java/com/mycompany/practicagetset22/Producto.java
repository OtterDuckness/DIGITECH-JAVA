

package com.mycompany.practicagetset22;

public class Producto {
private String nombre;
    private Double precio;
    private Integer caduc;
    private String tipo;
    
    public Producto(String nombre, Double precio, Integer caduc)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.caduc = caduc;
    }
    public Producto(String nombre, Double precio, String tipo)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    //creamos setters y getters
    public String getNombre() 
    {
        return nombre;
    }
    
    public void setNombre(String newNombre)
    {
        this.nombre = newNombre;
    }
    
    public Double getPrecio()
    {
        return precio;
    }
    
    public void setPrecio(Double newPrecio)
    {
        this.precio = newPrecio;
    }
    
    public Integer getCaduc()
    {
        return caduc;
    }
    
    public void setCaduc(Integer newCaduc)
    {
        this.caduc = newCaduc;
    }
    
    public String getTipo()
    {
        return tipo;
    }
    
    public void setTipo(String newTipo)
    {
        this.tipo = newTipo;
    }
    
    public Double calcular(Integer cantidad)
    {
        double sum = 0;
        if (caduc != null) //comprobamos si es perecedero o no
        {
            if (caduc == 1)
            {
                precio = precio/4;
                sum = precio * cantidad;
            }
            else if (caduc == 2)
            {
                precio = precio/3;
                sum = precio * cantidad;
            }
            else if (caduc == 3)
            {
                precio = precio/2;
                sum = precio * cantidad;
            }
            else
            {
                sum = precio * cantidad;
            }
            return sum;
        }
        else
        {
            sum = precio * cantidad;
            return sum;
        }
    }
}
