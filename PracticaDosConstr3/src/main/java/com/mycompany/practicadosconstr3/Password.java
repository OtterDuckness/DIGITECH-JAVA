
package com.mycompany.practicadosconstr3;

import java.util.Random;

public class Password {

    Random r = new Random();
    
    public Integer longitud;
    public String contrasena;
    
    public Password() //por defecto
    {
        this.longitud = 8;
        this.contrasena = "12345678";
    }
    
    public Password(Integer longitud)
    {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }
    
    public String generarPassword()
    {
        int rn;
        char c = 0;
        contrasena = "";
        for (int i = 0; i < longitud; i++)
        {
            rn = r.nextInt(3); //numero aleatorio 0-2
            if (rn == 0)
            {
                c = (char)(r.nextInt(26) + 'a'); //aleatoria letra minuscula
            }
            if (rn == 1)
            {
                c = (char)(r.nextInt(26) + 'A'); //aleatoria letra minuscula
            }
            if (rn == 2)
            {
                c = (char)(r.nextInt(10) + '0'); //aleatorio numero
            }

            contrasena += c; //anadimos cada caracter
        }
        //System.out.println("La contrasena es: " + contrasena);
        return contrasena;
    }
    
    public boolean esFuerte()
    {
        int mayusc = 0;  //contadores
        int minusc = 0;
        int numero = 0;
        for (int i = 0; i < longitud; i++)
        {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c) == true)
            {
                mayusc++;
            }
            else if (Character.isLowerCase(c) == true)
            {
                minusc++;
            }
            else if (Character.isDigit(c) == true)
            {
                numero++;
            }
        }
        if (mayusc > 2 && minusc > 1 && numero > 5) //condicion para ver si es fuerte o no
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
