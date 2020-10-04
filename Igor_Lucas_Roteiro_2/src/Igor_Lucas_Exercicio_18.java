//Implemente um programa que receba um n�mero inteiro de 3 d�gitos de entrada. Ap�s isso, verifique se o
//mesmo � pal�ndromo, ou seja, � o mesmo n�mero lido da direita para esquerda ou vice-versa. Ex.: 121,
//353, etc. N�o � permitido a utiliza��o de fun��es prontas do JAVA, tal como o m�todo reverse.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um n�mero de tr�s d�gitos: ");
		int numero = sc.nextInt();
		int aux, digito1, digito2, digito3;
		digito1 = numero / 100; //pega o d�gito mais a esquerda
		aux = numero % 100; //armazena os dois d�gitos da direita
		digito2 = numero / 10; //pega o d�gito da esquerda
		aux = numero % 10; //armazena o d�gito da direita
		digito3 = aux; //passa o d�gito armazenado para a vari�vel digito3
		
		if (digito1 == digito3) {
			System.out.println("N�mero inserido � pal�ndrono");
		} else {
			System.out.println("N�mero inserido n�o � pal�ndrono.");
		}
		sc.close();
	}

}
