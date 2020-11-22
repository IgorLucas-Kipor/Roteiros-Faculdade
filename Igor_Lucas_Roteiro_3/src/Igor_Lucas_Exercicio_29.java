//Suponha que JAVA possua somente as opera��es de soma e subtra��o. Dados dois n�meros inteiros
//positivos A e B, determine o quociente e o resto da divis�o de A por B.

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
		
		System.out.println("O quociente da divis�o de "+a+" por "+b+" �: "+divisao);
		System.out.println("O resto da divis�o de "+a+" por "+b+" �: "+a);
		
		
		
		sc.close();
	}

}
