//Considere uma equação do segundo grau na forma genérica (ax2 + bx + c) e calcule o valor das raízes da
//mesma. Sabe-se que os coeficientes a, b, e c devem ser fornecidos pelo usuário. Utilize as equações abaixo
//como teste. Teste também para alguns valores aleatórios de coeficientes (exemplo a = 3, b = 2 e c =4) e
//veja que em alguns casos não se retornam as raízes de forma correta. Identifique o porquê desse problema e
//indique uma possível solução.
//Equações para teste:

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
//		System.err.println("NÃO É POSSÍVEL ACHAR RAIZ COM DELTA NEGATIVO.");
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
	System.out.println("As raízes dessa equação de segundo grau são "+x1+" e "+x2+".");
//	Da forma que o código estava disposto antes, como as operações são feitas da esquerda para a direita, primeiro era feita a divisão
//	do resultado de -b com a raiz quadrada de delta por dois e depois se multiplicava isso pelo valor de a. A adição de um parêntese
//	previne esse problema.
//	Dependendo do valor inserido, também se é impossível achar raiz, o resultado retornando NaN. Isso porque nesses casos o delta dá
//	negativo, e não se pode achar a raiz quadrada de um número negativo. Sendo assim, uma possível solução para esses casos seria
//	inserir um if após o delta que avisa que não há raiz para valores negativos de delta e encerra o programa.
	in.close();
}
}
