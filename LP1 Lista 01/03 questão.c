/*
A série de Fibonacci é formada pela sequência: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...
Faça um procedimento que receba por parâmetro um número inteiro e em seguida, gere a série de
FIBONACCI até o N-ésimo termo (lido pelo usuário).
*/

#include <stdio.h>

int main(void){
int num;

  scanf("%d", &num);

int num1=1, num2=0, result=1;

  for(int i=1; i<num; i++){
    result = num1 + num2;
    num2 = num1;
    num1 = result;
  }
  printf("O %d° termo da sequência de Fibonacci é %d.", num, result);
  
  return 0;
}