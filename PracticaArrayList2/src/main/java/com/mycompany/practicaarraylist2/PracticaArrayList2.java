
package com.mycompany.practicaarraylist2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PracticaArrayList2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //ArrayList<Viaje> viajes = new ArrayList <>();
        ArrayList<ArrayList<String> > viajes = new ArrayList<ArrayList<String>>(); //un arraylist grande
        
        int menu = 0;
        
        
        do
        {
            String find = ""; //un string universal para cualquera busqueda
            int cont = 0; //un contador universal
            double precio = 0, min = 0, max = 0;
            double med = 0;
            int x = 0; //un valor unviersal
            String resp = "";
            
                    
            String preg = "";
            System.out.println("\n1. Agregar un viaje con todos sus datos");
            System.out.println("2. Mostrar todos los viajes en formato tabulado");
            System.out.println("3. Buscar viajes por pais");
            System.out.println("4. Buscar viajes con precio menor a un valor dado");
            System.out.println("5. Actualizar el precio de un viaje dado su destino");
            System.out.println("6. Modificar el numero de plazas disponibles");
            System.out.println("7. Eliminar un viaje por destino");
//            System.out.println("8. Ordenar los viajes por precio (de menor a mayor)");
//            System.out.println("9. Ordenar los viajes por duracion");
            System.out.println("10. Clonar el ArrayList completo y mostrar su contenido (usando clone() o constructor)");
            System.out.println("11. Contar cuantos viajes hay por pais");
            System.out.println("12. Calcular el precio promedio de los viajes");
            System.out.println("13. Mostrar el viaje mas caro y el mas barato");
            System.out.println("14. Buscar si existe un destino concreto");
            System.out.println("15. Vaciar la lista completa de viajes (con confirmacion del usuario)");
            System.out.println("16. Rellenar la lista con valores de prueba usando Arrays.asList()");
//            System.out.println("17. Usar indexOf() y lastIndexOf() para buscar posiciones de destinos duplicados");
            System.out.println("18. Convertir el ArrayList de un pais en un array simple y mostrarlo con Arrays.toString()");
//            System.out.println("19. Exportar la lista a texto plano simulando una exportacion CSV (mostrar por consola)");
            System.out.println("20. Salir del programa");
            menu = input.nextInt();
            if (menu == 1)
            {
                input.nextLine();
                //Agregar un viaje con todos sus datos.

                ArrayList <String> viaje = new ArrayList <>(); //un arraylist pequeno para rellenar y anadir al array list grande
                //lo creamos cada vez de nuevo para evitar la multiplicacion de los mismos datos
                System.out.println("Introduce el destino: ");
                viaje.add(input.nextLine());
                System.out.println("Introduce el pais: ");
                viaje.add(input.nextLine());
                System.out.println("Introduce el precio: ");
                viaje.add(input.nextLine());
                System.out.println("Introduce la duracion: ");
                viaje.add(input.nextLine());
                System.out.println("Introduce plazas disponibles: ");
                viaje.add(input.nextLine());
                
                viajes.add(viaje); //anadimos la data del arraylist pequeno al grande
                
                
                System.out.println("Tamano del ArrayList viajes: " + viajes.size());
                //viajes.add(new Viaje(destino, pais, precio, duracion, plazas));
                
            }
            if (menu == 2)
            {
                //Mostrar todos los viajes en formato tabulado.
                for (int i = 0; i < viajes.size(); i++) //imprimimos el arraylist grande
                {
                    System.out.println(viajes.get(i));
                    
//                    for (int y = 0; y < viajes.get(i).size(); y++)
//                    {
//                        System.out.println(viajes.get(i).get(y));
//                    }
                }
            }
            if (menu == 3)
            {
                input.nextLine();
                // Buscar viajes por país.
                System.out.println("Introduce pais: ");
                find = input.nextLine();
                
                for (int i = 0; i < viajes.size(); i++) //buscamos el pais
                {
                    if (viajes.get(i).indexOf(find) != -1)
                    {
                        System.out.println(viajes.get(i)); //si encontramos el pais, imprimimos todos los datos de viaje
                        cont++;
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No encontrado");
                }
            }
            if (menu == 4)
            {
                input.nextLine();
                // Buscar viajes con precio menor a un valor dado.
                System.out.println("Introduce el precio: ");
                find = input.next();
                for (int i = 0; i < viajes.size(); i++) //comparamos los precios
                {
                    if (Double.parseDouble(viajes.get(i).get(2)) <= Double.parseDouble(find)) //convertimos string to double para comparar valores
                    {
                        System.out.println(viajes.get(i));
                        cont++;
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No encontrado");
                }
                
            }
            if (menu == 5)
            {
                input.nextLine();
                // Actualizar el precio de un viaje dado su destino.
                System.out.println("Introduce un destino: ");
                find = input.nextLine();
                for (int i = 0; i < viajes.size(); i++) //buscamos el destino
                {
                    if (viajes.get(i).indexOf(find) != -1)
                    {
                        System.out.println(viajes.get(i)); //si encontramos el destino, imprimimos todos los datos del viaje
                        cont++;
                        System.out.println("Introduce nuevo precio: ");
                        precio = input.nextDouble();
                        viajes.get(i).set(2, Double.toString(precio)); //convertimos double to string y lo anadimos a nuestro arraylist
                    }
                }
                if (cont == 0)
                {
                    System.out.println("Destino no encontrado");
                }
            }
            
            if (menu == 6)
            {
                input.nextLine();
                // Modificar el número de plazas disponibles.
                System.out.println("Introduce un destino: ");
                find = input.nextLine();
                for (int i = 0; i < viajes.size(); i++) //buscamos el destino
                {
                    if (viajes.get(i).indexOf(find) != -1)
                    {
                        System.out.println(viajes.get(i)); //si encontramos el destino, imprimimos todos los datos del viaje
                        cont++;
                        System.out.println("Introduce plazas disponibles: ");
                        x = input.nextInt();
                        viajes.get(i).set(4, Integer.toString(x)); //convertimos int to string y lo anadimos a nuestro arraylist
                    }
                }
                if (cont == 0)
                {
                    System.out.println("Destino no encontrado");
                }
            }
            if (menu == 7)
            {
                input.nextLine();
                //Eliminar un viaje por destino
                System.out.println("Introduce un destino: ");
                find = input.nextLine();
                for (int i = 0; i < viajes.size(); i++) //buscamos el destino
                {
                    if (viajes.get(i).indexOf(find) != -1)
                    {
                        System.out.println(viajes.get(i)); //si encontramos el destino, imprimimos todos los datos del viaje
                        cont++;
                        System.out.println("Eliminar un viaje? si/no");
                        preg = input.next();
                        if (preg.equals("si"))
                        {
                            viajes.remove(i);
                        }
                    }
                }
                if (cont == 0)
                {
                    System.out.println("Destino no encontrado");
                }
            }
            if (menu == 8)
            {
                input.nextLine();
                //Ordenar los viajes por precio (de menor a mayor).
                
                
            }
            if (menu == 9)
            {
                input.nextLine();
                //Ordenar los viajes por duración
            }
            if (menu == 10)
            {
                input.nextLine();
                //Clonar el ArrayList completo y mostrar su contenido (usando clone() o constructor)
                ArrayList<String> viajes2 = new ArrayList<>();
                viajes2 = (ArrayList)viajes.clone();
                System.out.println("ArrayList Viajes2: " + viajes2);
            }
            if (menu == 11)
            {
                input.nextLine();
                //Contar cuántos viajes hay por país.
                System.out.println("Introduce pais: ");
                find = input.nextLine();
                
                for (int i = 0; i < viajes.size(); i++) //buscamos el pais
                {
                    if (viajes.get(i).indexOf(find) != -1)
                    {
                        cont++;
                    }
                }
                if (cont == 0)
                {
                    System.out.println("No encontrado");
                }
                else if (cont > 0)
                {
                    System.out.println("Hay " + cont + " viaje/s en este pais");
                }
            }
            if (menu == 12)
            {
                input.nextLine();
                //Calcular el precio promedio de los viajes.
                for (int i = 0; i < viajes.size(); i++)
                {
                    precio = precio + Double.parseDouble(viajes.get(i).get(2));
                }
                System.out.printf("El precio promedio: %.2f",(precio/viajes.size()));
            }
            if (menu == 13)
            {
                input.nextLine();
                //Mostrar el viaje más caro y el más barato.
                min = Double.parseDouble(viajes.get(0).get(2)); //asignamos el precio del primer viaje como max y min
                max = min;
                for (int i = 0; i < viajes.size(); i++) 
                {
                    precio = Double.parseDouble(viajes.get(i).get(2)); //buscamos max y min

                    if (precio < min)
                    {
                        min = precio;
                    }
                    if (precio > max)
                    {
                        max = precio;
                    }
                }
                for (int i = 0; i < viajes.size(); i++) //buscamos el pais con min y max precios
                {
                    precio = Double.parseDouble(viajes.get(i).get(2));
                    if (precio == min)
                    {
                        System.out.println("Viaje mas barato: " + viajes.get(i));
                    }
                    if (precio == max)
                    {
                        System.out.println("Viaje mas caro: " + viajes.get(i));
                    }
                }
                
            }
            if (menu == 14)
            {
                input.nextLine();
                //Buscar si existe un destino concreto usando contains()
                boolean found = false;
                System.out.println("Introduce un destino para ver si está en la lista de viajes");
                find = input.nextLine();
                for (int i = 0; i < viajes.size(); i++)
                {
                    if (viajes.get(i).indexOf(find) != -1) //no se como hacerlo con contains()
                    {
                        found = true;
                        break;
                    }
                }
                if (found == true)
                {
                    System.out.println("Si");
                }
                else
                {
                    System.out.println("No");
                }
            }
            if (menu == 15)
            {
                input.nextLine();
                //Vaciar la lista completa de viajes (con confirmación del usuario)
                
                System.out.println("Seguro? si/no");
                resp = input.next();
                if (resp.equals("si"))
                {
                    viajes.clear(); //borramos todo
                    System.out.println("La lista es vacia");
                }
                
            }
            if (menu == 16)
            {
                input.nextLine();
                //Rellenar la lista con valores de prueba usando Arrays.asList()
                List<ArrayList<ArrayList<String>>> list = Arrays.asList(viajes);
                System.out.println(list);
            }
            if (menu == 17)
            {
                input.nextLine();
                //Usar indexOf() y lastIndexOf() para buscar posiciones de destinos duplicados.
//                int ind1 = 0, ind2 = 0;
//                System.out.println("Introduce un destino:");
//                find = input.nextLine();
//                for (int i = 0; i < viajes.size(); i++) //buscamos el pais
//                {
//                    ind1 = viajes.get(i).indexOf(find);
//                }
//                for (int i = viajes.size() - 1; i >= 0; i--)
//                {
//                    ind2 = viajes.get(i).indexOf(find);
//                }
//                if (ind1 != ind2)
//                {
//                    System.out.println("El destino es duplicado");
//                }
        //NO FUNCIONA
                

            }
            if (menu == 18)
            {
                input.nextLine();
                //Convertir el ArrayList de un país en un array simple y mostrarlo con Arrays.toString().
                System.out.println("Introduce un pais:");
                find = input.nextLine();
                
                for (int i = 0; i < viajes.size(); i++)
                {
                    if (viajes.get(i).indexOf(find) != -1) //buscamos un pais y lo convertimos en array y despues en string
                    {
                    ArrayList<String> viaje = viajes.get(i);
                    Object[] viaje_array = viaje.toArray();
                    System.out.println(Arrays.toString(viaje_array));
                    }
                }
            }
            if (menu == 19)
            {
                input.nextLine();
                //Exportar la lista a texto plano simulando una exportación CSV (mostrar por consola)
            }
            
        }
        while (menu != 20);
        
    }
}
