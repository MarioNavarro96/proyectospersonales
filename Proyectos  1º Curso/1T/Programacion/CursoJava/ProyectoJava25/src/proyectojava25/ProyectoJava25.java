
package proyectojava25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ProyectoJava25 {

    public static void main(String[] args) {
      Pattern patron = Pattern.compile("COCO",Pattern.CASE_INSENSITIVE); //INSENSITIVE TE LO CUENTA CON MAYUSCULA Y MINUSCULA
      Matcher frase = patron.matcher("El zumo que me he puesto tiene coco y piña");
      
      boolean encontrado = frase.find();
       
      if(encontrado){  
          System.out.println("Si que se ha encontrado");
          
      }else{
      
      System.out.println("No se ha encontrado");
      }
    
    
    }
    
    
    
}
