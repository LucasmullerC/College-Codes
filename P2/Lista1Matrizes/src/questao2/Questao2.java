package questao2;
import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String [] Nomes;
		Nomes = new String [19];
		double [] [] Notas;
		Notas = new double [20] [3];
		double mediaT;
		int Amedia;
		for (int i = 0;i <= Nomes.length;i++) {
			System.out.print("Digite o nome do aluno n� " +(i + 1) + " :");
			Nomes [i] = input.nextLine();
			System.out.print("Digite a nota da primeira avalia��o:");
			Notas [i][0] = input.nextDouble();input.nextLine();
			System.out.print("Digite a nota da segunda avalia��o:");
			Notas [i][1] = input.nextDouble();input.nextLine();
			Notas [i][2] = (Notas [i] [0] * 2 + Notas [i] [1] * 3) / 5;
			System.out.println("O Aluno " +Nomes[i]+ " obteve m�dia " +Notas [i] [2]);
		}
		mediaT = Media(Notas);
		System.out.print("A m�dia da turma foi " +mediaT);
		Amedia = AMedia(mediaT,Notas);
		System.out.print(Amedia+ " Alunos ficaram abaixo da m�dia da turma.");
		MM (Notas);
	}
	public static double Media (double [] [] Notas) {
		double media = 0;
		for (int i = 0;i < 19;i++) {
			media = Notas [i] [2] + Notas [i + 1] [2];	
		}
		media = media /20;
		return media;	
	}
	public static int AMedia (double mediaT, double [] [] Notas) {
		int Amedia = 0;
		for (int i = 0;i <= Notas.length;i++) {
			if (Notas [i] [2] < mediaT) {
				Amedia = Amedia + 1;
			}
		}
		return Amedia;
	}
	public static void MM (double [] [] Notas) {
		double menor = 0, maior= 10;
		for (int i = 0;i <= Notas.length;i++) {
			if (menor > Notas [i] [2]) {
				menor = Notas [i] [2];
			}
			if (maior < Notas [i] [2]) {
				maior = Notas [i] [2];
			}	
		}
		System.out.print("A menor m�dia foi " +menor+ " e a maior m�dia foi " +maior);
	}

}
