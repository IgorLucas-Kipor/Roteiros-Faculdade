//O IMC (Índice de Massa Corporal) é um critério da Organização Mundial de Saúde para dar uma indicação
//sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = PESO/(ALTURA2). Elabore um
//algoritmo que leia o peso e a altura de um adulto e mostre sua condição.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a altura do indivíduo: ");
		double altura = sc.nextDouble();
		System.out.print("Insira o peso do indivíduo: ");
		double peso = sc.nextDouble();
		double imc = peso / (altura*altura);
		if (imc < 18.5) {
			System.out.println("Indivíduo abaixo do peso.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Indivíduo em peso normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Indivíduo acima do peso.");
		} else {
			System.out.println("Indivíduo obeso.");
		}
		sc.close();
	}
}
