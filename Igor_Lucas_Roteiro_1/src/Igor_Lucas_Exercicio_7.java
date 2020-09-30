//Faça um algoritmo que calcule a área e o perímetro de um retângulo recebendo de entrada os valores dos
//lados.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer base, altura, area, perimetro;
		System.out.print("Insira o valor da base do retangulo: ");
		base = in.nextInt();
		System.out.print("Insira o valor da altura do retangulo: ");
		altura = in.nextInt();
		area = base*altura;
		perimetro = 2 * (base+altura);
		System.out.println("A area desse retangulo e "+area+" e o perimetro do mesmo e "+perimetro+".");
		in.close();
	}

}
