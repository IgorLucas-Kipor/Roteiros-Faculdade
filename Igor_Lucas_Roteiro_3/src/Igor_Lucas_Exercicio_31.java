//Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os
//dados utilizados para a contagem dos votos obedecem à seguinte codificação:
//- 1, 2, 3, 4: voto para os respectivos candidatos;
//- 5: voto em branco;
//- Outros valores: voto nulo.
//Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
//- total de votos para cada candidato;
//- total de votos nulos;
//- total de votos em branco;
//Como finalizador do conjunto de votos, tem-se o valor de código igual à 0.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo=1, v1=0, v2=0, v3=0, v4=0, vb=0, vn=0;
		
		while (codigo !=0) {
			System.out.print("Insira o código do seu voto: ");
			codigo = sc.nextInt();
			if (codigo == 1) {
				v1++;
			} else if (codigo == 2) {
				v2++;
			} else if (codigo == 3) {
				v3++;
			} else if (codigo == 4) {
				v4++;
			} else if (codigo == 5) {
				vb++;
			} else if (codigo == 0) {
				
			} else {
				vn++;
			}
		}
		
		System.out.println("O canditado 1 recebeu "+v1+" votos.");
		System.out.println("O canditado 2 recebeu "+v2+" votos.");
		System.out.println("O canditado 3 recebeu "+v3+" votos.");
		System.out.println("O canditado 4 recebeu "+v4+" votos.");
		System.out.println("Tivemos "+vb+" votos em branco.");
		System.out.println("Tivemos "+vn+" votos em nulo.");
		
		sc.close();
	}

}
