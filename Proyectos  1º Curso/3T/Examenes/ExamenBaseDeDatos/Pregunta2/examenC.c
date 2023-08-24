


/*

Programa Coleccion Musical v 0.1
Mario Navarro

*/

#include <stdio.h>
#include <string.h>
#define PI 3.1416
#define NOMBREPROGRAMA "Programa Coleccion Musical"
#define VERSION "1.0"
#define AUTOR "Mario Navarro"

int main(int argc, char * argv[]){ //Se define una estructura llamada RegistroCDs que contiene campos para el título, artista, año y género musical de un CD.
      struct RegistroCDs{
        char titulo[50];
        char artista[50];
        char anio[50];
        char generomusi[50];
       
    };
    
    struct RegistroCDs cds[100];    //Se crea un arreglo de estructuras RegistroCDs llamado cds con capacidad para 100 CDs.
    strcpy(cds[0].titulo,"What Is Love");
    strcpy(cds[0].artista,"Haddaway");
    strcpy(cds[0].anio,"1993");
    strcpy(cds[0].generomusi,"Dance");
    
    strcpy(cds[1].titulo,"Freed From Desire");
    strcpy(cds[1].artista,"Gala Rizzato");
    strcpy(cds[1].anio,"1997");
    strcpy(cds[1].generomusi,"Dance");
    
    strcpy(cds[2].titulo,"Africa");
    strcpy(cds[2].artista,"Toto");
    strcpy(cds[2].anio,"1982");
    strcpy(cds[2].generomusi,"Pop");
    
    
    
    
//Mensaje de bienvenida
     printf("%s V %s \n",NOMBREPROGRAMA,VERSION);
     printf("Por %s \n",AUTOR);
     printf("Selecciona una opcion:  \n");      //Se muestra un menú de opciones y se lee la opción seleccionada por el usuario.
     printf("\t 1 -  Listado de canciones \n");
     printf("\t 2 - Introducir una nueva cancion \n");
     printf("\t 3 - Eliminar una cancion \n");
     printf("\t 4 -  Buscar una cancion \n");
     printf("\t 5-  Actualizar una cancion \n");
    printf("Tu opcion: \n");
    char opcion = getchar();
    printf("La opcion que has seleccionado es la numero: %c \n",opcion);
    
    switch(opcion){         //Se utiliza una estructura switch para realizar diferentes acciones según la opción seleccionada:
            case '1':
                printf("A continuacion te ofrezco un listado de canciones \n");
                 for(int i=0;i<10;i=i+1){
                     if(strcmp(cds[i].titulo,"")){
                    printf("El titulo es %s \n",cds[i].titulo);
                    printf("El artista  es %s \n",cds[i].artista);
                    printf("El anio de lanzamiento de la cancion es %s \n",cds[i].anio);
                    printf("El genero musical de esta cancion es %s \n",cds[i].generomusi);
                                            }
                 }
            break;
             case '2':
                printf("A continuacion vamos a introducir una nueva cancion \n");
            break;
             case '3':
                printf("A continuacion vamos a eliminar una cancion \n");
            break;
             case '4':
                printf("A continuacion vamos a buscar una cancion \n");
            break;
             case '5':
                printf("A continuacion vamos a actualizar una cancion \n");
            break;
        default:
            printf("La opcion que has seleccionado no es valida \n");
    }
    printf("Finalizando la ejecucion del programa...\n");       //Se muestra un mensaje de finalización del programa.
    printf("\n");
    return 0;
}
