/*
Faça uma struct que represente um produto de um supermercado. A struct deve possuir o código, o
nome, o valor unitário e a quantidade de itens do produto em estoque. Crie um programa em C que simule a inserção e alteração dos valores de 3 produtos.  
*/

#include <stdio.h>
#include <string.h>

struct tipo_produto{

  char nome[50];
  float valor;
  int quantidade;
  
}produto[3];

int main(void) {

  void mostrarProdutos(void);

  
  for(int i=0; i<3; i++){
    printf("Digite o nome do %d° produto:\n> ", i+1);
    scanf(" %49[^\n]", produto[i].nome);
    
    printf("Digite o preço do produto:\n> ");
    scanf("%f", &produto[i].valor);
    while (produto[i].valor < 0){
      printf("Valor inválido, digite novamente:\n> ");
      scanf("%f", &produto[i].valor);
    }

    printf("Digite a quantidade disponível para venda:\n> ");
    scanf("%d", &produto[i].quantidade);
    while (produto[i].valor < 1){
      printf("Quantidade inválida, digite novamente:\n> ");
      scanf("%d", &produto[i].quantidade);
    }

  }

int escolha=1, produtoNum;

  mostrarProdutos();
  
  while(escolha!=0){
    printf("Escolha uma opção:\n");
    printf("( 1 ) Mostrar os produtos.\n");
    printf("( 2 ) Alterar o valor de um produto.\n");
    printf("( 0 ) Encerrar o programa.\n");
    scanf("%d", &escolha);

    if(escolha ==  1){
      mostrarProdutos();
    }else if(escolha == 2){
      printf("Escolha um produto pelo número dele:\n> ");
      scanf("%d", &produtoNum);
      printf("Digite um novo valor para o produto %s.\n> ", produto[produtoNum-1].nome);
      scanf("%f", &produto[produtoNum-1].valor);
      if(produtoNum > 3 || produtoNum < 1){
        printf("Produto inválido.\n");
      }
    }else if(escolha<0 || escolha>2){
      printf("Opção inválida.\n");
    }
    
  }
  
  return 0;
}

void mostrarProdutos(void){

  printf("\nProdutos:\n\n");
  for(int i=0; i<3; i++){
    printf("%d° produto:\n", i+1);
    printf("Nome: %s\n", produto[i].nome);
    printf("Preço: R$ %.2f\n", produto[i].valor);
    printf("Quantidade disponível: %d", produto[i].quantidade);
    printf("\n\n");
  }
  
}