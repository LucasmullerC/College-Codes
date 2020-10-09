package list2vet1;
import java.util.Scanner;
public class List2vet1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String [] nomes = new String [50];
		Double [] notas = new Double [50];
		Double [] Segnota = new Double [50];
		Double [] media = new Double [50];
		int cont = 0;
		double Mturma = 0;
		double MFturma;
		double AlunosB;
		double AlunosA;
		double maior;
		do {
			System.out.print("Informe o nome do aluno: ");
			nomes[cont] = input.next();
			System.out.print("Informe a primeira nota do Aluno Nº " +cont+ ": ");
			notas[cont] = input.nextDouble();
			System.out.print("Informe a segunda nota do Aluno Nº " +cont+ ": ");
			Segnota[cont] = input.nextDouble();
			media[cont] = (notas[cont] * 2 + Segnota[cont] *3) / 5;
			System.out.println("O aluno " +nomes[cont]+ " obteve média " +media[cont]+ ".");
			cont = cont + 1;
		}while (cont != 50);
		for (int i = 0;i < media.length; i++) {
			Mturma = Mturma + media [i];
		}
		MFturma = Mturma / 50;
		System.out.print("A tuma obteve média " +MFturma);
		AlunosB = BMedia(media,MFturma);
		AlunosA = AMedia(media,MFturma);
		maior = Maior(media);
		System.out.print(AlunosB+ "% Dos alunos ficaram abaixo da média.");
		System.out.print(AlunosA+ "% Dos alunos ficaram acima da média.");
		System.out.print("A maior média da turma foi: " +maior);

	}
	public static double BMedia (Double [] media, double MFturma) {
		double Palunos = 0;
		double PBalunos = 0;
		double Ptotal = 0;
		for (int i = 0;i < media.length; i++) {
			if (media [i] < MFturma) {
				Palunos = Palunos + 1;		  
			}
			else {
				PBalunos = PBalunos + 1;		
			}		
		}
		Ptotal = Palunos / PBalunos;
		return Ptotal;
	}
	public static double AMedia (Double [] media, double MFturma) {
		double Palunos = 0;
		double PBalunos = 0;
		double Ptotal = 0;
		for (int i = 0;i < media.length; i++) {
			if (media [i] > MFturma) {
				Palunos = Palunos + 1;		  
			}
			else {
				PBalunos = PBalunos + 1;		
			}		
		}
		Ptotal = Palunos / PBalunos;
		return Ptotal;
	}
	public static double Maior (Double [] media) {
		double maior = 0;
		for (int i = 0;i < media.length; i++) {
			if (media [i] > maior) {
				maior = media [i];
			}
		}
		return maior;
	}

}
