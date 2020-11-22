//Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos e imprima a maior e a
//menor nota computada e qual aluno tirou tais notas. Além disso, calcule e imprima também a soma e a
//média de todas as notas.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos alunos serão computados: ");
		
		int nAlunos = sc.nextInt();
		
		if (nAlunos <= 0) {
			System.err.println("Número de alunos deve ser maior do que 0.");
			System.exit(0);;
		}
		
		double nota=0, maiorNota=0, menorNota=0;
		
		String aluno="a", maiorAluno="a", menorAluno="a";
		
		for (int i = 0; i < nAlunos; i++) {
			System.out.print("Insira o nome do aluno: ");
			aluno = sc.nextLine();
			aluno = sc.nextLine();
			System.out.print("Insira a nota do aluno: ");
			nota = sc.nextDouble();
			if ( i == 0) {
				maiorNota = nota;
				menorNota = nota;
				maiorAluno = aluno;
				menorAluno = aluno;
			} else if (nota > maiorNota) {
				maiorAluno = aluno;
				maiorNota = nota;
			} else if (nota < menorNota) {
				menorAluno = aluno;
				menorNota = nota;
			}
			
		}
		
		System.out.println("O aluno com a maior nota na prova foi "+maiorAluno+", com a nota de "+maiorNota+".");
		System.out.println("O aluno com a menor nota na prova foi "+menorAluno+", com a nota de "+menorNota+".");
		
		
		sc.close();
	}

}
