//Faça um algoritmo para identificar se um determinado número fornecido pelo usuário é primo ou não.
//Lembrando que um número primo só é divisível por 1 e por ele mesmo, ou seja, possui somente 2
//divisores. Exemplos: 2, 5, 7, etc.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.err.println("O número inserido deve ser maior do que 0.");
			System.exit(0);
		}
		
		for (int i = 1; i <= n; i++) {
			if ( (i != 1 && i != n) && n % i == 0) {
				System.out.println("O número inserido não é primo.");
				System.exit(0);
			}
		}
		
		System.out.println("O número inserido é primo.");
		
		sc.close();

	}

}
