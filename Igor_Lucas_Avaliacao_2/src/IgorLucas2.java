//Implemente um algoritmo que recebe de entrada um n�mero inteiro
//qualquer e defina qual � a base m�nima de representa��o desse n�mero. Por exemplo, o n�mero
//2145 tem base m�nima 6, ou seja, � a menor base que o n�mero consegue ser representado. J� o
//n�mero 1011 tem base m�nima 2, pois � a menor base que podemos o representar.

import java.util.Scanner;
public class IgorLucas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		professor, admito que n�o sei ao certo como definir a base m�nima de representa��o de um n�mero. Nunca fiz um exerc�cio assim
//		isso dito, noto que a base m�nima dos exemplos que voc� notou � um d�gito maior que o seu maior algarismo
//		em 2145, 5 � o maior algarismo e a base � 6. Em 1011, 1 � o maior algarismo e a base � 2
//		similarmente, n�meros representados na base 8 tem algarismos que v�o de 0 at� 7
//		sendo assim, vou partir do pressuposto de que essa base m�nima � igual ao maior algarismo + 1
//		em se tratando de n�meros negativos isso fica mais dif�cil. Sei que um n�mero como -9 pode ser escrito em bin�rio, por exemplo
//		mas jogar esse n�mero puro no meu c�digo retorna apenas 1, qualquer que seja o valor (desde que seja negativo)
//		tenho duas hip�teses para esse caso: ou o n�mero � representado pela mesma base m�nima da sua contraparte positiva
//		(por exemplo, 2145 e -2145 seriam ambos representados por 6)
//		ou o n�mero � representado pelo valor negativo da sua contraparte
//		(2145 teria como base m�nima 6 e -2145 teria como base m�nima -6)
//		como eu lhe perguntei no class e voc� me respondeu que n�o existe base negativa, acredito que a primeira hip�tese � a correta
//		j� que n�o me faz muito sentido que todos os n�meros negativos tenham como base m�nima 1
//		de qualquer forma, deixo aqui esse registro por meio de coment�rios do meu pensamento sobre essa quest�o
		
		System.out.print("Insira um n�mero inteiro: ");
		
		int n = sc.nextInt();
		
//		se um numero n compartilha a mesma base m�nima entre suas vers�es positivas e negativas, apenas preciso
//		transformar o n�mero negativo em positivo e trabalhar com ele
		if (n < 0) {
			n *= -1;
		}
		
		int algarismo = 0;
		int maiorAlgarismo = 0;
		
		while (n != 0) {
			algarismo = n%10;
			n = n/10;
			if (algarismo > maiorAlgarismo) {
				maiorAlgarismo = algarismo;
			}
		}
		
		maiorAlgarismo += 1;
		
		System.out.println("A base m�nima de representa��o desse n�mero � "+maiorAlgarismo+".");
		
		
		
		sc.close();
	}

}
