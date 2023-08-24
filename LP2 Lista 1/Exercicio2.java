/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author joaop
 * Faça um algoritmo (em Java) que efetue a leitura de um valor numérico inteiro e apresente o
resultado do valor lido elevado ao quadrado.
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Digite um número inteiro qualquer: ");
        num = new Scanner( System.in ).nextInt();
        num *= num;
        System.out.println(num);
        
    }
}
