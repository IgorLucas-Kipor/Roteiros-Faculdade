//Sabe-se que, para iluminar corretamente os c�modos de uma casa, para cada m2, deve-se usar 18 W de
//pot�ncia. Fa�a um programa que receba as dimens�es de um c�modo retangular (em metros), calcule e
//mostre a �rea de mesmo (em m2) e a pot�ncia de ilumina��o necess�ria para iluminar corretamente o
//c�modo.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_14 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Integer base, altura, area, potencia;
	System.out.print("Insira o valor da base do c�modo em metros: ");
	base = in.nextInt();
	System.out.print("Insira o valor da altura do c�modo em metros: ");
	altura = in.nextInt();
	area = base * altura;
	potencia = area * 18;
	System.out.println("A pot�ncia de ilumina��o necess�ria para iluminar corretamente o c�modo ser� de "+potencia+" W.");
	in.close();
}
}
