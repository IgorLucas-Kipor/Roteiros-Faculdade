//Faça um algoritmo em JAVA que preencha dois vetores de 10 posições e exiba um terceiro vetor
//resultante em que cada posição é a soma das posições dos outros vetores. Exemplo
//vet1 = [10 27 3 -4 -6 -19 6 9 14 53 ]
//vet2 = [ 0 -7 6 4 -5 15 -6 19 1 47 ]
//vet3 = [10 20 9 0 -11 -4 0 28 15 100 ]
		
import java.util.Scanner;
public class Igor_Lucas_Exercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetor1[] = new int[10];
		
		int vetor2[] = new int[10];
		
		for (int i=0; i<vetor1.length; i++) {
			System.out.print("Insira o "+(1+i)+"º elemento do vetor 1: ");
			vetor1[i] = sc.nextInt();
		}
		
		for (int i=0; i<vetor2.length; i++) {
			System.out.print("Insira o "+(1+i)+"º elemento do vetor 2: ");
			vetor2[i] = sc.nextInt();
		}
		
		int vetor3[] = new int [10];
		
		for (int i=0; i<vetor3.length; i++) {
			vetor3[i] = vetor1[i] + vetor2[i];
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor 1:");
		
		for (int v: vetor1) {
			System.out.print(v+" ");
		}
		
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor 2:");
		
		for (int v: vetor2) {
			System.out.print(v+" ");
		}
		
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor 3:");
		
		for (int v: vetor3) {
			System.out.print(v+" ");
		}
		

		sc.close();

	}

}
