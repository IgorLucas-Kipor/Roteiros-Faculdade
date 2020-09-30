//Funcionários da IFVende tem como benefício a receber ao final de cada mês um salário fixo mais 4% de
//comissão sobre as vendas realizadas pelo mesmo. Assim, faça um algoritmo que receba o salário fixo e o
//valor de vendas realizadas por um funcionário, calcule e mostre o benefício a ser recebido pelo mesmo.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Double salFixo, valVendas, beneficio;
		beneficio = 0.0;
		System.out.print("Insira o valor do salario fixo do funcionario: ");
		salFixo = in.nextDouble();
		System.out.print("Insira o valor de vendas do funcionario: ");
		valVendas = in.nextDouble();
//		beneficio = calculo(salFixo, valVendas, beneficio);
		beneficio = (valVendas * 0.04) + salFixo;
		System.out.println("O beneficio a ser recebido por esse funcionario e R$"+beneficio+" reais.");
		in.close();
	}
	
	//Versão com módulo:
//	static Double calculo (Double fixo, Double vendas, Double concluir) {
//		Double comissao = vendas * 0.04;
//		concluir = fixo + comissao;
//		return concluir;
//	}

}
