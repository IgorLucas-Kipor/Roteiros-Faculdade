//Implemente um algoritmo que receba 3 números reais de entrada. Calcule e mostre o resultado da
//multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário. Sabe-se
//que o denominador não pode ser zero, mas neste momento não se preocupe com as validações.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_3 {
public static void main(String[] args) {
	Scanner novo = new Scanner(System.in);
	Double n1, n2, n3, resul;
	System.out.print("Insira o primeiro numero: ");
	n1 = novo.nextDouble();
	System.out.print("Insira o segundo numero: ");
	n2 = novo.nextDouble();
	System.out.print("Insira o terceiro numero: ");
	n3 = novo.nextDouble();
//	erro (n3);
	resul = (n1*n2)/n3;
	System.out.println("O resultado da operação usando esses valores e "+resul+".");
	novo.close();
}
//Validação:
//static void erro (Double n) {
//	if (n == 0) {
//		System.err.println("DENOMINADOR NÃO PODE SER 0.");
//		System.exit(1);
//	}
//}
}
