//Suponha que JAVA possua somente as operações de soma e subtração. Dados dois números inteiros
//positivos A e B, determine o quociente e o resto da divisão de A por B.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int divisao = 0;
				
		System.out.print("Insira o valor de A: ");
		int a = sc.nextInt();

		
		if (a <= 0) {
			System.err.println("A deve ser positivo.");
			System.exit(0);
		}

		System.out.print("Insira o valor de B: ");
		int b = sc.nextInt();
		
		if (b <= 0) {
			System.err.println("B deve ser positivo.");
			System.exit(0);
		}
		
		if (b <= a) {
			while (a >= b) {
				a -= b;
				divisao++;
			}
					}
		
		System.out.println("O quociente da divisão de "+a+" por "+b+" é: "+divisao);
		System.out.println("O resto da divisão de "+a+" por "+b+" é: "+a);
		
		
		
		sc.close();
	}

}
