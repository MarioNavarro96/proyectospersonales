string[] agenda = new string[10];


agenda[0] = "Mario";
agenda[1] = "Fernando";

int longitud = agenda.Length;

Console.WriteLine("La longitud de la agenda es " + longitud + "");

foreach (string registro in agenda) {
Console.WriteLine(registro);
}