
package persona_online;

import com.mycompany.practicagetset.Persona;

public class NewMain {

   
    public static void main(String[] args) {

        
        Persona persona1 = new Persona("P1Nombre", "P1Apellido", 30, "P1Email");
        Persona persona2 = new Persona("P2Nombre", "P2Apellido", 30, "P2Email");
        
        System.out.println("P1 nombre: " + persona1.getNombre()); //comprobamos si funciona el getter
        persona1.setNombre("P1NombreNuevo"); //comprobamos si funciona el setter
        System.out.println("P1 nombre cambiado: " + persona1.getNombre());
        
        persona1.nombre = "Test"; //no nos deja cambiar nombre porque es privado
        persona1.apellido = "Test";  //nos deja cambiar apellido porque es publico
    }
    
}
