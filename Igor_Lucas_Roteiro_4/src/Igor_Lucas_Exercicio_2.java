import java.util.Scanner;

//Faça um programa que solicite o preenchimento de um vetor com 10 posições chamado
//VetorOriginal. Em seguida, o programa deve armazenar os números digitados de maneira invertida
//em vetor chamado VetorInvertido.
public class Igor_Lucas_Exercicio_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int vetorOriginal[] = new int[10];
		int vetorInvertido[] = new int[10];
		int aux = 9;
		
		for (int i=0; i<vetorOriginal.length; i++) {
			System.out.print("Insira o "+(i+1)+"º dígito do vetor: ");
			vetorOriginal[i] = sc.nextInt();
			vetorInvertido[aux] = vetorOriginal[i];
			aux--;
		}
		
		System.out.println("Vetor Original:");
		
		for (int i=0; i<vetorOriginal.length; i++) {
			System.out.print(vetorOriginal[i]+" ");
		}
		System.out.println();
		
		System.out.println("Vetor Invertido:");
		for (int i=0; i<vetorInvertido.length; i++) {
			System.out.print(vetorInvertido[i]+" ");
		}
		
		
		
		sc.close();

	}

}
