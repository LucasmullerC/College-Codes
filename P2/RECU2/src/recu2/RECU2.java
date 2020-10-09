package recu2;
import java.util.Scanner;
public class RECU2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X,Y,MDC;
		System.out.print("Digite o valor de X: ");
		X = input.nextInt();
		System.out.print("Digite o valor de Y: ");
		Y = input.nextInt();
		MDC = MDC (X,Y);
		System.out.print("O MDC de " +X+ " e " +Y+ " é " +MDC);

	}
	public static int MDC (int X,int Y) {
		if (X > Y) {
			return MDC(X - Y,Y);
		}
		else {
			return X;
		}
	}

}
