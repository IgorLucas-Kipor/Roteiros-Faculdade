//Fa�a um algoritmo que imprima a soma da sequ�ncia apresentada: H = 1 - 1/2 + 1/3 � 1/4 + 1/5... 1/N. O
//valor de N deve ser positivo e fornecido pelo usu�rio.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de n (n deve ser positivo): ");
		
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.err.println("N deve ser positivo.");
			System.exit(0);
		}
		
		double resultado = 0;
		
		for (double i=1; i <= n; i++) {
			if (i%2 == 0) {
				resultado = resultado - (1/i);
			} else if (i%2 != 0) {
				resultado = resultado + (1/i);
			}
		}
		
		System.out.printf("O resultado desse somat�rio � %.4f.%n", resultado);
		
		sc.close();

	}

}
