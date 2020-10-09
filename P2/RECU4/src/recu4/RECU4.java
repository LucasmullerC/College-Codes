package recu4;
import java.util.Scanner;
public class RECU4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int N;
		System.out.println("..Série de Fibonacci.. ");
		System.out.print("Digite o número de termos: ");
		N = input.nextInt();
		FIB(N);

	}
	public static int F1 (int N) {
		if (N < 2) {
            return N;
        } else {
            return F1(N - 1) + F1(N - 2);
        }
	}
	public static void FIB (int N) {
		int X2;
		if (N > 0) {
			X2 = F1(N);
			System.out.print(X2+ " ");
			FIB (N - 1);
		}
	}

}
