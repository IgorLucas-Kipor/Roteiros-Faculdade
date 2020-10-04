//Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira três números: ");
		double num1 = sc.nextDouble();
		double maior = num1, menor = num1, medio = num1;
		double num2 = sc.nextDouble();
		if (num2 > maior) {
			maior = num2;
		} else if (num2 < menor) {
			menor = num2;
		}
		
		double num3 = sc.nextDouble();
		if (num3 > maior) {
			maior = num3;
		} else if (num3 < menor){
			menor = num3;
		} else if (num3 < maior && num3 > menor) {
			medio = num3;
		} else if (num1 < maior && num1 > menor) {
			medio = num1;
		} else if (num2 < maior && num2 > menor) {
			medio = num2;
		}
		
		System.out.println("Imprimindo em ordem crescente:");
		System.out.println();
		System.out.println(menor);
		System.out.println(medio);
		System.out.println(maior);
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		System.out.println("Imprimindo em ordem decrescente:");
		System.out.println();
		System.out.println(maior);
		System.out.println(medio);
		System.out.println(menor);
		sc.close();

	}
}
