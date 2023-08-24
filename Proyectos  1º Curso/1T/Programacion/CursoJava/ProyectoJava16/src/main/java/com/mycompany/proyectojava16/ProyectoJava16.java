package com.mycompany.proyectojava16;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;                                                              //IMPORTO LA LIBRERIA PARA ABRIR ARCHIVOS
                                                                                       //CAPTURA ERRORES QUE SE PUEDAN CORREGIR AL ABRIR ARCHIVOS 
import java.io.IOException;

public class ProyectoJava16 {

    public static void main(String[] args) {
        
        try{                                                                      // PRIMERO INTENTA HACER ALGO
           
           
             FileWriter miarchivo = new FileWriter("archivo.txt");          //ABRE UN ARCHIVO
             miarchivo.write("Hola esto está escrito por java");                //SE ESCRIBE EL CONTENIDO DEL ARCHIVO
             miarchivo.close();                                                     //CIERRA LOS RECURSOS DESPUES DE USARLOS
            }catch(IOException e){                                                  //EN EL CASO DE QUE EL TRY FALLE
                e.printStackTrace();                                                // DIME EN QUE HA FALLADO
            }
        //////////////////////////
        try{                                                                        //// PRIMERO INTENTA HACER ALGO
             File miotroarchivo = new File ("archivo2.txt");                 //ABRE UN ARCHIVO
             Scanner lector = new Scanner(miotroarchivo);                      //LEO EL CONTENIDO DEL ARCHIVO
             while(lector.hasNextLine()){                                           //MIENTRAS QUE EL ARCVHIVO TENGA LINEAS DE TEXTO
                 System.out.println(lector.nextLine());                         // IMPRIME LA LINEA EN LA PANTALLA
            } 
        }catch(IOException e){                                                     //EN CASO DE QUE DE ERROR DE LECTURA
            e.printStackTrace();                                                    //DIME EN QUE HA CONSISTIDO EL ERROR
        }
    }}                
            