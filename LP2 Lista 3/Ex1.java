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

/*
Método Double que receba 2 valores e retorne a soma dos dois números.
Método Double que receba 2 valores, e retorne à subtração dos dois números.
Método Double que receba 2 valores, e retorne o produto dos dois números.
Método Double que receba 2 valores inteiros, e retorne o resultado da divisão dos dois números.
Método Double que receba 2 valores inteiros, e retorne o resto da divisão dos dois números.
*/
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        
        double a, b;
        System.out.printf("Digite um numero:\n> ");
        a = new Scanner(System.in) .nextDouble();
        System.out.printf("Digite outro numero:\n> ");
        b = new Scanner(System.in) .nextDouble();

        System.out.printf("Soma = %.2f\n", sum(a,b));
        System.out.printf("Subtração = %.2f\n", sub(a,b));  
        System.out.printf("Multiplicação = %.2f\n", product(a,b));  
        System.out.printf("Divisão = %.2f\n", division(a,b));
        System.out.printf("Resto da divisão = %.0f\n", remainder(a,b));  
    }
    
    public static double sum(double a, double b){           
        return a+b;
    }
    
    public static double sub(double a, double b){
        return a-b;
    }
    
    public static double product(double a, double b){
        return a*b;
    }
    
    public static double division(double a, double b){
        return a/b;
    }
    
    public static double remainder(double a, double b){
        return a%b;
    }
            
}
