
package Vector;

import java.util.Random;

public class Vector1 {
    int [] vector = new int[10];
    
    public void rellenarVector()
    {
        Random r = new Random();
        for (int i = 0; i < 10; i++)
        {
            vector[i] = r.nextInt(1, 10);
        }
    }
    
    public void derecho()
    {
        System.out.println("Vector al derecho: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    public void izq()
    {
        System.out.println("Vector al izquierdo: ");
        for (int i = 9; i >= 0; i--)
        {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
