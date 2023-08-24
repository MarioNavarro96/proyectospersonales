
package proyectojava22;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;



public class ProyectoJava22 extends JPanel {
    
    
    persona bolita = new persona();
    float x = 200;                                                                      //DEFINO UNA POSICION INICIAL
    float y = 200;                                                                      //DEFINO UNA Y INICIAL
    float direccion = 2;                                                                //DEFINO UNA DIRECCION INICIAL
    
    @Override
    public void paint(Graphics g){                                                      //SOBRESCRIBO EL METODO DE PINTURA POR DEFECTO
        super.paint(g);                                                                 //PINTO EN LA VENTANA PRICIPAL
        Graphics2D graf2D = (Graphics2D) g;                                             //CREO UN NUEVO ELEMENTO EN GRAFICOS 2D
        graf2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //ACTIVO EL SUAVIZADO DE LINEAS
        graf2D.fillOval((int)x,(int)y, 20, 20);                              //DIBUJO UN OVALO
    }
    
    public void muevebola(){                                                            //ESTA FUNCION MUEVE LA BOLA
        double min = -0.5;                                                              //ESTABLEZCO UN MINOMO
        double max = 0.5;                                                               //ESTABLEZCO UN MAXIMO
        double random = min + Math.random() * (max - min);                              //CREO UN NUMERO ALEATORIO ENTRE EL MINIMO Y EL MAXIMO
    direccion += random;                                                                //VARIO LA DIRECCION DE FORMA ALEATORIA
    x += Math.cos(direccion);                                                         //AUMENTO LA X EN BASE A LA DIRECCION Y SU COSENO
    y += Math.sin(direccion);                                                       //AUMENTO LA Y EN BASE A LA DIRECCION Y SU SENO
    
    if(x > 400){direccion += Math.PI;}                                                 //EN EL CASO DE QUE LA X SEA MENOR QUE 400 PEGA LA VUELTA 
    if(x < 0){direccion += Math.PI;}                                                   //PEGA LA VUELTA AL COLISIONAR
    if(y > 400){direccion += Math.PI;}                                                 //PEGA LA VUELTA AL COLISIONAR
    if(y < 0){direccion += Math.PI;}                                                   //PEGA LA VUELTA AL COLISIONAR
    }

    public static void main(String[] args) throws InterruptedException {               //FUNCION PRINCIPAL 
      
        JFrame marco = new JFrame("animacion");                                   //CREO UN MARCO DE SWING
        ProyectoJava22 animacion = new ProyectoJava22();                                //CREO UNA INSTANCIA DEL PROYECTO
        marco.add(animacion);                                                       //AL MARCO LE AÑADO UN PROYECTO
        marco.setSize(400, 400);                                            //ESPECIFICO LAS DIMENSIONES DE LA VENTANA 
        marco.setVisible(true);                                                     //LE DIGO QUE QUIERO QUE LA VENTANA SEA VISIBLE
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //LE DIGO QUE SE CIERRE EL PROCESO AL CERRAR LA VENTANA 
        
        
        while(true){                                                                    //ENTRAMOS EN EL BUCLE INFINITO
        animacion.muevebola();                                                          //MUEVE LA BOLA 
        animacion.repaint();                                                            //REPINTA LO QUE HAY EN LA PANTALLA
        Thread.sleep(10);                                                           //PARA LA EJECUCION UN TIEMPO PARA QUE EL BUCLE ESTE CONTROLADO 
        }
        
    }
  
}

