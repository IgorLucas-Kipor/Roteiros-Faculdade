//Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do salário mínimo. Faça um
//algoritmo que receba o valor atual do salário mínimo e a quantidade de quilowatt consumida em uma
//residência, calcule e mostre:
//a. O valor pago por quilowatt;
//b. O valor a ser pago pelo consumo nessa residência;
//c. O valor a ser pago considerando um desconto de 15%.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_18 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double salarioMinimo, quilowattConsumido, valorQuilowatt, valorConsumo, desconto, valorConsumoDesconto;
		System.out.print("Por favor, insira o valor do salário mínimo: ");
		salarioMinimo = in.nextDouble();
		System.out.print("Por favor, insira a quantia de quilowatts consumidos: ");
		quilowattConsumido = in.nextDouble();
		valorQuilowatt = salarioMinimo / 5;
		valorConsumo = valorQuilowatt * quilowattConsumido;
		desconto = valorConsumo * 0.15;
		valorConsumoDesconto = valorConsumo - desconto;
		System.out.println("O valor pago por quilowatt é: R$"+valorQuilowatt+" reais.");
		System.out.println("O valor a ser pago pelo consumo na residência é: R$"+valorConsumo+" reais.");
		System.out.println("Considerando um desconto de 15%, o valor a ser pago na residência se torna R$"+valorConsumoDesconto+
				" reais.");
		in.close();
	}

}
