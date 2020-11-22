//Desenvolva um programa que identifique, armazene em um vetor e mostre os 100 primeiros números
//primos a partir de 1. O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes. Como
//desafio, implemente o algoritmo utilizando a “forma tradicional” e depois utilizando o crivo de
//Eratóstenes, compute os tempos de ambas implementações e verifique a diferença entre os mesmos.
public class Igor_Lucas_Exercicio_17 {

	public static void main(String[] args) {
		// forma tradicional
		
		int contadorPrimos = 0;
		int verificadorPrimo = 0;
		
		int numerosPrimos[] = new int [100];
		
		for (int i=2; contadorPrimos <= 99; i++) {
			for (int j=1; j<=i; j++) {
				if ((j != 1 && j != i) && i % j == 0) {
					verificadorPrimo = 1;
				}
			}
			
			if (verificadorPrimo != 1) {
				numerosPrimos[contadorPrimos] = i;
				contadorPrimos++;
			}
			
			verificadorPrimo = 0;
		}

		System.out.println("Numeros Primos:");
		for (int v : numerosPrimos) {
			System.out.print(v+" ");
		}
		
		// usando crivo
		
		int maximo = 541;
		
		boolean primo[] = new boolean[maximo+1];
		
		for (int i=2; i<primo.length; i++) {
			primo[i] = true;
		}
		
		int primosCrivo[] = new int[100];
		
		for (int i=2; i<=maximo; i++) {
			if (primo[i] == true) {
				for (int j = 1; j<=i; j++) {
						if ((j != 1 && j != i) && i % j == 0) {
							primo[i] = false;
							verificadorPrimo = 1;
						}
					}
					
					if (verificadorPrimo != 1) {
						for (int k = i * i; k<maximo; k+=i) {
							primo[k] = false;
					}
				}
					verificadorPrimo = 0;
				}
			}	
		
		contadorPrimos = 0;
		
		for (int i=2; i<=maximo; i++) {
			if (primo[i] == true) {
				primosCrivo[contadorPrimos] = i;
				contadorPrimos++;
			}
		}
		
		System.out.println();
		
		System.out.println();
		
		System.out.println("Vetor Crivo:");
		
		for (int v : primosCrivo) {
			System.out.print(v+" ");
		}
	}

}
