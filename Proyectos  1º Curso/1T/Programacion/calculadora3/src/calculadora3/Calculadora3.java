
package calculadora3;


public class Calculadora3 {

    public static void main(String[] args) {
        float velocidadcirculada = 65;
        float minutoscirculados = 32;
         float kilometroscirculados;
         float horas = minutoscirculados/60;
         kilometroscirculados = horas*velocidadcirculada;
         
         System.out.println("La distancia recorrida del coche es de "+kilometroscirculados+" kilometros.");
        
    }
    
}
