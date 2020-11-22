//A companhia de teatro do IFMG Sabará deseja realizar uma série de espetáculos. A direção calcula que a
//despesa fixa do espetáculo é de R$200,00. Além disso, sabe-se que com os ingressos ao preço de R$5,00
//serão vendidos 120 entradas. Em uma pesquisa de público estimou-se que a cada R$0,50 de diminuição
//no valor do ingresso espera-se um aumento de 26 ingressos nas vendas. Diante dessas informações,
//implemente um programa que calcule e imprima uma tabela contendo os valores dos lucros esperados em
//função do valor dos ingressos, fazendo uma variação nos ingressos de R$5,00 à R$1,00 de R$0,50 em
//R$0,50. Escreva ainda o lucro máximo esperado, o preço do ingresso e quantidade de ingressos vendidos
//para obtenção desse lucro máximo estimado.

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
			System.out.printf("Preço de venda: R$%.2f%n", preco);
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
		
		System.out.printf("O lucro máximo esperado é de R$%.2f, com %.0f vendas à um preço de %.2f.%n", maximo, vendasMaximo, precoMaximo);

	}

}
