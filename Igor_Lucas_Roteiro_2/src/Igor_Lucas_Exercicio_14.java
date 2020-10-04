//Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D submetida a
//uma carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via teclado. Utilize a
//fórmula:
//	onde, n = 2 para D > 100; n = 6 para D < 50 e; n = 4 para outros valores de D.
	
import java.util.Scanner;
public class Igor_Lucas_Exercicio_14 {
	static final double PI = 3.1416;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor da barra cilíndrica D: ");
		double d = sc.nextDouble();
		System.out.print("Insira o valor da carga Q: ");
		double q = sc.nextDouble();
		double s, n;
		if (d > 100) {
			n = 2;
		} else if (d < 50) {
			n = 6;
		} else {
			n = 4;
		}
		s = ((4*q) / (PI * (d*d)))*n;
		System.out.println("A tensão S da barra é de "+s+".");
		sc.close();
	}

}
