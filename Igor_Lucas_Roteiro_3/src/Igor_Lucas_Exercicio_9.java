//Fa�a um programa que calcule e imprima a soma e a m�dia de N n�meros digitados pelo usu�rio. O valor
//de N deve ser fornecido pelo usu�rio.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos n�meros voc� deseja que sejam somados: ");
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.err.println("Valor de n deve ser maior do que 0.");
			System.exit(0);
		}
		
		double soma=0, valor=0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o "+i+"� n�mero: ");
			valor = sc.nextDouble();
			soma = soma + valor;
		}
		
		double media = soma / n;
		
		System.out.println("O resultado da soma dos n�meros digitados �: "+soma+".");
		System.out.println("A m�dia dos n�meros digitados �: "+media+".");
		sc.close();

	}

}
