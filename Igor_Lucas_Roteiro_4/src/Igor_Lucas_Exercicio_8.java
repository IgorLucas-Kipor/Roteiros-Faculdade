import java.util.Scanner;

//Construa um programa JAVA que preenche dois vetores reais de 10 posições, depois crie um terceiro
//vetor cujo conteúdo de cada posição é: 1, se o número armazenado em uma posição do vetor é o
//mesmo armazenado na posição respectiva do 2o, e 0, caso contrário.

public class Igor_Lucas_Exercicio_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double vetor1[] = new double[10];
		
		double vetor2[] = new double[10];
		                      
		int vetor3[] = new int[10];
		
		System.out.println("Preencha 10 valores para o vetor 1:");

		for (int i=0; i<vetor1.length; i++) {
			vetor1[i] = sc.nextDouble();
		}
		
		System.out.println("Preencha 10 valores para o vetor 2:");
		
		for (int i=0; i<vetor2.length; i++) {
			vetor2[i] = sc.nextDouble();
		}
		
		for (int i=0; i<vetor3.length; i++) {
			if (vetor1[i] == vetor2[i]) {
				vetor3[i] = 1;
			} else {
				vetor3[i] = 0;
			}
		}
		
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println();
		System.out.println("Vetor 1:");
		for (double v : vetor1) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println("Vetor 2:");
		for (double v : vetor2) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println("Vetor 3:");
		for (int v : vetor3) {
			System.out.print(v+" ");
		}
		
		
		sc.close();

	}

}
