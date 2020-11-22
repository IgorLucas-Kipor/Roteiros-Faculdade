//Implemente um programa que receba de entrada um n�mero inteiro qualquer, ap�s isso verifique se o
//n�mero inserido � ou n�o um PAL�NDROMO, ou seja, o n�mero � o mesmo tanto de visto da direita para
//esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. N�o utilize fun��es pr�-definidas
//no JAVA.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		
		int numero = sc.nextInt();
		int rev = 0, aux=numero;
		
		while (numero != 0) {
			rev = (rev*10) + (numero % 10);
			numero /= 10;
		}
		
		if (aux == rev) {
			System.out.println("N�mero inserido � pal�dromo.");
		} else {
			System.out.println("N�mero inserido n�o � pal�dromo.");
		}
		
		sc.close();

	}

}
