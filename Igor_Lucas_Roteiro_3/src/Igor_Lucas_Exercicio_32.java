//Escrever um algoritmo que gera e escreve os 5 primeiros números perfeitos. Um número perfeito é aquele
//que é igual a soma dos seus divisores. (Ex.: 6 = 1+2+3; 28= 1+2+4+7+14 etc).

public class Igor_Lucas_Exercicio_32 {

	public static void main(String[] args) {
		long valor = 2, perfeitos=0, soma=1;
		
		while(perfeitos != 5) {
			for (long i = 2; i<=valor; i++) {
				if (valor % i == 0 && i != valor) {
					soma += i;
				}
			}
				if (soma == valor) {
					System.out.println(valor);
					perfeitos++;
				}
				soma=1;
				valor++;
			}
		
		System.out.println("Terminou.");
	}

}
