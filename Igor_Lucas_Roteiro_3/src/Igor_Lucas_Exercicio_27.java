//Escreva um programa em JAVA que imprima o tri�ngulo abaixo, em que a altura do tri�ngulo (n�mero
//de linhas) � fornecido pelo usu�rio.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantas linhas voc� deseja que o tri�ngulo tenha: ");
		int numeroLinhas = sc.nextInt();
		
		String triangulo = "";
		
		for (int i=1; i <= numeroLinhas; i++) {
			triangulo = "# " + triangulo;
			System.out.println(triangulo);
		}
		
		
		
		sc.close();

	}

}
