//Criar um algoritmo que a partir da idade e peso do paciente calcule a dosagem de determinado
//medicamento e imprima a receita informando quantas gotas do medicamento o paciente deve tomar
//por dose. Considere que o medicamento em questão possui 500 mg por ml, e que cada ml corresponde a 20
//gotas.
//- Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60 quilos devem
//tomar 1000 mg; com peso abaixo de 60 quilos devem tomar 875 mg.
//- Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso corpóreo conforme a
//tabela a seguir:
	
import java.util.Scanner;
import java.util.Locale;
public class Igor_Lucas_Exercicio_10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a idade do paciente: ");
		int idade = sc.nextInt();
		System.out.print("Insira o peso do paciente: ");
		int peso = sc.nextInt();
		double mg=0, ml, gotas;
		if (idade >= 12 && peso >= 60) {
			mg = 1000;
		} else if (idade >=12 && peso < 60) {
			mg = 875;
		} else if (idade < 12) {
			if (peso >= 5 && peso <= 9) {
				mg = 125;
			} else if ( peso > 9 && peso <= 16){
				mg = 250;
			} else if ( peso > 16 && peso <= 24) {
				mg = 375;
			} else if ( peso > 24 && peso <= 30) {
				mg = 500;
			} else if (peso > 30) {
				mg = 750;
			}
		}
		ml = mg / 500;
		gotas = 20*ml;
		System.out.printf("O paciente em questão deve tomar %.0f gotas.%n", gotas);
		sc.close();
	}
}
