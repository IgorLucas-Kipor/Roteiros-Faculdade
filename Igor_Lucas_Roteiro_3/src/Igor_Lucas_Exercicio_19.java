//Fa�a um programa que deve solicitar n�meros para o usu�rio at� que seja digitado -1. Quando o usu�rio
//digitar -1, o programa termina e imprime a m�dia de todos os n�meros positivos digitados.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double numero = 0, soma = 0;
		int i=0;
		
		do {
			System.out.print("Digite um n�mero: ");
			numero = sc.nextDouble();
			if (numero > -1) {
				soma += numero;
				i++;
			}
		} while (numero != -1);
		
		double media = soma / i;
		
		System.out.println("A m�dia do somat�rio �: "+media);

		sc.close();
	}

}
