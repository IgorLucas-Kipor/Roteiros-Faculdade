//Fazer um algoritmo que:
//a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas
//estas que variam de 0 a 10 (valide as entradas);
//b. Calcule a frequência absoluta e a frequência relativa de cada nota;
//c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências
//absoluta e relativa.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aluno[] = new int[80];
		
		int fa0=0, fa1=0, fa2=0, fa3=0, fa4=0, fa5=0, fa6=0, fa7=0, fa8=0, fa9=0, fa10=0;
		double fr0=0, fr1=0, fr2=0, fr3=0, fr4=0, fr5=0, fr6=0, fr7=0, fr8=0, fr9=0, fr10=0;
		
		for (int i=0; i<aluno.length; i++) {
			System.out.print("Insira a nota do "+(1+i)+"º aluno: ");
			aluno[i] = sc.nextInt();
			while (aluno[i] < 0 || aluno[i] > 10) {
				System.err.print("Nota deve ser entre 0 e 10. Insira uma nota válida: ");
				aluno[i] = sc.nextInt();
			}
			
			switch(aluno[i]) {
			case 0:
				fa0++;
				break;
			case 1:
				fa1++;
				break;
			case 2:
				fa2++;
				break;
			case 3:
				fa3++;
				break;
			case 4:
				fa4++;
				break;
			case 5:
				fa5++;
				break;
			case 6:
				fa6++;
				break;
			case 7:
				fa7++;
				break;
			case 8:
				fa8++;
				break;
			case 9:
				fa9++;
				break;
			case 10:
				fa10++;
				break;
			}
		}
		
		fr0 = (Double.valueOf(fa0)/80) * 100;
		fr1 = (Double.valueOf(fa1)/80) * 100;
		fr2 = (Double.valueOf(fa2)/80) * 100;
		fr3 = (Double.valueOf(fa3)/80) * 100;
		fr4 = (Double.valueOf(fa4)/80) * 100;
		fr5 = (Double.valueOf(fa5)/80) * 100;
		fr6 = (Double.valueOf(fa6)/80) * 100;
		fr7 = (Double.valueOf(fa7)/80) * 100;
		fr8 = (Double.valueOf(fa8)/80) * 100;
		fr9 = (Double.valueOf(fa9)/80) * 100;
		fr10 = (Double.valueOf(fa10)/80) * 100;
//		fr1 = (fa1/10) * 100;
//		fr2 = (fa2/10) * 100;
//		fr3 = (fa3/10) * 100;
//		fr4 = (fa4/10) * 100;
//		fr5 = (fa5/10) * 100;
//		fr6 = (fa6/10) * 100;
//		fr7 = (fa7/10) * 100;
//		fr8 = (fa8/10) * 100;
//		fr9 = (fa9/10) * 100;
//		fr10 = (fa10/10) * 100;
		
//		System.out.println("A frequência absoluta da nota 0 é "+fa0+" e a sua frequência relativa é "+fr0);

		System.out.printf("A frequência absoluta da nota 0 é %d e a sua frequência relativa é %.2f porcento.%n", fa0, fr0);
		System.out.printf("A frequência absoluta da nota 1 é %d e a sua frequência relativa é %.2f porcento.%n", fa1, fr1);
		System.out.printf("A frequência absoluta da nota 2 é %d e a sua frequência relativa é %.2f porcento.%n", fa2, fr2);
		System.out.printf("A frequência absoluta da nota 3 é %d e a sua frequência relativa é %.2f porcento.%n", fa3, fr3);
		System.out.printf("A frequência absoluta da nota 4 é %d e a sua frequência relativa é %.2f porcento.%n", fa4, fr4);
		System.out.printf("A frequência absoluta da nota 5 é %d e a sua frequência relativa é %.2f porcento.%n", fa5, fr5);
		System.out.printf("A frequência absoluta da nota 6 é %d e a sua frequência relativa é %.2f porcento.%n", fa6, fr6);
		System.out.printf("A frequência absoluta da nota 7 é %d e a sua frequência relativa é %.2f porcento.%n", fa7, fr7);
		System.out.printf("A frequência absoluta da nota 8 é %d e a sua frequência relativa é %.2f porcento.%n", fa8, fr8);
		System.out.printf("A frequência absoluta da nota 9 é %d e a sua frequência relativa é %.2f porcento.%n", fa9, fr9);
		System.out.printf("A frequência absoluta da nota 10 é %d e a sua frequência relativa é %.2f porcento.%n", fa10, fr10);
			
		
		sc.close();
	}

}
