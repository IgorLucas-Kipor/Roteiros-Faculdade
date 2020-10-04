//O IMC (�ndice de Massa Corporal) � um crit�rio da Organiza��o Mundial de Sa�de para dar uma indica��o
//sobre a condi��o de peso de uma pessoa adulta. A f�rmula � IMC = PESO/(ALTURA2). Elabore um
//algoritmo que leia o peso e a altura de um adulto e mostre sua condi��o.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a altura do indiv�duo: ");
		double altura = sc.nextDouble();
		System.out.print("Insira o peso do indiv�duo: ");
		double peso = sc.nextDouble();
		double imc = peso / (altura*altura);
		if (imc < 18.5) {
			System.out.println("Indiv�duo abaixo do peso.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Indiv�duo em peso normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Indiv�duo acima do peso.");
		} else {
			System.out.println("Indiv�duo obeso.");
		}
		sc.close();
	}
}
