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

public class Ex6 {
    
    public static void main(String[] args){
        
        double salario, novoSalario;

        System.out.printf("Digite o salário do funcionário:\n> R$ ");
        salario = new Scanner(System.in) .nextDouble();
        
        novoSalario = salario;
        novoSalario*=1.2;
        novoSalario*=(1 - 0.075);
        
        System.out.printf("Salário anterior: R$ %.2f\nNovo Salário: R$ %.2f\n", salario, novoSalario);
     
    }
    
}
