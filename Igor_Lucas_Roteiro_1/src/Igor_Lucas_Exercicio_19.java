//Implemente m programa que receba um n�mero positivo, calcule e mostre:
// O n�mero digitado elevado ao quadrado;
// O n�mero digitado elevado ao cubo;
// A raiz quadrada do n�mero;
// A raiz c�bica do n�mero.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double numero, numeroAoQuadrado, numeroAoCubo, raizQuadrada, raizCubica;
		System.out.print("Digite um n�mero positivo: ");
		numero = in.nextDouble();
		//IF para verificar se o n�mero � positivo. Descomente para ativar.
//		if (numero < 0) {
//			System.err.println(numero+" N�O � POSITIVO!");
//			System.exit(1);
//		}
		numeroAoQuadrado = numero*numero;
		numeroAoCubo = numeroAoQuadrado*numero;
		raizQuadrada = Math.sqrt(numero);
		raizCubica = Math.cbrt(numero);
		System.out.println("O n�mero ao quadrado � "+numeroAoQuadrado+".");
		System.out.println("O n�mero ao cubo �: "+numeroAoCubo+".");
		System.out.println("A raiz quadrada do n�mero �: "+raizQuadrada+".");
		System.out.println("A raiz c�bica do n�mero �: "+raizCubica+".");
		in.close();
	}
}
