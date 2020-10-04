//Faça um algoritmo que receba o salário base e o tempo de serviço de um funcionário. Calcule e mostre:
	
import java.util.Scanner;
public class Igor_Lucas_Exercicio_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o salário base do funcionário: ");
		double salarioBase = sc.nextDouble();
		System.out.print("Insira o tempo de serviço do funcionário em anos: ");
		double tempoServico = sc.nextDouble();
		double imposto=0, gratificacao=0, salarioLiquido=0;
		
		if (salarioBase < 200) {
			System.out.println("Funcionário isento de imposto.");
		} else if (salarioBase >= 200 && salarioBase <= 450) {
			imposto = salarioBase * 0.03;
		} else if (salarioBase > 450 && salarioBase < 700) {
			imposto = salarioBase * 0.08;
		} else if (salarioBase >= 700) {
			imposto = salarioBase * 0.12;
		}
		
		System.out.println("Imposto: "+imposto+".");
		
		if (salarioBase > 500 && tempoServico <= 3) {
			gratificacao = 20;
		} else if (salarioBase > 500 && tempoServico > 3) {
			gratificacao = 30;
		} else if (salarioBase <= 500 && tempoServico <= 3) {
			gratificacao = 23;
		} else if (salarioBase <= 500 && (tempoServico > 3 && tempoServico < 6)) {
			gratificacao = 35;
		} else if (salarioBase <= 500 && tempoServico >= 6) {
			gratificacao = 33;
		}
		
		System.out.println("Gratificação: "+gratificacao+".");
		
		salarioLiquido = salarioBase - imposto + gratificacao;
		
		System.out.println("Salário Líquido: "+salarioLiquido+".");
		
		if (salarioLiquido <= 350) {
			System.out.println("Classificação: A.");
		} else if (salarioLiquido > 350 && salarioLiquido < 600) {
			System.out.println("Classificação: B.");
		} else if (salarioLiquido >= 600) {
			System.out.println("Classificação: C.");
		}
		sc.close();
	}

}
