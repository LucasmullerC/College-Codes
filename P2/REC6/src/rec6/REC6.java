package rec6;
import java.util.Scanner;
public class REC6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int N1,N2,X;
		System.out.println("Programa de Multiplicação: ");
		System.out.print("Digite o valor inteiro de N1: ");
		N1 = input.nextInt();
		while (N1 < 1) {
			System.out.print("O número deve ser maior ou igual a 1: ");
			N1 = input.nextInt();
		}
		System.out.print("Digite o valor inteiro de N2: ");
		N2 = input.nextInt();
		while (N2 < 1) {
			System.out.print("O número deve ser maior ou igual a 1: ");
			N2 = input.nextInt();
		}
		X = produto (N1,N2);
		System.out.print("A multiplicação de " +N1+ " X " +N2+ " é " +X);

	}
	public static int produto (int N1, int N2) {
		int X = 0;
		if (N2 > 0) {
			X = N1 + produto (N1,N2 - 1);
		}
		return X;
	}

}
