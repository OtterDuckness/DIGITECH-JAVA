
package Vector;

import java.util.Random;

public class Vector2 {

    
    public int [] A = new int[20];
    public int [] B = new int[20];
    public int [] C = new int[20];
    
    public void rellenar(int [] vector)
    {
        Random r = new Random();
        for (int i = 0; i < 20; i++)
        {
            vector[i] = r.nextInt(1, 20);
        }
    }
    
    public void calcular()
    {
        for (int i = 0; i < 20; i++)
        {
            C[i] = A[i] + B[i];
        }
    }
    
    public void visualizar()
    {
        System.out.println("Imprimimos vector A" );
        for (int i = 0; i < 20; i++)
        {
            System.out.print(A[i] + " ");
        }
        System.out.println();
        System.out.println("Imprimimos vector B" );
        for (int i = 0; i < 20; i++)
        {
            System.out.print(B[i] + " ");
        }
        System.out.println();
        System.out.println("Imprimimos vector C" );
        for (int i = 0; i < 20; i++)
        {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
    
    
}
