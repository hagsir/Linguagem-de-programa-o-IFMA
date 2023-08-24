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

public class Ex4 {
    
    public static void main(String[] args){
        
        double custoFab, custoCon;
        
        System.out.printf("Informe o custo de fábrica do carro:\n> ");
        custoFab = new Scanner(System.in) .nextDouble();
        
        custoCon = custoFab + ( custoFab*0.28 ) + ( custoFab*0.45 );
        
        System.out.printf("Custo do consumidor: R$ %.2f\n", custoCon);
        
    }
    
}
