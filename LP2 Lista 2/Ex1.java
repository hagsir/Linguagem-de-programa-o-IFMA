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

public class Ex1 {
    
    public static void main(String[] args){
        
        double a, b,c, d, r,s;
        
        System.out.printf("Digite um numero inteiro:\n> ");
        a = new Scanner(System.in) .nextDouble();
        System.out.printf("Digite outro numero inteiro:\n> ");
        b = new Scanner(System.in) .nextDouble();
        System.out.printf("Digite outro numero inteiro:\n> ");
        c = new Scanner(System.in) .nextDouble();
        
        r = (double) Math.pow((a+b),2);
        s = (double) Math.pow((b+c),2);
        d = (r + s) / 2;
        
        System.out.println(d);
        
        
        
    }
    
}
