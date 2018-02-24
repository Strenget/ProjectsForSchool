#include <stdio.h>

int main(){

  int a,b;
  scanf("%d%d", &a, &b);
  if(a < -10000 || b < -10000 || b > 10000 || a > 10000){
    printf("Vstup je mimo interval\n");
    return 0;
  }

  printf("Desitkova soustava: %d %d\n", a, b);
  printf("Sestnactkova soustava: %x %x\n", a, b);
  printf("Soucet: %d + %d = %d\n", a, b, a + b);
  printf("Rozdil: %d - %d = %d\n", a, b, a - b);
  printf("Soucin: %d * %d = %d\n", a, b, a * b);
  if(b == 0)
    printf("Nedefinovany vysledek!\n");
  else
    printf("Podil: %d / %d = %d\n", a, b, a / b);
  printf("Prumer: %.1f\n", (a + b) / 2.0);

  return 0;
}
