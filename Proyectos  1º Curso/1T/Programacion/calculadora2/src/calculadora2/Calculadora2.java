
package calculadora2;



public class Calculadora2 {


    public static void main(String[] args) {
  
         float iva = 21;
        float base = 384;
        float ivacalculado;
        float importetotal;
        ivacalculado = base*(iva/100);
        importetotal = base+ivacalculado;
        
        System.out.println("Que sepas que el iva es "+ivacalculado);
        System.out.println("Que sepas que el importe total es "+importetotal);
    }
    
}
