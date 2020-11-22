import java.util.Scanner;
public class IgorLucas2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Sabemos que o vértice 355,355 está no canto superior direito, enquanto o vértice 0,0 está na parte inferior do meio
//		através disso podemos saber a parte vertical da quadra vai de 0 a 355, enquanto a parte horizontal vai de -355 a 355
//		como o enunciado nos fala que se a bola acertar a linha, ou seja, uma dessas extremidades, ela ainda é considerada dentro
//		então a lógica deve incluir a possibilidade de acertar, por exemplo, 355,355 como "dentro"
//		importante manter em mente: x é o eixo horizontal e y é o eixo vertical
//		irei adicionar também uma condição para a bola acertar a rede, já que a coordenada x=0 indica a rede que separa os lados da quadra
//		adicionalmente, como um desafio pessoal, tentarei fazer que o programa também fale se a bola acertou a quadra de
//		cuba ou do brasil (segundo o exemplo da imagem nesse set)
		
		System.out.print("Insira a coordenada x (-500 <= x <= 500): ");
		double x = sc.nextDouble();
		System.out.print("Insira a coordenada y (-500 <= y <= 500): ");
		double y = sc.nextDouble();
		
		if (x < -500 || x > 500 || y < -500 || y > 500) {
			System.err.println("Coordenadas inválidas.");
			System.exit(0);
		}
		
		if ((x >= -355 && x <= 355) && (y >= 0 && y <= 355)) {
			System.out.println("Bola dentro.");
		} else if (x == 0 && (y >= 0 && y <= 355)) {
			System.out.println("Bola na rede.");
		} else {
			System.out.println("Bola fora.");
		}
		
		if ((x > 0 && x <= 355) && (y >= 0 && y <= 355)) {
			System.out.println("Bola na quadra de Cuba. Ponto para o Brasil.");
		} else if ((x< 0 && x >= -355) && (y >= 0 && y<= 355)) {
			System.out.println("Bola na quadra do Brasil. Ponto para Cuba.");
		}
		
		sc.close();
	}

}
