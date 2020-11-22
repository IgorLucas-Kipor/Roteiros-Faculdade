//Entrada
//A primeira linha cont�m dois inteiros F e R, indicando respectivamente o comprimento da fita de papel, em
//n�meros de posi��es, e o n�mero de gotas no in�cio do experimento. A segunda linha cont�m R inteiros,
//indicando as posi��es das gotas de reagente, que s�o dadas em ordem crescente.
//Sa�da
//Seu programa deve produzir uma �nica linha, contendo um �nico inteiro, o n�mero de dias necess�rios
//para que a fita de papel fique totalmente tomada pelo reagente.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o comprimento da fita e o n�mero de gotas no in�cio do experimento: ");
		
		int f = sc.nextInt();
		int r = sc.nextInt();
		
		while (f <= 0) {
			System.out.print("O comprimento deve ser um valor maior do que 0. Favor inserir um valor v�lido: ");
			f = sc.nextInt();
		}
		
		while (r < 0) {
			System.out.print("O n�mero de gotas deve ser maior ou igual a 0. Favor inserir um valor v�lido: ");
			r = sc.nextInt();
		}
		
		int fita[] = new int[f];
		
		int somatorio = 0;
		
		//colocando as gotas na fita
		
		System.out.println("Insira as posi��es da vida na qual ser�o colocadas as gotas: ");
		for (int i=0; i<r; i++) {
			fita[sc.nextInt()] = 1;
		}
		
		int dias = 0;
		//fazendo a propaga��o
		
		while (somatorio != fita.length) {
			for (int i=0; i<fita.length; i++) {
				if (fita[i] == 1 && i != 0) {
					fita[i-1] = 1;
				}
				
				if (fita[i] == 1 && i != fita.length - 1) {
					fita[i+1] = 1;
				}
				
				somatorio += fita[i];
			}
			
			if (somatorio != fita.length) {
				somatorio = 0;
			}
			
			dias++;
		}
		
		System.out.println();
		
		System.out.println("Dias para a fita ser tomada completamente pelo reagente: "+dias);
		sc.close();

	}

}
