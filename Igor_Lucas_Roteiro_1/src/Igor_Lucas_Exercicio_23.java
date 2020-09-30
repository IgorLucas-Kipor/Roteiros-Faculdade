//Num dado momento, 3 canais de TV tinham, em sua programa��o, novelas em seu hor�rio nobre: canal A,
//novela A, canal B, novela B, canal C novela C. Numa pesquisa com 3000 pessoas, perguntou-se quais
//novela agradavam. A tabela a seguir mostra o resultado da pesquisa:
//Novelas No de telespectadores
//A 1450
//B 1150
//C 900
//A e B 350
//A e C 400
//B e C 300
//A, B e C 100
//
//Implemente um algoritmo que encontre o n�mero de telespectadores que nenhuma das novelas os agradam.
//Receba as informa��es de prefer�ncias na entrada de dados e utilize as f�rmulas de teoria dos conjuntos.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_23 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Integer a, b, c, ab, ac, bc, abc, numeroEntrevistados, naoGostam;
	System.out.print("Insira o n�mero de entrevistados: ");
	numeroEntrevistados = in.nextInt();
	System.out.print("Insira quantos telespectadores gostam da novela A: ");
	a = in.nextInt();
	System.out.print("Insira quantos telespectadores gostam da novela B: ");
	b = in.nextInt();
	System.out.print("Insira quantos telespectadores gostam da novela C: ");
	c = in.nextInt();
	System.out.print("Insira quantos telespectadores gostam da novela A e B: ");
	ab = in.nextInt();
	System.out.print("Insira quantos telespectadores gostam da novela A e C: ");
	ac = in.nextInt();
	System.out.print("Insira quantos telespectadores gostam da novela B e C: ");
	bc = in.nextInt();
	System.out.print("Insira quantos telespectadores gostam da novela A, B e C: ");
	abc = in.nextInt();
	ab = ab - abc;
	ac = ac - abc;
	bc = bc - abc;
	a = a - ab - ac - abc;
	b = b - ab - bc - abc;
	c = c - ac - bc - abc;
	naoGostam = numeroEntrevistados - a - b - c - ac - ab - bc - abc;
	System.out.println("O n�mero de entrevistados que n�o gostam de nenhuma das novelas � "+naoGostam+".");
	in.close();
}
}
