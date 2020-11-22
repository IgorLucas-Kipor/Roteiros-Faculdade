//Implemente um programa que receba de entrada um número inteiro qualquer, após isso verifique se o
//número inserido é ou não um PALÍNDROMO, ou seja, o número é o mesmo tanto de visto da direita para
//esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. Não utilize funções pré-definidas
//no JAVA.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		
		int numero = sc.nextInt();
		int rev = 0, aux=numero;
		
		while (numero != 0) {
			rev = (rev*10) + (numero % 10);
			numero /= 10;
		}
		
		if (aux == rev) {
			System.out.println("Número inserido é palídromo.");
		} else {
			System.out.println("Número inserido não é palídromo.");
		}
		
		sc.close();

	}

}
