
package com.mycompany.pracitcaarraylist3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PracitcaArrayList3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        
        //tarea 1
        System.out.println("\nTarea 1\n");
        
        ArrayList<Integer> tarea1 = new ArrayList<>();
        int tarea1_val = 0, tarea1_contador = 0, tarea1_suma = 0, tarea1_cont = 0;
        double tarea1_med = 0;
        
        do  //rellenamos un ArrayList
        {
           System.out.println("Introduce valores para rellenar un ArrayList. Teclea '-99' para terminar:");
           tarea1_val = input.nextInt();
           if (tarea1_val !=-99)
           {
               tarea1.add(tarea1_val);
               tarea1_contador++;
           }
        }
        while (tarea1_val !=-99);
        
        for (int i = 0; i < tarea1.size(); i++) //contamos la suma y imprimimos el ArrayList
        {
            tarea1_suma = tarea1_suma + tarea1.get(i);
            System.out.println("Valor " + i + ": " + tarea1.get(i));
        }
        tarea1_med = (double)tarea1_suma / tarea1.size(); //contamos la media
        System.out.println(tarea1_contador + " valores en total"); //imprimimos todo
        System.out.println("La suma: " + tarea1_suma);
        System.out.printf("La media: %.2f\n", tarea1_med);
        for (int i = 0; i < tarea1.size(); i++) //contamos valores mayor que media
        {
            if (tarea1.get(i) > tarea1_med)
            {
                tarea1_cont++;
            }
        }
        System.out.println(tarea1_cont + " valor/valores mayor que la media");
        
        //tarea 2
        System.out.println("\nTarea 2\n");
        
        int tarea2_n = 0;
        String tarea2_preg = "";
        ArrayList <Integer> tarea2 = new ArrayList<>();
        
        System.out.println("Introduce el numero de valores aleatorios en ArrayList");
        tarea2_n = input.nextInt();
        
        for (int i = 0; i < tarea2_n; i++)
        {
            tarea2.add(r.nextInt(1000));
            System.out.println("Valor " + i + ": " + tarea2.get(i));
        }
        System.out.println("El primer valor: " + tarea2.get(0));
        System.out.println("El ultimo valor: " + tarea2.get(tarea2.size()-1));
        System.out.println("Quieres anadir otro valor? si/no");
        tarea2_preg = input.next();
        if (tarea2_preg.equals("si"))
        {
            System.out.println("Introduce el valor: ");
            tarea2.add(input.nextInt());
            for (int i = 0; i < tarea2.size(); i++)
            {
                System.out.println("Valor " + i + ": " + tarea2.get(i));
            }
        }
        System.out.println("El programa ha terminado");
      
        //tarea 3
        System.out.println("\nTarea 3\n");
        
        
        ArrayList <String> tarea3 = new ArrayList<>();
        int tarea3_pregunta = 0;
        String tarea3_find = "";
        
        do //creamos el menu
        {
            System.out.println("1. Agregar nuevas asignaturas");
            System.out.println("2. Mostrar la lista de asignaturas");
            System.out.println("3. Buscar asignaturas por su nombre");
            System.out.println("4. Salir");
            tarea3_pregunta = input.nextInt();
            input.nextLine();
            if (tarea3_pregunta == 1)
            {
                
                System.out.println("Introduce nueva asignatura: "); //anadimos asignaturas
                tarea3.add(input.nextLine());
            }
            else if (tarea3_pregunta == 2)
            {
                System.out.println("Imprimo la lista de asignaturas..."); //imprimimos la lasita de asignaturas
                for (int i = 0; i < tarea3.size(); i++)
                {
                    System.out.println("Asignatura " + i + ": " + tarea3.get(i));
                }
            }
            else if (tarea3_pregunta == 3)
            {
                System.out.println("Introduce un nombre de asignatura para buscarla:"); //buscamos una asignatura y su posicion
                tarea3_find = input.nextLine();
                if (tarea3.indexOf(tarea3_find) == -1)
                {
                    System.out.println("Asignatura no encontrada");
                }
                else 
                {
                    System.out.println("Asignatura encontrada. Su pocision es: " + tarea3.indexOf(tarea3_find) + ". " + tarea3.get(tarea3.indexOf(tarea3_find)));
                }
            }
            
        }
        while (tarea3_pregunta != 4);

        //tarea 4
        
        System.out.println("\nTarea 4\n");
        
        int tarea4_tam = 0, tarea4_pregunta = 0, tarea4_num = 0, tarea4_sum_al = 0, tarea4_sum_a = 0;
        int tarea4_gr_al = 0,tarea4_gr_a = 0;
        ArrayList <Integer> tarea4_al = new ArrayList<>();
        
        
        System.out.println("Cuantos numeros quieres introducir?"); //tamano del array
        tarea4_tam = input.nextInt();
        int [] tarea4_a = new int[tarea4_tam];
        
        
        
        do
        {
            System.out.println("1. Agregar numeros");
            System.out.println("2. Mostrar numeros");
            System.out.println("3. Calcular la suma");
            System.out.println("4. Encontrar el numero mas grande");
            System.out.println("5. Salir");
            tarea4_pregunta = input.nextInt();
            if (tarea4_pregunta == 1)
            {
                tarea4_al.clear(); //borramos todos los numeros en arraylist para empezar de nuevo cada vez
                for (int i = 0; i < tarea4_tam; i++)
                {
                    System.out.println("Introduce un numero: ");
                    tarea4_num = input.nextInt();
                    tarea4_al.add(tarea4_num); //agregamos valores en arraylist
                    tarea4_a[i] = tarea4_num; //agregamos valores en array
                }
            }
            else if (tarea4_pregunta == 2)
            {
                System.out.println("Valores de Arraylist: "); //imprimimos valores de arraylist
                for (int i = 0; i < tarea4_tam; i++)
                {
                    System.out.print(tarea4_al.get(i) + " ");
                }
                System.out.println();
                System.out.println("Valores de Array: "); //imprimimos valores de array
                for (int i = 0; i < tarea4_tam; i++)
                {
                    System.out.print(tarea4_a[i] + " ");
                }
                System.out.println();
            }
            else if (tarea4_pregunta == 3)
            {
                tarea4_sum_al = 0;
                tarea4_sum_a = 0;
                for (int i = 0; i < tarea4_tam; i++)
                {
                    tarea4_sum_al = tarea4_sum_al + tarea4_al.get(i); //calculamos la suma para arraylist
                    tarea4_sum_a = tarea4_sum_a + tarea4_a[i]; //calculamos la suma para array
                }
                System.out.println("La suma de valores en ArrayList: " + tarea4_sum_al);
                System.out.println("La suma de valores en array: " + tarea4_sum_a);
            }
            else if (tarea4_pregunta == 4)
            {
                for (int i = 0; i < tarea4_tam; i++)
                {
                    if (tarea4_gr_al <= tarea4_al.get(i)) //buscamos el numero mas grande de arraylist
                    {
                        tarea4_gr_al = tarea4_al.get(i);
                    }
                    if (tarea4_gr_a <= tarea4_a[i])  //buscamos el numero mas grande de array
                    {
                        tarea4_gr_a = tarea4_a[i];
                    }
                }
                System.out.println("El numero mas grande de ArrayList: " + tarea4_gr_al);
                System.out.println("El numero mas grande de array: " + tarea4_gr_a);
            }
        }
        while (tarea4_pregunta != 5);
         

        //tarea 5
        System.out.println("\nTarea 5\n"); 
        
        ArrayList <Integer> tarea5_al = new ArrayList<>();
        
        int tarea5_preg = 0, tarea5_num = 0, tarea5_max = 0, tarea5_find = 0, tarea5_cont = 0;
        String tarea5_preg2 = "";
        
        System.out.println("Quieres guardar numeros utilizando array(1) o arraylist(2)?");
        tarea5_preg = input.nextInt();
        if (tarea5_preg == 1)
        {
            do
            {
                System.out.println("Introduce numeros. Teclea 0 para terminar."); //agregamos numeros en ArrayList
                tarea5_num = input.nextInt();
                if (tarea5_num != 0)
                {
                    tarea5_al.add(tarea5_num);
                }
            }
            while (tarea5_num != 0);
            Integer [] tarea5_a =new Integer[tarea5_al.size()]; //convertimos ArrayList en array
            tarea5_a = tarea5_al.toArray(tarea5_a);
            
            System.out.println("Valores del array: "); //imprimimos el array
            for (int i = 0; i < tarea5_a.length; i++) 
            {
                System.out.print(tarea5_a[i] + " ");
            }
            System.out.println();
            
            System.out.println("Quieres saber cual valor es mayor? si/no");
            tarea5_preg2 = input.next();
            if (tarea5_preg2.equals("si"))
            {
                for (int i = 0; i < tarea5_a.length; i++) //buscamo el mayor valor
                {
                    if (tarea5_max <= tarea5_a[i])
                    {
                        tarea5_max = tarea5_a[i];
                    }
                }
                System.out.println("El valor mayor: " + tarea5_max);
            }
            System.out.println("Quieres buscar un valor? si/no");
            tarea5_preg2 = input.next();
            if (tarea5_preg2.equals("si"))
            {
                System.out.println("Introduce un valor:");
                tarea5_find = input.nextInt();
                for (int i = 0; i < tarea5_a.length; i++) //buscamos un valor tecleado
                {
                    if (tarea5_find == tarea5_a[i])
                    {
                        tarea5_cont++;
                    }
                }
                if (tarea5_cont > 0)
                {
                    System.out.println("Valor tecleado esta en array");
                }
                else 
                {
                    System.out.println("Valor tecleado no esta en array");
                }
            }
            
        }
        else if (tarea5_preg == 2)
        {
            do
            {
                System.out.println("Introduce numeros. Introduce numero negativo para terminar."); //agregamos valores
                tarea5_num = input.nextInt();
                if (tarea5_num >= 0)
                {
                    tarea5_al.add(tarea5_num);
                }
            }
            while (tarea5_num >= 0);
        
            System.out.println("Valores de ArrayList: "); //imprimimos
            for (int i = 0; i < tarea5_al.size(); i++)
            {
                System.out.print(tarea5_al.get(i) + " ");
            }
            System.out.println();

            System.out.println("Quieres saber cual valor es mayor? si/no");
            tarea5_preg2 = input.next();
            if (tarea5_preg2.equals("si"))
            {
                for (int i = 0; i < tarea5_al.size(); i++) //buscamo el mayor valor
                {
                    if (tarea5_max <= tarea5_al.get(i))
                    {
                        tarea5_max = tarea5_al.get(i);
                    }
                }
                System.out.println("El valor mayor: " + tarea5_max);
            }

            System.out.println("Quieres buscar un valor? si/no");
            tarea5_preg2 = input.next();
            if (tarea5_preg2.equals("si"))
            {
                System.out.println("Introduce un valor:"); //buscamos el valor
                tarea5_find = input.nextInt();
                if (tarea5_al.indexOf(tarea5_find) == -1)
                {
                    System.out.println("Valor tecleado no esta en ArrayList");
                }
                else
                {
                    System.out.println("Valor tecleado esta en ArrayList");
                }
            }
        }
    }
}
