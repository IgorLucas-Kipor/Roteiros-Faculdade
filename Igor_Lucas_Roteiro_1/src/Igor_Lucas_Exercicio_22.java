//Fa�a um algoritmo que leia dois valores num�ricos e armazene nas vari�veis A e B, ap�s isso, efetue a
//troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. Imprima os
//valores ap�s troca.

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
	System.out.println("Ap�s a troca, o valor de a � "+a+" e o valor de b � "+b+".");
	in.close();
}
}
