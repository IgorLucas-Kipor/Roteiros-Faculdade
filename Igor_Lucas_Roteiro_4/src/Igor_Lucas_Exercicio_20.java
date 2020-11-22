//Faça um programa que simule um controle bancário. O sistema bancário tem a capacidade de
//armazenar as informações somente de 50 usuários e contém as opções de cadastrar usuário; efetuar
//depósito; efetuar saque; consultar saldo em conta e finalizar o programa. O seguinte menu deverá
//aparecer o seguinte menu na tela para o usuário: (Desafio: fazer com interface gráfica)
//
//Menu de Operações
//1. Efetuar depósito
//2. Efetuar saque
//3. Consultar saldo em conta;
//4. Finalizar o programa
//
//- Na opção de cadastrar usuário devem ser lidos os seguintes dados: nome do usuário (vetor de String
//com 50 posições); número da conta (vetor inteiro de 50 posições); saldo da conta (vetor float com 50
//posições). O número da conta devem ser armazenados em um vetor de números inteiros (não pode
//haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de
//números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta
//504 foi armazenada na quinta posição do vetor de número de contas, seu saldo deverá ficar na quinta
//posição do vetor de saldos.
//- Para efetuar o depósito, deve-se solicitar o número da conta e o valor a ser depositado. Se a conta não
//estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu inicial. Se a
//conta existir, atualizar e exibir o novo saldo;
//- Para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver
//cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu. Se a conta existir,
//verificar se o seu saldo é suficiente para cobrir o saque. (Suponha que a conta não possa ficar com
//saldo negativo). Se o saldo for suficiente, realizar o saque, exibir o novo saldo e voltar ao menu. Caso
//contrário, mostrar a mensagem “Saldo insuficiente!” e voltar ao menu.
//- Para consultar saldo em conta, deve-se solicitar o número da conta a ser pesquisada. Se a conta não
//estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!”; senão, mostrar a conta com
//seu respectivo saldo e voltar ao menu;
//O programa termina quando for digitada a opção 4 – Finalizar o programa.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome[] = new String[50];
		
		int numeroConta[] = new int[50];
		
		float saldo[] = new float[50];
		
		System.out.println("Cadastro de Usuários:");
		
		System.out.println();
		
		for (int i=0; i<nome.length; i++) {
			System.out.println("Cadastro do "+(1+i)+" usuário:");
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			if (i==0) {
				System.out.println("(por favor, tecle enter)");
			}
			sc.nextLine();
			System.out.print("Número da conta: ");
			numeroConta[i] = sc.nextInt();
			for (int j=0; j<numeroConta.length; j++) {
				while (numeroConta[j] == numeroConta[i] && j != i) {
					System.err.print("Número da conta já escolhido! Por favor insira outro: ");
					numeroConta[i] = sc.nextInt();
				}
			}
			System.out.print("Saldo: ");
			saldo[i] = sc.nextFloat();
		}
		int escolha = 0;
		boolean verificador = false;
		do {
			System.out.println("Menu de Operações:");
			System.out.println("1. Efetuar depósito");
			System.out.println("2. Efetuar saque");
			System.out.println("3. Consultar saldo em conta");
			System.out.println("4. Finalizar o programa");
			System.out.println();
			System.out.print("Por favor, insira o valor correspondente à operação realizada: ");
			escolha = sc.nextInt();
			if (escolha == 1) {
				System.out.print("Por favor, insira o número da conta: ");
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
					System.err.println("Conta não encontrada!");
				}
			} else if (escolha == 2) {
				System.out.print("Por favor, insira o número da conta: ");
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
					System.err.println("Conta não encontrada!");
				}
			} else if (escolha == 3) {
				System.out.print("Por favor, insira o número da conta: ");
				int numero = sc.nextInt();
				for (int i=0; i<numeroConta.length; i++) {
					if (numeroConta[i] == numero) {
						verificador = true;
						System.out.println("Saldo: R$"+saldo[i]);
					}
				}
				if (verificador == false) {
					System.err.println("Conta não encontrada!");
				}
			} else if (escolha == 4) {
				
			} else {
				System.out.println("Operação inválida. Por favor, escolha uma operação válida.");
			}
			System.out.println();
			verificador = false;
		} while (escolha != 4);
		
		sc.close();
	}

}
