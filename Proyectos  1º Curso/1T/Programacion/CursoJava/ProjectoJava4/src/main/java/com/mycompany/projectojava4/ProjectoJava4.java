package com.mycompany.projectojava4;

/**
 *
 * @author pc
 */
public class ProjectoJava4 {

    public static void main(String[] args) {
        int edad = 42;
        int dia = 4;
        System.out.println("Voy a ver si es cierto o no "  +(edad>40 && dia==5));
        System.out.println("Voy a ver si es cierto o no "  +(edad>40 || dia==5));
        System.out.println("Voy a ver si es cierto o no "  +(edad<40 || dia==5));

    }
}
