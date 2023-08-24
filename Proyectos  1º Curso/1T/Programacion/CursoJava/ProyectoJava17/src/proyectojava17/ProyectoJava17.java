package proyectojava17;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProyectoJava17 {

    
    
    public static void main(String[] args) {
     try{
     Class.forName("com.mysql.jdbc.Driver");
     
     Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/cursojava","cursojava", "cursojava");
     Statement peticion = conexion.createStatement();
     peticion.execute("INSERT INTO agenda VALUES(NULL,'Alfredo','459784','emaildealfred@hotmail.com')");
     
     }catch(Exception e){
         e.printStackTrace();
     
     }
    }
    
}
