//Escreva um algoritmo que receba n�meros do usu�rio e imprima o triplo de cada n�mero. O algoritmo
//deve encerrar ao ser digitado o n�mero �999. Obs.: O triplo de -999 n�o deve ser exibido.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valor=0, triplo;
		do {
		System.out.print("Insira o valor cujo qual voc� deseja o triplo (insira -999 para encerrar o la�o): ");
		valor = sc.nextDouble();
		if (valor != -999) {
			triplo = valor * 3;
			System.out.println("O triplo de "+valor+" � "+triplo+".");
		}
	} while (valor != -999);
		sc.close();
}
}
