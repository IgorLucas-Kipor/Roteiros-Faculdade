import java.util.Scanner;

//Leia um conjunto de N números inteiros (N<=100). Faça a divisão destes números em dois outros
//conjuntos seguindo a regra: Conjunto 1 – Apenas números positivos e pares e Conjunto 2 – Apenas
//números ímpares e/ou negativos.
public class Igor_Lucas_Exercicio_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantos números inteiros o conjunto deverá ler: ");
		
		int n = sc.nextInt();
		
		int conjunto[] = new int[n];
		
		int contadorPositivoPar=0, contadorNegativoImpar=0;
		
		for (int i=0; i<conjunto.length; i++) {
			System.out.print("Insira o "+(1+i)+"º elemento do conjunto: ");
			conjunto[i] = sc.nextInt();
			if (conjunto[i] % 2 == 0 && conjunto[i] >= 0) {
				contadorPositivoPar++;
			} else if (conjunto[i] % 2 != 0 || conjunto[i] < 0) {
				contadorNegativoImpar++;
			}
		}
		
		int conjunto1[] = new int[contadorPositivoPar];
		int conjunto2[] = new int[contadorNegativoImpar];
		
		contadorPositivoPar=0;
		contadorNegativoImpar=0;
		
		for (int i=0; i<conjunto.length; i++) {
			if (conjunto[i] % 2 == 0 && conjunto[i] >= 0) {
				conjunto1[contadorPositivoPar] = conjunto[i];
				contadorPositivoPar++;
			} else if (conjunto[i] % 2 != 0 || conjunto[i] < 0) {
				conjunto2[contadorNegativoImpar] = conjunto[i];
				contadorNegativoImpar++;
			}
		}
		
		System.out.println("Conjunto:");
		
		for (int c : conjunto) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		System.out.println("Conjunto 1 (positivos e pares):");
		
		for (int c1 : conjunto1) {
			System.out.print(c1+" ");
		}
		
		System.out.println();
		
		System.out.println("Conjunto 2 (negativos e/ou ímpares):");
		
		for (int c2 : conjunto2) {
			System.out.print(c2+" ");
		}
		
		
		
		
		sc.close();
	}

}
