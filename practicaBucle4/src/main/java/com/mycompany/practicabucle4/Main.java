
package com.mycompany.practicabucle4;

import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String menu_principal = "", titulo1 = "", titulo2 = "", autor1 = "", autor2 = "", ano1 = "", ano2 = "", precio1 = "", precio2 = "", respuesta = "", buscar = "";

		do 
		{  //un bucle de menu principal
			System.out.println("1. Agregar nuevo libro ");
			System.out.println("2. Mostrar todos los libros ");
			System.out.println("3. Buscar libro por titulo ");
			System.out.println("4. Salir ");
			menu_principal = input.nextLine();
			if (menu_principal.equals("1")) 
			{ //anadimos libros
				System.out.println("Introduce el titulo: ");
				titulo1 = input.nextLine();
				System.out.println("Introduce el autor: ");
				autor1 = input.nextLine();
				System.out.println("Introduce el ano de publicacion: ");
				ano1 = input.nextLine();
				System.out.println("Introduce el precio: ");
				precio1 = input.nextLine();


				System.out.println("Quieres anadir otro libro? ");
				respuesta = input.nextLine();

				if (respuesta.equals("Si")) 
				{ //anadimos otro libro
					System.out.println("Introduce el titulo: ");
					titulo2 = input.nextLine();
					System.out.println("Introduce el autor: ");
					autor2 = input.nextLine();
					System.out.println("Introduce el ano de publicacion: ");
					ano2 = input.nextLine();
					System.out.println("Introduce el precio: ");
					precio2 = input.nextLine();


				} 
				else 
				{
					System.out.println("Regresamos al menu pricnipal ");
				}
			} 
			else if (menu_principal.equals("2")) 
			{ //no necesiamos un bucle aqui porque no utilizamos arreglos
				System.out.println("Titulo: " + titulo1);
				System.out.println("Autor: " + autor1);
				System.out.println("Ano: " + ano1);
				System.out.println("Precio: " + precio1);

				System.out.println("Titulo: " + titulo2);
				System.out.println("Autor: " + autor2);
				System.out.println("Ano: " + ano2);
				System.out.println("Precio: " + precio2);

			} 
			else if (menu_principal.equals("3")) 
			{
				System.out.println("Introduce un titulo del libro para buscar: ");
				buscar = input.nextLine();
				int x = 0; //para tener un codigo de respuesta y tambien para parar el bucle
				while (x == 0) 
				{
					if (buscar.equals(titulo1)) 
					{
						System.out.println("Titulo: " + titulo1);
						System.out.println("Autor: " + autor1);
						System.out.println("Ano: " + ano1);
						System.out.println("Precio: " + precio1);
						x = 1;
					} 
					else if (buscar.equals(titulo2)) 
					{
						System.out.println("Titulo: " + titulo2);
						System.out.println("Autor: " + autor2);
						System.out.println("Ano: " + ano2);
						System.out.println("Precio: " + precio2);
						x = 2;
					} 
					else 
					{
						System.out.println("No hay libros con este titulo. ");
						x = 3;
					}
				}
			}
		} 
		while (!menu_principal.equals("4"));
	}
}