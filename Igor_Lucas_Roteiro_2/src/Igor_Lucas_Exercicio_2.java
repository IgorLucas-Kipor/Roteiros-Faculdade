//Fa�a um algoritmo que dado um n�mero digitado pelo usu�rio mostre se o mesmo � par ou �mpar.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		double numero = sc.nextDouble();
		if (numero % 2 == 0) {
			System.out.println("O n�mero inserido � par.");
	} else {
		System.out.println("O n�mero inserido � �mpar.");
	}
		sc.close();
	}
}
