//Implemente um programa que receba um n�mero inteiro positivo representando um ano qualquer e
//imprima se o ano � bissexto ou n�o. Um ano bissexto � definido quando: (ano % 4 = 0 e (ano % 100 != 0
//ou ano % 400 == 0)).

import java.util.Scanner;
public class Igor_Lucas_Exerc�cio_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um ano: ");
		int ano = sc.nextInt();
		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			System.out.println("Ano inserido � bissexto.");
		} else {
			System.out.println("Ano inserido n�o � bissexto.");
		}
		sc.close();
	}

}
