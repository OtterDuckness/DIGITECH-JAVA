

package com.mycompany.practicaclasesextendidas3;


public class PracticaClasesExtendidas3 {

    public static void main(String[] args) {
        
        //Ordenador (String marca, String modelo, int ram, int capacidad)
        
        Ordenador test1_1 = new Ordenador("hp", "omen", 16, 500);
        
        test1_1.encender();
        test1_1.transferir(50);
        test1_1.eliminar(60);
        
        //Portatil(String marca, String modelo, int ram, 
        //int capacidad, String pantalla, int npuertos, double precio)
        
        Portatil test2_1 = new Portatil ("lenovo", "legion", 16, 1000, "16 pulgadas", 12, 1000);
        
        test2_1.encender();
        test2_1.imprimir();
        
        //PortatilMadrid(String marca, String modelo, int ram, int capacidad, //constructor completo
            //String pantalla, int npuertos, double precio, String serie,
            //String sede, int unidades)
        PortatilMadrid test3_1 = new PortatilMadrid("dell", "xps", 16, 2000, "14 pulgadas", 8, 2000,
                "xps2025", "sede123", 300);
        
        test3_1.imprimir();
        test3_1.encender();
        test3_1.transferir(500); //5. Probamos la herencia con un metodo de la clase Ordenador en la clase PortatilMadrid
        test3_1.eliminar(300);  //tambien tenemos dos variaciones del metodo "imprimir", cada variacion imprima 
                                //diferentes propiedades, depende de la clase
        
                                
        //6. Tenemos acceso a las propiedades dependentamente del atributo private o public. Si una propiedad 
        //tiene atributo private, utilizamos Get y Set para accederla
        
        
    }
}
