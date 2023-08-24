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
Desenvolva programa JAVA que possui método que receba um valor inteiro referente ao tempo em
segundos, calcule e mostre na seguinte ordem: hr :: min :: seg.
Ex1. 3600 ̧ saída será 1hr::0min::0seg
Ex2. 380 ̧ saída será 0hr::6min::20seg
Ex1. 9805 ̧ saída será 2hr::43min::25seg
*/
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        
        int a;
        System.out.printf("Digite a quantidade de segundos:\n> ");
        a = new Scanner(System.in) .nextInt();
        
        System.out.printf("%s \n", formatTime(a));

    }
    
    public static String formatTime(int segundos){
        int minutos=0;
        while(segundos>=60){
            segundos-=60;
            minutos++;
        }
        int horas=0;
        while(minutos>=60){
            minutos-=60;
            horas++;
        }       
        return horas+"hr::"+minutos+"min::"+segundos+"seg";
    }
    
}
