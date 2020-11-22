import java.util.Scanner;

//Em uma competição somente atletas que possuem altura maior ou igual a média geral das alturas dos
//inscritos podem participar. Sabe-se que a organização recebeu 20 inscrições. Faça um programa que
//identifique e mostre quais atletas podem participar da competição.

public class Igor_Lucas_Exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double atleta[] = new double[8];
		
		double media=0, numeroAtletas=0;
		
		for (int i=0; i<atleta.length; i++) {
			System.out.print("Insira a altura do "+(1+i)+"º atleta: ");
			atleta[i] = sc.nextDouble();
			media += atleta[i];
			numeroAtletas++;
		}
		
		media /= numeroAtletas;
//		System.out.println("Media: "+media);
		
		
		System.out.println("Os atletas que podem participar são:");
		for (int i=0; i<atleta.length; i++) {
			if (atleta[i] >= media) {
				System.out.println("Atleta nº "+(i+1));
			}
		}
		
		
		sc.close();
		
	}

}
