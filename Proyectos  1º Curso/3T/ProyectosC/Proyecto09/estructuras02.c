
#include <stdio.h>
#include <string.h>


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
    
    for(int i=0;i<10;i=i+1){
        printf("El nombre es %s \n",agenda[i].nombre);
        printf("El apellido es %s \n",agenda[i].apellidos);
    }
    
    printf("\n");
    return 0;
}