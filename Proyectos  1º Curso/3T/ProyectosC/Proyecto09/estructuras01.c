
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
    
    struct RegistroAgenda registro1;
    strcpy(registro1.nombre,"Mario");
    strcpy(registro1.apellidos,"Navarro");
    
    struct RegistroAgenda registro2;
    strcpy(registro2.nombre,"Fernando");
    strcpy(registro2.apellidos,"Martinez");
    
    printf("El nombre del primer registro es: %s \n",registro1.nombre);
    
     printf("El apellido del primer registro es: %s \n",registro1.apellidos);
    
     printf("El nombre del segundo registro es: %s \n",registro2.nombre);
    
     printf("El apellido del segundo registro es: %s \n",registro2.apellidos);
    
    printf("\n");
    return 0;
}