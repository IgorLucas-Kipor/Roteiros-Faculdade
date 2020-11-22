import java.util.Scanner;

//Faça um programa em JAVA que carregue em um vetor os N primeiros valores da serie de Fibonacci.
//Fibonacci = [1, 1, 2, 3, 5, 8, 13, 21, ....].
public class Igor_Lucas_Exercicio_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos termos da série Fibonacci você deseja calcular: ");
		
		int n = sc.nextInt();
		
		int serie[] = new int[n];
		
		int anterior = 0;
		
		for (int i=0; i<serie.length; i++) {
			if (i==0) {
				serie[i] = 1;
			} else {
				serie[i] = serie[i-1] + anterior;
				anterior = serie[i-1];
			}
			
			System.out.print(serie[i]+" ");
		}
		
		
		sc.close();

	}

}
