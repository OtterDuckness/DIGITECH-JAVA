
package com.mycompany.archivos;
//importamos la libria donde estan las clases para trabajar con archivos
import java.io.*;


public class Archivos {

    public static void main(String[] args) {
        
//ejemplo escribir en archivo
//---------------------------
//creamos el archivo que no existe
//escribirimos cada linea dentro del archivo
//necesitamos utilizar las excepciones, xq puede que archivo se pueda abrir o crear o no


//declarar las variables sin valor
FileWriter archivo = null;
PrintWriter pw = null;


try
{
    //bloque de codigo que se analiza
    //si no existe el archivo lo creamos
    archivo = new  FileWriter ("C:/prueba/ejercicio.txt");
    
    
    //escribimos en el archivo, asociamos el objeto de tipo printwriter al archivo del disco local
    pw = new PrintWriter(archivo);
    
    //como escribimos varias lineas programamos un bucle
    for (int i = 0; i < 10; i++)
    {
        //en cada vuelta del bucle se escribe un linea
        pw.println("Linea: " + i);
    }
    //cerramos el archivo
    pw.close();
}

catch (Exception e) {
    //gestionamos el posible error que puede suceder
    e.printStackTrace();
}



    }
}
