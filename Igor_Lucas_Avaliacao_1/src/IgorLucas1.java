import java.util.Scanner;
public class IgorLucas1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===========================");
		System.out.println("            MENU           ");
		System.out.println("===========================");
		System.out.println("1 - Radicia��o");
		System.out.println("2 - Potencia��o");
		System.out.println("3 - Divis�o");
		System.out.println("4 - Multiplica��o");
		System.out.print("Por favor, insira qual opera��o voc� deseja fazer: ");
		int escolha = sc.nextInt();
		double numero1, numero2, operacao;
		switch (escolha) {

		case 1:
			System.out.print("Por favor, insira o n�mero do qual deseja tirar a raiz quadrada: ");
			numero1 = sc.nextDouble();
			if (numero1 < 0) {
				System.err.println("N�o existe raiz quadrada de n�mero negativo.");
				break;
			} else {
				operacao = Math.sqrt(numero1);
				System.out.println("O resultado da opera��o �: " + operacao + ".");
				break;
			}

		case 2:
			System.out.print("Insira a base da pot�ncia: ");
			numero1 = sc.nextDouble();
			System.out.print("Insira o expoente da pot�ncia: ");
			numero2 = sc.nextDouble();
			operacao = Math.pow(numero1, numero2);
			System.out.println("O resultado da opera��o �: " + operacao + ".");
			break;

		case 3:
			System.out.print("Insira o numerador da divis�o: ");
			numero1 = sc.nextDouble();
			System.out.print("Insira o denominador da divis�o: ");
			numero2 = sc.nextDouble();
			if (numero2 == 0) {
				System.err.println("N�o existe divis�o por 0.");
				break;
			} else {
				operacao = numero1 / numero2;
				System.out.println("O resultado da opera��o �: " + operacao + ".");
				break;
			}

		case 4:
			System.out.println("Insira o primeiro termo da multiplica��o: ");
			numero1 = sc.nextDouble();
			System.out.println("Insira o segundo termo da multiplica��o: ");
			numero2 = sc.nextDouble();
			operacao = numero1 * numero2;
			System.out.println("O resultado da opera��o �: " + operacao + ".");
			break;
			
		default:
			System.err.println("Alternativa inv�lida.");
			break;
		}
		sc.close();
	}

}
