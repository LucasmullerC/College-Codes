package rec5;
import java.util.Scanner;
public class REC5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		System.out.print("Digite um n�mero inteiro: ");
		N = input.nextInt();
		while (N < 1) {
			System.out.print("O n�mero deve ser maior ou igual a 1: ");
			N = input.nextInt();
		}
		binario(N);
	}
	public static void binario (int N) {
		if (N > 0) {
			binario(N / 2);
			System.out.print(N % 2);
		}
	}

}
