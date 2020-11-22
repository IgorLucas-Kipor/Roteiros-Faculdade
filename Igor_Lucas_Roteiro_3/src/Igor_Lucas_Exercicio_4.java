//Escreva um algoritmo que receba números do usuário e imprima o triplo de cada número. O algoritmo
//deve encerrar ao ser digitado o número –999. Obs.: O triplo de -999 não deve ser exibido.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor=0, triplo;
		do {
		System.out.print("Insira o valor cujo qual você deseja o triplo (insira -999 para encerrar o laço): ");
		valor = sc.nextDouble();
		if (valor != -999) {
			triplo = valor * 3;
			System.out.println("O triplo de "+valor+" é "+triplo+".");
		}
	} while (valor != -999);
		sc.close();
}
}
