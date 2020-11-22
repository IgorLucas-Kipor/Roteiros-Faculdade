import java.util.Scanner;
public class IgorLucas3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o primeiro ângulo do triângulo (em graus): ");
		double angulo1 = sc.nextDouble();
		System.out.print("Insira o segundo ângulo do triângulo (em graus): ");
		double angulo2 = sc.nextDouble();
		System.out.print("Insira o terceiro ângulo do triângulo (em graus): ");
		double angulo3 = sc.nextDouble();
		
//		Considerando que as três possibilidades de triângulos com ângulos baseiam-se nas seguintes condições:
//		1) todos os ângulos com menos de 90 graus
//		2) um ângulo com 90 graus
//		3) um ângulo maior que 90 graus
//		entendo que não se pode existir um triângulo com mais de dois ângulos maiores ou iguais a 90 graus
//		similarmente, entendo também que nenhum dos ângulos pode ser menor ou igual a 0 graus
//		é a partir desses preceitos que baseio meu raciocínio a seguir
		
		if ((angulo1 >= 90 && angulo2 >= 90) || (angulo1>= 90 && angulo3 >= 90) || (angulo2 >= 90 && angulo3 >= 90) || (angulo1 <= 0 || angulo2 <= 0 || angulo3 <=0)) {
			System.err.println("Não é possível formar um triângulo com essas medidas.");
		} else if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Essas medidas formam um triângulo retângulo.");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("Essas medidas formam um triângulo acutângulo.");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Essas medidas formam um triângulo obtusângulo.");
		}
		sc.close();
	}

}
