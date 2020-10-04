//Faça um programa que recebe de entrada o código de um produto e a quantidade comprada do mesmo.
//Calcule e mostre:
//a) O preço unitário do produto, segundo Tabela I
//b) Preço total da nota
//c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
//d) Preço final ao consumidor após desconto
//e) Não se esqueça de verificar a existência do produto

import java.util.Scanner;
public class Igor_Lucas_Exercicio_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o código do produto: ");
		int codigo = sc.nextInt();
		System.out.print("Insira a quantia comprada do produto: ");
		int quantia = sc.nextInt();
		double valorUnitario=0;
		
		if (codigo >= 1 && codigo <= 10) {
			valorUnitario = 10;
		} else if (codigo >= 11 && codigo <= 20) {
			valorUnitario = 20;
		} else if (codigo >= 21 && codigo <= 30) {
			valorUnitario = 30;
		} else if (codigo >= 31 && codigo <= 40) {
			valorUnitario = 40;
		} else {
			System.err.println("Código não existente.");
			System.exit(1);
		}
		
		System.out.printf("Valor unitário do produto: %.2f.%n", valorUnitario);
		double valorTotal = valorUnitario * quantia;
		System.out.printf("Valor total da nota: %.2f.%n", valorTotal);
		double valorFinal = 0;
		
		if (valorTotal <= 250) {
			System.out.println("Desconto a ser aplicado: 5%.");
			valorFinal = valorTotal * 0.95;
		} else if (valorTotal > 250 && valorTotal <= 500) {
			System.out.println("Desconto a ser aplicado: 10%.");
			valorFinal = valorTotal * 0.9;
		} else if (valorTotal > 500) {
			System.out.println("Desconto a ser aplicado: 15%.");
			valorFinal = valorTotal * 0.85;
		}
		
		System.out.printf("Valor final da nota com desconto: %.2f.%n", valorFinal);
		sc.close();
	}

}
