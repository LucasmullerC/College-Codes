package rec1;
import java.util.Scanner;
public class REC1 {
	public static void main(String[] args) {
		Scanner input =  new Scanner (System.in);
		int N,V;
		System.out.print("Digite um valor inteiro: ");
		N = input.nextInt();
		while (N <= 1) {
			System.out.print("O valor deve ser maior ou igual a 1. Digite novamente: ");
			N = input.nextInt();
		}
		V = X (N);
		System.out.print(V);
	}
	public static int X (int a) {
		if ( a <= 0 ) {
			return 0;
			}
			else {
			return a + X(a-1);
			}
		}

}
