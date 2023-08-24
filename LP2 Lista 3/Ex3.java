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
Desenvolva programa JAVA que possui método que receba um valor inteiro com 4 dígitos, e retorne um
número com seus dígitos invertidos.
Obs: Usar operações matemática.
Ex1. 1345, retorna 5431
Ex2. 9876, retorna 6789
*/
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        
        int a;
        System.out.printf("Digite um numero em binario de 4 dígitos:\n> ");
        a = new Scanner(System.in) .nextInt();
        
        System.out.printf("%d \n", inversor(a));

    }
    
    public static int inversor(int num){

        int milesima = (num/1000);
        
        int centesima = (num - (milesima*1000))/100;
        
        int decimal = (num - ((centesima*100)+(milesima*1000)))/10;
        
        int unidade = (num - ((centesima*100)+(milesima*1000)+(decimal*10)));
        
        //return (unidade*1000) + (decimal*100) + (centesima*10) + (milesima);
        
        // Ou do jeito mais dificil e bizarramente estranho:
        return ((num-(((num-((num/1000)*1000))/100*100)+((num/1000)*1000)+((num-(((num-((num/1000)*1000))/100*100)+((num/1000)*1000)))/10*10)))*1000)
                +((num-(((num-((num/1000)*1000))/100*100)+((num/1000)*1000)))/10*100)
                +((num-((num/1000)*1000))/100*10)
                +(num/1000);
    }
    
}
