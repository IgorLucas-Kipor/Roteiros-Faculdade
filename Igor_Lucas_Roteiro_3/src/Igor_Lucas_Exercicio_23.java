//Considere uma linha ferroviária entre São Paulo e Curitiba. Suponha que uma locomotiva (trem) A parte
//de São Paulo para Curitiba com velocidade de 30 m/s enquanto que uma outra locomotiva B parte de
//Curitiba para São Paulo no mesmo instante com velocidade de 40 m/s. Considere a distância entre São
//Paulo e Curitiba de 400 Km. Considere também que as linhas férreas são paralelas. Implemente um
//algoritmo que calcule iterativamente o tempo em que as locomotivas se cruzarão no caminho. O
//algoritmo deve calcular também a distância que as locomotivas devem percorrer até o momento do
//cruzamento.


public class Igor_Lucas_Exercicio_23 {

	public static void main(String[] args) {


		int A=30, B=40, distancia = 400000, tempo=0, trajetoA=0, trajetoB=0;
		
		while (distancia>0) {
			trajetoA += A;
			distancia -= A;
			trajetoB += B;
			distancia -= B;
			tempo++;
		}
		
		int tempoHora = tempo / 3600;
		
		int tempoMin = (tempo - (tempoHora * 3600)) / 60;
		
		int tempoSeg = (tempo - (tempoHora * 3600) - (tempoMin * 60));
		
		
		System.out.println("As locomotivas cruzaram caminho aproximadamente em "+tempoHora+" horas, "+tempoMin+" minutos e "+tempoSeg+" segundos"
				+ ", quando a locomotiva A tiver percorrido "+trajetoA+" metros e a locomotiva B tiver percorrido "+trajetoB+" metros.");

	}

}
