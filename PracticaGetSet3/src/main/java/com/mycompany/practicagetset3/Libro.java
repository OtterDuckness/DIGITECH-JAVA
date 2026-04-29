
package com.mycompany.practicagetset3;

public class Libro {
    
    private String titulo;
    private String editorial;
    private String isbn;
    private String autor;
    private String genero;
    private Integer ano;
    private Double precio;
    
    public Libro()
    {
    }
    
    //creamos setters y getters
    public String getTitulo() 
    {
        return titulo;
    }
    
    public void setTitulo(String newTitulo)
    {
        this.titulo = newTitulo;
    }
    
    public String getEditorial()
    {
        return editorial;
    }
    public void setEditorial(String newEditorial)
    {
        this.editorial = newEditorial;
    }
    
    public String getIsbn()
    {
        return isbn;
    }
    public void setIsbn(String newIsbn)
    {
        this.isbn = newIsbn;
    }
    
    public String getAutor()
    {
        return autor;
    }
    public void setAutor(String newAutor)
    {
        this.autor = newAutor;
    }
    
    public String getGenero()
    {
        return genero;
    }
    public void setGenero(String newGenero)
    {
        this.genero = newGenero;
    }
    
    public Integer getAno()
    {
        return ano;
    }
    public void setAno(Integer newAno)
    {
        this.ano = newAno;
    }
    
    public Double getPrecio()
    {
        return precio;
    }
    public void setPrecio(Double newPrecio)
    {
        this.precio = newPrecio;
    }
    
    //creamos 2 metodos
    
    public void oferta()
    {
        //cambiamos el precio con el descuento de 20%
        //this.precio = this.precio * 0.8
    }
    
    public Double total(Integer cantidad)
    {
        //introduce la cantidad de libros
        //calculamos cantidad * precio
        //devolvemos total
        Double total = cantidad * precio;
        return total;
        
    }
    
}
