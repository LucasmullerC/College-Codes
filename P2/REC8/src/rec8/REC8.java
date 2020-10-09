package rec8;
import java.util.Scanner;
public class REC8 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double X,XY;
		int Y;
		System.out.print("Digite o valor de X: ");
		X = input.nextDouble();
		System.out.print("Digite o valor de Y: ");
		Y = input.nextInt();
		while (Y < 0) {
			System.out.print("Y deve ser maior ou igual a 0: ");
			Y = input.nextInt();
		}
		XY = POWER (X,Y);
		System.out.print(X+ " Elevado a " +Y+ " É " +XY);

	}
	public static double POWER (double X, int Y) {
		if (Y == 0) {
			return 0;
		}
		else if (Y == 1) {
			return X;
		}
		else {
			return X * POWER (X,Y - 1);
		}
	}

}
