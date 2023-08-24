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
Desenvolva programa JAVA que possui método que recebe como parâmetro uma String com 4 Bits, e
retorne o valor correspondente em Decimal.
Ex1. “1111”, resultado: 1x2^3 + 1x2^2 + 1+2^1 + 1x2^0 = 15
Ex2. “1001”, resultado: 1x2^3 + 0x2^2 + 0+2^1 + 1x2^0 = 9
Obs: Pode ser lido uma String com qualquer sequência de 4 bits.
*/
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        
        String a;
        System.out.printf("Digite um numero:\n> ");
        a = new Scanner(System.in) .nextLine();
        
        System.out.printf("%f ", binario(a));

    }
    
    public static double binario(String binStr){
        return Character.getNumericValue(binStr.charAt(0)) *Math.pow(2,3)
               +Character.getNumericValue(binStr.charAt(1))*Math.pow(2,2)
                +Character.getNumericValue(binStr.charAt(2))*Math.pow(2,1)
                 +Character.getNumericValue(binStr.charAt(3))*Math.pow(2,0);
    }
    
}
