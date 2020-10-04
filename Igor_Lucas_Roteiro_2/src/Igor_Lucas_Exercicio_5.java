//O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
//impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
//porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
//carro e mostre o custo ao consumidor

import java.util.Scanner;
public class Igor_Lucas_Exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o custo de fábrica do carro: ");
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
		System.out.printf("O custo que o consumidor tem que pagar por esse carro é R$%.2f.%n", custoConsumidor);
		sc.close();
	}

}
