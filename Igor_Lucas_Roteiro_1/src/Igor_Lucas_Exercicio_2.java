//Implemente um algoritmo que leia um número inteiro e imprima seu antecessor e seu sucessor.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero, antecessor, sucessor;
		System.out.print("Insira um numero inteiro: ");
		numero = in.nextInt();
		antecessor = numero-1;
		sucessor = numero+1;
		System.out.println("O antecessor a numero e "+antecessor+" e o sucessor ao mesmo e "+sucessor+".");
		in.close();
	}

}
