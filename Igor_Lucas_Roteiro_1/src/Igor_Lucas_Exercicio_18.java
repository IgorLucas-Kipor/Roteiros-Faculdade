//Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do sal�rio m�nimo. Fa�a um
//algoritmo que receba o valor atual do sal�rio m�nimo e a quantidade de quilowatt consumida em uma
//resid�ncia, calcule e mostre:
//a. O valor pago por quilowatt;
//b. O valor a ser pago pelo consumo nessa resid�ncia;
//c. O valor a ser pago considerando um desconto de 15%.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double salarioMinimo, quilowattConsumido, valorQuilowatt, valorConsumo, desconto, valorConsumoDesconto;
		System.out.print("Por favor, insira o valor do sal�rio m�nimo: ");
		salarioMinimo = in.nextDouble();
		System.out.print("Por favor, insira a quantia de quilowatts consumidos: ");
		quilowattConsumido = in.nextDouble();
		valorQuilowatt = salarioMinimo / 5;
		valorConsumo = valorQuilowatt * quilowattConsumido;
		desconto = valorConsumo * 0.15;
		valorConsumoDesconto = valorConsumo - desconto;
		System.out.println("O valor pago por quilowatt �: R$"+valorQuilowatt+" reais.");
		System.out.println("O valor a ser pago pelo consumo na resid�ncia �: R$"+valorConsumo+" reais.");
		System.out.println("Considerando um desconto de 15%, o valor a ser pago na resid�ncia se torna R$"+valorConsumoDesconto+
				" reais.");
		in.close();
	}

}
