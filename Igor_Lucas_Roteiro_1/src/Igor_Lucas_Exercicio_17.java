//Faça um programa que receba de entrada um número real, encontre e mostre:
//a. A parte inteira desse número;
//b. A parte fracionária desse número.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_17 {
	public static void main(String[] args) {
		Double numero, inteira, fracionaria;
		Scanner in = new Scanner(System.in);
		System.out.print("Por favor insira um número real: ");
		numero = in.nextDouble();
		fracionaria = numero % 1;
		inteira = numero - fracionaria;
		System.out.println("Parte inteira: "+inteira+". Parte fracionaria: "+fracionaria);
		in.close();
	}
}
