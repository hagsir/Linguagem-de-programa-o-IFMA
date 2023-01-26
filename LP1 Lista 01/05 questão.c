/*
Faça um programa em C, que tenha uma função que calcule a média de 3 (três) NOTAS de 5 ALUNOS,
e calcule o resultado da média de cada aluno. Em seguida, informe se os ALUNOS estão ou não
APROVADOS. Após isso, o programa deverá salvar em arquivo: o nome dos alunos, N1, N2, N3, 
média e situação calculada de cada aluno. [média maior ou igual a sete, para ser aprovado]
*/

#include<stdio.h>
#include<locale.h>

int main(void){
setlocale(LC_ALL, "Portuguese");
int soma=0;

struct tipo_aluno{

  char nome[50];
  float notas[3];
  float media;
}alunos[5];

	FILE *fptr;

	fptr = fopen("Alunos.txt", "w");

	for(int i=0; i<5; i++){
    	printf("Digite o nome do %d° aluno: ", i+1);
    	scanf(" %49[^\n]", alunos[i].nome);
    	for(int j=0; j<3; j++){
        	printf("Digite a %dº nota desse aluno: ", j+1);
        	do{
        	scanf("%f", &alunos[i].notas[j]);
            	if(alunos[i].notas[j]<0 || alunos[i].notas[j]>10){
                	printf("Nota inválida, digite novamente: ");
            	}
        	}while(alunos[i].notas[j]<0 || alunos[i].notas[j]>10);
    	}
    	printf("\n\n");
	}
	system("cls");

	for(int i=0; i<5; i++){
    	printf("Nome: %s\nNotas: ", alunos[i].nome);
    	fprintf(fptr,"Nome: %s\nNotas: ", alunos[i].nome);

    	for(int j=0; j<3; j++){
        	printf("\n%.2f", alunos[i].notas[j]);
        	fprintf(fptr,"\n%.2f", alunos[i].notas[j]);
        	soma += alunos[i].notas[j];
    	}
    	alunos[i].media = soma / 3;
    	printf("\nMedia: %.2f", alunos[i].media);
    	fprintf(fptr,"\nMedia: %.2f", alunos[i].media);
    	if(alunos[i].media>=7){
        	printf("\nAprovado!");
        	fprintf(fptr,"\nAprovado!");
    	}else{
        	printf("\nReprovado!");
        	fprintf(fptr,"\nReprovado!");
    	}
    	soma = 0;
    	printf("\n\n");
    	fprintf(fptr,"\n\n");
	}

	fclose(fptr);

return 0;
}

