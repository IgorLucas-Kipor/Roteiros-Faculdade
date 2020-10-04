//Fa�a um programa que simule uma calculadora simples. Para isso, o usu�rio dever� entrar com dois
//n�meros quaisquer e a opera��o que deseja realizar: '+' soma; ' - ' subtra��o; ' * ' multiplica��o e ' / '
//divis�o. Lembre-se das condi��es para realizar a divis�o. Utilize a estrutura switch/case e apresente um
//menu de op��es para o usu�rio.

import java.util.Scanner;
import java.util.Locale;
public class Igor_Lucas_Exercicio_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro n�mero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Insira o segundo n�mero: ");
		double numero2 = sc.nextDouble();
		double soma, subtracao, multiplicacao, divisao;
		System.out.print("Insira a opera��o que deseja realizar: + para soma, - para subtra��o, * para multiplica��o e / para divis�o. ");
		char operacao = sc.next().charAt(0);
		switch (operacao) {
		case '+':
			soma = numero1 + numero2;
			System.out.printf("Resultado da soma: %.2f.%n", soma);
			break;
		case '-':
			subtracao = numero1 - numero2;
			System.out.printf("Resultado da subtra��o: %.2f.%n", subtracao);
			break;
		case '*':
			multiplicacao = numero1 * numero2;
			System.out.printf("Resultado da multiplica��o: %.2f.%n", multiplicacao);
			break;
		case '/':
			if (numero2 == 0) {
				System.err.println("Divis�o com denominador 0 n�o � poss�vel.");
				System.exit(1);
			}
			divisao = numero1 / numero2;
			System.out.printf("Resultado da divis�o: %.2f.%n", divisao);
			break;
		default:
			System.err.println("Opera��o inv�lida.");
			break;
		}
		sc.close();
		
	}

}
