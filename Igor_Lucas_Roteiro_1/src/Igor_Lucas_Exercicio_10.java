//Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao m�s. Essa pessoa
//gostaria de saber qual o total acumulado ap�s 2 anos. Fa�a um programa que forne�a tais informa��es.
//(Obs. desconsidere corre��o monet�ria e utilize a f�rmula de juros compostos).

public class Igor_Lucas_Exercicio_10 {
	public static void main(String[] args) {
		Double investimento=2000.0, total, tempo;
		tempo = Math.pow(1.005, 24);
		total = investimento * tempo;
		System.out.println("O valor que essa pessoa tera acumulado ao fim dos 2 anos e R$"+total+".");
	}

}
