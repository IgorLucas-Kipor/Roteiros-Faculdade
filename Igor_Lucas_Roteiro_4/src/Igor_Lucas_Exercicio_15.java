//Fa�a um programa que carregue um vetor de 5 posi��es, calcule e mostre o somat�rio e o produt�rio
//do mesmo.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor[] = new int[5];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Insira o "+(1+i)+"� elemento do vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		int somatorio=0, produtorio=1;
		
		for (int i=0; i<vetor.length; i++) {
			somatorio += vetor[i];
			produtorio *= vetor[i];
		}
		
		System.out.println();
		System.out.println();
		System.out.println("Vetor:");
		
		for (int v : vetor) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println("Somat�rio: "+somatorio);
		System.out.println();
		System.out.println("Produt�rio: "+produtorio);
		
		sc.close();

	}

}
