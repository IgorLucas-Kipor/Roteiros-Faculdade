//Elabore um programa que realize o mesmo procedimento do fluxograma abaixo. A fun��o mod utilizada
//no fluxograma representa o resto da divis�o interia.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro n�mero: ");
		int num1 = sc.nextInt();
		System.out.print("Insira o segundo n�mero: ");
		int num2 = sc.nextInt();
		if (num1 % num2 == 0) {
			System.out.println(num1+" � m�ltiplo de "+num2+".");
		} else {
			System.out.println(num1+" n�o � m�ltiplo de "+num2+".");
		}
		sc.close();
	}

}
