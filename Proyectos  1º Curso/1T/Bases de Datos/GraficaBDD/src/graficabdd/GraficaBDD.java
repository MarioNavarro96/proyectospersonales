package graficabdd;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;                                                          //LIBRERIAS IMPORTADAS
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GraficaBDD extends JPanel{                                                         // 1 PONEMOS EL extends JPanel para poder trabajar con las herramientras de ventana
   
@Override public void paint (Graphics g){                                                      // 3 UTILIZAMOS OVERRIDE EN EL METODO PUBLIC VOID LLAMADO PAINT E IMPORTAMOS LA LIBRERIA GRAPHICS Y PARA EL PROYECTO LA LLAMAMOS G
        super.paint(g);                                                                         //UTILIZAMOS EL SUPER PAINT PARA QUE PINTE TODA LA CLASE DENOMINADA G
        Graphics2D misgraficos = (Graphics2D) g;                                                //CON GRAPHICPS2D CREAMOS MIS GRAFICOS Y NOS PONEMOS A PINTAR
        int basegrafica = 360; 
        misgraficos.drawLine(10, 10, 10, 360);                                       //linea vertical
        misgraficos.drawLine(10, basegrafica, 360, basegrafica);                      //Linea horizontal
    int[] barras = new int[]{ 100,300,200,200,100,200,50,200,25,50};
    String url = "jdbc:sqlite:C://Users/pc/Desktop/sqlite2/registros.db";
        Connection conn = null;
        try {
            String sql = "SELECT * FROM logmeses";
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int contador = 0;
             while (rs.next()) {
                System.out.println(rs.getInt("mes") + "\t" +
                                   rs.getString("numero"));
                barras[contador] = Integer.parseInt(rs.getString("numero"))/10;
                contador++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        for (int i = 0;i<barras.length;i++){
        int randomNum = barras[i];
        misgraficos.fillRect(i*30+20, basegrafica-randomNum, 10, randomNum);     //Dibujo una primera barra
                }
} 
    public static void main(String[] args) {                                                        
       JFrame marco = new JFrame("grafica");                                //2 CON JFRAME HACEMOS EL MARCO COMO UN NEW JFRAME Y QUEREMOS QUE SE LLAME GRAFICA CUANDO LO INICIEMOS 
       GraficaBDD mimarco = new GraficaBDD();                                   //DENTRO DEL PROYECTO CREAMOS LA ANIMACION MI MARCO
       marco.add(mimarco);                                                  //AÑADIMOS LA ANIMACION MIMARCO AL MARCO
       marco.setSize(400, 400);                                         //PONEMOS LA ALTURA YA ANCHURA
       marco.setVisible(true);                                                  //HACEMOS QUE SE MUESTRE EN PANTALLA
       marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);            //HACEMOS QUE EL PROCESO TERMINE AL CERRAR LA VENTANA
    }
}
