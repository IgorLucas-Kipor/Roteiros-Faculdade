//Implemente m programa que receba um número positivo, calcule e mostre:
// O número digitado elevado ao quadrado;
// O número digitado elevado ao cubo;
// A raiz quadrada do número;
// A raiz cúbica do número.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double numero, numeroAoQuadrado, numeroAoCubo, raizQuadrada, raizCubica;
		System.out.print("Digite um número positivo: ");
		numero = in.nextDouble();
		//IF para verificar se o número é positivo. Descomente para ativar.
//		if (numero < 0) {
//			System.err.println(numero+" NÃO É POSITIVO!");
//			System.exit(1);
//		}
		numeroAoQuadrado = numero*numero;
		numeroAoCubo = numeroAoQuadrado*numero;
		raizQuadrada = Math.sqrt(numero);
		raizCubica = Math.cbrt(numero);
		System.out.println("O número ao quadrado é "+numeroAoQuadrado+".");
		System.out.println("O número ao cubo é: "+numeroAoCubo+".");
		System.out.println("A raiz quadrada do número é: "+raizQuadrada+".");
		System.out.println("A raiz cúbica do número é: "+raizCubica+".");
		in.close();
	}
}
