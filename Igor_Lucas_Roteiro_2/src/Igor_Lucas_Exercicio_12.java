//Faça um algoritmo que receba a idade de um nadador e mostre a categoria do mesmo. Faça os testes
//necessários em relação a idade inválida.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a idade do nadador: ");
		int idade = sc.nextInt();
		if (idade >= 5 && idade <= 7) {
			System.out.println("O nadador é de categoria INFATIL.");
		} else if (idade >= 8 && idade <= 10) {
			System.out.println("O nadador é de categoria JUVENIL.");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println("O nadador é de categoria ADOLESCENTE.");
		} else if (idade >= 16 && idade <= 40) {
			System.out.println("O nadador é de categoria ADULTO.");
		} else if (idade > 40) {
			System.out.println("O nadador é de categoria SÊNIOR.");
		} else {
			System.err.println("IDADE INVÁLIDA!");
			System.exit(1);
		}
		sc.close();
	}
}
