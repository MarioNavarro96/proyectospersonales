package com.mycompany.proyectojava3;

public class ProyectoJava3 {

    public static void main(String[] args) {
        
        float operador1 = 2;
        float operador2 = 3;
        
        //Suma
        float suma = operador1 + operador2;
        System.out.println("La suma de 2 más 3 es igual a "+suma);
         //Resta
        float resta = operador1 - operador2;
        System.out.println("La resta de 2 más 3 es igual a "+resta);
          //Multiplicación
        float multiplicacion = operador1 * operador2;
        System.out.println("La multiplicación de 2 más 3 es igual a "+multiplicacion);
          //División
        float division = operador1 / operador2;
        System.out.println("La división de 2 entre 3 es igual a "+division);
        //Operador lógico de igualdad
        boolean igualdad = operador1 == operador2;
        System.out.println("La igualdad de 2 y 3 es "+igualdad);
        //Operador lógico de no igualdad
        boolean noigualdad = operador1 != operador2;
        System.out.println("La no igualdad de 2 y 3 es "+noigualdad);
                //Operador lógico de menor que
        boolean menorque = operador1 < operador2;
        System.out.println("La comparación es "+menorque);
                 //Operador lógico de mayor que
        boolean mayorque = operador1 > operador2;
        System.out.println("La comparación es "+mayorque);
        
    }
}
