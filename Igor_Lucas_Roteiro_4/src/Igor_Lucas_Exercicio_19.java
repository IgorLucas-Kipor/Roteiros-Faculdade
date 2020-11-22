//Implemente um algoritmo que preencha com valores inteiros um vetor de 10 posi��es. Em seguida
//solicite o usu�rio que digite um valor qualquer e pesquise se o valor informado pelo usu�rio pertence
//ou n�o ao vetor preenchido inicialmente. Caso n�o, mostre a mensagem �O valor X n�o est� presente
//no vetor�; caso sim, mostre a mensagem �O valor X est� na posi��o Y do vetor�. Exemplo:
//Vetor preenchido:
//Valor digitado pelo usu�rio: 30 -> Mensagem: �Valor 30 n�o est� presente no vetor�
//Valor digitado pelo usu�rio: 84 -> Mensagem: �Valor 84 est� na posi��o 5 no vetor�

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Insira o "+(1+i)+"� termo do vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Digite o n�mero que voc� deseja encontrar: ");
		
		int n = sc.nextInt();
		
		int verificador=1;
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] == n) {
				System.out.println("Valor "+n+" est� na posi��o "+i+" do vetor.");
				verificador = 0;
			}
		}
		
		if (verificador==1) {
			System.out.println("Valor "+n+" n�o est� presente no vetor.");
		}
		
		sc.close();

	}

}
