//Fa�a um algoritmo para identificar se um determinado n�mero fornecido pelo usu�rio � primo ou n�o.
//Lembrando que um n�mero primo s� � divis�vel por 1 e por ele mesmo, ou seja, possui somente 2
//divisores. Exemplos: 2, 5, 7, etc.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.err.println("O n�mero inserido deve ser maior do que 0.");
			System.exit(0);
		}
		
		for (int i = 1; i <= n; i++) {
			if ( (i != 1 && i != n) && n % i == 0) {
				System.out.println("O n�mero inserido n�o � primo.");
				System.exit(0);
			}
		}
		
		System.out.println("O n�mero inserido � primo.");
		
		sc.close();

	}

}
