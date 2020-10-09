package vetoresOBJ;
import java.util.Scanner;
public class VetoresOBJ {
	public static void main(String[] args) {
		Pessoa [] vet = new Pessoa [20];
		System.out.println("Informe os dados da pessoas: ");
		FillPessoa (vet);
	    PesoIdeal(vet);
	    Exibe(vet);

	}
	public static void FillPessoa (Pessoa [] vet) {
		Scanner input = new Scanner (System.in);
		String nome;
		Pessoa pep;
		int id;
		char gen;
		double pes;
		double alt;
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Informe o nome da pessoa Nº " +(i + 1)+ " :");
			nome = input.next();
			pep = new Pessoa(nome);
			System.out.println("Informe a idade da pessoa Nº " +(i + 1)+ " :");
			do {
				id = input.nextInt();
			} while (id <= 0 || id > 100);
			pep.setIdade (id);
			System.out.println("Informe o genero (F / M) da pessoa Nº " +(i + 1)+ " :");
			do {
				gen = input.next().charAt(0);
			}while (gen != 'F' && gen != 'M');
			pep.setGenero (gen);
			System.out.println("Informe o peso da pessoa Nº " +(i + 1)+ " :");
			do {
				pes = input.nextDouble();
			}while (pes <= 0);
			pep.setPeso (pes);
			System.out.println("Informe a altura da pessoa Nº " +(i + 1)+ " :");
			do {
				alt = input.nextDouble();
			}while (alt <= 0 || alt > 3.00);
			pep.setAltura (alt);
			vet[i] = pep;	
		}	
	}
	public static void PesoIdeal (Pessoa [] vet) {
		double PI;
		for (int i = 0; i < vet.length; i++) {
			if (vet[i].getGenero() == 'F') {
				PI = 62.1 * vet[i].getAltura() - 44.7;
				vet[i].setPesoideal (PI);
			}
			else {
				PI = 72.7 * vet[i].getAltura() - 58;
				vet[i].setPesoideal(PI);
			}
		}
	}
	public static void Exibe (Pessoa [] vet) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}
	

}