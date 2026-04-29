
package proyecto;
import java.sql.*;

public class conexion {
    Connection conectar=null;
     public Connection conectar(){
        //Ruta URL Base de Datos
        String host ="localhost";
        String puerto ="3306";
        String nameDB ="tolubaev";
        
        //usurio y contraseña
        String usuario ="mikhail";
        String pass ="mikhail";
        
        //Driver
        String driver="com.mysql.cj.jdbc.Driver";
        
        //Construir nuestro URL
        String databaseURL="jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
        try{
            
            Class.forName(driver);
           conectar=DriverManager.getConnection(databaseURL,usuario,pass);
            System.out.println("Base de datos conectada");
        }catch(Exception ex){
            System.out.println("Base de datos NO conectada");
          
             }   
  
    
            return conectar;
}
}
 
 
 



