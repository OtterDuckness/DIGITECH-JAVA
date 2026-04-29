
package com.mycompany.practicabucle2;
import java.util.Scanner;

public class PracticaBucle2 {

    public static void main(String[] args) {
        

    //tarea 1
        
        int tarea1 = 0;
        System.out.println(tarea1);
        for (int i = 1; tarea1 < 100; i++ )
        {
            tarea1 = tarea1 +10;
            System.out.println(tarea1);
        }
        
    //tarea 2
    int tarea2 = 1;
    
    Scanner datospantalla = new Scanner(System.in);
    
    while (tarea2 > 0)
            {
            System.out.println("Introduce un número mayor que cero. Menos que cero para parar: ");
            tarea2 = datospantalla.nextInt();
                System.out.println(tarea2 * 2);
            }
    
    
    //tarea 3
    int tarea3;
    int x;
    int pos = 0;
    int neg = 0;
    
        System.out.println("Cuantas números: ");
        tarea3 = datospantalla.nextInt();
        
        for (int i = 0; i < tarea3; i++)
        {
            System.out.println("Introduce un número: ");
            x = datospantalla.nextInt();
            
            if (x%2 == 0)
            {
                pos ++;
            }
            else
            {
                neg ++;
            }
            
        }
        System.out.println("Has tecleado " + pos + " números positivos");
        System.out.println("Has tecleado " + neg + " números negativos");
    
    //tarea 5
    
    int tarea5 = 0;
        System.out.println(tarea5);
    
    while (tarea5 < 100)
    {
        tarea5 = tarea5 + 10;
        System.out.println(tarea5);
    }

    datospantalla.close();
    }
}
