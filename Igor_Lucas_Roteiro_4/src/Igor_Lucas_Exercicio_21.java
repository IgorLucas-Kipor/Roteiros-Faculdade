//Entrada
//A primeira linha da entrada cont�m um inteiro N, representando o tamanho da sequ�ncia. A segunda linha
//cont�m N inteiros Ai, 1 <=1 i <= N, representando a sequ�ncia de alturas da montanha.
//Sa�da
//Seu programa deve imprimir uma linha contendo o caractere �S� se h� mais de um pico, ou o caractere �N� se
//h� apenas um pico.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o tamanho da sequ�ncia: ");
		
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.print("O tamanho deve ser maior do que 0. Por favor, insira um valor v�lido: ");
			n = sc.nextInt();
		}
		
		int sequencia[] = new int[n];
		
		System.out.println("Insira a sequ�ncia: ");
		
		for (int i=0; i<sequencia.length; i++) {
			sequencia[i] = sc.nextInt();
		}
		
		//verificando
		
		boolean maisDeUmPico = false;
		
		for (int i=0; i<sequencia.length; i++) {
			if (i>0 && i<sequencia.length-1 && sequencia[i] < sequencia[i+1] && sequencia[i] < sequencia[i-1]) {
				maisDeUmPico = true;
			}
		}
		
		System.out.println();
		
		System.out.println("H� mais de um pico nessa montanha?");
		
		if (maisDeUmPico == false) {
			System.out.println("N");
		} else {
			System.out.println("S");
		}
		
		sc.close();
	}

}
