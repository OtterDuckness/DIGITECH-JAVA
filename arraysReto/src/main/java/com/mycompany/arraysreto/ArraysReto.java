
package com.mycompany.arraysreto;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysReto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jugadores = 3;
        int [] jug1 = new int[4];
        int [] jug2 = new int[4];
        int [] jug3 = new int[4];
        double jugm = 0;
        int a = 0; //num a de arbitro
        int b = 0; //numero b de arbitro
        int dif = 0;
        int jug1_score = 0, jug2_score = 0, jug3_score = 0;

    System.out.println("Jugador 1, elige 4 numeros 1-10:"); //creamos arrays de jugadores
    for (int i = 0; i < 4; i++)
    {
          do {
          System.out.println("Numero " + (i + 1) + " :");
          jug1[i] = input.nextInt();
          }
          while (jug1[i] <= 0 || jug1[i] > 10);
    }
    Arrays.sort(jug1);
    System.out.println("Jugador 2, elige 4 numeros 1-10:");
    for (int i = 0; i < 4; i++)
    {
          do {
          System.out.println("Numero " + (i + 1) + " :");
          jug2[i] = input.nextInt();
          }
          while (jug2[i] <= 0 || jug2[i] > 10);
    }
    Arrays.sort(jug2);
    System.out.println("Jugador 3, elige 4 numeros 1-10:");
    for (int i = 0; i < 4; i++)
    {
          do {
          System.out.println("Numero " + (i + 1) + " :");
          jug3[i] = input.nextInt();
          }
          while (jug3[i] <= 0 || jug3[i] > 10);
    }
    Arrays.sort(jug3);


    do { //introducimos numeros del arbitro
    System.out.println("Arbitro, elige numero A: ");
    a = input.nextInt();
    }
    while (a <= 0 || a > 10);

    do {
    System.out.println("Arbitro, elige numero B: ");
    b = input.nextInt();
    }
    while (b <= 0 || b > 10);

    if (a > b)
    {
        dif = a - b + 1;
    }
    else if (a < b)
    {
          dif = b - a + 1;
    }
    else
    {
          dif = 1 ;
    }

    int [] arb = new int[dif];  //creamos un array del arbitro

    System.out.println("");
    System.out.print("Numeros del arbitro: ");
    for (int i = 0; i < arb.length; i ++)
    {
          if (a > b)
          {
                arb[i] = b + i;
          }
          else if (a < b)
          {
                arb[i] = a + i;
          }
          else
          {
                arb[i] = a;
          }
          System.out.print(arb[i] + " ");
    }


    System.out.println("");
          for (int i = 0; i < jug1.length; i ++) //aciertos de jugador 1
          {
                if (Arrays.binarySearch(arb, jug1[i]) >= 0)
                {
                      jug1_score ++;
                }

          }

          System.out.print("\nNumeros introducidos por jugador 1: ");
          for (int i = 0; i < jug1.length; i ++)
          {
                      System.out.print(jug1[i] + " ");
          }


          System.out.println("\nAciertos de jugador 1: " + jug1_score);
          System.out.println();

          for (int i = 0; i < jug2.length; i ++) //aciertos de jugador 2
          {
                if (Arrays.binarySearch(arb, jug2[i]) >= 0)
                {
                      jug2_score ++;
                }

          }

          System.out.print("Numeros introducidos por jugador 2: ");
          for (int i = 0; i < jug2.length; i ++)
          {
                      System.out.print(jug2[i] + " ");
          }

          System.out.println("\nAciertos de jugador 2: " + jug2_score);
          System.out.println();

          System.out.print("Numeros introducidos por jugador 3: ");
          for (int i = 0; i < jug3.length; i ++)
          {
                      System.out.print(jug3[i] + " ");
          }

          for (int i = 0; i < jug3.length; i ++)
          {
                if (Arrays.binarySearch(arb, jug3[i]) >= 0) //aciertos de jugador 3
                {
                      jug3_score ++;
                }

          }
          System.out.println("\nAciertos de jugador 3: " + jug3_score);
          System.out.println();


          jugm = (jug3_score + jug2_score + jug1_score) / 3.0; //media aritmetica de los aciertos
          System.out.printf("La media aritmetica: " + "%.2f", jugm);
    }
}
