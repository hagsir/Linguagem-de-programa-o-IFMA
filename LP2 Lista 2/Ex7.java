/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

/**
 *
 * @author joaop
 */

import java.util.Scanner;

public class Ex7 {
    
    public static void main(String[] args){
        
        double conta, carlos, andre, felipe;
        
        System.out.printf("Digite o valor da conta:\n> ");
        conta = new Scanner(System.in) .nextDouble();
  
        andre = (int) conta/3;
        carlos = (int) conta/3;
        
        felipe = conta - (andre+carlos);
        
        System.out.printf("Valor do preço que cada um deverá pagar:\n");
        System.out.printf("Carlos: R$ %.2f\n", carlos);
        System.out.printf("André: R$ %.2f\n", andre);
        System.out.printf("Felipe: R$ %.2f\n", felipe);

    }
    
}
