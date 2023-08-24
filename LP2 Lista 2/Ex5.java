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

public class Ex5 {
    
    public static void main(String[] args){
        
        double a,b,c;

        System.out.printf("Digite um numero inteiro:\n> ");
        a = new Scanner(System.in) .nextInt();
        System.out.printf("Digite outro numero inteiro:\n> ");
        b = new Scanner(System.in) .nextInt();
        System.out.printf("Digite outro numero inteiro:\n> ");
        c = new Scanner(System.in) .nextInt();
        
        int max = (int) Math.max(a,b);
        max = (int) Math.max(max,c);
        System.out.println(max);
        
        
        
        
    }
    
}
