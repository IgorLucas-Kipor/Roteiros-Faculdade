//No �ltimo ano foi realizada um estudo estat�stico sobre acidentes de tr�nsito em 5 cidades brasileiras.
//Para isso os seguintes dados foram coletados:
//a) Nome da cidade (String ou char).
//b) N�mero de ve�culos
//c) N�mero de acidentes de tr�nsito
//Com esses dados deseja-se saber:
//a) O maior e o menor �ndice de acidentes e o nome da cidade a que pertencem
//b) A raz�o entre quantidade de acidentes por quantidade de ve�culos nas 5 cidades analisadas
//c) A m�dia de ve�culos nas cinco cidades
//d) A m�dia de acidentes de tr�nsito nas cidades com menos de 200 ve�culos

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
			System.out.print("Insira o n�mero de ve�culos na cidade: ");
			veiculos = sc.nextDouble();
			System.out.print("Insira o n�mero de acidentes de tr�nsito na cidade: ");
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
			
			System.out.println("A raz�o entre a quantidade de acidentes e a quantidade de ve�culos na cidade de "+cidade+" � "+razao+".");
			
			mediaVeiculos = mediaVeiculos + veiculos;
			
			if (veiculos < 200) {
				menorDuzentos++;
				mediaAcidentes = mediaAcidentes + acidentes;
			}
		}
		
		mediaVeiculos = mediaVeiculos / 5;
		
		mediaAcidentes = mediaAcidentes / menorDuzentos;
		
		System.out.println("A cidade com o maior �ndice de acidentes � "+maiorCidade+", com "+maiorAcidentes+" acidentes.");
		System.out.println("A cidade com o menor �ndice de acidentes � "+menorCidade+", com "+menorAcidentes+" acidentes.");
		System.out.println("A m�dia de ve�culos nas cinco cidades � de "+mediaVeiculos+".");
		System.out.println("A m�dia de acidentes nas cidades com menos de 200 ve�culos � de "+mediaAcidentes+".");
		
		sc.close();

	}

}
