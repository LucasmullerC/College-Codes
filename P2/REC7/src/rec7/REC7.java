package rec7;
import java.util.Scanner;
public class REC7 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int N;
		System.out.print("Digite um valor inteiro e par: ");
		N = input.nextInt();
		while (N < 1 || N % 2 != 0) {
			System.out.print("O número deve ser maior que zero e par: ");
			N = input.nextInt();
		}
		PAR (N);

	}
	public static void PAR (int N) {
		int FM;
		if (N > 0) {
			System.out.println(N);
			PAR (N - 2);
		}
	}

}
