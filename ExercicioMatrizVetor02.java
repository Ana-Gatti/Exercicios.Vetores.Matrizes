package generation.exercicios.vetores.matrizes;

//importando biblioteca
import java.util.Scanner;

public class ExercicioMatrizVetor02 {

	public static void main(String[] args) {

		// informando que o comando leia dever� ser scaneado
		Scanner leia = new Scanner(System.in);

		// declarando vari�veis
		int[] arrayVetor = new int[10];
		int maiorLancamento = 0, qtdMaiorLancamento = 0;
		double soma = 0, media = 0;
		
		// la�o de repeti��o
		for (int i = 0; i <= 9; i++) {
			System.out.println("Informe o valor da " + (i + 1) + "� jogada: ");

			arrayVetor[i] = leia.nextInt();
			
			// condicional
			if (arrayVetor[i] > maiorLancamento) {
				maiorLancamento = arrayVetor[i];
			}

		}
		for (int i = 0; i <= 9; i++) {
			System.out.print(arrayVetor[i] + "|");
			soma += arrayVetor[i];
			media = soma / 10;

			if (maiorLancamento == arrayVetor[i]) {
				qtdMaiorLancamento++;
			}

		}
		
		// retorno ao usu�rio
		System.out.println("\nA m�dia dos lan�amentos � de: " + media);
		System.out.println("\nA maior pontua��o " + maiorLancamento + " saiu: " + qtdMaiorLancamento + " vez(es)");
		
		// encerrando a fun��o leia
		leia.close();
	}

}
