//Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores
//digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos números você deseja digitar: ");
		int n = sc.nextInt();
		
		if (n <= 0) {
			System.err.println("Valor de n deve ser maior do que 0.");
			System.exit(0);
		}
		
		double numero=0, maior=0, menor=0;
		
		for (int i = 1; i <= n; i++) {
			System.out.print("Digite o "+i+"º número: ");
			numero = sc.nextDouble();
			if (maior == 0 && menor == 0) {
				maior = numero;
				menor = numero;
			}
			else if (numero > maior) {
				maior = numero;
			} else if (numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("O maior dos números digitados é "+maior+" e o menor dos números digitados é "+menor+".");
		sc.close();

	}

}