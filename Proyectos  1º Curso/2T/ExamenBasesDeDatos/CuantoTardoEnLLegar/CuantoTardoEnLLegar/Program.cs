
Console.WriteLine("CALCULADORA DE CUANTO TIEMPO TARDO EN LLEGAR");
//Variables iniciales

//Primero pregunto datos de partida
Console.WriteLine("Dime a que velocidad va tu coche");
string velocidad = Console.ReadLine();
Console.WriteLine("Dime a que distancia esta el lugar al que vas");
string distancia = Console.ReadLine();
//Realizo operaciones con los datos de partida
float velocidad_entero = float.Parse(velocidad);
float distancia_entero = float.Parse(distancia);

float tiempo = distancia_entero / velocidad_entero;
//Por ultimo muestro los datos en pantalla
Console.WriteLine("Vas a tardar en llegar " + tiempo + " horas");