//Uma empresa decide dar um aumento de 30% aos funcion�rios com sal�rio inferior � R$700,00 e 10% aos
//funcion�rios com sal�rio superior ou igual � R$700,00. Fa�a um algoritmo que calcule o reajuste e mostre
//o novo sal�rio.

import java.util.Scanner;
import java.util.Locale;
public class Igor_Lucas_Exercicio_8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o sal�rio do funcion�rio: ");
		double salario = sc.nextDouble();
		double reajuste, novoSalario;
		if (salario < 700) {
			reajuste = salario * 0.30;
		} else {
			reajuste = salario * 0.10;
		}
		novoSalario = salario + reajuste;
		System.out.printf("O novo sal�rio do funcion�rio ap�s o aumento ser� de $%.2f.%n", novoSalario);
		sc.close();
	}
}
