//Diz-se que um n�mero inteiro � um n�mero irm�o par se a soma de todos
//os seus divisores resulta em um n�mero par. Caso contr�rio, o n�mero � dito irm�o �mpar. Por
//exemplo, 8 � um n�mero irm�o �mpar porque os divisores de 8 s�o 1, 2, 4 e 8 que quando
//somados resultam no n�mero 15. J� o 7 � um n�mero irm�o par, pois seus divisores s�o 1 e 7
//que quando somado resulta no n�mero 8. Implemente um algoritmo que determine se o um
//n�mero digitado pelo usu�rio � um n�mero irm�o par ou irm�o �mpar.

import java.util.Scanner;
public class IgorLucas3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		
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
			System.out.println(n+" � um n�mero irm�o par.");
		} else {
			System.out.println(n+" � um n�mero irm�o �mpar.");
		}
		
		sc.close();
	}

}
