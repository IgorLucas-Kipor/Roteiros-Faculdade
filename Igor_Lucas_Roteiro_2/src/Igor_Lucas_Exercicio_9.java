//Na cidade de Sabar�, para transfer�ncias de ve�culos, a SABATRAN cobra uma taxa de 1% para carros
//fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa est�
//incidindo sobre o valor de tabela do carro. Implemente um algoritmo que l� o ano de fabrica��o e o pre�o
//do carro e a seguir calcula e imprime imposto a ser pago.

import java.util.Scanner;
import java.util.Locale;
public class Igor_Lucas_Exercicio_9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o pre�o do carro: ");
		double preco = sc.nextDouble();
		double taxa;
		System.out.print("Insira o ano de fabrica��o do carro: ");
		int ano = sc.nextInt();
		if (ano < 1990) {
			taxa = preco * 0.01;
		} else {
			taxa = preco * 0.015;
		}
		System.out.printf("O imposto cobrado pela transfer�ncia desse ve�culo pela SABATRAN � de R$%.2f.%n", taxa);
		sc.close();
	}
}
