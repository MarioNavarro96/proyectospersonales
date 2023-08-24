package proyectojava20;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ProyectoJava20 {

    public static void main(String[] args) throws IOException {
       
        int anchura = 800;                                                                  //ANCHURA QUE TENDRÁ LA IMAGEN 
        int altura = 400;                                                                   //ALTURA QUE TENDRÁ LA IMAGEN

        BufferedImage imagencacheada = new BufferedImage(anchura,altura,BufferedImage.TYPE_INT_RGB);        //CREO UNA IMAGEN CON SU ALTURA ANCHURA Y TIPO DE COLOR
        
        Graphics2D graficos = imagencacheada.createGraphics();                              //DENTRO DE ESA IMAGEN VOY A PINTAR COSAS
          
        //EN ESTE TROZO PUEDES PINTAR
          graficos.setColor(Color.white); 
          graficos.fillRect(0,0,anchura,altura);
        
          graficos.setColor(Color.RED);                                                   //DIGO QUE VOY A PINTAR DE COLOR ROJO
          graficos.fillRect(20, 20, 300, 300);                              //PINTO UN RECTANGULO
          graficos.setColor(Color.green);
           graficos.drawString("Programa de Mario", 300, 200);
          
           BufferedImage imagen = null;
           
          imagen = ImageIO.read(new File ("logos/logo_java.png"));
          graficos.drawImage(imagen,0,0,400, 400,null);
          

        //EN ESTE TROZO PUEDES PINTAR
         graficos.dispose();                                                                        //LIBERO EL RECURSO
         for (int i = 0; i<10;i++){
         
         File archivo = new File ("guardado/primeraprueba"+i+".png");                             //APUNTO A UN NUEVO ARCHIVO
         ImageIO.write(imagencacheada,"png", archivo);                    //CON LA LIBRERIA CORRESPONDIENTE GUARDO EL PNG EN ESE ARCHIVO
         
         }
         
    }
    
    
    
}
