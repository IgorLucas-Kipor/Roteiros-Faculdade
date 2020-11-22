//Assim, implemente um algoritmo que receba de entrada 11 dígitos de um CPF qualquer (uma única
//variável inteira) e verifique se o valor inserido é ou não um CPF válido. Utilize as referências citadas
//anteriormente para realizar os cálculos para validação. Utilize estrutura de repetição.

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
				System.err.println("CPF INVÁLIDO!");
				System.exit(0);
			}
		} else {
			if (11-resto == num[1]) {
				
			} else {
				System.err.println("CPF INVÁLIDO!");
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
				System.out.println("CPF válido.");
			} else {
				System.err.println("CPF INVÁLIDO!");
				System.exit(0);
			}
		} else {
			if (11-resto == num[0]) {
				System.out.println("CPF válido.");
			} else {
				System.err.println("CPF INVÁLIDO!");
				System.exit(0);
			}
		}
		
		sc.close();
	}

}
