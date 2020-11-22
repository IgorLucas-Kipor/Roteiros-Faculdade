//Assim, implemente um algoritmo que receba de entrada 11 d�gitos de um CPF qualquer (uma �nica
//vari�vel inteira) e verifique se o valor inserido � ou n�o um CPF v�lido. Utilize as refer�ncias citadas
//anteriormente para realizar os c�lculos para valida��o. Utilize estrutura de repeti��o.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o CPF: ");
		
		long cpf = sc.nextLong();
		
		long num [] = new long [11];
		
		for (int i = 0; i<num.length; i++) {
			num[i] = cpf%10;
			cpf /= 10;
		}
		
		long soma = 0, multiplicador=10;
		
		for (int i=10; i>1; i--) {
			soma += (multiplicador * num[i]);
			multiplicador--;
		}
		
		long resto = soma % 11;
		
		if (resto < 2) {
			if (num[1] == 0) {
				
			} else {
				System.err.println("CPF INV�LIDO!");
				System.exit(0);
			}
		} else {
			if (11-resto == num[1]) {
				
			} else {
				System.err.println("CPF INV�LIDO!");
				System.exit(0);
			}
		}
		
		soma = 0;
		multiplicador = 11;
		
		for (int i=10; i>0; i--) {
			soma += (multiplicador * num[i]);
			multiplicador--;
		}
		
		resto = soma%11;
		
		if (resto < 2) {
			if (num[0] == 0) {
				System.out.println("CPF v�lido.");
			} else {
				System.err.println("CPF INV�LIDO!");
				System.exit(0);
			}
		} else {
			if (11-resto == num[0]) {
				System.out.println("CPF v�lido.");
			} else {
				System.err.println("CPF INV�LIDO!");
				System.exit(0);
			}
		}
		
		sc.close();
	}

}
