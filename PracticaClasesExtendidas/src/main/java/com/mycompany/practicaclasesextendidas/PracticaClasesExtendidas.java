

package com.mycompany.practicaclasesextendidas;


public class PracticaClasesExtendidas {

    public static void main(String[] args) {
        
        Alumno test1 = new Alumno("Ivan", "Petrov"); //objeto Alumno
        test1.mostrarInfo();
        
        Alumno_online test2 = new Alumno_online("Petr", "Ivanov", 20); //objeto Alumno_online
        test2.mostrarInfo();
        
        Alumno_madrid test3 = new Alumno_madrid("Sergey", "Nikolaev", "no se que es normativa"); //objeto Alumno_madrid
        test3.mostrarInfo();
    }
}
