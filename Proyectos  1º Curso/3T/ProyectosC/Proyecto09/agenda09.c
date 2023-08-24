


/*

Programa agenda v 0.1
Mario Navarro

*/

#include <stdio.h>
#include <string.h>
#define PI 3.1416
#define NOMBREPROGRAMA "Programa agenda"
#define VERSION "1.2"
#define AUTOR "Mario Navarro"

int main(int argc, char * argv[]){
      struct RegistroAgenda{
        char nombre[50];
        char apellidos[50];
        char correo[50];
        char telefono[50];
        char direccion[50];
    };
    
    struct RegistroAgenda agenda[100];
    strcpy(agenda[0].nombre,"Mario");
    strcpy(agenda[0].apellidos,"Navarro");
    
    strcpy(agenda[1].nombre,"Tommy");
    strcpy(agenda[1].apellidos,"Vercetty");
    
    strcpy(agenda[2].nombre,"Ricardo");
    strcpy(agenda[2].apellidos,"Diaz");
    
    
    
    
//Mensaje de bienvenida
     printf("%s V %s \n",NOMBREPROGRAMA,VERSION);
     printf("Por %s \n",AUTOR);
     printf("Selecciona una opcion:  \n");
     printf("\t 1 -  Listado de registros \n");
     printf("\t 2 - Introducir un registro \n");
     printf("\t 3 - Eliminar un registro \n");
     printf("\t 4 -  Buscar un registro \n");
     printf("\t 5-  Actualizar un registro \n");
    printf("Tu opcion: \n");
    char opcion = getchar();
    printf("La opcion que has seleccionado es la numero: %c \n",opcion);
    
    switch(opcion){
            case '1':
                printf("A continuacion te ofrezco un listado de registros \n");
                 for(int i=0;i<10;i=i+1){
                     if(strcmp(agenda[i].nombre,"")){
                    printf("El nombre es %s \n",agenda[i].nombre);
                    printf("El apellido es %s \n",agenda[i].apellidos);
                                            }
                 }
            break;
             case '2':
                printf("A continuacion vamos a introducir un registro \n");
            break;
             case '3':
                printf("A continuacion vamos a eliminar un registro \n");
            break;
             case '4':
                printf("A continuacion vamos a buscar un registro \n");
            break;
             case '5':
                printf("A continuacion vamos a actualizar un registro \n");
            break;
        default:
            printf("La opcion que has seleccionado no es valida \n");
    }
    printf("Finalizando la ejecucion del programa...\n");
    printf("\n");
    return 0;
}
