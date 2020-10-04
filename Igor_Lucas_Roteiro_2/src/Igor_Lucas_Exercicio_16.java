//Faça um programa que receba de entrada a data de votação do ano atual e a data de nascimento de uma
//pessoa. Utilizando as informações pesquisadas na questão anterior, verifique se essa pessoa não pode votar,
//é obrigada a votar ou o voto e facultativo, segundo as regras brasileiras.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Igor_Lucas_Exercicio_16 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Insira a data atual (formato dd/mm/aaaa): ");
		Date dataAtual = formato.parse(sc.nextLine());
		System.out.print("Insira o seu ano de nascimento (formato dd/mm/aaaa): ");
		Date nascimento = formato.parse(sc.nextLine());
		
		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(dataAtual);
		int anoAtual = cal1.get(Calendar.YEAR);
		int mesAtual = cal1.get(Calendar.MONTH);
		int diaAtual = cal1.get(Calendar.DAY_OF_MONTH);
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(nascimento);
		int anoNascimento = cal2.get(Calendar.YEAR);
		int mesNascimento = cal2.get(Calendar.MONTH);
		int diaNascimento = cal2.get(Calendar.DAY_OF_MONTH);
		int idade = anoAtual - anoNascimento - 1;
		
		if (mesAtual > mesNascimento || (mesAtual == mesNascimento && diaAtual >= diaNascimento)) {
			idade++;
		}
//		System.out.println(idade);
		if (idade < 16) {
			System.out.println("Não vota.");
		} else if ((idade >= 16 && idade < 18) || idade > 70) {
			System.out.println("Voto facultativo.");
		} else if (idade >= 18 && idade <= 70){
			System.out.println("Voto obrigatório.");
		}
		sc.close();
	}

}
