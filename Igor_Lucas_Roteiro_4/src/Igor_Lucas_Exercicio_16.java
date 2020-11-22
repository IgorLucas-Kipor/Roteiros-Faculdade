//Escreva um algoritmo que leia preencha e mostre um vetor de 10 posições, cada posição é composta
//pelo fatorial da mesma.
//
//vet = [0 1 2 6 24 120 720 5040 40320 362880]
public class Igor_Lucas_Exercicio_16 {

	public static void main(String[] args) {


		int vetor[] = new int[10];
		
		for (int i=0; i<vetor.length; i++) {
				vetor[i] = 1;
				for (int j=1; j<=i; j++) {
					vetor[i] *= j;
				}
			}
		
		System.out.println("Vetor:");
		for (int v : vetor) {
			System.out.print(v+" ");
		}

	}

}
