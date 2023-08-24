
#include <stdio.h>


int main(int argc, char * argv[]){
    char* agenda[10][4];
    
    agenda[0][0] = "Mario";
    agenda[0][1] = "12345";
    agenda[0][2] = "La calle de Mario";
    agenda[0][3] = "marionavarro651@gmail.com";
    
    agenda[1][0] = "Juan";
    agenda[1][1] = "67890";
    agenda[1][2] = "La calle de Juan";
    agenda[1][3] = "emaildejuan@gmail.com";
    
    agenda[2][0] = "Vicente";
    agenda[2][1] = "347135";
    agenda[2][2] = "La calle de Vicente";
    agenda[2][3] = "vicente@gmail.com";
    
    printf("La calle de Mario es %s y su correo es %s \n",agenda[0][2],agenda[0][3]);
        
    printf("\n");
    return 0;
}