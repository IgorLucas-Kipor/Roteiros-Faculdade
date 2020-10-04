//Elabore um programa que realize o mesmo procedimento do fluxograma abaixo. A função mod utilizada
//no fluxograma representa o resto da divisão interia.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o primeiro número: ");
		int num1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		int num2 = sc.nextInt();
		if (num1 % num2 == 0) {
			System.out.println(num1+" é múltiplo de "+num2+".");
		} else {
			System.out.println(num1+" não é múltiplo de "+num2+".");
		}
		sc.close();
	}

}
