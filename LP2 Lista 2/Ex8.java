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

public class Ex8 {
    
    public static void main(String[] args){
        
        double lata=0.35, garrafa=0.6, garrafa2=2, litros;
        
        System.out.printf("Digite a quantidade de latas:\n> ");
        lata = new Scanner(System.in)  .nextDouble() * lata;
        System.out.printf("Digite a quantidade de garrafas 600ml:\n> ");
        garrafa = new Scanner(System.in)  .nextDouble() * garrafa;
        System.out.printf("Digite a quantidade de garrafas 2L:\n> ");
        garrafa2 = new Scanner(System.in)  .nextDouble() * garrafa2;
        
        litros = lata + garrafa + garrafa2;
        
        System.out.printf("Litros: %.1f", litros);
        

    }
    
}
