//Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
//números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
//divisão. Lembre-se das condições para realizar a divisão. Utilize a estrutura switch/case e apresente um
//menu de opções para o usuário.

import java.util.Scanner;
import java.util.Locale;
public class Igor_Lucas_Exercicio_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro número: ");
		double numero1 = sc.nextDouble();
		System.out.print("Insira o segundo número: ");
		double numero2 = sc.nextDouble();
		double soma, subtracao, multiplicacao, divisao;
		System.out.print("Insira a operação que deseja realizar: + para soma, - para subtração, * para multiplicação e / para divisão. ");
		char operacao = sc.next().charAt(0);
		switch (operacao) {
		case '+':
			soma = numero1 + numero2;
			System.out.printf("Resultado da soma: %.2f.%n", soma);
			break;
		case '-':
			subtracao = numero1 - numero2;
			System.out.printf("Resultado da subtração: %.2f.%n", subtracao);
			break;
		case '*':
			multiplicacao = numero1 * numero2;
			System.out.printf("Resultado da multiplicação: %.2f.%n", multiplicacao);
			break;
		case '/':
			if (numero2 == 0) {
				System.err.println("Divisão com denominador 0 não é possível.");
				System.exit(1);
			}
			divisao = numero1 / numero2;
			System.out.printf("Resultado da divisão: %.2f.%n", divisao);
			break;
		default:
			System.err.println("Operação inválida.");
			break;
		}
		sc.close();
		
	}

}
