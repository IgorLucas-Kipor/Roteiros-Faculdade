//Faça um algoritmo que receba 3 notas e seus respectivos pesos, calcule e mostre a media ponderada dessas
//notas.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double n1, n2, n3, p1, p2, p3, mP;
		System.out.print("Insira a primeira nota: ");
		n1 = in.nextDouble();
		System.out.print("Insira a segunda nota: ");
		n2 = in.nextDouble();
		System.out.print("Insira a terceira nota: ");
		n3 = in.nextDouble();
		System.out.print("Insira o primeiro peso: ");
		p1 = in.nextDouble();
		System.out.print("Insira o segundo peso: ");
		p2 = in.nextDouble();
		System.out.print("Insira o terceiro peso: ");
		p3 = in.nextDouble();
		mP = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
		System.out.println("A media ponderada com essas notas e pesos e: "+mP+".");
		in.close();
	}

}
