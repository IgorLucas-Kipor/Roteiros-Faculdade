//Voc� est� de volta em seu hotel na Tail�ndia depois de um dia de
//mergulhos. O seu quarto tem duas l�mpadas. Vamos cham�-las de A e B. No hotel h� dois
//interruptores, que chamaremos de I1 e I2. Ao apertar I1, a l�mpada A troca de estado, ou seja,
//acende se estiver apagada e apaga se estiver acesa. Se apertar I2, ambas as l�mpadas A e B
//trocam de estado. As l�mpadas inicialmente est�o ambas apagadas. Seu amigo resolveu bolar
//um desafio para voc�. Ele ir� apertar os interruptores em uma certa sequ�ncia, e gostaria que
//voc� respondesse o estado final das l�mpadas A e B. Para o auxiliar, implemente um algoritmo
//que recebe A primeira linha cont�m um n�mero N que representa quantas vezes seu amigo ir�
//apertar algum interruptor. Na linha seguinte seguir�o N n�meros, que pode ser 1, se o
//interruptor I1 foi apertado, ou 2, se o interruptor I2 foi apertado. Ao final o algoritmo deve
//imprimir o estado final de cada l�mpada.

//quisera eu estar em um hotel na tail�ndia. Na verdade quisera nada; tailandeses s�o meio estranhos

import java.util.Scanner;
public class IgorLucas4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas vezes meu amigo apertar� um interruptor? ");
		
		int n = sc.nextInt();
		
		while (n < 0) {
			System.err.print("N�o se pode apertar o interruptor um n�mero negativo de vezes. Por favor insira um valor v�lido: ");
			n = sc.nextInt();
		}
		
		boolean a = false;
		boolean b = false;
		
		for (int i=1; i<=n; i++) {
			System.out.print("Qual interruptor foi apertado? 1 para T1 e 2 para T2: ");
			int interruptor = sc.nextInt();
			while (interruptor != 1 && interruptor != 2) {
				System.err.print("O valor inserido deve ser 1 ou 2. 1 para T1, 2 para T2. Por favor, insira um valor v�lido: ");
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
			System.out.println("A l�mpada A est� acessa.");
		} else {
			System.out.println("A l�mpada A est� apagada.");
		}
		
		if (b==true) {
			System.out.println("A l�mpada B est� acessa.");
		} else {
			System.out.println("A l�mpada B est� apagada.");
		}
		
		sc.close();
	}

}
