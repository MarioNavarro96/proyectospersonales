/*

Programa agenda v 0.1
Mario Navarro

*/

#include <stdio.h>
#define PI 3.1416
#define NOMBREPROGRAMA "Programa agenda"
#define VERSION "1.2"
#define AUTOR "Mario Navarro"

int main(int argc, char * argv[]){
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