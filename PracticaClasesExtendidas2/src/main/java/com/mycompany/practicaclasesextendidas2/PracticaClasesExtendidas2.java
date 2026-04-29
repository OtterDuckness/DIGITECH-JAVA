
package com.mycompany.practicaclasesextendidas2;

public class PracticaClasesExtendidas2 {

    public static void main(String[] args) {
        
        
        //tarea 1
        System.out.println("Tarea 1");
        
        Empleado test1 = new Empleado("Empleado", 52);
        
        test1.mostrarDatos(); 
        test1.cumplirAnnos(10); //cambiamos la edad y mostramos datos
        test1.mostrarDatos();
        
        //tarea 2
        System.out.println("\nTarea 2");
        Empleado_madrid test2 = new Empleado_madrid("Empleado_madrid", 36, 2200, "IT");
        
        test2.mostrarDatos(); //metodos del Empleado_madrid
        test2.subirSalario(0.21);
        System.out.println("Salario nuevo: " + test2.getSalario());
        test2.cumplirAnnos(5);
        test2.mostrarDatos();
        
        //tarea 3
        System.out.println("\nTarea 3");
        Empleado_bcn test3 = new Empleado_bcn("Empleado_bcn", 120, 1500, "Ingles", "Convenio");
        
        test3.mostrarDatos(); //metodos del Empleado_bcn
        test3.ajustarSalario(0.21);
        System.out.println("Salario nuevo: " + test3.getSalario());
        test3.cumplirAnnos(5);
        test3.mostrarDatos();
        
        
    }
}
