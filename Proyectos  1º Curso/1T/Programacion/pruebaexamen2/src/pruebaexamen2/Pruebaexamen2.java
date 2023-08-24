
package pruebaexamen2;

public class Pruebaexamen2 {

    public static void main(String[] args) {
        double velocidadluz = 299798.458;
        double distanciatierrasol = 15000000;
        double segundos = distanciatierrasol/velocidadluz;
        
        int minutos =(int)segundos/60;
        int restosegundos = (int)segundos %60;
        
        System.out.println("Los segundos que tarda la luz del sol en llegar a la tierra son "+segundos);
        System.out.println("La luz del sol tarda en llegar a la tierra "+minutos+" minutos y"+restosegundos+" segundos.");
        
    }
    
}
