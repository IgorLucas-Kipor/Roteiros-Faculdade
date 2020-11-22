import java.util.Scanner;
public class IgorLucas4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int verificador=0, verificador2=0, porcentagem = 0, categoria=0;
		char situacao = 'x';
		double aumento=0, desconto=0, valorFinal=0;
		System.out.print("Insira o preço de compra do produto: ");
		double preco = sc.nextDouble();
		if (preco <= 0) {
			System.err.println("Preço não pode ser igual a 0 ou negativo.");
		}
		
		
		do{
			System.out.print("Insira a categoria do produto (1 - limpeza, 2 - alimentação, 3 - vestuário): ");
			categoria = sc.nextInt();
			if (categoria != 1 && categoria != 2 && categoria != 3) {
				System.err.println("Categoria inválida. Por favor, insira uma categoria válida.");
			} else {
				verificador2 = 1;
			}
		} while (verificador2 != 1);
		
		do {
			System.out.print("Insira a situação do produto (R - necessita refrigeração, N - não necessita refrigeração): ");
			situacao = sc.next().charAt(0);
			if (situacao != 'r' && situacao != 'R' && situacao != 'N' && situacao != 'n') {
				System.err.println("Situação inserida inválida. Por favor, insira uma situação válida.");
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
		
		System.out.println("O aumento que esse produto sofrerá será de "+porcentagem+"%.");
		
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
		
		System.out.println("O valor do desconto do imposto nesse produto será de "+porcentagem+"%.");
		
		valorFinal = preco + aumento - desconto;
		
		System.out.printf("O valor final desse produto será de R$%.2f.%n", valorFinal);
		
		if (valorFinal <= 50) {
			System.out.println("Esse produto é classificado como Barato.");
		} else if (valorFinal >= 50 && valorFinal < 120 ) {
			System.out.println("Esse produto é classificado como Normal.");
		} else {
			System.out.println("Esse produto é classificado como Caro.");
		}
		
		sc.close();
	}

}
