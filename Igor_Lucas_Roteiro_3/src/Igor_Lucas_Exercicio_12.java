//No último ano foi realizada um estudo estatístico sobre acidentes de trânsito em 5 cidades brasileiras.
//Para isso os seguintes dados foram coletados:
//a) Nome da cidade (String ou char).
//b) Número de veículos
//c) Número de acidentes de trânsito
//Com esses dados deseja-se saber:
//a) O maior e o menor índice de acidentes e o nome da cidade a que pertencem
//b) A razão entre quantidade de acidentes por quantidade de veículos nas 5 cidades analisadas
//c) A média de veículos nas cinco cidades
//d) A média de acidentes de trânsito nas cidades com menos de 200 veículos

import java.util.Scanner;
public class Igor_Lucas_Exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String cidade="b", maiorCidade="a", menorCidade="a";
		
		double veiculos=0, acidentes=0, maiorAcidentes=0, menorAcidentes=0, razao=0, mediaVeiculos=0, mediaAcidentes=0, menorDuzentos=0;
		
		for (int i = 0; i < 5; i++) {
			cidade=sc.nextLine(); //nextLine extra para evitar problemas de "levar" o enter de outro scan
			System.out.print("Insira o nome da cidade: ");
			cidade = sc.nextLine();
			System.out.print("Insira o número de veículos na cidade: ");
			veiculos = sc.nextDouble();
			System.out.print("Insira o número de acidentes de trânsito na cidade: ");
			acidentes = sc.nextDouble();
			if (i == 0) {
				maiorAcidentes = acidentes;
				menorAcidentes = acidentes;
				maiorCidade = cidade;
				menorCidade = cidade;
			} else if ( acidentes > maiorAcidentes) {
				maiorAcidentes = acidentes;
				maiorCidade = cidade;
			} else if ( acidentes < menorAcidentes) {
				menorAcidentes = acidentes;
				menorCidade = cidade;
			}
			
			razao = acidentes/veiculos;
			
			System.out.println("A razão entre a quantidade de acidentes e a quantidade de veículos na cidade de "+cidade+" é "+razao+".");
			
			mediaVeiculos = mediaVeiculos + veiculos;
			
			if (veiculos < 200) {
				menorDuzentos++;
				mediaAcidentes = mediaAcidentes + acidentes;
			}
		}
		
		mediaVeiculos = mediaVeiculos / 5;
		
		mediaAcidentes = mediaAcidentes / menorDuzentos;
		
		System.out.println("A cidade com o maior índice de acidentes é "+maiorCidade+", com "+maiorAcidentes+" acidentes.");
		System.out.println("A cidade com o menor índice de acidentes é "+menorCidade+", com "+menorAcidentes+" acidentes.");
		System.out.println("A média de veículos nas cinco cidades é de "+mediaVeiculos+".");
		System.out.println("A média de acidentes nas cidades com menos de 200 veículos é de "+mediaAcidentes+".");
		
		sc.close();

	}

}
