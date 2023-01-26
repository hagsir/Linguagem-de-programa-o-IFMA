/*
Faça uma função que receba como parâmetros o valor de um salário e um valor em porcentagem. A
função deve retornar um novo salário com o reajuste de aumento no valor da porcentagem.
*/

#include <stdio.h>

int main(void){
float reajuste(float salario, float percent);

float salario, percent;

  printf("Digite o salário atual:\n> R$ ");
  scanf("%f", &salario);
  printf("Digite a porcentagem para o reajuste:\n> ");
  scanf("%f", &percent);

  printf("O salário R$ %.2f com o reajuste de %.1f%% resulta em R$ %.2f", salario, percent, reajuste(salario, percent));
  
  return 0;
}

float reajuste(float salario, float percent){

  float reajuste = salario + ( salario * percent/100 );

  return reajuste;
}