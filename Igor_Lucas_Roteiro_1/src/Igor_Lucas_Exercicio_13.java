//A copa do mundo de futebol da FIFA � uma competi��o internacional que iniciou em 1930, acontecendo
//desde ent�o de 4 em 4 anos, exceto durante o per�odo das guerras mundiais que impossibilitaram a
//realiza��o 2 copas mundiais. Sabendo dessas informa��es, fa�a um algoritmo em JAVA que dado o ano
//atual calcule o n�mero de copas j� realizadas e exiba o resultado ao usu�rio.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_13 {
public static void main(String[] args) {
	Scanner ano = new Scanner(System.in);
	Integer anoAtual, copasRealizadas;
	System.out.print("Insira o ano atual: ");
	anoAtual = ano.nextInt();
	copasRealizadas = ((anoAtual - 1930)/4)-1;
	System.out.println("At� o ano de "+anoAtual+", foram realizadas "+copasRealizadas+" copas.");
	ano.close();
}
}
