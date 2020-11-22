//Fa�a um programa que simule um controle banc�rio. O sistema banc�rio tem a capacidade de
//armazenar as informa��es somente de 50 usu�rios e cont�m as op��es de cadastrar usu�rio; efetuar
//dep�sito; efetuar saque; consultar saldo em conta e finalizar o programa. O seguinte menu dever�
//aparecer o seguinte menu na tela para o usu�rio: (Desafio: fazer com interface gr�fica)
//
//Menu de Opera��es
//1. Efetuar dep�sito
//2. Efetuar saque
//3. Consultar saldo em conta;
//4. Finalizar o programa
//
//- Na op��o de cadastrar usu�rio devem ser lidos os seguintes dados: nome do usu�rio (vetor de String
//com 50 posi��es); n�mero da conta (vetor inteiro de 50 posi��es); saldo da conta (vetor float com 50
//posi��es). O n�mero da conta devem ser armazenados em um vetor de n�meros inteiros (n�o pode
//haver mais de uma conta com o mesmo c�digo) e os saldos devem ser armazenados em um vetor de
//n�meros reais. O saldo dever� ser cadastrado na mesma posi��o do c�digo. Por exemplo, se a conta
//504 foi armazenada na quinta posi��o do vetor de n�mero de contas, seu saldo dever� ficar na quinta
//posi��o do vetor de saldos.
//- Para efetuar o dep�sito, deve-se solicitar o n�mero da conta e o valor a ser depositado. Se a conta n�o
//estiver cadastrada, dever� aparecer a mensagem �Conta n�o encontrada!� e voltar ao menu inicial. Se a
//conta existir, atualizar e exibir o novo saldo;
//- Para efetuar saque, deve-se solicitar o c�digo da conta e o valor a ser sacado. Se a conta n�o estiver
//cadastrada, dever� aparecer a mensagem �Conta n�o encontrada!� e voltar ao menu. Se a conta existir,
//verificar se o seu saldo � suficiente para cobrir o saque. (Suponha que a conta n�o possa ficar com
//saldo negativo). Se o saldo for suficiente, realizar o saque, exibir o novo saldo e voltar ao menu. Caso
//contr�rio, mostrar a mensagem �Saldo insuficiente!� e voltar ao menu.
//- Para consultar saldo em conta, deve-se solicitar o n�mero da conta a ser pesquisada. Se a conta n�o
//estiver cadastrada, dever� aparecer a mensagem �Conta n�o encontrada!�; sen�o, mostrar a conta com
//seu respectivo saldo e voltar ao menu;
//O programa termina quando for digitada a op��o 4 � Finalizar o programa.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome[] = new String[50];
		
		int numeroConta[] = new int[50];
		
		float saldo[] = new float[50];
		
		System.out.println("Cadastro de Usu�rios:");
		
		System.out.println();
		
		for (int i=0; i<nome.length; i++) {
			System.out.println("Cadastro do "+(1+i)+" usu�rio:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			if (i==0) {
				System.out.println("(por favor, tecle enter)");
			}
			sc.nextLine();
			System.out.print("N�mero da conta: ");
			numeroConta[i] = sc.nextInt();
			for (int j=0; j<numeroConta.length; j++) {
				while (numeroConta[j] == numeroConta[i] && j != i) {
					System.err.print("N�mero da conta j� escolhido! Por favor insira outro: ");
					numeroConta[i] = sc.nextInt();
				}
			}
			System.out.print("Saldo: ");
			saldo[i] = sc.nextFloat();
		}
		int escolha = 0;
		boolean verificador = false;
		do {
			System.out.println("Menu de Opera��es:");
			System.out.println("1. Efetuar dep�sito");
			System.out.println("2. Efetuar saque");
			System.out.println("3. Consultar saldo em conta");
			System.out.println("4. Finalizar o programa");
			System.out.println();
			System.out.print("Por favor, insira o valor correspondente � opera��o realizada: ");
			escolha = sc.nextInt();
			if (escolha == 1) {
				System.out.print("Por favor, insira o n�mero da conta: ");
				int numero = sc.nextInt();
				System.out.print("Por favor, insira o valor a ser depositado: ");
				float deposito = sc.nextFloat();
				for (int i=0; i<numeroConta.length; i++) {
					if (numeroConta[i] == numero) {
						saldo[i] += deposito;
						verificador = true;
						System.out.println("Novo saldo: R$"+saldo[i]);
					}
				}
				if (verificador == false) {
					System.err.println("Conta n�o encontrada!");
				}
			} else if (escolha == 2) {
				System.out.print("Por favor, insira o n�mero da conta: ");
				int numero = sc.nextInt();
				System.out.print("Por favor, insira o valor a ser sacado: ");
				float saque = sc.nextFloat();
				for (int i=0; i<numeroConta.length; i++) {
					if (numeroConta[i] == numero) {
						verificador = true;
						if (saldo[i] >= saque) {
							saldo[i] -= saque;
							System.out.println("Novo saldo: R$"+saldo[i]);
						} else {
							System.err.println("Saldo insuficiente!");
						}
					}
				}
				if (verificador == false) {
					System.err.println("Conta n�o encontrada!");
				}
			} else if (escolha == 3) {
				System.out.print("Por favor, insira o n�mero da conta: ");
				int numero = sc.nextInt();
				for (int i=0; i<numeroConta.length; i++) {
					if (numeroConta[i] == numero) {
						verificador = true;
						System.out.println("Saldo: R$"+saldo[i]);
					}
				}
				if (verificador == false) {
					System.err.println("Conta n�o encontrada!");
				}
			} else if (escolha == 4) {
				
			} else {
				System.out.println("Opera��o inv�lida. Por favor, escolha uma opera��o v�lida.");
			}
			System.out.println();
			verificador = false;
		} while (escolha != 4);
		
		sc.close();
	}

}
