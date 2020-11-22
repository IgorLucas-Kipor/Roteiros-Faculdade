//Implemente um programa que solicite um valor inteiro positivo (N) ao usuário. Após isso imprima a
//tabuada dos números de 1 à N.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número positivo inteiro:");
		int numero = sc.nextInt();
		int tabuada=0;
		
		if (numero <= 0) {
			System.err.println("Número deve ser positivo.");
			System.exit(0);
		}
		
		for (int i=1; i<=numero; i++) {
			System.out.println("TABUADA DE "+i+":");
			System.out.println();
			for (int b=0; b<=10; b++) {
				tabuada = i * b;
				System.out.println(i+" * "+b+": "+tabuada);
			}
			System.out.println();
			System.out.println("======================================");
			System.out.println();
		}
		
		
		sc.close();
	}

}
