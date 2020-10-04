//Crie um programa que solicite a entrada de dois números, em seguida imprima na tela o quadrado do
//menor e a raiz quadrada do maior número, caso os números sejam iguais mostre uma mensagem
//informando que os números são iguais. Lembre-se de verificar as condições para um número possuir raiz
//quadrada real.

import java.util.Locale;
import java.util.Scanner;
public class Igor_Lucas_Exercicio_3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		System.out.print("Insira o primeiro número: ");
		double numero1 = in.nextDouble();
		System.out.print("Insira o segundo número: ");
		double numero2 = in.nextDouble();
		double quadrado, raiz;
		
		if (numero1 > numero2) {
			quadrado = Math.pow(numero2, 2);
			if (numero1 >= 0) {
				raiz = Math.sqrt(numero1);
				System.out.printf("O quadrado de %.2f é %.2f e a raiz quadrada de %.2f é %.2f%n", numero2, quadrado, numero1, raiz);
			} else {
				System.out.printf("O quadrado de %.2f é %.2f. Não existe raiz quadrada de %.2f pois não "
						+ "existe raiz quadrada de número negativo.%n", numero2, quadrado, numero1);
			}
		} else if (numero2 > numero1) {
			quadrado = Math.pow(numero1, 2);
			if (numero2 >= 0) {
				raiz = Math.sqrt(numero2);
				System.out.printf("O quadrado de %.2f é %.2f e a raiz quadrada de %.2f é %.2f%n", numero1, quadrado, numero2, raiz);
			} else {
				System.out.printf("O quadrado de %.2f é %.2f. Não existe raiz quadrada de %.2f pois não "
						+ "existe raiz quadrada de número negativo.%n", numero1, quadrado, numero2);
			}
		} else {
			System.out.println("Os número inseridos são iguais.");
		}
		in.close();
	}

}
