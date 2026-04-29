
package com.mycompany.practicapoo2;

public class Libro {
    String isbn, titulo, autor;
    int paginas;
    
    public Libro(String isbn, String titulo, String autor, int paginas)
    {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    public void toString1()
    {
        System.out.println("El libro " + this.titulo + " con ISBN " + this.isbn + " creado por " + this.autor + " tiene " + this.paginas + " paginas" );
    }
    
    public Libro comparar(Libro otro)  //devolvemos objeto Libro para que podamos trabajor con eso despues
    {
        if (this.paginas > otro.paginas)
        {
            System.out.println(this.titulo + " tiene mas paginas(" + this.paginas + ")"); //imprimimos y devolvemos un objeto
            return this;
        }
        else if (this.paginas < otro.paginas)
        {
            System.out.println(otro.titulo + " tiene mas paginas(" + otro.paginas + ")");
            return otro;
        }
        else 
        {
            return null;
        }
        
    }
    
}
