//Faça um algoritmo que leia o número de andares de um prédio e, a seguir,
//para cada andar do prédio, leia o número de pessoas que entraram e saíram do elevador.
//Considere que o estado inicial do elevador é vazio, no primeiro andar e subindo. Os dados
//inseridos se referem a apenas uma “subida” do elevador e que o número de pessoas dentro do
//elevador sempre será maior ou igual a 0. Se o número de pessoas, após a entrada e saída em
//qualquer um dos andares for maior que 15, deve ser mostrada a mensagem “EXCESSO DE
//PASSAGEIROS. DEVEM SAIR" em seguida, o número de pessoas que devem sair do
//elevador, de modo que seja obedecido o limite de 15 passageiros. Após a entrada e saída de
//pessoas no último andar o algoritmo deve mostrar quantas pessoas estarão no elevador para
//descer. Além disso, mostre qual foi o andar que possuía mais pessoas dentro do elevador.

import java.util.Scanner;
public class IgorLucas1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de andares do prédio: ");
		
		int andares = sc.nextInt();
		
		while (andares < 1) {
			System.err.println("Número de andares não pode ser igual ou menor a 0. Por favor, insira um número válido: ");
			andares = sc.nextInt();
		}
		int passageiros = 0;
		int maisPessoas = 0, maisPassageiros=0;
		
		for (int i=1; i<=andares; i++) {
			System.out.println(i+"º andar:");
			System.out.print("Insira quantos passageiros irão entrar no elevador: ");
			int n = sc.nextInt();
			while (n < 0) {
				System.err.print("Não pode entrar um número negativo de pessoas. Favor digitar um valor válido: ");
				n = sc.nextInt();
			}
			passageiros += n;
			System.out.print("Insira quantos passageiros irão sair do elevador: ");
			n = sc.nextInt();
			while (passageiros - n < 0) {
				System.out.print("O elevador não pode ficar com um número negativo de passageiros. Por favor, insira outro valor: ");
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
		
		System.out.println("No último andar haviam "+passageiros+" pessoas no elevador para descer.");
		System.out.println("O "+maisPessoas+"º andar foi o andar no qual o elevador teve mais pessoas, com "+maisPassageiros+" passageiros.");
		
		sc.close();
	}

}
