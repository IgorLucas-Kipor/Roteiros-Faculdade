//Fa�a um programa que receba de entrada tr�s valores. Verificar se esses valores podem formar um
//tri�ngulo. Caso n�o, informar que n�o forma um tri�ngulo; caso sim, imprima que tipo de tri�ngulo pode
//ser formado (escaleno, is�sceles ou equil�tero).

import java.util.Scanner;
public class Igor_Lucas_Exercicio_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor do primeiro lado do tri�ngulo: ");
		double a = sc.nextDouble();
		System.out.print("Insira o valor do segundo lado do tri�ngulo: ");
		double b = sc.nextDouble();
		System.out.print("Insira o valor do terceiro lado do tri�ngulo: ");
		double c = sc.nextDouble();
		if (a < c+b && b < a+c && c < a+b) {
			if ( a == b && b == c) {
				System.out.println("Valores formam um tri�ngulo equil�tero.");
			} else if (a != b && b != c && c != a) {
				System.out.println("Valores formam um tri�ngulo escaleno.");
			} else if (((a==b && b != c) || (a == c && b != a) || (b == c && c != a))) {
				System.out.println("Valores formam um tri�ngulo is�sceles.");
			}
		} else {
			System.err.println("Valores n�o formam um tri�ngulo.");
		}
		sc.close();
	}

}
