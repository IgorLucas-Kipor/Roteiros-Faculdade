//Dona Maria das Couve é uma mulher muito preocupada com sua saúde e busca a prática de exercícios
//físicos constantes. Devido a crise financeira, Dona Maria está sem dinheiro para pagar academia, e teve
//como alternativa fazer caminhada diária ao redor do quarteirão de sua casa. O quarteirão da casa dela
//possui formato de um triângulo retângulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
//km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
//voltas Dona Maria precisa fazer no quarteirão para que ela atinja sua meta.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_12 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Double ruaA, ruaB, ruaC, kmDia, volta, totalVoltas;
	System.out.print("Insira a medida da rua A em metros: ");
	ruaA = in.nextDouble();
	System.out.print("Insira a medida da rua B em metros: ");
	ruaB = in.nextDouble();
	System.out.print("Insira quanto Dona Maria deve caminhar por dia em km: ");
	kmDia = in.nextDouble();
//	Sabemos as medidas da rua A e B. Temos que calcular as medidas da rua C
//	Como o quarteirão tem formato de triângulo retângulo e o lado C é o maior, usamos o teorema de pitágoras para
//	calcular a hipotenusa
	ruaC = Math.hypot(ruaA, ruaB);
	//como ela tem que dar a volta no triângulo, ela irá passar por todos os lados, um de cada vez. Então calculamos o perímetro
	volta = ruaA + ruaB + ruaC;
	//agora, como estamos trabalhando com km e metros, temos que colocar tudo em quantias equivalentes. Como 1km=1000m, temos que
   //multiplicar o kmDia por mil
	kmDia = kmDia * 1000;
	//agora, basta dividir o kmDia pelo perímetro para descobrirmos quantas voltas ela deve fazer
	totalVoltas = kmDia / volta;
	System.out.println("Para atingir sua meta, Dona Maria deve fazer "+totalVoltas+" voltas ao redor do quarteirão todos os dias.");
	in.close();
	
}
}
