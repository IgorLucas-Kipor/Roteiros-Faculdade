//Faça um programa que deve solicitar números para o usuário até que seja digitado -1. Quando o usuário
//digitar -1, o programa termina e imprime a média de todos os números positivos digitados.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero = 0, soma = 0;
		int i=0;
		
		do {
			System.out.print("Digite um número: ");
			numero = sc.nextDouble();
			if (numero > -1) {
				soma += numero;
				i++;
			}
		} while (numero != -1);
		
		double media = soma / i;
		
		System.out.println("A média do somatório é: "+media);

		sc.close();
	}

}
