/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author joaop
 * Faça um algoritmo (em Java) que dado o nome de um funcionário, seu número de horas
trabalhadas, o valor que recebe da hora trabalhada, calcule o salário desse funcionário e
apresente seu nome e salário.
 */
public class Exercicio5 {
    public static void main(String[] args){
        String nome;
        int horas;
        double valorHora;

        System.out.println("Digite o nome do funcionário: ");
        nome = new Scanner (System.in) .nextLine();

        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horas = new Scanner (System.in) .nextInt();
        
        System.out.println("Digite o valor que recebe por hora: ");
        valorHora = new Scanner (System.in) .nextDouble();
        
        System.out.printf("%s tem o salário de R$ %.2f por mês.", nome, horas*valorHora*20); // 20 dias de Segunda a Sexta por cada semana do mes
        
    }
}
