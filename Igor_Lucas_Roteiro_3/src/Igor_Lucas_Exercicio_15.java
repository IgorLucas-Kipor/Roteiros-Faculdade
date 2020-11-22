//Faça um programa em JAVA que imprima os N primeiros termos da serie de Fibonacci. Sabe-se que N é
//fornecido pelo usuário. Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, ...

import java.util.Scanner;
public class Igor_Lucas_Exercicio_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos termos da serie Fibonacci devem ser impressos: ");
		
		int n = sc.nextInt();
		
		int termoAnterior=0, termoAtual=0;
		
		System.out.println(n+" primeiros termos da serie Fibonacci:");
		for (int i=0; i<n; i++) {
			if (i==0) {
				termoAtual = 1;
			} else if (i>0) {
				int aux = termoAtual;
				termoAtual += termoAnterior;
				termoAnterior = aux;
			}
			System.out.println(termoAtual);
		}
		sc.close();
	}

}
