package proyectojava21;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;

public class ProyectoJava21 {

    public static void main(String[] args) {
            try{
     Class.forName("com.mysql.jdbc.Driver");
     //ESTABLEZCO LA CONEXIÓN
     Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/cursojava","cursojava", "cursojava");
     //PREPARO UNA PETICION A LA BASE DE DATOS
     Statement peticion = conexion.createStatement();
    ResultSet resultado = peticion.executeQuery("SELECT * FROM cursos");
    int numero = 1;
    while(resultado.next()){
    System.out.println(resultado.getString(3));
    //////////////////////////////////////////////
      
        int anchura = 800;                                                                  //ANCHURA QUE TENDRÁ LA IMAGEN 
        int altura = 400;                                                                   //ALTURA QUE TENDRÁ LA IMAGEN

        BufferedImage imagencacheada = new BufferedImage(anchura,altura,BufferedImage.TYPE_INT_RGB);        //CREO UNA IMAGEN CON SU ALTURA ANCHURA Y TIPO DE COLOR
        
        Graphics2D graficos = imagencacheada.createGraphics();                              //DENTRO DE ESA IMAGEN VOY A PINTAR COSAS
          
        //EN ESTE TROZO PUEDES PINTAR
          graficos.setColor(Color.white); 
          graficos.fillRect(0,0,anchura,altura);
        
         
          BufferedImage imagen = null;
           
          imagen = ImageIO.read(new File ("logos/"+resultado.getString(7)));
          graficos.drawImage(imagen,0,0,400, 400,null);
          
          BufferedImage imagen2 = null;
           
          imagen2 = ImageIO.read(new File ("fotos/Fotos Jose Vicente Carratala "+String.format("%05d",numero)+".jpg"));
         
          graficos.drawImage(imagen2,400,0,400, 400,null);
     
          Color negrotransparente = new Color(0,0,0,150);
          graficos.setColor(negrotransparente);                                                   //DIGO QUE VOY A PINTAR DE COLOR ROJO
          graficos.fillRect(0, 380, anchura, 400);                              //PINTO UN RECTANGULO

          graficos.setColor(Color.white);                                            
          graficos.fillRect(390, 0, 20, 400);                             
          
          
           graficos.setColor(Color.white);
           graficos.setFont(new Font("Arial",Font.PLAIN,28));
           graficos.drawString(resultado.getString(3), 10, 395);
           
          
        //EN ESTE TROZO PUEDES PINTAR
         graficos.dispose();                                                                        //LIBERO EL RECURSO
  
         
         File archivo = new File ("guardado/"+String.format("%05d",numero)+""+resultado.getString(2)+".png");                             //APUNTO A UN NUEVO ARCHIVO
         ImageIO.write(imagencacheada,"png", archivo);                    //CON LA LIBRERIA CORRESPONDIENTE GUARDO EL PNG EN ESE ARCHIVO
          numero++;
         
         
    
    //////////////////////////////////////////////
    
    }
     
     }catch(Exception e){
         e.printStackTrace();
     
     }
    }
    
}
