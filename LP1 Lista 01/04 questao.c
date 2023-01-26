/*
Utilize a matriz abaixo para resolver os itens a seguir:

  1 2 3
  4 5 6
  7 8 9

Crie um programa em C que mostre:
a) O maior número.
b) O menor número.
c) O somatório de todos os números.
*/

#include <stdio.h>

int main(void){
int matriz[3][3] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
int sum=0, maiorNumero = matriz[0][0], menorNumero = matriz[0][0];

  
  for(int i=0; i<3; i++){
    for(int j=0; j<3; j++){
      if(matriz[i][j] > maiorNumero){
        maiorNumero = matriz[i][j];
      }
      if(matriz[i][j] < menorNumero){
        menorNumero = matriz[i][j];
      }
      sum += matriz[i][j];
    }
  }

  printf("Maior número: %d\n", maiorNumero);
  printf("Menor número: %d\n", menorNumero);
  printf("Somatório dos números: %d\n", sum);
  
  return 0;
}