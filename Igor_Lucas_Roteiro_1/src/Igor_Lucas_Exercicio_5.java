//Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e mostre o sal�rio a receber,
//sabendo que esse funcion�rio possui uma gratifica��o de 10% sobre o sal�rio base e paga 5% de imposto
//sobre o valor acumulado (sal�rio base + gratifica��o).

import java.util.Scanner;
public class Igor_Lucas_Exercicio_5 {
	public static void main(String[] args) {
		Scanner sal = new Scanner(System.in);
		Double salario, salarioReceber;
		salarioReceber = 0.0;
		System.out.print("Insira o sal�rio base do funcionario: ");
		salario = sal.nextDouble();
//		salarioReceber = calculo(salario, salarioReceber);
		salarioReceber = (salario * 1.1) * 0.95;
		System.out.println("O salario que o funcionario ira receber, considerando a gratificacao e o imposto, sera R$"+salarioReceber+" reais.");
		sal.close();
	}
	
	//Vers�o m�dulo da resolu��o:
//static Double calculo (Double base, Double fim) {
//	Double gratificacao = base * 1.1;
//	fim = gratificacao * 0.95;
//	return fim;
//}
}
