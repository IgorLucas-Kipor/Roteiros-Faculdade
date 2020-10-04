//Faça um algoritmo que receba de entrada a altura e o sexo de uma pessoa ('M' - Masculino ou 'F' -
//Feminino), construa um algoritmo que calcule o peso ideal da pessoa de acordo com as regras:
//- Homens: (72.7*altura) - 58 - Mulher: (62,1*altura) - 44.7

import java.util.Scanner;
public class Igor_Lucas_Exercicio_25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a altura da pessoa: ");
		double altura = sc.nextDouble();
		System.out.print("Insira o sexo da pessoa. M para masculino e F para feminino. ");
		char sexo = sc.next().charAt(0);
		double pesoIdeal = 0;
		
		switch(sexo) {
		case 'M':
			pesoIdeal = (72.7*altura) - 58;
			break;
		case 'F':
			pesoIdeal = (62.1*altura) - 44.7;
			break;
		default:
			System.err.println("Sexo inválido.");
			System.exit(1);
		}
		
		System.out.printf("O peso ideal dessa pessoa seria %.2f.%n", pesoIdeal);
		sc.close();
	}

}
