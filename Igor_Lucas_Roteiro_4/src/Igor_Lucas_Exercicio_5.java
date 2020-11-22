import java.util.Scanner;

//Em uma competi��o somente atletas que possuem altura maior ou igual a m�dia geral das alturas dos
//inscritos podem participar. Sabe-se que a organiza��o recebeu 20 inscri��es. Fa�a um programa que
//identifique e mostre quais atletas podem participar da competi��o.

public class Igor_Lucas_Exercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double atleta[] = new double[8];
		
		double media=0, numeroAtletas=0;
		
		for (int i=0; i<atleta.length; i++) {
			System.out.print("Insira a altura do "+(1+i)+"� atleta: ");
			atleta[i] = sc.nextDouble();
			media += atleta[i];
			numeroAtletas++;
		}
		
		media /= numeroAtletas;
//		System.out.println("Media: "+media);
		
		
		System.out.println("Os atletas que podem participar s�o:");
		for (int i=0; i<atleta.length; i++) {
			if (atleta[i] >= media) {
				System.out.println("Atleta n� "+(i+1));
			}
		}
		
		
		sc.close();
		
	}

}
