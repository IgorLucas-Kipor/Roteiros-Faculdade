//Fa�a um algoritmo que receba duas datas (dia, m�s e ano) e determine a maior entre elas. Voc� dever�
//receber as datas no formato de uma String e fazer as devidas compara��es. Pesquisem sobre as classes
//Date e Calendar.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Igor_Lucas_Exercicio_15 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Insira a primeira data (modelo dd/MM/aaaa): ");
		
		Date data1 = formato.parse(sc.nextLine());
		System.out.print("Insira a segunda data (modelo dd/MM/aaaa): ");
		Date data2 = formato.parse(sc.nextLine());
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(data1);
		int ano1 = cal1.get(Calendar.YEAR); //pega o ano
		int mes1 = cal1.get(Calendar.MONTH); //pega o m�s
		int dia1 = cal1.get(Calendar.DAY_OF_MONTH); //pega o dia
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(data2);
		int ano2 = cal2.get(Calendar.YEAR);
		int mes2 = cal2.get(Calendar.MONTH);
		int dia2 = cal2.get(Calendar.DAY_OF_MONTH);
		
		if (ano1 > ano2) { //compara os anos primeiramente
			System.out.println("A primeira data inserida, "+formato.format(data1)+", � a maior.");
		} else if (ano2 > ano1) {
			System.out.println("A segunda data inserida, "+formato.format(data2)+", � a maior.");
		} else {
			if ( mes1 > mes2) { //se a compara��o dos anos for igual, compara m�s
				System.out.println("A primeira data inserida, "+formato.format(data1)+", � a maior.");
			} else if ( mes1 < mes2) {
				System.out.println("A segunda data inserida, "+formato.format(data2)+", � a maior.");
			} else {
				if (dia1 > dia2) { //se a compara��o dos meses tamb�m falhar, compara dia
					System.out.println("A primeira data inserida, "+formato.format(data1)+", � a maior.");
				} else if (dia2 > dia1) {
					System.out.println("A segunda data inserida, "+formato.format(data2)+", � a maior.");
				} else {
					System.out.println("As datas s�o iguais."); //se ano, m�s e dia forem iguais, diz que s�o iguais
				}
			}
		}
		
		sc.close();
//		System.out.println(formato.format(data1));
//		System.out.println(formato.format(data2));
			

	}

}
