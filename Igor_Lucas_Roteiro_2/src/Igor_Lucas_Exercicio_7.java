//Fa�a um programa que solicite ao usu�rio que digite um caracter e em seguida imprima se o caracter
//digitado � ou n�o uma vogal.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um caracter: ");
		char caracter = sc.next().charAt(0);
		if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
			System.out.println("Caracter inserido � uma vogal.");
		} else {
			System.out.println("Caracter inserido n�o � uma vogal.");
		}
		sc.close();
	}

}
