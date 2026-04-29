

package com.mycompany.ficheros;
import java.io.FileWriter;
import java.io.IOException;

public class Ficheros {

    public static void main(String[] args) throws IOException
        
    {
        FileWriter f = new FileWriter( "C:\\Users\\mandnicktolub\\OneDrive - Digitech\\ASIGNATURAS\\JAVA\\prueba1.txt" );
        f.write("testtesttesttesttesttesttesttesttesttesttest12312312");
        f.close();
        
        
    }
}

