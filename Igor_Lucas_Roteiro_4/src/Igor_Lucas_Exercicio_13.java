//Intercalação é o processo utilizado para construir uma tabela ordenada, de tamanho n+m, a partir de
//duas tabelas já ordenadas de tamanhos n e m. Por exemplo, a partir das tabelas A = {1,3,6,7} e B =
//{2,4,5}, construímos a tabela C = {1,2,3,4,5,6,7}. Faça um algoritmo que:
//a. Leia NA, número de elementos do conjunto A (NA<=100);
//b. Leia, em seguida, os elementos do conjunto A;
//c. Leia, após o valor de NB, número de elementos do conjunto B(NB<=100);
//d. Leia, finalmente, os elementos do conjunto B;
//e. Crie e imprima um conjunto C, ordenado, de tamanho NA + NB, a partir dos conjuntos originais A e
//B.
//Obs: Considere os elementos de A e B como inteiros e já ordenados.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos elementos terá o conjunto A (<=100): ");
		
		int n = sc.nextInt();
		
		int na[] = new int[n];
		
		for (int i=0; i<na.length; i++) {
			System.out.print("Insira o "+(1+i)+"º elemento do conjunto A: ");
			na[i] = sc.nextInt();
		}
		
		System.out.print("Insira quantos elementos terá o conjunto B (<=100): ");
		
		n = sc.nextInt();
		
		int nb[] = new int[n];
		
		for (int i=0; i<nb.length; i++) {
			System.out.print("Insira o "+(1+i)+"º elemento do conjunto B: ");
			nb[i] = sc.nextInt();
		}
		
		int nc[] = new int[na.length+nb.length];
		
		int contadorA=0, contadorB=0;
		
		for (int i=0; i<nc.length; i++) {
			if (contadorA == na.length) {
				nc[i] = nb[contadorB];
				contadorB++;
			} else if (contadorB == nb.length) {
				nc[i] = na[contadorA];
				contadorA++;
			} else {
				if (na[contadorA] < nb[contadorB]) {
					nc[i] = na[contadorA];
					contadorA++;
				} else if (na[contadorA] > nb[contadorB]) {
					nc[i] = nb[contadorB];
					contadorB++;
				} else {
					nc[i] = na[contadorA];
					contadorA++;
					contadorB++;
				}
			}
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Conjunto A:");
		
		for (int v : na) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Conjunto B:");
		
		for (int v : nb) {
			System.out.print(v+" ");
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Conjunto C:");
		
		for (int v : nc) {
			System.out.print(v+" ");
		}
		
		
		sc.close();
	}

}
