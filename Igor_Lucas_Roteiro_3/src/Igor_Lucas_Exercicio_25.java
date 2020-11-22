public class Igor_Lucas_Exercicio_25 {

	public static void main(String[] args) {
		
		double s=0, a=1, temp=0;
		
		for (int i = 1; i<=51; i++) {
			temp = Math.pow(a, 3);
			if (i % 2 != 0 ) {
				s += (1 / temp);
			} else if (i % 2 == 0){
				s -= (1 / temp);
			}
			a += 2;
		}
		
		double valor = s * 32;
		double PI = Math.cbrt(valor);
		
		System.out.println("O valor de PI é: "+PI);

	}

}
