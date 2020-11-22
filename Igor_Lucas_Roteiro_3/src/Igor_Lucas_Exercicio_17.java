//Escreva um algoritmo que calcule o m.d.c. (máximo divisor comum) entre A e B (número inteiros e
//positivos). Esses dois valores são passados pelo usuário através do teclado. Utilize a lógica do algoritmo
//de Euclides.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		int A = sc.nextInt();
		
		if (A < 0) {
			System.err.println("A não pode ser negativo.");
			System.exit(0);
		}
		
		System.out.print("Insira o valor de B: ");
		int B = sc.nextInt();
		
		if (B < 0) {
			System.err.println("B não pode ser negativo.");
			System.exit(0);
		}
		
		int mdc = 0, resto = 0, quociente = 0, auxA = A, auxB = B;
		
		do {
			if (A != 0 && B !=0) {
				quociente = A/B;
				resto = A%B;
				if (A == B*quociente+resto) {
					A = B;
					B = resto;
				} else {
					System.err.println("Erro inesperado.");
					System.exit(1);
				}
			}
			
			if (A == 0) {
				mdc = B;
			}
			else if (B == 0){
				mdc = A;
			}
		} while (A != 0 && B != 0);

		System.out.println("O mdc de "+auxA+" e "+auxB+" é igual a: "+mdc);
		
		sc.close();
	}

}
