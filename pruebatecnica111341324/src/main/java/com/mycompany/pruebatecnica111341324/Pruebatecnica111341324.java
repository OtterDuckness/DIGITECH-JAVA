/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebatecnica111341324;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mandnicktolub
 */
public class Pruebatecnica111341324 {

    public static void main(String[] args) {
        List<User> usuarios = Arrays.asList(
            new User("andrés", 23),
            new User("luCÍa", 33),
            new User("MARTA", 11),
            new User("Julio", 65)
        );
        
        

        try {
            User resultado = Search.searchUser(usuarios, "Marta");
            System.out.println("Usuario encontrado: " + resultado);
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            User resultado = Search.searchUser(usuarios, "Pedro");
            System.out.println("Usuario encontrado: " + resultado);
        } catch (UserNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

