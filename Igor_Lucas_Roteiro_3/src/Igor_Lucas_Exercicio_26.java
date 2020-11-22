//Implementar um algoritmo para calcular o sen(X). Sabe-se que o valor de X deverá ser fornecido pelo
//usuário em graus. O valor do seno de X será calculado pela soma dos 15 primeiros termos da série a
//seguir:

import java.util.Scanner;
public class Igor_Lucas_Exercicio_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de X em graus: ");
		double x = sc.nextDouble();
		
		if (x<0) {
			System.err.println("X não pode ser negativo.");
			System.exit(1);
		}
		
		double divisor=1, fatorial=1, seno=0, potencia = 0, expoente = 1;
		
		for (int i = 1; i<=15; i++) {
			for (int b = 1; b <= divisor; b++) {
				fatorial = fatorial * b; 
			}
			potencia = Math.pow(x, expoente);
			if (i % 2 != 0) {
				seno += (potencia / fatorial);
			}
			else if (i % 2 == 0) {
				seno -= (potencia / fatorial);
			}
			divisor = divisor + 2;
			expoente = expoente + 2;
			fatorial = 1;
		}
		
		System.out.println("O seno do valor de x de "+x+" é "+seno+".");
		
		sc.close();

	}

}
