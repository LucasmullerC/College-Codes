package questao4;
import java.util.Scanner;
public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] Nomes;
		Nomes = new String [10];
		Double [] [] Notas;
		Notas = new Double [10] [5];
		int C1 = 0;
		double menor = 0;
		for (int i = 0;i <= Nomes.length;i++) {
			System.out.print("Digite o nome do aluno nº " +(i + 1) + " :");
			Nomes [i] = input.nextLine();
			System.out.print("Digite a nota da primeira avaliação:");
			Notas [i][0] = input.nextDouble();input.nextLine();
			System.out.print("Digite a nota da segunda avaliação:");
			Notas [i][1] = input.nextDouble();input.nextLine();
			System.out.print("Digite a nota da terceira avaliação:");
			Notas [i][2] = input.nextDouble();input.nextLine();
			System.out.print("Digite a nota da quarta avaliação:");
			Notas [i][3] = input.nextDouble();input.nextLine();
			System.out.print("Digite a nota da quinta avaliação:");
			Notas [i][4] = input.nextDouble();input.nextLine();
		}
		for (int i = 0;i <= Nomes.length;i++) {
			for (int f = 0;i < 4;i++) {
				if (menor < Notas [i][f]) {
					menor = Notas [i][f];
				}
			}			
			System.out.print("A menor nota do aluno " +Nomes[i]+ " foi " +menor);	
			}
		}
}
