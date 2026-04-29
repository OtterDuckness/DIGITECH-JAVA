
package com.mycompany.practicaclasesabstractas2;


public class PracticaClasesAbstractas2 {

    public static void main(String[] args) {
        
       //public TrabajadorIndefinido(String nombre, String dni, 
       //double salarioBase, String area, double plus)
       
       TrabajadorIndefinido test1 = new TrabajadorIndefinido("Test1", "12345678m", 20000, "Madrid", 15000);
       
       System.out.println("Tipo: " + test1.getTipoTrabajador());
       test1.mostrarDatos();
       System.out.println("Salario final: " + test1.calcularSalarioFinal());
       
       //TrabajadorPorHoras(String nombre, String dni, double salarioBase, 
                            //String area, int horas, double precioHora)
       
       TrabajadorPorHoras test2 = new TrabajadorPorHoras("Test2", "12345678a", 
               10000, "Sevilla", 180, 20);
       System.out.println("Tipo: " + test2.getTipoTrabajador());
       test2.mostrarDatos();
       System.out.println("Salario final: " + test2.calcularSalarioFinal());
       
       //TrabajadorComision(String nombre, String dni, double salarioBase, 
       //String area, int proyectosCompletados, double comisionPorProyecto)
       
       TrabajadorComision test3 = new TrabajadorComision("Test3", "12345678o", 10000, "Zaragoza", 5, 8000);
       
       System.out.println("Tipo: " + test3.getTipoTrabajador());
       test3.mostrarDatos();
       System.out.println("Salario final: " + test3.calcularSalarioFinal());
       
       //AdministradorRed(String nivelPermiso, String zonaAsignada, 
                    // boolean accesoActivo, String idEmpleado)
                    
        AdministradorRed test4 = new AdministradorRed("Avanzado", "IT", true, "a55s5");
        
        test4.mostrarPermisos();
        System.out.println("Acceso: " + test4.tieneAcceso());
        test4.activarAcceso();
        System.out.println("Acceso: " + test4.tieneAcceso());
        
        //AnalistaSeguridad(String nivelPermiso, String zonaAsignada, 
                          //  boolean accesoActivo, String idEmpleado)
       
        AnalistaSeguridad test5 = new AnalistaSeguridad("Bajo", "Ventas", false, "ds5581s");
        
        test5.mostrarPermisos();
        System.out.println("Acceso: " + test5.tieneAcceso());
        test5.activarAcceso();
        System.out.println("Acceso: " + test5.tieneAcceso());

    }
}
