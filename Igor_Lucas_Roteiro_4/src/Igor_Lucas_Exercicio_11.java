//Faça um programa que carregue dois vetores de dez elementos e mostre um terceiro vetor resultante da
//intercalação desses dois vetores.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double vetor1[] = new double[10];
		
		double vetor2[] = new double[10];
		
//		int contador=0, verificador=0;
		
		System.out.println("Preenchendo o vetor 1.");
		
		for (int i=0; i<vetor1.length; i++) {
			System.out.print("Insira o "+(i+1)+"º termo do vetor 1: ");
			vetor1[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		System.out.println("Preenchendo o vetor 2.");
		
		for (int i=0; i<vetor2.length; i++ ) {
			System.out.print("Insira o "+(1+i)+"º termo do vetor 2: ");
			vetor2[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double vetor3[] = new double [20];
		
		for (int i=0; i<vetor3.length; i++) {
			if (i<10) {
				vetor3[i] = vetor1[i];
			} else {
				vetor3[i] = vetor2[i-10];
			}
		}
		
		double aux;
		
		for (int i=0; i<vetor3.length; i++) {
			for (int j=i+1; j<vetor3.length; j++) {
				if (vetor3[i] > vetor3[j]) {
					aux = vetor3[i];
					vetor3[i] = vetor3[j];
					vetor3[j] = aux;
				}
			}
		}
		
//		//verificar quantos termos iguais existem
//		
//		for (int i=0; i<vetor1.length; i++) {
//			for (int j=0; j<vetor2.length; j++) {
//				if (vetor1[i] == vetor2[j]) {
//					contador++;
//				}
//			}
//		}
//		
//		double vetor3[] = new double[20-contador];
//		
//		//reaproveitar variável contador para atribuir valores aos vetores depois
//		contador = 10;
//		
//		//colocando o vetor 1 no vetor 3
//		
//		for (int i=0; i<vetor1.length; i++) {
//			vetor3[i] = vetor1[i];
//		}
//		
//		//comparando vetor 1 com o 2 e colocando os termos diferentes no vetor 3
//		
//		for (int i=0; i<vetor2.length; i++) {
//			for (int j=0; j<vetor1.length; j++) {
//				if (vetor2[i] == vetor1[j]) {
//					verificador = 1;
//				}
//			}
//			
//			if (verificador != 1) {
//				vetor3[i+contador] = vetor2[i];
//			} else {
//				contador--;
//			}
//			
//			verificador = 0;
//		}
		
		System.out.println("Vetor 1:");
		
		for (double v : vetor1) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor 2:");
		
		for (double v : vetor2) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor 3:");
		
		for (double v : vetor3) {
			System.out.print(v+" ");
		}
		
		sc.close();
	}

}
