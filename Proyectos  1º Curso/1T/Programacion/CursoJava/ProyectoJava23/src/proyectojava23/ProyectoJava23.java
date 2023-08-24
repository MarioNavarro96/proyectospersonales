
package proyectojava23;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ProyectoJava23 extends JPanel {
    
    int numerobolas = 430;
    int anchura = 1920;
    int altura= 1080;
    persona bolita[] = new persona[numerobolas];
public void inicio(){
    for(int i = 0;i<numerobolas;i++){
    bolita[i] = new persona();
    
 }

}
    
@Override
public void paint(Graphics g){                                                      //SOBRESCRIBO EL METODO DE PINTURA POR DEFECTO
        super.paint(g);                                                                 //PINTO EN LA VENTANA PRICIPAL
        Graphics2D graf2D = (Graphics2D) g;                                             //CREO UN NUEVO ELEMENTO EN GRAFICOS 2D
       // graf2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //ACTIVO EL SUAVIZADO DE LINEAS
        for(int i = 0;i<numerobolas;i++){
        graf2D.fillOval((int)bolita[i].x,(int)bolita[i].y, 20, 20);                   //DIBUJO UN OVALO

        }
        
    }
   public void muevete (){
   for(int i = 0;i<numerobolas;i++){
   bolita[i].muevebola(); 
   }
   }

    public static void main(String[] args) throws InterruptedException {               //FUNCION PRINCIPAL 
      
        JFrame marco = new JFrame("animacion");                                   //CREO UN MARCO DE SWING
        ProyectoJava23 animacion = new ProyectoJava23();                                //CREO UNA INSTANCIA DEL PROYECTO
        marco.add(animacion);                                                       //AL MARCO LE AÑADO UN PROYECTO
        marco.setSize(1920, 1080);                                            //ESPECIFICO LAS DIMENSIONES DE LA VENTANA 
        marco.setVisible(true);                                                     //LE DIGO QUE QUIERO QUE LA VENTANA SEA VISIBLE
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//LE DIGO QUE SE CIERRE EL PROCESO AL CERRAR LA VENTANA 
        animacion.inicio();
        
        while(true){                                                                    //ENTRAMOS EN EL BUCLE INFINITO
        animacion.muevete();
        animacion.repaint();                                                            //REPINTA LO QUE HAY EN LA PANTALLA
        Thread.sleep(10);                                                           //PARA LA EJECUCION UN TIEMPO PARA QUE EL BUCLE ESTE CONTROLADO 
        }
        
    }
  
}
    