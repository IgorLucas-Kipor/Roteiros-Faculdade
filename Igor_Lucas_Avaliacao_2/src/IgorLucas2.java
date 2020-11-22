//Implemente um algoritmo que recebe de entrada um número inteiro
//qualquer e defina qual é a base mínima de representação desse número. Por exemplo, o número
//2145 tem base mínima 6, ou seja, é a menor base que o número consegue ser representado. Já o
//número 1011 tem base mínima 2, pois é a menor base que podemos o representar.

import java.util.Scanner;
public class IgorLucas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		professor, admito que não sei ao certo como definir a base mínima de representação de um número. Nunca fiz um exercício assim
//		isso dito, noto que a base mínima dos exemplos que você notou é um dígito maior que o seu maior algarismo
//		em 2145, 5 é o maior algarismo e a base é 6. Em 1011, 1 é o maior algarismo e a base é 2
//		similarmente, números representados na base 8 tem algarismos que vão de 0 até 7
//		sendo assim, vou partir do pressuposto de que essa base mínima é igual ao maior algarismo + 1
//		em se tratando de números negativos isso fica mais difícil. Sei que um número como -9 pode ser escrito em binário, por exemplo
//		mas jogar esse número puro no meu código retorna apenas 1, qualquer que seja o valor (desde que seja negativo)
//		tenho duas hipóteses para esse caso: ou o número é representado pela mesma base mínima da sua contraparte positiva
//		(por exemplo, 2145 e -2145 seriam ambos representados por 6)
//		ou o número é representado pelo valor negativo da sua contraparte
//		(2145 teria como base mínima 6 e -2145 teria como base mínima -6)
//		como eu lhe perguntei no class e você me respondeu que não existe base negativa, acredito que a primeira hipótese é a correta
//		já que não me faz muito sentido que todos os números negativos tenham como base mínima 1
//		de qualquer forma, deixo aqui esse registro por meio de comentários do meu pensamento sobre essa questão
		
		System.out.print("Insira um número inteiro: ");
		
		int n = sc.nextInt();
		
//		se um numero n compartilha a mesma base mínima entre suas versões positivas e negativas, apenas preciso
//		transformar o número negativo em positivo e trabalhar com ele
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
		
		System.out.println("A base mínima de representação desse número é "+maiorAlgarismo+".");
		
		
		
		sc.close();
	}

}
