//A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
//desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
//realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
//atual calcule o número de copas já realizadas e exiba o resultado ao usuário.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_13 {
public static void main(String[] args) {
	Scanner ano = new Scanner(System.in);
	Integer anoAtual, copasRealizadas;
	System.out.print("Insira o ano atual: ");
	anoAtual = ano.nextInt();
	copasRealizadas = ((anoAtual - 1930)/4)-1;
	System.out.println("Até o ano de "+anoAtual+", foram realizadas "+copasRealizadas+" copas.");
	ano.close();
}
}
