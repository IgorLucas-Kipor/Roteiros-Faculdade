//Faça um programa que receba a medida do ângulo formado por uma escada apoiada e a altura da parede.
//Calcule e mostre a medida da escada para que a ponta da parede possa ser alcançada.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_21 {
//	static final Double PI = 3.1416;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Double altura, angulo, medidaEscada, seno, anguloRadiano;
		
		System.out.print("Por favor, insira o ângulo formado pela escada em graus: ");
		angulo = in.nextDouble();
		System.out.print("Por favor, insira a altura da parede em metros: ");
		altura = in.nextDouble();
//		anguloRadiano = angulo * PI/180;
		anguloRadiano = Math.toRadians(angulo);
		seno = Math.sin(anguloRadiano);
		medidaEscada = altura / seno;
		//printf é versão arrendodado com duas casas, println versão com número inteiro. ativar a que preferir.
		System.out.printf("A escada tem que medir %.2f metros para que alcance a ponta da parede nesse ângulo.%n", medidaEscada);
//		System.out.println("A escada tem que medir "+medidaEscada+" metros para que alcance a ponta da parede nesse ângulo.");
		in.close();
	}

}
