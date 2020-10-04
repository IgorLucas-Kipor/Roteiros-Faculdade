//O custo de um carro novo ao consumidor � a soma do custo de f�brica, a porcentagem do distribuidor e os
//impostos. O valor pago pela distribui��o e dos impostos � calculado com base no custo de f�brica. As
//porcentagens est�o apresentadas na tabela abaixo. Fa�a um programa que receba o custo de f�brica de um
//carro e mostre o custo ao consumidor

import java.util.Scanner;
public class Igor_Lucas_Exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o custo de f�brica do carro: ");
		double custoFabrica = sc.nextDouble();
		double imposto=0, distribuidor=0, custoConsumidor;
		if (custoFabrica <= 28000) {
			distribuidor = custoFabrica * 0.05;
		} else if (custoFabrica > 28000 && custoFabrica <= 45000) {
			distribuidor = custoFabrica * 0.1;
			imposto = custoFabrica * 0.15;
		} else if (custoFabrica > 45000) {
			distribuidor = custoFabrica * 0.15;
			imposto = custoFabrica * 0.2;
		}
		
		custoConsumidor = custoFabrica + distribuidor + imposto;
		System.out.printf("O custo que o consumidor tem que pagar por esse carro � R$%.2f.%n", custoConsumidor);
		sc.close();
	}

}
