//João recebeu seu salário e precisa pagar 2 contas atrasadas. Em razão do atraso, ele deverá pagar multa de
//2% sobre cada conta. Faça um programa que receba o salário do João e o valor de cada conta, calcule e
//mostre quanto restará de salário após o pagamento das duas contas.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double salario, conta1, conta2, multa1, multa2, salarioRestante;
		System.out.print("Insira o salario de Joao: ");
		salario = in.nextDouble();
		System.out.print("Insira o valor da primeira conta: ");
		conta1 = in.nextDouble();
		System.out.print("Insira o valor da segunda conta: ");
		conta2 = in.nextDouble();
		multa1 = conta1 * 0.02;
		multa2 = conta2 * 0.02;
		salarioRestante = salario - conta1 - conta2 - multa1 - multa2;
		System.out.println("O salario restante de Joao apos o pagamento das duas contas e multas será R$"+salarioRestante+" reais.");
		in.close();
	}
}
