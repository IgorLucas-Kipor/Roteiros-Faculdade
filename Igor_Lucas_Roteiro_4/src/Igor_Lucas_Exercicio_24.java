//Entrada
//A primeira linha da entrada contém um inteiro N, representando a
//quantidade de flechas lançadas. Cada uma das N linhas seguintes
//contém dois inteiros, X e Y , indicando as coordenadas do ponto em
//que cada flecha atingiu o alvo, definindo a sequência de lançamentos.
//Saída
//Imprima uma linha contendo um inteiro representando a penalidade total do atleta.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número de flecha disparadas: ");
		
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.print("O número de flechas disparadas de ser maior do que 0. Insira um valor válido: ");
			n = sc.nextInt();
		}
		
		int penalidade = 0;
		
		int x[] = new int[n];
		int y[] = new int[n];
		boolean verificador[] = new boolean[n];
		
		//inserindo disparos
		
		for (int i=0; i<x.length; i++) {
			System.out.print("Insira os valores da "+(1+i)+"º sequência de x e y: ");
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		for (int i=x.length-1; i<x.length; i++) {
				for (int j=0; j<x.length-1; j++) {
					if (x[i] > 0 && y[i] > 0) {
						if (x[j] <= x[i] && x[j] >= 0 && y[j] <= y[i] && y[j] >= 0) {
							verificador[j] = true;
						} else if (x[j] <= x[i] && x[j] >= 0 && y[j] > y[i] && y[j] >= 0) {
							int dif1 = x[i] - x[j];
							int dif2 = y[i] - y[j];
							int dif = dif1 + dif2;
							if (dif >= 0) {
								verificador[j] = true;
							}
						} else if (x[j] > x[i] && x[j] >= 0 && y[j] <= y[i] && y[j] >= 0) {
							int dif1 = x[i] - x[j];
							int dif2 = y[i] - y[j];
							int dif = dif1 + dif2;
							if (dif >= 0) {
								verificador[j] = true;
							}
						}
					} else if (x[i] < 0 && y[i] < 0) {
						if (x[j] >= x[i] && x[j] <= 0 && y[j] >= y[i] && y[j] <= 0) {
							verificador[j] = true;
						} else if (x[j] >= x[i] && x[j] <= 0 && y[j] < y[i] && y[j] <= 0) {
							int dif1 = x[i] - x[j];
							int dif2 = y[i] - y[j];
							int dif = dif1 + dif2;
							if (dif <= 0) {
								verificador[j] = true;
							}
						} else if (x[j] < x[i] && x[j] <= 0 && y[j] >= y[i] && y[j] <= 0) {
							int dif1 = x[i] - x[j];
							int dif2 = y[i] - y[j];
							int dif = dif1 + dif2;
							if (dif <= 0) {
								verificador[j] = true;
							}
						}
					}
				}
			}
		
		for (int i=0; i<x.length-1; i++) {
			if (verificador[i] == true) {
				penalidade += (1+i);
			}
		}
		
		System.out.println("Penalidade: "+penalidade);
		
		sc.close();

	}

}
