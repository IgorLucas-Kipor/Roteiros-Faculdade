//Faça um programa que preencha um vetor com 10 números digitados pelo usuário e em seguida crie e
//mostre um vetor ordenado de forma crescente e outro vetor ordenado de forma decrescente.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor1[] = new int[10];
		int aux;
		
		//preenchendo o vetor1
		
		for (int i = 0; i< vetor1.length; i++) {
			System.out.print("Insira o "+(1+i)+"º termo do vetor 1: ");
			vetor1[i] = sc.nextInt();
		}
		
		int vetor2[] = new int[10];
		int vetor3[] = new int[10];
		
		//colocando vetor1 em vetor2 e 3
		
		for (int i = 0; i< vetor1.length; i++) {
			vetor2[i] = vetor1[i];
			vetor3[i] = vetor1[i];
		}
		
		//organizando vetor2
		
		for (int i=0; i<vetor2.length; i++) {
			for (int j=i+1; j<vetor2.length; j++) {
				if (vetor2[i] > vetor2[j]) {
					aux = vetor2[i];
					vetor2[i] = vetor2[j];
					vetor2[j] = aux;
				}
			}
		}
		
		//organizando vetor3
		
		for (int i=0; i<vetor3.length; i++) {
			for (int j=i+1; j<vetor3.length; j++) {
				if (vetor3[i] < vetor3[j]) {
					aux = vetor3[i];
					vetor3[i] = vetor3[j];
					vetor3[j] = aux;
				}
			}
		}
		
		//imprimindo
		System.out.println();
		
		System.out.println("Vetor 1:");
		
		for (int v : vetor1) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor 2:");
		
		for (int v : vetor2) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor 3:");
		
		for (int v : vetor3) {
			System.out.print(v+" ");
		}
		
		sc.close();
	}

}
