package com.mycompany.proyectojava13;

public class ProyectoJava13 {

    public static void main(String[] args) {
        
  Persona Nerea = new Persona();
  Persona Fermín = new Persona ();
  System.out.println("El nombre de Nerea es:"+Nerea.nombre);
  Nerea.nombre ="Nerea";
  Nerea.edad = 20;
  Fermín.nombre = "Fermín";
  Fermín.edad = 40;
  
  /*
  System.out.println("El nombre ahora mísmo de Nerea es:"+Nerea.nombre);
  System.out.println("La edad de Nerea es:"+Nerea.edad);
  System.out.println("El nombre de Fermín es:"+Fermín.nombre);
  System.out.println("La edad de Fermín es:"+Fermín.edad);
  
   */
  
  Nerea.saluda();
    }
}
