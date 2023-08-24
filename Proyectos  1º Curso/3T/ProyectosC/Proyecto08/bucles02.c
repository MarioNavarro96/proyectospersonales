
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
    
    agenda[3][0] = "Mario";
    agenda[3][1] = "12345";
    agenda[3][2] = "La calle de Mario";
    agenda[3][3] = "marionavarro651@gmail.com";
    
    agenda[4][0] = "Juan";
    agenda[4][1] = "67890";
    agenda[4][2] = "La calle de Juan";
    agenda[4][3] = "emaildejuan@gmail.com";
    
    agenda[5][0] = "Vicente";
    agenda[5][1] = "347135";
    agenda[5][2] = "La calle de Vicente";
    agenda[5][3] = "vicente@gmail.com";
    
    for(int registro = 0; registro<=5;registro = registro + 1){
       for(int campo = 0;campo<=3;campo=campo+1){
           printf("-%s \n", agenda[registro][campo]);
       }
        printf("\n");
    }
    printf("\n");
    return 0;
}