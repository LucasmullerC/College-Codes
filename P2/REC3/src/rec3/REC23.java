package rec3;
import java.util.Scanner;
public class REC23 {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int X,Y,M;
	System.out.print("Digite um n�mero X inteiro: ");
	X = input.nextInt();
	System.out.print("Digite um n�mero Y inteiro: ");
	Y = input.nextInt();
	M = MOD(X,Y);
	System.out.print("O resto da divis�o de " +X+ " por " +Y+ " � " +M);
	}
	public static int MOD (int X, int Y) {
		if (X > Y) {
			return MOD (X - Y,Y);
		}
		else if (X < Y) {
			return X;
		}
		else {
			return 0;
		}
	}

}
