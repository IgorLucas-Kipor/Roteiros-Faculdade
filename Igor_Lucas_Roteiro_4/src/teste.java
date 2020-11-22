
public class teste {
	
	public static void main (String [] args) {
		
		int vetor[] = new int[4];
		
		for (int i=0; i<vetor.length; i++) {
			vetor[i] = i;
		}
		
		for (int v : vetor) {
			System.out.println(v);
		}
	}

}
