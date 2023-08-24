
package pruebaexamen3;

public class Pruebaexamen3 {

    public static void main(String[] args) {
      int palet = 15;
      int paletdelcamion = 33;
      int cajas = 2000;
      
      int paletsquenecesitamos = cajas/palet;
      int camionesnecesarios = paletsquenecesitamos/paletdelcamion;
      System.out.println(paletsquenecesitamos);
      System.out.println(camionesnecesarios);
    }
    
}
