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
 * Todo restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% de comissão
para o garçom. Faça um algoritmo (em Java) que leia o valor gasto com despesas realizadas em
um restaurante e imprima o valor da gorjeta e o valor total com a gorjeta.
 */
public class Exercicio4 {
    public static void main(String[] args){
        
        double valor;
        
        System.out.println("Digite o valor total das despesas: ");
        valor = new Scanner ( System.in ) .nextDouble();
        
        System.out.printf("O valor da gorjeta é R$ %.2f e o valor total com a gorjeta é R$ %.2f.\n", valor*0.10, valor*1.10);
        
    }
}
