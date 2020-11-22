//Fa�a um programa que calcule e imprima o fatorial do valor N. O valor de N ser� fornecido de entrada
//pelo usu�rio. O fatorial de um n�mero positivo N qualquer (representado por N!) � o produto de todos os
//inteiros positivos menores ou iguais � N, ou seja, Fatorial (N) = 1 * 2 * 3 * ... * N. Por exemplo, o
//fatorial de 5 = 1*2*3*4*5 = 120.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor N: ");
		
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.err.println("N deve ser inteiro e maior do que 0.");
			System.exit(0);
		}
		
		int fatorial = 1;
		
		for (int i = 1; i <= n; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println("O fatorial de "+n+" � "+fatorial+".");
		
		sc.close();

	}

}
