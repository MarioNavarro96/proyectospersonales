
package proyectojava23;

public class persona {
        //voy a declarar propiedades a la clase
     double minx = 0;                                                              //ESTABLEZCO UN MINOMO
        double maxx = 1920;                                                               //ESTABLEZCO UN MAXIMO
        double randomx = minx + Math.random() * (maxx - minx);                              //CREO UN NUMERO ALEATORIO ENTRE EL MINIMO Y EL MAXIMO
    public double x = randomx;
     double miny = 0;                                                              //ESTABLEZCO UN MINOMO
        double maxy = 1080;                                                               //ESTABLEZCO UN MAXIMO
        double randomy = miny + Math.random() * (maxy - miny);                              //CREO UN NUMERO ALEATORIO ENTRE EL MINIMO Y EL MAXIMO
    public double y = randomy;
    public float direccion = 0;
     
    public void muevebola(){                                                            //ESTA FUNCION MUEVE LA BOLA
        double min = -0.5;                                                              //ESTABLEZCO UN MINOMO
        double max = 0.5;                                                               //ESTABLEZCO UN MAXIMO
        double random = min + Math.random() * (max - min);                              //CREO UN NUMERO ALEATORIO ENTRE EL MINIMO Y EL MAXIMO
    direccion += random;                                                                //VARIO LA DIRECCION DE FORMA ALEATORIA
    x += Math.cos(direccion);                                                         //AUMENTO LA X EN BASE A LA DIRECCION Y SU COSENO
    y += Math.sin(direccion);                                                       //AUMENTO LA Y EN BASE A LA DIRECCION Y SU SENO
    
    if(x > 1920){direccion += Math.PI;}                                                 //EN EL CASO DE QUE LA X SEA MENOR QUE 400 PEGA LA VUELTA 
    if(x < 0){direccion += Math.PI;}                                                   //PEGA LA VUELTA AL COLISIONAR
    if(y > 1080){direccion += Math.PI;}                                                 //PEGA LA VUELTA AL COLISIONAR
    if(y < 0){direccion += Math.PI;}                                                   //PEGA LA VUELTA AL COLISIONAR
    }
}
