//O n�mero de inscri��o no CPF � composto de onze d�gitos decimais, sendo os oito primeiros
//aleatoriamente designados no momento da inscri��o. J� o nono (antepen�ltimo) d�gito indica a regi�o fiscal
//respons�vel pela inscri��o (MG � a regi�o 6, portanto em todos CPF�s emitidos em MG o nono digito � 6).
//Por fim, o d�cimo e o d�cimo primeiro s�o d�gitos verificadores calculados de acordo com um
//algoritmo definido pela Receita Federal e publicamente conhecido. Refer�ncias abaixo:
//a. http://www.gerardocumentos.com.br/?pg=entenda-a-formula-do-cpf
//b. https://bityli.com/CI4gC
//
//Assim, implemente um algoritmo que receba de entrada 11 d�gitos de um CPF qualquer (uma �nica
//vari�vel inteira) e verifique se o valor inserido � ou n�o um CPF v�lido. Utilize as refer�ncias citadas
//anteriormente para realizar os c�lculos para valida��o.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o n�mero do CPF (apenas d�gitos): ");
		long cpf = sc.nextLong();
		long d11 = cpf % 10; //pega d�gito mais a direita
		long aux = cpf / 10; // armazena resto
		long d10 = aux % 10;
		aux = aux / 10;
		long d9 = aux % 10;
		aux = aux / 10;
		long d8 = aux % 10;
		aux = aux / 10;
		long d7 = aux % 10;
		aux = aux / 10;
		long d6 = aux % 10;
		aux = aux / 10;
		long d5 = aux % 10;
		aux = aux / 10;
		long d4 = aux % 10;
		aux = aux / 10;
		long d3 = aux % 10;
		aux = aux / 10;
		long d2 = aux % 10;
		aux = aux / 10;
		long d1 = aux % 10;
		aux = aux / 10;
		long somatorioDecimo = d1*10+d2*9+d3*8+d4*7+d5*6+d6*5+d7*4+d8*3+d9*2;
		long resto = somatorioDecimo % 11;
		if (resto < 2 && d10 != 0) {
			System.err.println("CPF inv�lido.");
			System.exit(1);
		} else if (resto >= 2 && 11-resto != d10) {
			System.err.println("CPF inv�lido.");
			System.exit(1);
		}
		
		long somatorioDecimoPrimeiro = d1*11+d2*10+d3*9+d4*8+d5*7+d6*6+d7*5+d8*4+d9*3+d10*2;
		resto = somatorioDecimoPrimeiro % 11;
		
		if (resto < 2 && d11 != 0) {
			System.err.println("CPF inv�lido.");
			System.exit(1);
		} else if (resto >= 2 && 11-resto != d11) {
			System.err.println("CPF inv�lido.");
			System.exit(1);
		}
		
		System.out.println("CPF v�lido.");
//		System.out.println(d11);
//		System.out.println(d10);
//		System.out.println(aux);
		sc.close();
	}

}
