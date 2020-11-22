//Entrada
//A primeira linha da entrada contém um número natural N. A segunda linha contém N números naturais
//distintos de 1 a N, representando a ordem dos pregos na horizontal.
//Saída
//Seu programa deve escrever uma linha na saída, contendo o número de cruzamentos entre pares de
//linhas, conforme a descrição anterior.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de N: ");
		
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.print("N deve ser maior do que 0. Por favor, insira um valor válido: ");
			n = sc.nextInt();
		}
		
		int vertical[] = new int[n];
		int horizontal[] = new int[n];
		
		for (int i=0; i<vertical.length; i++) {
			vertical[i] = i+1;
		}
		
		//inserindo a ordem dos horizontais
		
		System.out.println("Insira a ordem dos termos horizontais: ");
		
		for (int i=0; i<horizontal.length; i++) {
			horizontal[i] = sc.nextInt();
		}
		
		int cruzamentos = 0;
		
		for (int i=0; i<vertical.length; i++) {
			for (int j=0; j<horizontal.length; j++) {
				if (vertical[i] == horizontal[j]) {
					int dif = 0;
					if (j < horizontal.length-1) {
						dif = i - j;
					} else if (j == horizontal.length-1){
						dif = vertical[i] - (j - 1);
					}
					
					if (dif < 0) {
						dif *= -1;
					}
					
					cruzamentos += dif;
				}
			}
		}
		
		System.out.println("Quantos cruzamentos tem entre as linhas? "+cruzamentos);
		
		sc.close();

	}

}
