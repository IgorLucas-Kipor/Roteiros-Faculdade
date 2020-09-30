//Implemente um algoritmo que receba o n�mero de lados de um pol�gono convexo regular, calcule e mostre
//o n�mero de diagonais desse pol�gono. Sabe-se que ND = N*(N � 3)/2, em que N representa o n�mero de
//lados do pol�gono.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Integer numeroLados, numeroDiagonais=0;
		System.out.print("Insira o numero de lados do poligono: ");
		numeroLados = in.nextInt();
//		numeroDiagonais = calcular (numeroLados, numeroDiagonais);
		numeroDiagonais = (numeroLados *(numeroLados - 3)) / 2;
		System.out.println("O numero de diagonais desse poligono convexo regular e "+numeroDiagonais+".");
		in.close();
	}
	
	//Vers�o m�dulo:
//	static Integer calcular (Integer dado, Integer fim) {
//		fim = (dado *(dado - 3) )/ 2;
//		return fim;
//	}

}
