//Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
//sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto
//sobre o valor acumulado (salário base + gratificação).

import java.util.Scanner;
public class Igor_Lucas_Exercicio_5 {
	public static void main(String[] args) {
		Scanner sal = new Scanner(System.in);
		Double salario, salarioReceber;
		salarioReceber = 0.0;
		System.out.print("Insira o salário base do funcionario: ");
		salario = sal.nextDouble();
//		salarioReceber = calculo(salario, salarioReceber);
		salarioReceber = (salario * 1.1) * 0.95;
		System.out.println("O salario que o funcionario ira receber, considerando a gratificacao e o imposto, sera R$"+salarioReceber+" reais.");
		sal.close();
	}
	
	//Versão módulo da resolução:
//static Double calculo (Double base, Double fim) {
//	Double gratificacao = base * 1.1;
//	fim = gratificacao * 0.95;
//	return fim;
//}
}
