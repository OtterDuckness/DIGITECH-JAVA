

package com.mycompany.poo1;


public class Poo1 {

    public static void main(String[] args) {
        
        //tarea 1
        
        System.out.println("\nTarea 1\n");
        
        
        vecino raul = new vecino("Raul", "Garcia", 85, "prosperidad, 1", "raulelviejo@gmail.com");
        vecino angelina = new vecino("Angelina", "Dzhioeva", 36, "prosperidad, 1", "aneglinaguapa@gmail.com");
        vecino sandra = new vecino("Sandra", "Estevez", 30, "prosperidad, 1", "sandraprofe@gmail.com");
        
        System.out.println("Vecino 1: " + raul.nombre + " " + raul.apellido + "; " + raul.edad + "; " + raul.direcc + "; " + raul.email);
        System.out.println("Vecino 2: " + angelina.nombre + " " + angelina.apellido + "; " + angelina.edad + "; " + angelina.direcc + "; " + angelina.email);
        System.out.println("Vecino 2: " + sandra.nombre + " " + sandra.apellido + "; " + sandra.edad + "; " + sandra.direcc + "; " + sandra.email);
    }
}
