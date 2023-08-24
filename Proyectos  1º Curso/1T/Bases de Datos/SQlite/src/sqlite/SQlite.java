
package sqlite;
import java.sql.*;
public class SQlite {


    public static void main(String[] args) {
        System.out.println("Hola Sqlite");
        
        
        Connection conexion = null;
          //DECLARO LAS VARIABLES EN LAS QUE GUARDO LA INFORMACION//
            int mac = 0;
            int android = 0;
            int ubuntu = 0;
            int ios = 0;
            int  windows = 0;
            String nmwindows = "";
             String nmmac = "";
              String nmubuntu = "";
               String nmandroid = "";
                String nmios = "";
        try{
            String ruta = "jdbc:sqlite:/Users/pc/Desktop/registros/registros.db";
            conexion = DriverManager.getConnection(ruta);

Statement peticion = conexion.createStatement();
  //PIDO COSAS A LA BASE DE DATOS//
  //windows///
            String consulta = "SELECT * FROM visitaswindows";
            ResultSet resultados = peticion.executeQuery(consulta);
            while(resultados.next()){windows = resultados.getInt("windows");}
  //Mac///
            consulta = "SELECT * FROM visitasmac";
            resultados = peticion.executeQuery(consulta);
            while(resultados.next()){mac = resultados.getInt("windows");}
  //ubuntu///
            consulta = "SELECT * FROM visitasubuntu";
            resultados = peticion.executeQuery(consulta);
            while(resultados.next()){ubuntu = resultados.getInt("windows");}
   //android///
            consulta = "SELECT * FROM visitasandroid";
            resultados = peticion.executeQuery(consulta);
            while(resultados.next()){android = resultados.getInt("windows");}
   //iOS///
            consulta = "SELECT * FROM visitasios";
            resultados = peticion.executeQuery(consulta);
            while(resultados.next()){ios = resultados.getInt("windows");}
            for (int i = 0;i<windows;i+=1000){nmwindows += "#";}
             for (int i = 0;i<mac;i+=1000){nmmac += "#";}
              for (int i = 0;i<ubuntu;i+=1000){nmubuntu += "#";}
               for (int i = 0;i<android;i+=1000){nmandroid += "#";}
                for (int i = 0;i<ios;i+=1000){nmios += "#";}
            System.out.println("windows:\t " +String.valueOf(windows)+"\t "+nmwindows);
             System.out.println("mac:\t\t " +String.valueOf(mac)+"\t "+nmmac);
              System.out.println("ubuntu:\t\t " +String.valueOf(ubuntu)+"\t "+nmubuntu);
               System.out.println("android:\t " +String.valueOf(android)+"\t "+nmandroid);
                System.out.println("iOS:\t\t " +String.valueOf(ios)+"\t "+nmios);
        }catch(SQLException e){
        System.out.println(e.getMessage());}
    }
    
}
