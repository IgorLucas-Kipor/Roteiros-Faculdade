//Faça um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize
//divisão inteira e resto da divisão inteira).

import java.util.Scanner;
public class Igor_Lucas_Exercicio_16 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Integer quantidadeMinutos, minutos, horas;
	System.out.print("Insira a quantidade de minutos que você quer que seja convertida: ");
	quantidadeMinutos = in.nextInt();
	horas = quantidadeMinutos / 60;
	minutos = quantidadeMinutos % 60;
	System.out.println("A conversão da quantidade de minutos inserida resulta em "+horas+" hora(s) e "+minutos+" minuto(s).");
	in.close();
}
}
