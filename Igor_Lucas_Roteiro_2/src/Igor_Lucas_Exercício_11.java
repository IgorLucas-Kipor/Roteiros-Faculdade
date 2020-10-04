//Crie um algoritmo que receba o valor de x, calcule e imprima o valor de f(x).

import java.util.Scanner;
public class Igor_Lucas_Exercício_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor de x: ");
		double x = sc.nextDouble();
		double fx=0;
		if (x <= 1) {
			fx = 1;
		} else if (x > 1 && x <= 2) {
			fx = 2;
		} else if (x > 2 && x <= 3) {
			fx = Math.pow(x, 2);
		} else if (x > 3) {
			fx = Math.pow(x, 3);
		}
		
		System.out.print("O valor de f(x) é: "+fx);
		sc.close();
	}

}
