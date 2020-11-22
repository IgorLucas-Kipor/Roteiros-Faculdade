import java.util.Scanner;
public class IgorLucas3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro �ngulo do tri�ngulo (em graus): ");
		double angulo1 = sc.nextDouble();
		System.out.print("Insira o segundo �ngulo do tri�ngulo (em graus): ");
		double angulo2 = sc.nextDouble();
		System.out.print("Insira o terceiro �ngulo do tri�ngulo (em graus): ");
		double angulo3 = sc.nextDouble();
		
//		Considerando que as tr�s possibilidades de tri�ngulos com �ngulos baseiam-se nas seguintes condi��es:
//		1) todos os �ngulos com menos de 90 graus
//		2) um �ngulo com 90 graus
//		3) um �ngulo maior que 90 graus
//		entendo que n�o se pode existir um tri�ngulo com mais de dois �ngulos maiores ou iguais a 90 graus
//		similarmente, entendo tamb�m que nenhum dos �ngulos pode ser menor ou igual a 0 graus
//		� a partir desses preceitos que baseio meu racioc�nio a seguir
		
		if ((angulo1 >= 90 && angulo2 >= 90) || (angulo1>= 90 && angulo3 >= 90) || (angulo2 >= 90 && angulo3 >= 90) || (angulo1 <= 0 || angulo2 <= 0 || angulo3 <=0)) {
			System.err.println("N�o � poss�vel formar um tri�ngulo com essas medidas.");
		} else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Essas medidas formam um tri�ngulo ret�ngulo.");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("Essas medidas formam um tri�ngulo acut�ngulo.");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Essas medidas formam um tri�ngulo obtus�ngulo.");
		}
		sc.close();
	}

}
