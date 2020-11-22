//Fa�a um algoritmo que leia o n�mero de andares de um pr�dio e, a seguir,
//para cada andar do pr�dio, leia o n�mero de pessoas que entraram e sa�ram do elevador.
//Considere que o estado inicial do elevador � vazio, no primeiro andar e subindo. Os dados
//inseridos se referem a apenas uma �subida� do elevador e que o n�mero de pessoas dentro do
//elevador sempre ser� maior ou igual a 0. Se o n�mero de pessoas, ap�s a entrada e sa�da em
//qualquer um dos andares for maior que 15, deve ser mostrada a mensagem �EXCESSO DE
//PASSAGEIROS. DEVEM SAIR" em seguida, o n�mero de pessoas que devem sair do
//elevador, de modo que seja obedecido o limite de 15 passageiros. Ap�s a entrada e sa�da de
//pessoas no �ltimo andar o algoritmo deve mostrar quantas pessoas estar�o no elevador para
//descer. Al�m disso, mostre qual foi o andar que possu�a mais pessoas dentro do elevador.

import java.util.Scanner;
public class IgorLucas1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o n�mero de andares do pr�dio: ");
		
		int andares = sc.nextInt();
		
		while (andares < 1) {
			System.err.println("N�mero de andares n�o pode ser igual ou menor a 0. Por favor, insira um n�mero v�lido: ");
			andares = sc.nextInt();
		}
		int passageiros = 0;
		int maisPessoas = 0, maisPassageiros=0;
		
		for (int i=1; i<=andares; i++) {
			System.out.println(i+"� andar:");
			System.out.print("Insira quantos passageiros ir�o entrar no elevador: ");
			int n = sc.nextInt();
			while (n < 0) {
				System.err.print("N�o pode entrar um n�mero negativo de pessoas. Favor digitar um valor v�lido: ");
				n = sc.nextInt();
			}
			passageiros += n;
			System.out.print("Insira quantos passageiros ir�o sair do elevador: ");
			n = sc.nextInt();
			while (passageiros - n < 0) {
				System.out.print("O elevador n�o pode ficar com um n�mero negativo de passageiros. Por favor, insira outro valor: ");
				n = sc.nextInt();
			}
			passageiros -= n;
			if (passageiros > 15) {
				System.err.println("EXCESSO DE PASSAGEIROS. DEVEM SAIR.");
				System.out.println();
				int sair = passageiros - 15;
				System.err.println("DEVEM SAIR "+sair+" PESSOAS PARA OBEDECER O LIMITE.");
				passageiros -= sair;
				System.out.println("Sairam "+sair+" pessoas e o elevador agora segue obedecendo ao seu limite.");
				System.out.println();
			}
			if (passageiros > maisPassageiros) {
				maisPessoas = i;
				maisPassageiros = passageiros;
			}
		}
		
		System.out.println("No �ltimo andar haviam "+passageiros+" pessoas no elevador para descer.");
		System.out.println("O "+maisPessoas+"� andar foi o andar no qual o elevador teve mais pessoas, com "+maisPassageiros+" passageiros.");
		
		sc.close();
	}

}
