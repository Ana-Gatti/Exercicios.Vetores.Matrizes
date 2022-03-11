/* Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

package generation.exercicios.vetores.matrizes;

import java.util.Scanner;

public class Exercicio01matriz {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int [] arrayVetor = new int [5];
		int maiorPontuacao = 0;
		
		for (int i = 0; i <= 4; i++) {
			System.out.println("Digite o valor da " + (i+1) + "º Pontuação");
			arrayVetor[i] = leia.nextInt();
			if (arrayVetor[i] > maiorPontuacao){
				maiorPontuacao = arrayVetor[i];
			}
		}
		
		for (int i = 0; i <= 4; i++) {
		System.out.print(arrayVetor[i] + "|");
		}
		
		System.out.println("\nA maior pontuacao é: " +maiorPontuacao);
		leia.close();
	}

}
