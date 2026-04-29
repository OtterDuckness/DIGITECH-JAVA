
package com.mycompany.practicametodosarrays;

import java.util.Arrays;
import java.util.Scanner;

public class PracticaMetodosArrays {

    public static void main(String[] args) {
        
        //1
        
        int [] inventario = {1045, 2001, 1500, 1100, 987, 1750, 3000};
        
        System.out.println("Inventario inicial: " + Arrays.toString(inventario));
        
        //2
        
        Arrays.sort(inventario);
        
        System.out.println("Inventario ordenado: " + Arrays.toString(inventario));
        
        //3
        
        inventario = Arrays.copyOf(inventario, 10);
        
        Arrays.fill(inventario, 7, 8, 3100);
        Arrays.fill(inventario, 8, 9, 3200);
        Arrays.fill(inventario, 9, 10, 3300);
        
        System.out.println("Inventario ampliado: " + Arrays.toString(inventario));
        
        //4
        
        int [] inventarioBackup = Arrays.copyOf(inventario, 10);
        
        if (Arrays.equals(inventario, inventarioBackup))
        {
            System.out.println("Los inventarios son identicos");
        }
        else
        {
            System.out.println("Los inventarios han cambiado.");
        }
        
        //5
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca el codigo a buscar: ");
        int codigo = input.nextInt();
        
        if (Arrays.binarySearch(inventario, codigo) >= 0)
        {
            System.out.println("El producto con codigo " + codigo + " se encuentra en la posicion " + Arrays.binarySearch(inventario, codigo));
        }
        else 
        {
            System.out.println("El producto con codigo " + codigo + " no se encuentra en el inventario.");
        }
    }
}
