//Faça um programa que preencha um vetor A de 10 posições e calcule o valor de S da seguinte forma:
//
//S = (a[0] - a[9]) 2 + (a[1] - a[8])2 + (a[2] - a[7])2 + (a[3] - a[6])2 + (a[4] - a[5])2

import java.util.Scanner;
public class Igor_Lucas_Exercicio_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a[] = new double[10];
		
		for (int i=0; i<a.length; i++) {
			System.out.print("Insira o valor da "+(1+i)+"º posição do vetor: ");
			a[i] = sc.nextDouble();
		}
		
		double s=0;
		int contadorReverso = 9;
		
		for (int i=0; i<5; i++) {
			s += Math.pow((a[i] - a[contadorReverso]), 2);
			contadorReverso--;
		}
		
		System.out.println("O valor de S é: "+s);
		
		System.out.println();
		
		sc.close();
	}

}
