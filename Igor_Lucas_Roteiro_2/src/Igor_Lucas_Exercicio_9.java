//Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros
//fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está
//incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço
//do carro e a seguir calcula e imprime imposto a ser pago.

import java.util.Scanner;
import java.util.Locale;
public class Igor_Lucas_Exercicio_9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o preço do carro: ");
		double preco = sc.nextDouble();
		double taxa;
		System.out.print("Insira o ano de fabricação do carro: ");
		int ano = sc.nextInt();
		if (ano < 1990) {
			taxa = preco * 0.01;
		} else {
			taxa = preco * 0.015;
		}
		System.out.printf("O imposto cobrado pela transferência desse veículo pela SABATRAN é de R$%.2f.%n", taxa);
		sc.close();
	}
}
