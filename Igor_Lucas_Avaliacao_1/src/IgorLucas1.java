import java.util.Scanner;
public class IgorLucas1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("            MENU           ");
		System.out.println("===========================");
		System.out.println("1 - Radiciação");
		System.out.println("2 - Potenciação");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.print("Por favor, insira qual operação você deseja fazer: ");
		int escolha = sc.nextInt();
		double numero1, numero2, operacao;
		switch (escolha) {

		case 1:
			System.out.print("Por favor, insira o número do qual deseja tirar a raiz quadrada: ");
			numero1 = sc.nextDouble();
			if (numero1 < 0) {
				System.err.println("Não existe raiz quadrada de número negativo.");
				break;
			} else {
				operacao = Math.sqrt(numero1);
				System.out.println("O resultado da operação é: " + operacao + ".");
				break;
			}

		case 2:
			System.out.print("Insira a base da potência: ");
			numero1 = sc.nextDouble();
			System.out.print("Insira o expoente da potência: ");
			numero2 = sc.nextDouble();
			operacao = Math.pow(numero1, numero2);
			System.out.println("O resultado da operação é: " + operacao + ".");
			break;

		case 3:
			System.out.print("Insira o numerador da divisão: ");
			numero1 = sc.nextDouble();
			System.out.print("Insira o denominador da divisão: ");
			numero2 = sc.nextDouble();
			if (numero2 == 0) {
				System.err.println("Não existe divisão por 0.");
				break;
			} else {
				operacao = numero1 / numero2;
				System.out.println("O resultado da operação é: " + operacao + ".");
				break;
			}

		case 4:
			System.out.println("Insira o primeiro termo da multiplicação: ");
			numero1 = sc.nextDouble();
			System.out.println("Insira o segundo termo da multiplicação: ");
			numero2 = sc.nextDouble();
			operacao = numero1 * numero2;
			System.out.println("O resultado da operação é: " + operacao + ".");
			break;
			
		default:
			System.err.println("Alternativa inválida.");
			break;
		}
		sc.close();
	}

}
