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
 * Faça um algoritmo (em Java) que leia a idade de uma pessoa em anos. Em seguida, calcule e
escreva quantos dias ela viveu. Considerar o ano com 365,25 dias.
 */
public class Exercicio3 {
        public static void main(String[] args) {
        
        double idade, dias;
        
        System.out.println("Digite sua idade em anos: ");
        idade = new Scanner( System.in ).nextInt();
        dias = idade * 365.25;
        System.out.printf("Você viveu %.0f dias.", dias);
    }
}
