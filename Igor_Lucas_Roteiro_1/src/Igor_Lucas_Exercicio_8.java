//Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
//sabendo o valor médio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a área
//total e o valor médio de venda (R$) que Zé Borba Gato pode pedir pelo terreno.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double baseMenor, baseMaior, altura, valorMedio, area, valorMedioVenda;
		System.out.print("Insira o valor da base menor em metros: ");
		baseMenor = in.nextDouble();
		System.out.print("Insira o valor da base maior em metros: ");
		baseMaior = in.nextDouble();
		System.out.print("Insira o valor da altura em metros: ");
		altura = in.nextDouble();
		System.out.print("Insira o valor medio pago por metro quadrado em reais: ");
		valorMedio = in.nextDouble();
		area = ((baseMaior+baseMenor)/2) * altura;
		valorMedioVenda = area * valorMedio;
		System.out.println("Ze Borba Gato pode pedir um total de R$"+valorMedioVenda+
				" por esse lote, com base na sua area de "+area+"m² e no valor medio pago por metro quadrado no local.");
		in.close();
	}

}
