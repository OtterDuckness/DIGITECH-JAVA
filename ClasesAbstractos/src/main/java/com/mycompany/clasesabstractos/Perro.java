
package com.mycompany.clasesabstractos;

public class Perro extends Animal {
    
    public String raza;
    
    //utilizamos la propiedad nombre que hereda de su clase abstracta madre
    public Perro(String nombre, String raza)
    {
        super(nombre);
        this.raza = raza;
    }

    //implementamos el metodo abstracto
    //como este método se declara en la clase abstracta pero se implementa aqui
    //@override
    
    @Override
    public void hacer()
    {
        System.out.println("El perro con la raza " + this.raza + " ladra");
    }
}
