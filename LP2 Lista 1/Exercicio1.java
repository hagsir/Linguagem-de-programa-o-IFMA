/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * Faça um algoritmo (em Java) que armazene em variáveis diferentes o nome de uma pessoa, a
    sua idade e o seu salário, e em seguida mostre essas informações na tela.
 */
class funcionario{
    String nome;
    int idade;
    double salario;
    
}
        
public class Exercicio1 {
    public static void main(String[] args) {
        funcionario f1 = new funcionario();
        
        f1.nome = "João Pedro";
        f1.idade = 20;
        f1.salario = 0.0;
        
        System.out.println(f1.nome);
        System.out.println(f1.idade);
        System.out.println(f1.salario);
    }
    
}
