//Faça um programa que identifique se um número digitado pelo usuário é positivo, negativo ou zero.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um número: ");
		double numero = sc.nextDouble();
		if (numero > 0) {
			System.out.println("O número digitado é positivo.");
		} else if (numero < 0) {
			System.out.println("O número digitado é negativo.");
		} else {
			System.out.println("O número digitado é zero.");
		}
		
		sc.close();

	}

}
