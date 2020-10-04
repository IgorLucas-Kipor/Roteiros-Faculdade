//Implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo
//pertence à família dos binários. Para isto, “desmembre” o número digitado verifique se foram digitados
//somente bits. Caso o número digitado seja binário, seu algoritmo deve o converter para decimal e mostrar o
//rsultado.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira um valor de quatro dígitos: ");
		int num = sc.nextInt();
		int d1 = num/1000; //pega dígito mais a esquerda
		int aux = num%1000; //armazena outros três dígitos
		int d2 = aux/100; //pega dígito mais a esquerda
		aux = num%100; //armazena outros dois dígitos
		int d3 = aux/10; //pega dígito da direita
		aux = num%10; //armazena último dígito
//		System.out.println(d1);
//		System.out.println(d2);
//		System.out.println(d3);
//		System.out.println(aux);
		if ((d1 != 0 && d1 !=1) || (d2 != 0 && d2 !=1) || (d3 != 0 && d3 != 1) || (aux != 0 && aux != 1)) {
			System.err.println("Valor inserido não é binário.");
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
		
		System.out.println("O valor binário inserido, quando convertido em decimal, resulta em "+decimal+".");
		sc.close();
	}

}
