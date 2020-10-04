//Refa�a o exerc�cio referente � equa��o do segundo grau do roteiro anterior considerando todas as
//condi��es poss�veis, conforme fluxograma abaixo.

import java.util.Locale;
import java.util.Scanner;
public class Igor_Lucas_Exercicio_4 {
public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	System.out.print("Insira o valor de a: ");
	double a = sc.nextDouble();
	if (a == 0) {
		System.err.println("N�o � uma equa��o de 2� grau.");
		System.out.print("Insira o valor de b: ");
		double b = sc.nextDouble();
		if (b == 0) {
			System.err.println("N�o � uma equa��o de 1� grau.");
			System.exit(1);
		} else {
			System.out.print("Insira o valor de c: ");
			double c = sc.nextDouble();
			double raiz = -c / b;
			System.out.printf("A raiz dessa equa��o � %.2f.%n", raiz);
		}
	}
	System.out.print("Insira o valor de b: ");
	double b = sc.nextDouble();
	System.out.print("Insira o valor de c: ");
	double c = sc.nextDouble();
	double delta = (b*b) - 4*a*c;
	if (delta < 0) {
		System.err.println("N�o h� ra�zes reais.");
		System.exit(1);
	}
	double r1 = (-b + Math.sqrt(delta)) / (2*a);
	double r2 = (-b - Math.sqrt(delta)) / (2*a);
	System.out.printf("As ra�zes dessa equa��o s�o %.2f e %.2f.%n", r1, r2);
	sc.close();
}
}
