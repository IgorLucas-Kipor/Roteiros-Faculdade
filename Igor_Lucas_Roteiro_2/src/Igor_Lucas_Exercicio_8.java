//Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior à R$700,00 e 10% aos
//funcionários com salário superior ou igual à R$700,00. Faça um algoritmo que calcule o reajuste e mostre
//o novo salário.

import java.util.Scanner;
import java.util.Locale;
public class Igor_Lucas_Exercicio_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o salário do funcionário: ");
		double salario = sc.nextDouble();
		double reajuste, novoSalario;
		if (salario < 700) {
			reajuste = salario * 0.30;
		} else {
			reajuste = salario * 0.10;
		}
		novoSalario = salario + reajuste;
		System.out.printf("O novo salário do funcionário após o aumento será de $%.2f.%n", novoSalario);
		sc.close();
	}
}
