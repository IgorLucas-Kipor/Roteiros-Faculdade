//Fa�a um algoritmo que receba o n�mero de horas trabalhadas, o valor do sal�rio m�nimo e o n�mero de
//horas extras trabalhadas. Calcule e mostre o sal�rio a receber seguindo as seguintes regras:
//a) O valor a ser pago por hora trabalhada � 0.125 do sal�rio m�nimo;
//b) O valor a ser pago por hora extra vale 0.25 do sal�rio m�nimo;
//c) o sal�rio bruto equivale ao n�mero de horas trabalhadas vezes o valor pago por hora;
//d) a quantia a receber por horas extras equivale � horas extras realizadas multiplicado pelo valor pago
//por hora extra;
//e) o sal�rio a receber equivale � soma do sal�rio bruto mais a quantia a receber pelas horas extras.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_20 {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	Double salarioMinimo, salarioReceber, valorPagoHora, valorPagoHoraExtra, salarioBruto, quantiaHoraExtra;
	Integer horasTrabalhadas, horasExtras;
	System.out.print("Insira o valor do sal�rio m�nimo: ");
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
	System.out.println("O valor a receber nesse m�s, considerando o sal�rio m�nimo, as horas trabalhadas"
			+ " e as horas extras feitas durante o m�s, � R$"+salarioReceber+" reais.");
	in.close();
}
}
