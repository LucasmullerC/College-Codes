package recu3;
import java.util.Scanner;
public class RECU3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int K,N,comb;
		System.out.print("Digite o número de pessoas N: ");
		N = input.nextInt();
		while (N < 1) {
			System.out.print("O número deve ser maior ou igual a 1: ");
			N = input.nextInt();
		}
		System.out.print("Digite o número de pessoas K: ");
		K = input.nextInt();
		while (K < 1) {
			System.out.print("O número deve ser maior ou igual a 1: ");
			K = input.nextInt();
		}
		comb = comb(N,K);
		System.out.println("É possivel formar " +comb+ " Diferentes grupos.");

	}
	public static int comb (int N, int K) {
		int i;
		if (K == 1) {
			return N;
		}
		else if (K == N) {
			return 1;
		}
		else if (1 < K && K < N) {
			return comb(N - 1,K - 1) + comb(N - 1,K);
		}
		else {
			for (i = 1;i <= N;i= i + 1) {
				N = N*i;
			}
			for (i = 1;i <= N;i= i + 1) {
				K = K*i;
			}
			return N / K * (N - K);
		}
	}

}
