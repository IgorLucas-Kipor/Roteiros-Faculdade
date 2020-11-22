//Escreva um programa em JAVA que imprima o triângulo abaixo, em que a altura do triângulo (número
//de linhas) é fornecido pelo usuário.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantas linhas você deseja que o triângulo tenha: ");
		int numeroLinhas = sc.nextInt();
		
		String triangulo = "";
		
		for (int i=1; i <= numeroLinhas; i++) {
			triangulo = "# " + triangulo;
			System.out.println(triangulo);
		}
		
		
		
		sc.close();

	}

}
