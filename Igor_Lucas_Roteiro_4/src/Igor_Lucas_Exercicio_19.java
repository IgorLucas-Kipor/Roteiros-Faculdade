//Implemente um algoritmo que preencha com valores inteiros um vetor de 10 posições. Em seguida
//solicite o usuário que digite um valor qualquer e pesquise se o valor informado pelo usuário pertence
//ou não ao vetor preenchido inicialmente. Caso não, mostre a mensagem “O valor X não está presente
//no vetor”; caso sim, mostre a mensagem “O valor X está na posição Y do vetor”. Exemplo:
//Vetor preenchido:
//Valor digitado pelo usuário: 30 -> Mensagem: “Valor 30 não está presente no vetor”
//Valor digitado pelo usuário: 84 -> Mensagem: “Valor 84 está na posição 5 no vetor”

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Insira o "+(1+i)+"º termo do vetor: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println();
		
		System.out.print("Digite o número que você deseja encontrar: ");
		
		int n = sc.nextInt();
		
		int verificador=1;
		
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] == n) {
				System.out.println("Valor "+n+" está na posição "+i+" do vetor.");
				verificador = 0;
			}
		}
		
		if (verificador==1) {
			System.out.println("Valor "+n+" não está presente no vetor.");
		}
		
		sc.close();

	}

}
