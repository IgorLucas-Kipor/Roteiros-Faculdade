//Faça um algoritmo que dado um número digitado pelo usuário mostre se o mesmo é par ou ímpar.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();
		if (numero % 2 == 0) {
			System.out.println("O número inserido é par.");
	} else {
		System.out.println("O número inserido é ímpar.");
	}
		sc.close();
	}
}
