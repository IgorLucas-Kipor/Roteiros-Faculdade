//Fa�a um programa que calcule e imprima a soma e a m�dia dos 10 primeiros n�meros positivos. Soma =
//1 + 2 + 3 + ... + 10
public class Igor_Lucas_Exercicio_5 {

	public static void main(String[] args) {
		int soma=0;
		for (int i=1; i <= 10; i++) {
			soma = soma + i;
		}
		
		System.out.println("O resultado da soma �: "+soma+".");
	}

}
