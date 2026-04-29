
package com.mycompany.archivos3;
import java.io.*;

public class Archivos3 {

    public static void main(String[] args) {
        //crear un array con datos
        //escribir los datos del array en el archivo
        File archivo = null;
        PrintWriter pw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;
        
        //creamos el array
        String[] nombres = {"test1", "test2", "test3", "test4"};
      
        try
        {
            archivo = new File ("C:\\prueba\\ejercicio.txt");
            pw = new PrintWriter(archivo);
            
            bw = new BufferedWriter(new FileWriter(archivo));
            br = new BufferedReader(new FileReader(archivo));
            
            for (int i = 0; i < nombres.length; i++)
            {
                //aparece el texto dentro del archivo en lineas diferentes
                bw.write(nombres[i] + "\r\n");
            }
            //actualizamos el buffer
            bw.flush();
            
            System.out.println("Se escriben los datos del archivo: ");
            
            //mostramos en java los datos del archivo
            String cadena;
            while ((cadena = br.readLine())!= null)
            {
                System.out.println(cadena);
            }
            
            
        }
        
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
