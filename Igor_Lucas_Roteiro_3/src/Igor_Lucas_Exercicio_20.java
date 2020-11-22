//Construa um algoritmo para calcular a m�dia de valores PARES e �MPARES, que ser�o digitados pelo
//usu�rio. Ao final o algoritmo deve mostrar estas duas m�dias bem como o maior n�mero PAR e o menor
//n�mero �MPAR digitado. O algoritmo finaliza quando o usu�rio digitar um valor negativo.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int par = 0, impar = 0, numero=0;
		
		double somaPar=0, somaImpar=0, mediaPar=0, mediaImpar=0;
		
		do {
			System.out.print("Insira um n�mero: ");
			
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
		
		System.out.println("Foram digitados "+par+" n�meros pares, com sua m�dia sendo "+mediaPar+".");
		System.out.println("Foram digitados "+impar+" n�meros �mpares, com sua m�dia sendo "+mediaImpar+".");

		sc.close();
	}

}
