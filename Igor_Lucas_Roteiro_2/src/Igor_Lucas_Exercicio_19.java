//Implemente um algoritmo que receba de entrada um valor inteiro com 4 d�gitos e verifique se o mesmo
//pertence � fam�lia dos bin�rios. Para isto, �desmembre� o n�mero digitado verifique se foram digitados
//somente bits. Caso o n�mero digitado seja bin�rio, seu algoritmo deve o converter para decimal e mostrar o
//rsultado.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um valor de quatro d�gitos: ");
		int num = sc.nextInt();
		int d1 = num/1000; //pega d�gito mais a esquerda
		int aux = num%1000; //armazena outros tr�s d�gitos
		int d2 = aux/100; //pega d�gito mais a esquerda
		aux = num%100; //armazena outros dois d�gitos
		int d3 = aux/10; //pega d�gito da direita
		aux = num%10; //armazena �ltimo d�gito
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
//		System.out.println(aux);
		if ((d1 != 0 && d1 !=1) || (d2 != 0 && d2 !=1) || (d3 != 0 && d3 != 1) || (aux != 0 && aux != 1)) {
			System.err.println("Valor inserido n�o � bin�rio.");
			System.exit(1);
		}
		
		if (d1 != 0) {
			d1 = d1 * (2*2*2);
		}
		
		if (d2 != 0) {
			d2 = d2 * (2*2);
		}
		
		if (d3 != 0) {
			d3 = d3 * 2;
		}
		
		if (aux != 0) {
			aux = aux * 1;
		}
		
		int decimal = d1 + d2 + d3 + aux;
		
		System.out.println("O valor bin�rio inserido, quando convertido em decimal, resulta em "+decimal+".");
		sc.close();
	}

}
