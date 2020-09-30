//Faça um algoritmo que calcule a área de uma circunferência, recebendo o valor do raio. Obs.: Defina PI
//como constante de valor 3.1416.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_15 {
	static final Double PI = 3.1416;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double raio, raioAoQuadrado, area;
		System.out.print("Insira o raio da circunferência: ");
		raio = in.nextDouble();
		raioAoQuadrado = raio*raio;
		area = PI * raioAoQuadrado;
		System.out.println("A área dessa circunferência é de "+area+"m².");
		in.close();
	}

}
