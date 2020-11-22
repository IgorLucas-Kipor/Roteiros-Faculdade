//Fa�a um programa que calcule e imprima a soma e a m�dia dos N primeiros n�meros positivos. Soma = 1
//+ 2 + 3 + ... + N

import java.util.Scanner;
public class Igor_Lucas_Exercicio_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira at� qual n�mero positivo a soma deve ir: ");
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.err.println("O n�mero deve ser positivo.");
			System.exit(0);
		}
		
		int soma=0;
		
		for (int i = 1; i <= n; i++) {
			soma = soma + i;
		}
		
		System.out.println("O resultado da soma �: "+soma+".");
		sc.close();
	}

}
