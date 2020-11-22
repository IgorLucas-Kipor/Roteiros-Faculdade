//Diz-se que um número inteiro é um número irmão par se a soma de todos
//os seus divisores resulta em um número par. Caso contrário, o número é dito irmão ímpar. Por
//exemplo, 8 é um número irmão ímpar porque os divisores de 8 são 1, 2, 4 e 8 que quando
//somados resultam no número 15. Já o 7 é um número irmão par, pois seus divisores são 1 e 7
//que quando somado resulta no número 8. Implemente um algoritmo que determine se o um
//número digitado pelo usuário é um número irmão par ou irmão ímpar.

import java.util.Scanner;
public class IgorLucas3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		
		int n = sc.nextInt();
		
		int somatorio = 0;
		
		if (n > 0) {
			for (int i=1; i<= n; i++) {
				if (n % i == 0) {
					somatorio += i;
				}
			}
		} else if (n < 0) {
			for (int i=-1; i>=n; i--) {
				if (n % i == 0) {
					somatorio += i;
				}
			}
		}
		
		if (somatorio % 2 == 0) {
			System.out.println(n+" é um número irmão par.");
		} else {
			System.out.println(n+" é um número irmão ímpar.");
		}
		
		sc.close();
	}

}
