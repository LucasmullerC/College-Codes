package recu5;
import java.util.Scanner;
public class RECU5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cont = 0,n;
		double S;
		System.out.print("Digite o valor de N: ");
		n = input.nextInt();
		while (n <= 0) {
			System.out.print("N deve ser maior que zero: ");
			n = input.nextInt();
		}
		S = serie (cont,n);
		System.out.print("S = " +S);
	}
	public static double serie(int cont, int n) {
		double S = 0;
		if (n == 0) {
			return 1;
		}
		else {
			S = S + (serie(cont,n-1) + (1.0 / fat(cont)));
			return S;
		}
	}
	public static int fat(int cont) {
        if (cont == 1 || cont == 0) {

            return 1;

        } else {
            return cont * fat(cont - 1);

        }
	}

}
