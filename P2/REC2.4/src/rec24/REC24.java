package rec24;
import java.util.Scanner;
public class REC24 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int A;
		System.out.print("Digite um número inteiro: ");
		A = input.nextInt();
		while (A <= 0) {
			System.out.print("Digite um número inteiro maior do que zero: ");
			A = input.nextInt();
		}
		P (A);

	}
	public static void C (int L,int N) {
		if (L > 0) {
			System.out.print(N+ " ");
			C (L - 1,N + 1);
		}
	}
	public static void P (int A) {
		int L = A + 1,N = 1;
		if (A > 0) {
			L = L - 1;
			System.out.println(" ");
			C (L,N);
			P (A - 1);
		}
	}

}
