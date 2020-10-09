package questao4;
import java.util.Scanner;
public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		char [] Gabarito = new char [100];
		char [] [] Respostas = new char [50] [100];
		String [] Nomes = new String [50];
		int [] Acertos = new int [50];
		int cont = 0;
		System.out.println("Digite o gabarito da prova: ");
		for (int i=0;i<= Gabarito.length;i++) {
			System.out.println("Questão Nº " +(i+1)+ ": ");
			Gabarito [i] = input.next().charAt(0);	
		}
		for (int a=0;a<=Nomes.length;a++) {
			System.out.println("Digite o nome do aluno nº " +(a+1)+ ": ");
			Nomes [a] = input.nextLine();
		}
		System.out.println("Digite as respostas dos alunos: ");
		for (int b=0;b<= 99;b++) {
			if (cont == 50) {
				break;
			}
			System.out.println("Aluno: " +Nomes [cont]+ " , Resposta da questão nº " +(b+1)+ ": ");
			Respostas [cont] [b] = input.next().charAt(0);
			if (b == 99) {
				cont++;
				b = 0;
			}
		}
		cont = 0;
		for(int c=0;c <= 99;c++) {
			if (cont == 50) {
				break;
			}
			if (Respostas [cont] [c] == Gabarito [c]) {
				Acertos [cont] = Acertos [cont] + 1;
			}
			if (c == 99) {
				cont++;
				c = 0;
			}
		}
		cont = 0;
		for(int d=0;d <= Nomes.length;d++) {
			System.out.println("Aluno " +Nomes[d]+ " acertou " +Acertos [d]+ " questões.");
			if (Acertos [d] >= 70) {
				System.out.println("Aluno aprovado!");
			}
			else {
				System.out.println("Aluno reprovado.");
			}
		}
		

	}

}
