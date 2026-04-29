

package com.mycompany.practicaarchivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class PracticaArchivos {

    public static void main(String[] args) throws IOException {
        
        String text = "";
        
        FileWriter f = new FileWriter("C:\\Users\\mandnicktolub\\OneDrive - Digitech\\Documentos\\NetBeansProjects\\Test.txt");
        f.write("TEST TEST TEST");
        f.close();
        
        
        int character;
        FileReader r = new FileReader("C:\\Users\\mandnicktolub\\OneDrive - Digitech\\Documentos\\NetBeansProjects\\Test.txt");
        while ((character = r.read()) != -1)
        {
            char c = (char) character;
            if (c != ' ')
            {
            text = text + c;
            }
        }
        System.out.println(text);
        
    }
}
