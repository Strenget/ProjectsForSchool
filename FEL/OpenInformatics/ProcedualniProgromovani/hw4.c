#include <stdio.h>

int main(){

  int a, b, c;

  if(scanf("%d%d", &a, &b) != 2){
    fprintf(stderr, "Error: Chybny vstup!\n");
    return 100;
  }

  if(a < 3 || b < 3 || a > 69 || b > 69){
    fprintf(stderr, "Error: Vstup mimo interval!\n");
    return 101;
  }

  if(a % 2 == 0){
    fprintf(stderr, "Error: Sirka neni liche cislo!\n");
    return 102;
  }

  if(a == b){
    if(scanf("%d", &c) != 1){
      fprintf(stderr, "Error: Chybny vstup!\n");
      return 100;
    }
    else if(c < 3 || c > 69){
      fprintf(stderr, "Error: Vstup mimo interval!\n");
      return 101;
    }
    else if(c <= 0 || c > a){
      fprintf(stderr, "Error: Neplatna velikost plotu!\n");
      return 103;
    }

    for(int i = 0; i < a / 2; i++){
      for(int j = 0; j < a; j++){
        if(j == a / 2 - i || j == a / 2  + i)
          printf("X");
        else
          printf(" ");
      }
      printf("\n");
    }
    int control = 0;
    int controlTwo = 0;

    if(c % 2 == 0){
      for(int i = 0; i < b; i++){
        for(int j = 0; j < a + c ; j++){
          if((i == 0 || j == 0 || i == b - 1 || j == a - 1) && j < a)
            printf("X");
          else if(control == 0 && j < a ){
            printf("o");
            control = 1;
          }
          else if(j < a){
            printf("*");
            control = 0;
          }
          else{
            if( i == b - c || i == b - 1){
              if(controlTwo == 0){
                printf("-");
                controlTwo = 1;
              }
              else{
                printf("|");
                controlTwo = 0;
              }
            }
            else if( i > b - c){
              if(controlTwo == 0){
                printf(" ");
                controlTwo = 1;
              }
              else{
                printf("|");
                controlTwo = 0;
              }
            }
          }
        }
        printf("\n");
      }
    }
    else{
      for(int i = 0; i < b; i++){
        for(int j = 0; j < a + c - 1 ; j++){
          if((i == 0 || j == 0 || i == b - 1 || j == a - 1) && j < a)
            printf("X");
          else if(control == 0 && j < a ){
            printf("o");
            control = 1;
          }
          else if(j < a){
            printf("*");
            control = 0;
          }
          else{
            if( i == b - c || i == b - 1){
              if(controlTwo == 0){
                printf("-");
                controlTwo = 1;
              }
              else{
                printf("|");
                controlTwo = 0;
              }
            }
            else if( i > b - c){
              if(controlTwo == 0){
                printf(" ");
                controlTwo = 1;
              }
              else{
                printf("|");
                controlTwo = 0;
              }
            }
          }
        }
        printf("\n");
      }
    }
  }
  else{
    for(int i = 0; i < a / 2; i++){
      for(int j = 0; j < a; j++){
        if(j == a / 2 - i || j == a / 2 + i)
          printf("X");
        else
          printf(" ");
      }
      printf("\n");
    }
    for(int i = 0; i < b; i++){
      for(int j = 0; j < a; j++){
        if(i == 0 || j == 0 || j == a - 1 || i == b - 1)
          printf("X");
        else
          printf(" ");
      }
      printf("\n");
    }
  }
  return 0;
}
