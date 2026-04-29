
package app;

import com.mycompany.ejerciciopaquetes.modelo.moto;


public class NewMain {


    public static void main(String[] args) {
    
        moto moto1 = new moto("marca1", "modelo1", 1990, "color 1", "seguro 1");
        moto moto2 = new moto();
        System.out.println("moto1: " + moto1.marca);
        System.out.println("moto2: " + moto2.marca);
        
    } 
}
