//Considere uma equa��o do segundo grau na forma gen�rica (ax2 + bx + c) e calcule o valor das ra�zes da
//mesma. Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usu�rio. Utilize as equa��es abaixo
//como teste. Teste tamb�m para alguns valores aleat�rios de coeficientes (exemplo a = 3, b = 2 e c =4) e
//veja que em alguns casos n�o se retornam as ra�zes de forma correta. Identifique o porqu� desse problema e
//indique uma poss�vel solu��o.
//Equa��es para teste:

import java.util.Scanner;
public class Igor_Lucas_Exercicio_24 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Double a, b, c, delta, x1, x2;
	System.out.print("Insira o valor de a: ");
	a = in.nextDouble();
	System.out.print("Insira o valor de b: ");
	b = in.nextDouble();
	System.out.print("Insira o valor de c: ");
	c = in.nextDouble();
	delta = (b*b) - 4*a*c;
	//Exemplo de IF:
//	if (delta < 0) {
//		System.err.println("N�O � POSS�VEL ACHAR RAIZ COM DELTA NEGATIVO.");
//		System.exit(1);
//	}
//	x1 = (-b + Math.sqrt(delta)) / 2*a;
//	x2 = (-b - Math.sqrt(delta)) / 2*a;
	x1 = (-b + Math.sqrt(delta)) / (2*a);
	x2 = (-b - Math.sqrt(delta)) / (2*a);
//	System.out.println(delta);
//	System.out.println((2*a));
//	System.out.println((-b + Math.sqrt(delta)));
//	System.out.println((-b + Math.sqrt(delta)) / 2);
//	System.out.println((-b + Math.sqrt(delta)) / 2*a);
//	System.out.println((-b + Math.sqrt(delta)) / (2*a));
//	System.out.println((-b - Math.sqrt(delta)));
	System.out.println("As ra�zes dessa equa��o de segundo grau s�o "+x1+" e "+x2+".");
//	Da forma que o c�digo estava disposto antes, como as opera��es s�o feitas da esquerda para a direita, primeiro era feita a divis�o
//	do resultado de -b com a raiz quadrada de delta por dois e depois se multiplicava isso pelo valor de a. A adi��o de um par�ntese
//	previne esse problema.
//	Dependendo do valor inserido, tamb�m se � imposs�vel achar raiz, o resultado retornando NaN. Isso porque nesses casos o delta d�
//	negativo, e n�o se pode achar a raiz quadrada de um n�mero negativo. Sendo assim, uma poss�vel solu��o para esses casos seria
//	inserir um if ap�s o delta que avisa que n�o h� raiz para valores negativos de delta e encerra o programa.
	in.close();
}
}
