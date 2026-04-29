
package com.mycompany.archivos2;

import java.io.*;

public class Archivos2 {

    public static void main(String[] args) {
        
        //ejemplo lectura del contenido de un archivo
        //inicializacion de las variables
        //incluso el buffer de lectura
        try
        {
            File inputFile = null;
            FileReader in = null;
            BufferedReader br = null;
        
        
        //asociamos el archivo
        inputFile = new File("C:\\prueba\\ejercicio.txt");
        
        in = new FileReader(inputFile);
        br = new BufferedReader(in);
        
        //realizamos la lectura del archivo
        String linea;
        
        //mieantra el archivo tiene lineas diferentes a null
        //mientras el archivo tiene contenido, se imprimen las lineas
        while((linea = br.readLine())!=null)
        {
            System.out.println(linea);
        }
        
        }
        catch(Exception e)
        {
            //mostramor el error
            System.out.println(e.getMessage());
        }
        
        
    }
}
