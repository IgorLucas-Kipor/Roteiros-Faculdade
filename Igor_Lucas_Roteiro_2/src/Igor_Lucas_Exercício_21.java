//Implemente um programa que receba um número inteiro positivo representando um ano qualquer e
//imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0
//ou ano % 400 == 0)).

import java.util.Scanner;
public class Igor_Lucas_Exercício_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um ano: ");
		int ano = sc.nextInt();
		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			System.out.println("Ano inserido é bissexto.");
		} else {
			System.out.println("Ano inserido não é bissexto.");
		}
		sc.close();
	}

}
