//Fa�a um programa em JAVA que gere um vetor com 10 posi��es onde cada elemento coresponde ao
//quadrado de sua posi��o. Imprima o vetor resultante.
public class Igor_Lucas_Exercicio_4 {

	public static void main(String[] args) {
		
		double vetor[] = new double[10];
		
		System.out.println("Vetor:");
		for (int i = 0; i<vetor.length; i++) {
			vetor[i] = Math.pow((i+1), 2);
			System.out.printf("%.0f ", vetor[i]);
		}

	}

}
