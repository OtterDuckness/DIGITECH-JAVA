

package com.mycompany.practicaclasesabstractas1;

public class cactus extends planta{ //clase normal
    
    public cactus(String nombre,int edad)
    {
        super(nombre, edad);
    }

    @Override
    public String sistemaDeRiego(String tipo) //metodo normal
    {
        if (tipo.equals("interior"))
        {
            return "goteo";
        }
        else if (tipo.equals("exterior"))
        {
            return "permanente";
        }
        else if (tipo.equals("frutal"))
        {
            return "permanente";
        }
        else
        {
            return "ninguno";
        }
    }
}
