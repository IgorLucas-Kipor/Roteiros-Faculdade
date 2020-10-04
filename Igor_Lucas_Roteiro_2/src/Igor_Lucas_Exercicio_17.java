//Faça um programa que receba de entrada três valores. Verificar se esses valores podem formar um
//triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo pode
//ser formado (escaleno, isósceles ou equilátero).

import java.util.Scanner;
public class Igor_Lucas_Exercicio_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor do primeiro lado do triângulo: ");
		double a = sc.nextDouble();
		System.out.print("Insira o valor do segundo lado do triângulo: ");
		double b = sc.nextDouble();
		System.out.print("Insira o valor do terceiro lado do triângulo: ");
		double c = sc.nextDouble();
		if (a < c+b && b < a+c && c < a+b) {
			if ( a == b && b == c) {
				System.out.println("Valores formam um triângulo equilátero.");
			} else if (a != b && b != c && c != a) {
				System.out.println("Valores formam um triângulo escaleno.");
			} else if (((a==b && b != c) || (a == c && b != a) || (b == c && c != a))) {
				System.out.println("Valores formam um triângulo isósceles.");
			}
		} else {
			System.err.println("Valores não formam um triângulo.");
		}
		sc.close();
	}

}
