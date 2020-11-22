//Elabore um algoritmo que faça a conversão de um número binário digitado pelo usuário para o número na
//base octal, base decimal e base hexadecimal. Valide se o valor informado na entrada só possui 0’s ou
//1’s, ou seja, se é mesmo um número binário. Não utilize funções pré-definidas no JAVA.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número binário: ");
		
		int binario = sc.nextInt();
		int binarioDecimal = binario, binarioOctal = binario, binarioHexadecimal=binario, algarismoOctal=0, algarismoHexadecimal=0;
		int b=1, c=1;
		
		double decimal=0, octal=0, hexadecimal=0, i=0;
		
		String hexa = "";
		
		do {
			int algarismo = binarioDecimal % 10;
			binarioDecimal = binarioDecimal / 10;
			if (algarismo != 0 && algarismo != 1) {
				System.err.println("VALOR INSERIDO NÃO É BINÁRIO!");
				System.exit(1);
			}
			double valorDecimal = Math.pow(2, i);
			decimal = decimal + (algarismo * valorDecimal);
			i++;
		} while (binarioDecimal != 0);
		
		while (binarioOctal != 0) {
			double octal2=0;
			for (int x = 1; x<=3; x++) {
				algarismoOctal = binarioOctal % 10;
				binarioOctal /= 10;
				if (x == 1) {
					octal2 = octal2 + (algarismoOctal * Math.pow(2, 0));
				} else if (x == 2) {
					octal2 = octal2 + (algarismoOctal * Math.pow(2, 1));
				} else if (x == 3) {
					octal2 = octal2 + (algarismoOctal * Math.pow(2, 2));
				}
			}
			octal = octal + (octal2*b);
			b *= 10;
		}
		
		while (binarioHexadecimal != 0) {
			double hexadecimal2=0;
			for (int x = 1; x<=4; x++) {
				algarismoHexadecimal = binarioHexadecimal % 10;
				binarioHexadecimal /= 10;
				if (x == 1) {
					hexadecimal2 = hexadecimal2 + (algarismoHexadecimal * Math.pow(2, 0));
				} else if (x == 2) {
					hexadecimal2 = hexadecimal2 + (algarismoHexadecimal * Math.pow(2, 1));
				} else if (x == 3) {
					hexadecimal2 = hexadecimal2 + (algarismoHexadecimal * Math.pow(2, 2));
				} else if (x == 4) {
					hexadecimal2 = hexadecimal2 + (algarismoHexadecimal * Math.pow(2, 3));
				}
			}
			hexadecimal = hexadecimal + (hexadecimal2*c);
			c *= 100;
		}
		
		int hexade = 0;
		
		while (hexadecimal > 15) {
			int agrupamentoHexa = (int) hexadecimal % 100;
			hexadecimal /= 100;
			switch(agrupamentoHexa) {
			case 10:
				hexa = "A" + hexa;
				break;
			case 11:
				hexa = "B" + hexa;
				break;
			case 12:
				hexa = "C" + hexa;
				break;
			case 13:
				hexa = "D" + hexa;
				break;
			case 14:
				hexa = "E" + hexa;
				break;
			case 15:
				hexa = "F" + hexa;
				break;
			default:
				hexa = Integer.toString(agrupamentoHexa) + hexa;
			}
			if (hexadecimal <= 15) {
				hexade = (int) hexadecimal;
			}
		}
		
		
		System.out.println("O valor em decimal é: "+decimal);
		System.out.println("O valor em octal é: "+octal);
		System.out.println("O valor em hexadecimal é: "+hexade+hexa);
		
		sc.close();

	}

}
