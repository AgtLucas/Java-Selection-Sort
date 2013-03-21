/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03selectionsort;

import java.util.Scanner;

/**
 *
 * @author AgtLucas
 */
public class Aula03SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        float x[] = new float[10];
        float eleito, menor;
        int i, j, pos;
 
        for (i = 0; i <= 9; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            x[i] = in.nextFloat();
        }
 
        for (i = 0; i <= 8; i++) {
            eleito = x[i];
            menor = x[i + 1];
            pos = i + 1;
            for (j = i + 2; j <= 9; j++) {
                if (x[j] < menor) {
                    menor = x[j];
                    pos = j;
                }
            }
            if (menor < eleito) {
                x[i] = x[pos];
                x[pos] = eleito;
            }
        }
        
        int location = 9;
        int result = 1;
 
        for (i = 0; i <= 9; i++) {
            System.out.println((i + 1) + "° número: " + x[i]);
        }
        
        System.out.println("O maior número é: " + x[9] + " e teve " + result + " aparição(ções) no vetor.");
    }
}
