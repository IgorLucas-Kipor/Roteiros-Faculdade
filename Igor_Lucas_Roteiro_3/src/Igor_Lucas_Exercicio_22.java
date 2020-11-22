//Sabe-se que um país A possui 500000 habitantes e uma taxa de natalidade de 3% ao ano, já o país B
//possui 700000 habitantes e uma taxa de natalidade de 2% ao ano. Escreva um algoritmo, sabendo que
//estamos no ano de 2015, que calcule em que ano a população do país A ultrapassará a população de B.

public class Igor_Lucas_Exercicio_22 {

	public static void main(String[] args) {

		double A=500000, B=700000;
		
		int ano=2015;
		
		while (A<=B) {
			A = A + (A * 0.03);
			B = B + (B * 0.02);
			ano++;
		}
		
		System.out.println("A população do país A será maior do que a do país B no ano de "+ano+".");

	}

}
