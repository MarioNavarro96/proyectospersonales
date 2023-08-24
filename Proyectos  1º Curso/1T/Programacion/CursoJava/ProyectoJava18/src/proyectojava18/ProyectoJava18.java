package proyectojava18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class ProyectoJava18 {

    
    
    public static void main(String[] args) {
        
        try{
     Class.forName("com.mysql.jdbc.Driver");
     //ESTABLEZCO LA CONEXIÓN
     Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/cursojava","cursojava", "cursojava");
     //PREPARO UNA PETICION A LA BASE DE DATOS
     Statement peticion = conexion.createStatement();
    ResultSet resultado = peticion.executeQuery("SELECT * FROM agenda");
    while(resultado.next()){
    System.out.println(resultado.getString(1)+"-"+resultado.getString(2)+"-"+resultado.getString(3));
    
    }
     
     }catch(Exception e){
         e.printStackTrace();
     
     }
        
    }
    
}
