//Implemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o
//mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121,
//353, etc. Não é permitido a utilização de funções prontas do JAVA, tal como o método reverse.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um número de três dígitos: ");
		int numero = sc.nextInt();
		int aux, digito1, digito2, digito3;
		digito1 = numero / 100; //pega o dígito mais a esquerda
		aux = numero % 100; //armazena os dois dígitos da direita
		digito2 = numero / 10; //pega o dígito da esquerda
		aux = numero % 10; //armazena o dígito da direita
		digito3 = aux; //passa o dígito armazenado para a variável digito3
		
		if (digito1 == digito3) {
			System.out.println("Número inserido é palíndrono");
		} else {
			System.out.println("Número inserido não é palíndrono.");
		}
		sc.close();
	}

}
