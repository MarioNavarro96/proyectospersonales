package com.mycompany.proyectojava8;

public class ProyectoJava8 {

    public static void main(String[] args) {
        String diadelasemana = "lunes";
        switch(diadelasemana){
          case "lunes":
            System.out.println("Hoy es el peor día de la semana");break;
          case "martes":
            System.out.println("Hoy es el segundo peor día de la semana");break;
          case "miercoles":
            System.out.println("Ya vamos por la mitad de la semana");break;
          case "jueves":
            System.out.println("Ya queda nada");break;
          case "viernes":
            System.out.println("Por fin viernes");break;
          case "sabado":
            System.out.println("Hoy es el mejor día de la semana");break;
            case "domingo":
            System.out.println("Maldición mañana es lunes");break;
          default:
            System.out.println("Esto no es un día de la semana");break;
        
        }
    }
}
