
package com.mycompany.array;


public class Array {

    public static void main(String[] args) {
        //creamos un array con 5 celdas que almacena los salarios
        //creo el array con 5 posiciones
        Double [] sueldos = new Double[5];
        
        //si una vez creado asignamos el valor, referenciamos a la celda donde almacenamos el valor
        
        sueldos[0]=1523.23;
        sueldos[1]=1452.23;
        sueldos[2]=1326.5;
        sueldos[3]=1762.5;
        sueldos[4]=1789.1;
        
        //creamos otro array, es su declaracion almacenamos los valores
        //nombres
        
        String[] nombres = {"Eva", "Ana", "Luis", "Ramon", "Lucia"};
        
        //recorremos el array sueldos
        //podemos utilizar la propiedad length para conocer el numero de celdas del array
        //nombrearray.length
        
        for (int i = 0; i < sueldos.length; i++)
        {
            System.out.println(sueldos[i]);
            
        }
    }
}
