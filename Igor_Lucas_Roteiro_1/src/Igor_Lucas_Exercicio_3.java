//Implemente um algoritmo que receba 3 n�meros reais de entrada. Calcule e mostre o resultado da
//multiplica��o dos dois primeiros n�meros dividido pelo terceiro n�mero fornecido pelo usu�rio. Sabe-se
//que o denominador n�o pode ser zero, mas neste momento n�o se preocupe com as valida��es.

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
	System.out.println("O resultado da opera��o usando esses valores e "+resul+".");
	novo.close();
}
//Valida��o:
//static void erro (Double n) {
//	if (n == 0) {
//		System.err.println("DENOMINADOR N�O PODE SER 0.");
//		System.exit(1);
//	}
//}
}
