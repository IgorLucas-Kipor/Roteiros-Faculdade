//Escreva um programa que leia um conjunto de 50 fichas correspondente � alunos e armazene-as em
//vetores, cada uma contendo, a altura e o c�digo do sexo de uma pessoa (c�digo = 1 se for masculino e
//2 se for feminino), e calcule e imprima:
//- A maior, menor e a m�dias das alturas da turma;
//- As mulheres com altura acima da m�dia da altura dos homens;
//- Os homens com altura abaixo da m�dia da altura das mulheres;
//- As pessoas com altura abaixo da m�dia da turma.


import java.util.Scanner;
public class Igor_Lucas_Exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nome[] = new String[50];
		
		double altura[] = new double[50];
		
		int codigo[] = new int[50];
		
		double mediaM=0, maior=0, menor=0, mediaH=0, media=0, nM=0, nH=0;
		
		for (int i=0; i<altura.length; i++) {
			System.out.print("Insira o nome do "+(i+1)+"� aluno: ");
			nome[i] = sc.next();
			System.out.print("Insira a altura do "+(i+1)+"� aluno: ");
			altura[i] = sc.nextDouble();
			System.out.print("Insira o c�digo do aluno (1 para homem, 2 para mulher): ");
			codigo[i] = sc.nextInt();
			while (codigo[i] != 1 && codigo[i] != 2) {
				System.err.print("C�digo inv�lido. Por favor, insira 1 para homem ou 2 para mulher: ");
				codigo[i] = sc.nextInt();
			}
			
			if (i == 0) {
				maior = altura[i];
				menor = altura[i];
			} else {
				if (altura[i] > maior) {
					maior = altura[i];
				} else if (altura[i] < menor) {
					menor = altura[i];
				}
			}
			
			media += altura[i];
			if (codigo[i] == 1) {
				mediaH += altura[i];
				nH++;
			} else if (codigo[i] == 2) {
				mediaM += altura[i];
				nM++;
			}
		}
		
		media /= 50;
		mediaH /= nH;
		mediaM /= nM;
		
		System.out.println("A pessoa mais alta da turma tem "+maior+" de altura.");
		System.out.println("A pessoa mais baixa da turma tem "+menor+" de altura.");
		System.out.println("A m�dia de altura entre as mulheres da turma � de "+mediaM+".");
		System.out.println("A m�dia de altura entre os homens da turma � de "+mediaH+".");
		System.out.println("A altura m�dia geral da turma � de  "+media+".");
		
		System.out.println();
		System.out.println("As mulheres maiores que a m�dia dos homens da turma s�o:");
		
		for (int i=0; i<altura.length; i++) {
			if (codigo[i] == 2 && altura[i] > mediaH) {
				System.out.println(nome[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Os homens menores que a m�dia das mulheres da turma s�o:");
		
		for (int i=0; i<altura.length; i++) {
			if (codigo[i] == 1 && altura[i] < mediaM) {
				System.out.println(nome[i]+" ");
			}
		}
		System.out.println();
		System.out.println("As pessoas menores do que a m�dia geral da turma s�o:");
		
		for (int i=0; i<altura.length; i++) {
			if (altura[i] < media) {
				System.out.println(nome[i]+" ");
			}
		}
		
		sc.close();
	}

}
