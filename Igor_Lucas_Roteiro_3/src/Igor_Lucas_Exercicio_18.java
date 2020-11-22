//Faça um algoritmo que simule o funcionamento de uma calculadora que contenha as operações
//aritméticas básicas com dois números digitados pelo usuário. O programa implementado deve mostrar
//seguinte menu ao usuário. Não se esqueça de verificar se as operações podem ser realizadas.
//====================
//Calculadora de Fulano
//====================
//Opções:
//1 - Soma
//2 - Subtração
//3 - Multiplicação
//4 - Divisão
//5 – Sair
//====================

import java.util.Scanner;
public class Igor_Lucas_Exercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("===========================");
			System.out.println("    CALCULADORA DO IGOR    ");
			System.out.println("===========================");
			System.out.println("Opções:");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			System.out.print("Insira o primeiro número: ");
			double n1 = sc.nextDouble();
			System.out.print("Insira o segundo número: ");
			double n2 = sc.nextDouble();
			System.out.print("Insira o código da operação desejada: ");
			opcao = sc.nextInt();
			if (opcao == 1) {
				double soma = n1 + n2;
				System.out.println("Resultado da soma: "+soma);
			} else if (opcao == 2) {
				double sub = n1 - n2;
				System.out.println("Resultado da subtração: "+sub);
			} else if (opcao == 3) {
				double multi = n1 * n2;
				System.out.println("Resultado da multiplicação: "+multi);
			} else if (opcao == 4) {
				if (n2 == 0) {
					System.err.println("Não é possível fazer divisão por 0.");
				} else {
					double div = n1 / n2;
					System.out.println("Resultado da divisão: "+div);
				}
			} else if (opcao == 5) {
				System.out.println("Encerrando a calculadora.");
			} else {
				System.err.println("Opção inválida.");
			}
		} while (opcao != 5);
		sc.close();
	}

}
