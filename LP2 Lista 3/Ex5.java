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
A importância de R$ 780.000,00 será dividida entre três ganhadores de um concurso, sendo que:
• O primeiro ganhador receberá 46% do total.
• O segundo receberá 32% do total.
• O terceiro receberá o restante.
Desenvolva programa JAVA que calcule e imprima a quantia recebida por cada um dos ganhadores.
Obs: A solução deverá conter método(s) com ou sem retorno, e com ou sem parâmetros.
*/

public class Ex5 {
    public static void main(String[] args){
        
        double total = 780000;

        System.out.printf("Primeiro lugar: R$ %.2f \n", quantia(total, 1));
        System.out.printf("Segundo lugar: R$ %.2f \n", quantia(total, 2));
        System.out.printf("Terceiro lugar: R$ %.2f \n", quantia(total, 3));
    }
    
    public static double quantia(double total, int classificacao){
        if(classificacao == 1){
            return total * 0.46;
        }
        if(classificacao == 2){
            return total * 0.32;
        }
        if(classificacao == 3){
            return total * (1 - (0.46+0.32));
        }
        return 0;
    }
    
}
