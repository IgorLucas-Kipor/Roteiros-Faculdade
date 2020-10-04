//Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
//digitado é ou não uma vogal.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um caracter: ");
		char caracter = sc.next().charAt(0);
		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
			System.out.println("Caracter inserido é uma vogal.");
		} else {
			System.out.println("Caracter inserido não é uma vogal.");
		}
		sc.close();
	}

}
