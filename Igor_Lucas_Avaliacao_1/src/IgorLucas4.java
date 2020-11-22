import java.util.Scanner;
public class IgorLucas4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int verificador=0, verificador2=0, porcentagem = 0, categoria=0;
		char situacao = 'x';
		double aumento=0, desconto=0, valorFinal=0;
		System.out.print("Insira o pre�o de compra do produto: ");
		double preco = sc.nextDouble();
		if (preco <= 0) {
			System.err.println("Pre�o n�o pode ser igual a 0 ou negativo.");
		}
		
		
		do{
			System.out.print("Insira a categoria do produto (1 - limpeza, 2 - alimenta��o, 3 - vestu�rio): ");
			categoria = sc.nextInt();
			if (categoria != 1 && categoria != 2 && categoria != 3) {
				System.err.println("Categoria inv�lida. Por favor, insira uma categoria v�lida.");
			} else {
				verificador2 = 1;
			}
		} while (verificador2 != 1);
		
		do {
			System.out.print("Insira a situa��o do produto (R - necessita refrigera��o, N - n�o necessita refrigera��o): ");
			situacao = sc.next().charAt(0);
			if (situacao != 'r' && situacao != 'R' && situacao != 'N' && situacao != 'n') {
				System.err.println("Situa��o inserida inv�lida. Por favor, insira uma situa��o v�lida.");
			} else {
				verificador = 1;
			}
		} while (verificador != 1);
		
		switch (categoria) {
		case 1:
			if (preco > 25) {
				aumento = preco * 0.12;
				porcentagem = 12;
				break;
			} else {
				aumento = preco * 0.05;
				porcentagem = 5;
				break;
			}
			
		case 2:
			if (preco > 25) {
				aumento = preco * 0.15;
				porcentagem = 15;
				break;
			} else {
				aumento = preco * 0.08;
				porcentagem = 8;
				break;
			}
			
		case 3:
			if (preco > 25) {
				aumento = preco * 0.18;
				porcentagem = 18;
				break;
			} else {
				aumento = preco * 0.1;
				porcentagem = 10;
				break;
			}
		}
		
		System.out.println("O aumento que esse produto sofrer� ser� de "+porcentagem+"%.");
		
		if (categoria == 3 || ( situacao == 'R' || situacao == 'r')) {
			desconto = (preco + aumento) * 0.08;
			porcentagem = 8;
		} else if (categoria == 2 && (situacao == 'N' || situacao == 'n')) {
			desconto = (preco + aumento) * 0.05;
			porcentagem = 5;
		} else {
			desconto = (preco + aumento) * 0.03;
			porcentagem = 3;
		}
		
		System.out.println("O valor do desconto do imposto nesse produto ser� de "+porcentagem+"%.");
		
		valorFinal = preco + aumento - desconto;
		
		System.out.printf("O valor final desse produto ser� de R$%.2f.%n", valorFinal);
		
		if (valorFinal <= 50) {
			System.out.println("Esse produto � classificado como Barato.");
		} else if (valorFinal >= 50 && valorFinal < 120 ) {
			System.out.println("Esse produto � classificado como Normal.");
		} else {
			System.out.println("Esse produto � classificado como Caro.");
		}
		
		sc.close();
	}

}
