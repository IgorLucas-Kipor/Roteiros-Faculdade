//Crie um algoritmo que calcule a soma e a média de 3 números passados pelo usuário.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double n1, n2, n3, soma, media;
		System.out.print("Insira o primeiro numero: ");
		n1 = in.nextDouble();
		System.out.print("Insira o segundo numero: ");
		n2 = in.nextDouble();
		System.out.print("Insira o terceiro numero: ");
		n3 = in.nextDouble();
		soma = n1 + n2 + n3;
		media = soma / 3;
		System.out.println("A soma dos valores e: "+soma+".");
		System.out.println("A media dos valores e: "+media+".");
		in.close();
		
	}
}
