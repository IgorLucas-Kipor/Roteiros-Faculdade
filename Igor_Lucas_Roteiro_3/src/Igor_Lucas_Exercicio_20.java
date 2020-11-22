//Construa um algoritmo para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo
//usuário. Ao final o algoritmo deve mostrar estas duas médias bem como o maior número PAR e o menor
//número ÍMPAR digitado. O algoritmo finaliza quando o usuário digitar um valor negativo.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par = 0, impar = 0, numero=0;
		
		double somaPar=0, somaImpar=0, mediaPar=0, mediaImpar=0;
		
		do {
			System.out.print("Insira um número: ");
			
			numero = sc.nextInt();
			if (numero >= 0) {
			if (numero % 2 == 0) {
				somaPar += numero;
				par++;
			} else if (numero % 2 != 0) {
				somaImpar += numero;
				impar++;
			}
		}
		} while (numero >= 0);
		
		mediaPar = somaPar/par;
		mediaImpar = somaImpar/impar;
		
		System.out.println("Foram digitados "+par+" números pares, com sua média sendo "+mediaPar+".");
		System.out.println("Foram digitados "+impar+" números ímpares, com sua média sendo "+mediaImpar+".");

		sc.close();
	}

}
