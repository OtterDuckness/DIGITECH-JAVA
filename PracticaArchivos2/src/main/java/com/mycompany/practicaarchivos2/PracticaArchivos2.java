
package com.mycompany.practicaarchivos2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PracticaArchivos2 {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        String ruta = "alumnos.txt";
        int menu;

        do
        {
            System.out.println("\n1. Anadir alumno");
            System.out.println("2. Mostrar alumnos");
            System.out.println("3. Buscar alumno por DNI");
            System.out.println("4. Calcular media general");
            System.out.println("5. Salir");

            menu = input.nextInt();
            input.nextLine();

            if (menu == 1)
            {
                System.out.println("Introduce DNI:");
                String dni = input.nextLine();

                if (dni.equals(""))
                {
                    System.out.println("DNI no puede estar vacio");
                }
                else
                {
                    System.out.println("Introduce Nombre:");
                    String nombre = input.nextLine();

                    System.out.println("Introduce Apellidos:");
                    String apellidos = input.nextLine();

                    System.out.println("Introduce Curso:");
                    String curso = input.nextLine();

                    System.out.println("Introduce Nota media:");
                    double nota = input.nextDouble();
                    input.nextLine();

                    if (nota < 0 || nota > 10)
                    {
                        System.out.println("Nota invalida");
                    }
                    else
                    {
                        File archivo = new File(ruta);

                        if (!archivo.exists())
                        {
                            archivo.createNewFile();
                        }

                        FileWriter fw = new FileWriter(ruta, true);
                        fw.write(dni + ";" + nombre + ";" + apellidos + ";" + curso + ";" + nota + "\n");
                        fw.close();

                        System.out.println("Alumno añadido correctamente");
                    }
                }
            }

            if (menu == 2)
            {
                File archivo = new File(ruta);

                if (!archivo.exists())
                {
                    System.out.println("El archivo no existe");
                }
                else
                {
                    FileReader fr = new FileReader(ruta);
                    int caracter;
                    String linea = "";

                    while ((caracter = fr.read()) != -1)
                    {
                        char c = (char) caracter;

                        if (c != '\n')
                        {
                            linea = linea + c;
                        }
                        else
                        {
                            mostrarLinea(linea);
                            linea = "";
                        }
                    }

                    if (!linea.equals(""))
                    {
                        mostrarLinea(linea);
                    }

                    fr.close();
                }
            }

            if (menu == 3)
            {
                System.out.println("Introduce DNI a buscar:");
                String buscar = input.nextLine();

                File archivo = new File(ruta);

                if (!archivo.exists())
                {
                    System.out.println("El archivo no existe");
                }
                else
                {
                    FileReader fr = new FileReader(ruta);
                    int caracter;
                    String linea = "";
                    boolean encontrado = false;

                    while ((caracter = fr.read()) != -1)
                    {
                        char c = (char) caracter;

                        if (c != '\n')
                        {
                            linea = linea + c;
                        }
                        else
                        {
                            String[] partes = linea.split(";");

                            if (partes[0].equals(buscar))
                            {
                                System.out.println("Alumno encontrado:");
                                mostrarLinea(linea);
                                encontrado = true;
                            }

                            linea = "";
                        }
                    }

                    fr.close();

                    if (encontrado == false)
                    {
                        System.out.println("No existe un alumno con ese DNI");
                    }
                }
            }

            if (menu == 4)
            {
                File archivo = new File(ruta);

                if (!archivo.exists())
                {
                    System.out.println("El archivo no existe");
                }
                else
                {
                    FileReader fr = new FileReader(ruta);
                    int caracter;
                    String linea = "";
                    double suma = 0;
                    int contador = 0;

                    while ((caracter = fr.read()) != -1)
                    {
                        char c = (char) caracter;

                        if (c != '\n')
                        {
                            linea = linea + c;
                        }
                        else
                        {
                            String[] partes = linea.split(";");
                            suma = suma + Double.parseDouble(partes[4]);
                            contador++;
                            linea = "";
                        }
                    }

                    fr.close();

                    if (contador == 0)
                    {
                        System.out.println("No hay alumnos");
                    }
                    else
                    {
                        double media = suma / contador;
                        System.out.println("Media general: " + media);
                    }
                }
            }

        }
        while (menu != 5);

    }

    public static void mostrarLinea(String linea)
    {
        String[] partes = linea.split(";");

        System.out.println("DNI: " + partes[0] +
                " | Nombre: " + partes[1] + " " + partes[2] +
                " | Curso: " + partes[3] +
                " | Nota: " + partes[4]);
    }
}
