//Fa�a um programa que receba de entrada um n�mero real, encontre e mostre:
//a. A parte inteira desse n�mero;
//b. A parte fracion�ria desse n�mero.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_17 {
	public static void main(String[] args) {
		Double numero, inteira, fracionaria;
		Scanner in = new Scanner(System.in);
		System.out.print("Por favor insira um n�mero real: ");
		numero = in.nextDouble();
		fracionaria = numero % 1;
		inteira = numero - fracionaria;
		System.out.println("Parte inteira: "+inteira+". Parte fracionaria: "+fracionaria);
		in.close();
	}
}
