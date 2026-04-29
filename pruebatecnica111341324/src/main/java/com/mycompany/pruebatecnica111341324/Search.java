/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebatecnica111341324;

import java.util.List;

/**
 *
 * @author mandnicktolub
 */
public class Search {
    public static User searchUser(List<User> users, String nameToSearch) throws UserNotFoundException {
        if (users == null || nameToSearch == null || nameToSearch.isEmpty()) {
            throw new UserNotFoundException("No se puede realizar la búsqueda.");
        }

        for (User user : users) {
            if (user.getName().equalsIgnoreCase(nameToSearch)) {
                return user;
            }
        }

        throw new UserNotFoundException("Usuario con nombre '" + nameToSearch + "' no encontrado.");
    }
}
