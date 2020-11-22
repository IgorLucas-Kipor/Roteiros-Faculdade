//A companhia de teatro do IFMG Sabar� deseja realizar uma s�rie de espet�culos. A dire��o calcula que a
//despesa fixa do espet�culo � de R$200,00. Al�m disso, sabe-se que com os ingressos ao pre�o de R$5,00
//ser�o vendidos 120 entradas. Em uma pesquisa de p�blico estimou-se que a cada R$0,50 de diminui��o
//no valor do ingresso espera-se um aumento de 26 ingressos nas vendas. Diante dessas informa��es,
//implemente um programa que calcule e imprima uma tabela contendo os valores dos lucros esperados em
//fun��o do valor dos ingressos, fazendo uma varia��o nos ingressos de R$5,00 � R$1,00 de R$0,50 em
//R$0,50. Escreva ainda o lucro m�ximo esperado, o pre�o do ingresso e quantidade de ingressos vendidos
//para obten��o desse lucro m�ximo estimado.

public class Igor_Lucas_Exercicio_30 {

	public static void main(String[] args) {
		double preco = 5.00;
		double reducao = 0.50;
		double vendas = 120;
		double lucro = 0;
		double maximo = 0;
		double vendasMaximo = 0;
		double precoMaximo = 0;
		
		while (preco >= 1) {
			lucro = (preco * vendas) - 200;
			System.out.println("====================");
			System.out.println();
			System.out.printf("Pre�o de venda: R$%.2f%n", preco);
			System.out.printf("Lucro esperado: R$%.2f%n", lucro);
			System.out.println();
			System.out.println("====================");
			if (lucro > maximo ) {
				precoMaximo = preco;
				maximo = lucro;
				vendasMaximo = vendas;
			}
			preco -= reducao;
			vendas += 26;
		}
		
		System.out.println();
		
		System.out.printf("O lucro m�ximo esperado � de R$%.2f, com %.0f vendas � um pre�o de %.2f.%n", maximo, vendasMaximo, precoMaximo);

	}

}
