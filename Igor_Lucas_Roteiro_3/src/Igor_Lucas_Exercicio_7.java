//Faça um algoritmo que imprima a soma da sequência apresentada: H = 1/1 + 1/2 + 1/3 + ... + 1/N. O
//valor de N deve ser positivo e fornecido pelo usuário.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor de n (lembrando que n deve ser positivo): ");
		int n = sc.nextInt();
		
		double soma = 0;
		
		if (n < 0) {
			System.err.println("N deve ser positivo.");
			System.exit(0);
		}
		
		for (double i = 1; i <= n; i++) {
			soma = soma + (1/i);
		}
		
		System.out.printf("O valor total da soma é %.4f.%n", soma);
		
		sc.close();

	}

}
