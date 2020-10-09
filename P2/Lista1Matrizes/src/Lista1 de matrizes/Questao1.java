package questao1;
import java.util.Scanner;
public class Questao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String [] Nomes;
		Nomes = new String [19];
		Double [] [] Notas;
		Notas = new Double [20] [3];
		for (int i = 0;i <= Nomes.length;i++) {
			System.out.print("Digite o nome do aluno nº " +(i + 1) + " :");
			Nomes [i] = input.nextLine();
			System.out.print("Digite a nota da primeira avaliação:");
			Notas [i][0] = input.nextDouble();input.nextLine();
			System.out.print("Digite a nota da segunda avaliação:");
			Notas [i][1] = input.nextDouble();input.nextLine();
			Notas [i][2] = (Notas [i] [0] * 2 + Notas [i] [1] * 3) / 5;
			System.out.println("O Aluno " +Nomes[i]+ " obteve média " +Notas [i] [2]);
		}

	}

}
