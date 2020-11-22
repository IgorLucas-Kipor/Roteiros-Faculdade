//Fa�a um algoritmo que simule o funcionamento de uma calculadora que contenha as opera��es
//aritm�ticas b�sicas com dois n�meros digitados pelo usu�rio. O programa implementado deve mostrar
//seguinte menu ao usu�rio. N�o se esque�a de verificar se as opera��es podem ser realizadas.
//====================
//Calculadora de Fulano
//====================
//Op��es:
//1 - Soma
//2 - Subtra��o
//3 - Multiplica��o
//4 - Divis�o
//5 � Sair
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
			System.out.println("Op��es:");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Sair");
			System.out.print("Insira o primeiro n�mero: ");
			double n1 = sc.nextDouble();
			System.out.print("Insira o segundo n�mero: ");
			double n2 = sc.nextDouble();
			System.out.print("Insira o c�digo da opera��o desejada: ");
			opcao = sc.nextInt();
			if (opcao == 1) {
				double soma = n1 + n2;
				System.out.println("Resultado da soma: "+soma);
			} else if (opcao == 2) {
				double sub = n1 - n2;
				System.out.println("Resultado da subtra��o: "+sub);
			} else if (opcao == 3) {
				double multi = n1 * n2;
				System.out.println("Resultado da multiplica��o: "+multi);
			} else if (opcao == 4) {
				if (n2 == 0) {
					System.err.println("N�o � poss�vel fazer divis�o por 0.");
				} else {
					double div = n1 / n2;
					System.out.println("Resultado da divis�o: "+div);
				}
			} else if (opcao == 5) {
				System.out.println("Encerrando a calculadora.");
			} else {
				System.err.println("Op��o inv�lida.");
			}
		} while (opcao != 5);
		sc.close();
	}

}
