//Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de
//horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
//a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
//b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
//c) o salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
//d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago
//por hora extra;
//e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Double salarioMinimo, salarioReceber, valorPagoHora, valorPagoHoraExtra, salarioBruto, quantiaHoraExtra;
	Integer horasTrabalhadas, horasExtras;
	System.out.print("Insira o valor do salário mínimo: ");
	salarioMinimo = in.nextDouble();
	System.out.print("Insira quantas horas foram trabalhadas: ");
	horasTrabalhadas = in.nextInt();
	System.out.print("Insira quantas horas extras foram trabalhadas: ");
	horasExtras = in.nextInt();
	valorPagoHora = salarioMinimo * 0.125;
	valorPagoHoraExtra = salarioMinimo * 0.25;
	salarioBruto = valorPagoHora * horasTrabalhadas;
	quantiaHoraExtra = valorPagoHoraExtra * horasExtras;
	salarioReceber = salarioBruto + quantiaHoraExtra;
	System.out.println("O valor a receber nesse mês, considerando o salário mínimo, as horas trabalhadas"
			+ " e as horas extras feitas durante o mês, é R$"+salarioReceber+" reais.");
	in.close();
}
}
