//Fa�a um programa que identifique se um n�mero digitado pelo usu�rio � positivo, negativo ou zero.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um n�mero: ");
		double numero = sc.nextDouble();
		if (numero > 0) {
			System.out.println("O n�mero digitado � positivo.");
		} else if (numero < 0) {
			System.out.println("O n�mero digitado � negativo.");
		} else {
			System.out.println("O n�mero digitado � zero.");
		}
		
		sc.close();

	}

}
