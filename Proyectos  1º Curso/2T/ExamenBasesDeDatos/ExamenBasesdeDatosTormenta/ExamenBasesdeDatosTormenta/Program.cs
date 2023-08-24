Console.WriteLine("CALCULADOR DE TORMENTAS 1.0");
//Variables iniciales
int velocidadsonido = 343;
int distancia;
//Primero pregunto datos de partida
Console.WriteLine("Dime cuantos segundos han pasado desde el rayo hasta el trueno");
string tiempo = Console.ReadLine();
int tiempoenetero = int.Parse(tiempo);
//Realizo operaciones con los datos de partida
distancia = tiempoenetero * velocidadsonido;
//Por ultimo muestro los datos en pantalla
Console.WriteLine("La distancia a la tormenta es " + distancia + " metros");