//Você está de volta em seu hotel na Tailândia depois de um dia de
//mergulhos. O seu quarto tem duas lâmpadas. Vamos chamá-las de A e B. No hotel há dois
//interruptores, que chamaremos de I1 e I2. Ao apertar I1, a lâmpada A troca de estado, ou seja,
//acende se estiver apagada e apaga se estiver acesa. Se apertar I2, ambas as lâmpadas A e B
//trocam de estado. As lâmpadas inicialmente estão ambas apagadas. Seu amigo resolveu bolar
//um desafio para você. Ele irá apertar os interruptores em uma certa sequência, e gostaria que
//você respondesse o estado final das lâmpadas A e B. Para o auxiliar, implemente um algoritmo
//que recebe A primeira linha contém um número N que representa quantas vezes seu amigo irá
//apertar algum interruptor. Na linha seguinte seguirão N números, que pode ser 1, se o
//interruptor I1 foi apertado, ou 2, se o interruptor I2 foi apertado. Ao final o algoritmo deve
//imprimir o estado final de cada lâmpada.

//quisera eu estar em um hotel na tailândia. Na verdade quisera nada; tailandeses são meio estranhos

import java.util.Scanner;
public class IgorLucas4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas vezes meu amigo apertará um interruptor? ");
		
		int n = sc.nextInt();
		
		while (n < 0) {
			System.err.print("Não se pode apertar o interruptor um número negativo de vezes. Por favor insira um valor válido: ");
			n = sc.nextInt();
		}
		
		boolean a = false;
		boolean b = false;
		
		for (int i=1; i<=n; i++) {
			System.out.print("Qual interruptor foi apertado? 1 para T1 e 2 para T2: ");
			int interruptor = sc.nextInt();
			while (interruptor != 1 && interruptor != 2) {
				System.err.print("O valor inserido deve ser 1 ou 2. 1 para T1, 2 para T2. Por favor, insira um valor válido: ");
				interruptor = sc.nextInt();
			}
			if (interruptor == 1) {
				if (a == false) {
					a = true;
				} else {
					a = false;
				}
			} else if (interruptor == 2) {
				if (a == false) {
					a = true;
				} else {
					a = false;
				}
				
				if (b == false) {
					b = true;
				} else {
					b = false;
				}
			}
		}
		
		if (a==true) {
			System.out.println("A lâmpada A está acessa.");
		} else {
			System.out.println("A lâmpada A está apagada.");
		}
		
		if (b==true) {
			System.out.println("A lâmpada B está acessa.");
		} else {
			System.out.println("A lâmpada B está apagada.");
		}
		
		sc.close();
	}

}
