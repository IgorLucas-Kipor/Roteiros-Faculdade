//O desvio padr�o de uma amostra de dados calcula o quanto de varia��o existe da amostra em rela��o �
//m�dia. Valores baixos indicam que os dados tendem a estar pr�ximos � m�dia, por outro lado, valores
//altos indicam maior dispers�o dos dados. O gerente de produ��o da Refrigerator Tabajar� est�
//avaliando o processo de fabrica��o de seus refrigerantes em lata, especificamente a etapa de
//preenchimento do conte�do. As latas devem possuir 390 ml, com desvio padr�o de + ou � 5 ml. Na
//an�lise foram coletadas 20 amostras aleat�rias da linha de produ��o, medindo-se a quantidade de
//produto das mesmas. Voc� � o programador da empresa, e ficou incumbido de implementar um
//programa que auxilie seu gerente, mostrando ao mesmo a m�dia e o desvio padr�o entre os elementos
//das amostras. Al�m disso, exiba se o processo deve ou n�o ser revisado.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double latas[] = new double[20];
		
		
		double media=0;
		
		//preenchendo as latas e calculando m�dia
		
		for (int i=0; i<latas.length; i++) {
			System.out.print("Quantidade de conte�do na lata "+(1+i)+": ");
			latas[i] = sc.nextDouble();
			media += latas[i];
		}
		
		media /= latas.length;
		
		//calculando dist�ncia
		
		double distancia[] = new double[20];
		
		for (int i=0; i<distancia.length; i++) {
			distancia[i] = Math.pow((latas[i] - media), 2);
		}
		
		//calculando somat�rio
		
		double somatorio = 0;
		
		for (int i=0; i<distancia.length; i++) {
			somatorio += distancia[i];
		}
		
		//divis�o
		
		somatorio /= (latas.length-1);
		
		//desvio padr�o
		
		double desvio = Math.sqrt(somatorio);
		
		System.out.println();
		
		System.out.println("M�dia: "+media);
		System.out.println("Desvio padr�o: "+desvio);
		
		if (desvio > 5 || desvio < -5) {
			System.out.println("O processo deve ser revisto.");
		} else {
			System.out.println("O processo est� funcionando bem e n�o necessita ser revisto.");
		}
		

		
		sc.close();
	}

}
