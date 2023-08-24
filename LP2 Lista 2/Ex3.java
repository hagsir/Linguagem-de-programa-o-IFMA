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

public class Ex3 {
    
    public static void main(String[] args){
        
        double[] nota = {0,0,0};
        double media;
   
        
        System.out.printf("Nota 1:\n> ");
        nota[0] = new Scanner(System.in) .nextDouble();
        System.out.printf("Nota 2:\n> ");
        nota[1] = new Scanner(System.in) .nextDouble();
        System.out.printf("Nota 3:\n> ");
        nota[2] = new Scanner(System.in) .nextDouble();
        
        nota[0] *= 3;
        nota[1] *= 5;
        nota[2] *= 7;
        
        media = (nota[0] + nota[1] + nota[2]) / 3;
        
        System.out.printf("Média = %.2f", media);
        
    }
    
}
