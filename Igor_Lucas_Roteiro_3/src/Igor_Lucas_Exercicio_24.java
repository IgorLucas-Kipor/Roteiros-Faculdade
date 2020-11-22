//Uma Empresa de fornecimento de energia el�trica faz a leitura mensal dos medidores de consumo. Para
//cada consumidor, s�o digitados os seguintes dados:
//- N�mero do consumidor;
//- Quantidade de kWh consumidos durante o m�s;
//- Tipo (c�digo) do consumidor.
//1 � residencial, pre�o em reais por kWh = 0,3
//2 � comercial, pre�o em reais por kWh = 0,5
//3 � industrial, pre�o em reais por kWh = 0,7
//
//Os dados devem ser lidos at� que seja encontrado um consumidor com N�mero 0 (zero). Escreva um
//programa que calcule e imprima:
//- O custo total para cada consumidor;
//- O total de consumo para os tr�s tipos de consumidor;
//- A m�dia de consumo dos tipos 1 e 2.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0, codigo=0;
		double quantidadeKW = 0, consumo1=0, consumo2=0, consumo3=0, c1 = 0, c2 = 0, custo1=0, custo2=0, custo3=0;
		
		do {
			System.out.print("Insira o n�mero do consumidor: ");
			numero = sc.nextInt();
			System.out.print("Insira a quantidade de kWh consumidos nesse m�s: ");
			quantidadeKW = sc.nextDouble();
			System.out.print("Insira o c�digo do consumidor: ");
			codigo = sc.nextInt();
			if (numero != 0) {
				if (codigo == 1) {
					custo1 += (quantidadeKW * 0.3);
					consumo1 += quantidadeKW;
					c1++;
				} else if (codigo == 2) {
					custo2 += (quantidadeKW * 0.5);
					consumo2 += quantidadeKW;
					c2++;
				} else if (codigo == 3) {
					custo3 += (quantidadeKW * 0.7);
					consumo3 += quantidadeKW;
				} else {
					System.err.println("C�digo inv�lido.");
				}
			}
			} while (numero != 0);
		
		double media1 = consumo1 / c1;
		double media2 = consumo2 / c2;
		
		System.out.printf("O custo para cada consumidor foi de R$%.2f para o consumidores do c�digo 1, "
				+ "R$%.2f para consumidores do c�digo 2 e R$%.2f para consumidores do c�digo 3.%n", custo1, custo2, custo3);
		System.out.println("O total de consumo para cada consumidor foi de "+consumo1+" para os consumidores de c�digo 1, "
				+consumo2+" para os consumidores de c�digo 2 e "+consumo3+" para os consumidores de c�digo 3.");
		System.out.printf("A m�dia de consumo � de %.2f para os consumidores do c�digo 1 e %.2f para os consumidores do c�digo 2.", media1, media2);
		
		
		sc.close();
		
			}

	}

