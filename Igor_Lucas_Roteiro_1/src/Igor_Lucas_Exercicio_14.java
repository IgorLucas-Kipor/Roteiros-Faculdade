//Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m2, deve-se usar 18 W de
//potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
//mostre a área de mesmo (em m2) e a potência de iluminação necessária para iluminar corretamente o
//cômodo.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_14 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Integer base, altura, area, potencia;
	System.out.print("Insira o valor da base do cômodo em metros: ");
	base = in.nextInt();
	System.out.print("Insira o valor da altura do cômodo em metros: ");
	altura = in.nextInt();
	area = base * altura;
	potencia = area * 18;
	System.out.println("A potência de iluminação necessária para iluminar corretamente o cômodo será de "+potencia+" W.");
	in.close();
}
}
