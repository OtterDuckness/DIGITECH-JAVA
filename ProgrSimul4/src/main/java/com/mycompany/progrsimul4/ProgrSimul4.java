

package com.mycompany.progrsimul4;

import java.util.Scanner;


public class ProgrSimul4 {

    public static void main(String[] args) {
        
        
        //tarea 4
        
        Scanner input = new Scanner(System.in);
        
        int menu, x, y, z;
        
        do
        {
            System.out.println("\n Elige la operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Operaciones avanzadas");
            System.out.println("6. Seno de un angulo");
            System.out.println("7. Coseno  de un angulo");
            System.out.println("8. Redondeo");
            System.out.println("9. Potencia");
            System.out.println("10. Salir");
            menu = input.nextInt();
            
            if (menu == 1)
            {
                System.out.println("Introduce numero 1: ");
                x = input.nextInt();
                System.out.println("Introduce numero 2: ");
                y = input.nextInt();
                z = x + y;
                System.out.println("La suma: " + z);
            }
             
            else if (menu == 2)
            {
                System.out.println("Introduce numero 1: ");
                x = input.nextInt();
                System.out.println("Introduce numero 2: ");
                y = input.nextInt();
                z = x - y;
                System.out.println("La resta: " + z);
            }
            
            else if (menu == 3)
            {
                System.out.println("Introduce numero 1: ");
                x = input.nextInt();
                System.out.println("Introduce numero 2: ");
                y = input.nextInt();
                z = x * y;
                System.out.println("La multiplicacion: " + z);
            }
            
            else if (menu == 4)
            {
                System.out.println("Introduce numero 1: ");
                x = input.nextInt();
                System.out.println("Introduce numero 2: ");
                y = input.nextInt();
                if (y != 0)
                {
                    z = x / y;
                    System.out.println("La division: " + z);
                }
                else
                {
                    System.out.println("Error");
                }
            }
            
            else if (menu == 5)
            {
                do
                {
                    System.out.println("\n1. Mostrar el valor de PI");
                    System.out.println("2. Mostrar el valor de Euler");
                    System.out.println("3. Calcular el logaritmo natural");
                    System.out.println("4. Salir");
                    menu = input.nextInt();

                    if (menu == 1)
                    {
                        System.out.println("El valor de PI es" + Math.PI);
                    }
                    else if (menu == 2)
                    {
                        System.out.println("El valor de Euler es" + Math.E);
                    }
                    else if (menu == 3)
                    {
                        System.out.println("Introduce un numero:");
                        x = input.nextInt();
                        System.out.println("El logaritmo natural: " + Math.log(x));
                    }
                    
                    
                }
                while (menu != 4); 
                
            }
            
            else if (menu == 6)
            {
                System.out.println("Introduce un numero:");
                double seno = input.nextDouble();
                System.out.println("El seno: " + Math.sin(seno));
            }
            
            else if (menu == 7)
            {
                System.out.println("Introduce un numero:");
                double coseno = input.nextDouble();
                System.out.println("El seno: " + Math.cos(coseno));
            }
            
            else if (menu == 8)
            {
                System.out.println("Introduce un numero para redondear");
                double redond = input.nextDouble();
                redond = Math.round(redond);
                System.out.println("El numero redondeado: " + redond);
            }
            else if (menu == 9)
            {
                System.out.println("Introduce numero 1: ");
                x = input.nextInt();
                System.out.println("Introduce numero 2: ");
                y = input.nextInt();
                System.out.println("La potencia:" + Math.pow(x, y));
            }
        }
        while (menu != 10);
    }
}
