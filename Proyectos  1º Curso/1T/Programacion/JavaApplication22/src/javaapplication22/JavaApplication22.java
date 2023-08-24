
package javaapplication22;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.Math.round;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;                                                         
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaApplication22 extends JPanel {
    private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
@Override public void paint (Graphics g){                                                      // 3 UTILIZAMOS OVERRIDE EN EL METODO PUBLIC VOID LLAMADO PAINT E IMPORTAMOS LA LIBRERIA GRAPHICS Y PARA EL PROYECTO LA LLAMAMOS G
        super.paint(g);                                                                         //UTILIZAMOS EL SUPER PAINT PARA QUE PINTE TODA LA CLASE DENOMINADA G
        Graphics2D misgraficos = (Graphics2D) g;                                                //CON GRAPHICPS2D CREAMOS MIS GRAFICOS Y NOS PONEMOS A PINTAR
   //CREO UN CONJUNTO DE DATOS EN UN ARRAY
   
   float[] barras = new float[]{33,33,50,100,280,300};
   List misbarras = new ArrayList();
 

  // System.out.println("Que sepas que la suma de las porciones es"+suma);
   int acontinuacion = 0;
     String url = "jdbc:sqlite:C://Users/pc/Desktop/registros/registros.db";
          Connection conn = null;
        try {
            String sql = "SELECT * FROM PRUEBA";
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
          
             while (rs.next()) {misbarras.add(Integer.parseInt(rs.getString("numero")));}
        sql = "SELECT * FROM mac";
         rs = stmt.executeQuery(sql);
              while (rs.next()) {misbarras.add(Integer.parseInt(rs.getString("numero")));}
               sql = "SELECT * FROM ubuntu";
         rs = stmt.executeQuery(sql);
              while (rs.next()) {misbarras.add(Integer.parseInt(rs.getString("numero")));}
               sql = "SELECT * FROM android";
         rs = stmt.executeQuery(sql);
              while (rs.next()) {misbarras.add(Integer.parseInt(rs.getString("numero")));}
               sql = "SELECT * FROM iphone";
         rs = stmt.executeQuery(sql);
              while (rs.next()) {misbarras.add(Integer.parseInt(rs.getString("numero")));}
       
        
        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        int tamanio = misbarras.size();
         float suma = 0;
   for( Object numero: misbarras){
       System.out.println(numero);
       suma += (int)numero;
   }
   System.out.println("La suma es" +suma);
    /////////////////CREO UNA CONEXION///////////////////////////////

        System.out.println(tamanio);
///AHORA DIBUJO LA GRAFICA
 for( Object numero: misbarras){
      int rojo = getRandomNumberInRange(0,255);
      int verde = getRandomNumberInRange(0,255);
      int azul = getRandomNumberInRange(0,255);
      Color micolor = new Color(rojo,verde,azul);
      misgraficos.setColor(micolor);
      int angulo = (int)(round(((int)numero/suma)*360));
      System.out.println("quesito"+ angulo);
      acontinuacion +=angulo;
      misgraficos.fillArc(0, 10, 380, 380, acontinuacion, angulo);} 
      misgraficos.setColor(Color.white);
      misgraficos.fillArc(150, 160, 80, 80, 0, 360);
}

    public static void main(String[] args) {
         JFrame marco = new JFrame("graficapruebaexamen");                       
       JavaApplication22 mimarco = new JavaApplication22();                                   
       marco.add(mimarco);                                              
       marco.setSize(400, 400);                                        
       marco.setVisible(true);                                              
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            
 
    }
    
}
