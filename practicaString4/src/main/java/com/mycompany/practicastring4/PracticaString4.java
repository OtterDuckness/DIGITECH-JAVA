
package com.mycompany.practicastring4;

import java.util.Scanner;

public class PracticaString4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Tarea 1
        System.out.println("Tarea 1");
        
        String tarea1;
        int x = 0;
        int voc = 0;
               
        do
        {
        System.out.println("Introduce un texto de al menos 25 caracteres: ");
        tarea1 = input.nextLine();
        
        String vocales = "";
        int a = 0, e = 0, i2 = 0, o = 0, u = 0;
        vocales = tarea1.toLowerCase();
        for (int i = 0; i < tarea1.length(); i++)
        {
            if (vocales.charAt(i) == 'a')
            {
                a ++;
            }
            else if (vocales.charAt(i) == 'e')
            {
                e ++;
            }
            else if (vocales.charAt(i) == 'i')
            {
                i2 ++;
            }
            else if (vocales.charAt(i) == 'o')
            {
                o ++;
            }
            else if (vocales.charAt(i) == 'u')
            {
                u ++;
            }
        }
        if (tarea1.length() > 25)
        {
            voc = a + e + i2 + o +u;
            System.out.println("Vocales: " + voc);
            System.out.println("a: " + a);
            System.out.println("e: " + e);
            System.out.println("i: " + i2);
            System.out.println("o: " + o);
            System.out.println("u: " + u);
        
        }
        else
        {
            System.out.println("Introduce al menos 25 caracteres");
        }
        }
        while (tarea1.length() < 25);
        
        
        //Tarea 2
        
        
        System.out.println(" ");
        System.out.println("Tarea 2");
        System.out.println(" ");
        
        String tarea2 = "";
        //String digi = "digitechfp";
        int cant = 0; //cantidad de @
        int puesto = 0; //puesto de digitechfp en el correo
        
        System.out.println("Introduce el correo electronico: ");
        tarea2 = input.nextLine();
        
        for (int i = 0; i < tarea2.length(); i++)
        {
            if (tarea2.charAt(i) == '@')
            {
                cant++;
            }
        }
        
        puesto = tarea2.indexOf("digitechfp"); //puesto de digitechfp
        int posarroba = tarea2.indexOf('@'); //puesto de @
        
        if (cant == 0 || tarea2.contains("digitechfp") != true)
        {
            System.out.println("El correo no contiene @ o digitechfp");
        }
        else if (cant > 1)
        {
            System.out.println("El correo contiene demasiado @");
        }
        else 
        {
            if (posarroba == puesto - 1)
            {
                System.out.println("Has introducido la @ en un puesto correcto");
            }
            else
            {
                System.out.println("Has introducido la @ en un puesto incorrecto");
            }
        }
        if (tarea2.charAt(tarea2.length()-4) != '.')
        {
            System.out.println("Has introducido el . en un puesto incorrecto o no lo has introducido");
        }
        else
        {
            System.out.println("Has introducido el . en un puesto correcto");
        }
        
        
         //Tarea 3
        
        System.out.println(" ");
        System.out.println("Tarea 3");
        System.out.println(" ");
        
        String nombre = "";
        String tarea3 = "";
        String nombre_resultado = "";
        String usuario = "";
        char z;
        
        System.out.println("Introduce un nombre en minusculas: ");
        nombre = input.nextLine();
        System.out.println("Introduce un usuario: ");
        usuario = input.nextLine();
        
        if (nombre.equals(nombre.toLowerCase()) == true)
        {
            System.out.println("El nombre solo contiene minusculas");
        }
        else {
            System.out.println("El nombre debe contener solo minusculas");
        }
        nombre = nombre.toLowerCase(); //convertimos todas las letras en minusculas
        
        for (int i = 0; i < nombre.length(); i++)
        {
            if (i%2 == 0) //cambiarnos algunas letras a mayusculas
            {
                z = Character.toUpperCase(nombre.charAt(i)); 
            }
            else{
                z = nombre.charAt(i);
            }
            nombre_resultado += z;
        }
        System.out.println(nombre_resultado);
        
        //vocales
        int a = 0; 
        int e = 0; 
        int i2 = 0;
        int o = 0;
        int u = 0;
        String vocales = "";
        for (int i = 0; i < nombre.length(); i++)  //contamos vocales
        {
            if (nombre.charAt(i) == 'a')
            {
                a ++;
            }
            else if (nombre.charAt(i) == 'e')
            {
                e ++;
            }
            else if (nombre.charAt(i) == 'i')
            {
                i2 ++;
            }
            else if (nombre.charAt(i) == 'o')
            {
                o ++;
            }
            else if (nombre.charAt(i) == 'u')
            {
                u ++;
            }
        }
        System.out.println("Vocales: ");
            System.out.println("a: " + a);
            System.out.println("e: " + e);
            System.out.println("i: " + i2);
            System.out.println("o: " + o);
            System.out.println("u: " + u);
            
        String guion = "";
        String mitad1 = usuario.substring(0, usuario.length()/2);  //separamos strings en partes
        String mitad2 = usuario.substring(usuario.length()/2, usuario.length());
        
        mitad2 = mitad2.toUpperCase(); //convertimos en mayusculas
        
        String mitad1_1 = mitad1.substring(0, mitad1.length()/2);
        String mitad1_2 = mitad1.substring(mitad1.length()/2, mitad1.length());
        
        for (int i = 0; i < mitad1_1.length(); i++) //anadimos un guion
        {
            guion = guion + mitad1_1.charAt(i) + "-";
        }
        System.out.println(guion + mitad1_2 + mitad2);
        
        
        //CONSONANTES
        
        usuario = usuario.toLowerCase();
        char c;
        int B=0, C=0, D=0, F=0, G=0, H=0, J=0, K=0, L=0, M=0, N=0, Ñ=0, P=0, Q=0, R=0, S=0, T=0, V=0, W=0, X=0, Y=0, Z=0;
        
        for (int i = 0; i < usuario.length(); i++)
        {
            c = usuario.charAt(i);
            
            switch (c)
                    {
                case 'b':
                    B++;
                    break;
                case 'c':
                    C++;
                    break;
                case 'd':
                    D++;
                    break;
                case 'f':
                    F++;
                    break;
                case 'g':
                    G++;
                    break;
                case 'H':
                    H++;
                    break;
                case 'J':
                    J++;
                    break;
                case 'k':
                    K++;
                    break;
                case 'l':
                    L++;
                    break;
                case 'm':
                    M++;
                    break;
                case 'n':
                    N++;
                    break;
                case 'ñ':
                    Ñ++;
                    break;
                case 'p':
                    P++;
                    break;
                case 'q':
                    Q++;
                    break;
                case 'r':
                    R++;
                    break;
                case 's':
                    S++;
                    break;
                case 't':
                    T++;
                    break;
                case 'v':
                    V++;
                    break;
                case 'w':
                    W++;
                    break;
                case 'x':
                    X++;
                    break;
                case 'y':
                    Y++;
                    break;
                case 'z':
                    Z++;
                    break;
                //
                    
                    }
        }
        System.out.println("b: " + B);
        System.out.println("c: " + C);
        System.out.println("d: " + D);
        System.out.println("f: " + F);
        System.out.println("g: " + G);
        System.out.println("h: " + H);
        System.out.println("j: " + J);
        System.out.println("k: " + K);
        System.out.println("l: " + L);
        System.out.println("m: " + M);
        System.out.println("n: " + N);
        System.out.println("ñ: " + Ñ);
        System.out.println("p: " + P);
        System.out.println("q: " + Q);
        System.out.println("r: " + R);
        System.out.println("s: " + S);
        System.out.println("t: " + T);
        System.out.println("v: " + V);
        System.out.println("w: " + W);
        System.out.println("y: " + Y);
        System.out.println("z: " + Z);

    }
}
