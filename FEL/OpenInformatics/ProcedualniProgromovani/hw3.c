#include <stdio.h>
#include <stdlib.h>

typedef struct Cykl{
  int kladnych, zapornych, sum;
  int count, sudych, lichych;
  int max, min, number, zero;
} Cykl;

int main(){

Cykl one;

one.count = 0;
one.sum = 0;
one.kladnych = 0;
one.zapornych = 0;
one.sudych = 0;
one.lichych = 0;
one.zero = 0;



while(scanf("%d", &one.number) != EOF){

  if(one.number < -10000 || one.number > 10000){
    printf("Error: Vstup je mimo interval!\n");
    return 100;
  }

  if(one.count == 0){
    printf("%d", one.number);
    one.max = one.min = one.number;
  }
  else
    printf(", %d", one.number);

  one.sum += one.number;
  if(one.number < 0)
    one.zapornych++;
  else if(one.number > 0)
    one.kladnych++;
  else
    one.zero++;

  if(one.number % 2 == 0)
    one.sudych++;
  else
    one.lichych++;

  if(one.max < one.number)
    one.max = one.number;

  if(one.min > one.number)
    one.min = one.number;

  one.count++;
}

printf("\nPocet cisel: %d\n", one.count);
printf("Pocet kladnych: %d\n", one.kladnych);
printf("Pocet zapornych: %d\n", one.zapornych);
printf("Procento kladnych: %.2f\n", 100.0 / (one.count) * one.kladnych);
printf("Procento zapornych: %.2f\n", 100.0 / (one.count) * one.zapornych);
printf("Pocet sudych: %d\n", one.sudych);
printf("Pocet lichych: %d\n", one.lichych);
printf("Procento sudych: %.2f\n", 100.0 / (one.count) * one.sudych);
printf("Procento lichych %.2f\n", 100.0 / (one.count) * one.lichych);
printf("Prumer: %.2f\n", one.sum * 1.0 / one.count);
printf("Maxium: %d\n", one.max);
printf("Minimum: %d\n", one.min);

return 0;
}
