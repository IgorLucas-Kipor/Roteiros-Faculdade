//O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à
//média. Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores
//altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está
//avaliando o processo de fabricação de seus refrigerantes em lata, especificamente a etapa de
//preenchimento do conteúdo. As latas devem possuir 390 ml, com desvio padrão de + ou – 5 ml. Na
//análise foram coletadas 20 amostras aleatórias da linha de produção, medindo-se a quantidade de
//produto das mesmas. Você é o programador da empresa, e ficou incumbido de implementar um
//programa que auxilie seu gerente, mostrando ao mesmo a média e o desvio padrão entre os elementos
//das amostras. Além disso, exiba se o processo deve ou não ser revisado.

import java.util.Scanner;
public class Igor_Lucas_Exercicio_18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double latas[] = new double[20];
		
		
		double media=0;
		
		//preenchendo as latas e calculando média
		
		for (int i=0; i<latas.length; i++) {
			System.out.print("Quantidade de conteúdo na lata "+(1+i)+": ");
			latas[i] = sc.nextDouble();
			media += latas[i];
		}
		
		media /= latas.length;
		
		//calculando distância
		
		double distancia[] = new double[20];
		
		for (int i=0; i<distancia.length; i++) {
			distancia[i] = Math.pow((latas[i] - media), 2);
		}
		
		//calculando somatório
		
		double somatorio = 0;
		
		for (int i=0; i<distancia.length; i++) {
			somatorio += distancia[i];
		}
		
		//divisão
		
		somatorio /= (latas.length-1);
		
		//desvio padrão
		
		double desvio = Math.sqrt(somatorio);
		
		System.out.println();
		
		System.out.println("Média: "+media);
		System.out.println("Desvio padrão: "+desvio);
		
		if (desvio > 5 || desvio < -5) {
			System.out.println("O processo deve ser revisto.");
		} else {
			System.out.println("O processo está funcionando bem e não necessita ser revisto.");
		}
		

		
		sc.close();
	}

}
