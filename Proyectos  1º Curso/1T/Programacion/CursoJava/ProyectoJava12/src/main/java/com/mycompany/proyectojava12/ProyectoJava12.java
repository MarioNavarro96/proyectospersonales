package com.mycompany.proyectojava12;

public class ProyectoJava12 {

    public static void main(String[] args) {
   saluda("Mario");
   saluda("Manolo");
   saluda("Germán");
   saluda("Nerea");
   saluda("Matilde", "Lunes");
       
    }
    public static void saluda(String nombre){
        System.out.println("Hola "+nombre+", ¿como estás?");
        
    }
        public static void saluda(String nombre, String dia){
        System.out.println("Hola "+nombre+", ¿como estás?, ¿sabes que hoy es "+dia+"?");
    
    }
}
