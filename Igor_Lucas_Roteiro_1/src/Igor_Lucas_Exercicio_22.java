//Faça um algoritmo que leia dois valores numéricos e armazene nas variáveis A e B, após isso, efetue a
//troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. Imprima os
//valores após troca.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_22 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Double a, b;
	System.out.print("Insira o valor de a: ");
	a = in.nextDouble();
	System.out.print("Insira o valor de b: ");
	b = in.nextDouble();
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("Após a troca, o valor de a é "+a+" e o valor de b é "+b+".");
	in.close();
}
}
