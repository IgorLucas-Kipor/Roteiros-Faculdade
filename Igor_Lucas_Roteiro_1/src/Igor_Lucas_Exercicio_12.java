//Dona Maria das Couve � uma mulher muito preocupada com sua sa�de e busca a pr�tica de exerc�cios
//f�sicos constantes. Devido a crise financeira, Dona Maria est� sem dinheiro para pagar academia, e teve
//como alternativa fazer caminhada di�ria ao redor do quarteir�o de sua casa. O quarteir�o da casa dela
//possui formato de um tri�ngulo ret�ngulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
//km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
//voltas Dona Maria precisa fazer no quarteir�o para que ela atinja sua meta.

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
//	Como o quarteir�o tem formato de tri�ngulo ret�ngulo e o lado C � o maior, usamos o teorema de pit�goras para
//	calcular a hipotenusa
	ruaC = Math.hypot(ruaA, ruaB);
	//como ela tem que dar a volta no tri�ngulo, ela ir� passar por todos os lados, um de cada vez. Ent�o calculamos o per�metro
	volta = ruaA + ruaB + ruaC;
	//agora, como estamos trabalhando com km e metros, temos que colocar tudo em quantias equivalentes. Como 1km=1000m, temos que
   //multiplicar o kmDia por mil
	kmDia = kmDia * 1000;
	//agora, basta dividir o kmDia pelo per�metro para descobrirmos quantas voltas ela deve fazer
	totalVoltas = kmDia / volta;
	System.out.println("Para atingir sua meta, Dona Maria deve fazer "+totalVoltas+" voltas ao redor do quarteir�o todos os dias.");
	in.close();
	
}
}
