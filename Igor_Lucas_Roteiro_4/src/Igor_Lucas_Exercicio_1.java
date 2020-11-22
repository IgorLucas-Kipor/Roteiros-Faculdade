//Uma turma possui 40 alunos. Fa�a um programa que leia o nome e a idade de todos os alunos e logo
//em seguida imprima:
//A. Total de alunos com idade menor ou igual a 16 anos
//B. Total de alunos com idade maior que 16 anos
//C. M�dia das idades
//D. Alunos com idade acima da m�dia
//E. Nome e Idade do aluno mais novo
//F. Nome e Idade do aluno mais velho

import java.util.Scanner;
public class Igor_Lucas_Exercicio_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idadeAlunos[] = new int[40];
		String nomeAlunos[] = new String[40];
		
		int maisVelho = 0, maisNovo = 0, menorDezesseis = 0, maiorDezesseis = 0;
		double media = 0, totalAlunos = 0;
		String alunoVelho = "", alunoNovo = "";
		
		for (int i=0; i<idadeAlunos.length; i++) {
			System.out.print("Insira o nome do aluno: ");
			nomeAlunos[i] = sc.next();
			System.out.print("Insira a idade do aluno: ");
			idadeAlunos[i] = sc.nextInt();
			if (i==0) {
				maisVelho = idadeAlunos[i];
				maisNovo = idadeAlunos[i];
				alunoVelho = nomeAlunos[i];
				alunoNovo = nomeAlunos[i];
			} else {
				if (idadeAlunos[i] > maisVelho) {
					maisVelho = idadeAlunos[i];
					alunoVelho = nomeAlunos[i];
				} else if (idadeAlunos[i] < maisNovo) {
					maisNovo = idadeAlunos[i];
					alunoNovo = nomeAlunos[i];
				}
			}
			
			if (idadeAlunos[i] > 16) {
				maiorDezesseis++;
			} else if (idadeAlunos[i] <= 16) {
				menorDezesseis++;
			}
			
			media += idadeAlunos[i];
			totalAlunos++;
		}
		
		media = media/totalAlunos;
		
		System.out.println("O total de alunos com mais de 16 anos �: "+maiorDezesseis);
		System.out.println("O total de alunos com 16 anos ou menos �: "+menorDezesseis);
		System.out.println("A m�dia das idades �: "+media);
		System.out.println("Os alunos com idade acima da m�dia s�o:");
		
		for (int i=0; i<nomeAlunos.length; i++) {
			if (idadeAlunos[i] > media) {
				System.out.println(nomeAlunos[i]);
			}
		}
		
		System.out.println("O aluno mais novo � "+alunoNovo+", com "+maisNovo+" anos.");
		System.out.println("O aluno mais velho � "+alunoVelho+", com "+maisVelho+" anos.");
		
		
		sc.close();

	}

}
