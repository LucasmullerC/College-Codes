package questao5;
import java.util.Scanner;
public class Questao5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] [] MATa;
		MATa = new int [3] [4];
		int [] [] MATb;
		MATb = new int [4] [3];
		int C1=0,C2=0;
		for (int i = 0; i <= 11;i++) {
			System.out.print("Digite um valor para [" +(C1 + 1)+ ","+(C2 + 1)+ "]: ");
			MATa [C1] [C2] = input.nextInt();
			if (C2 <= 3 && C1 <= 2) {
				MATb [C2] [C1] = MATa [C1] [C2];
			}
			if (C2 == 3) {
				C2 = 0;
				C1 = C1 + 1;
			}
			else {
				C2 = C2 + 1;
			}
		}
		LerM1(MATa);
		System.out.println(" ");
		LerM2(MATb);

	}
	public static void LerM1 (int [] [] MAT1) {
		int C1=0,C2=0;
		for (int i = 0; i <= 11;i++) {
			System.out.print(MAT1 [C1] [C2]+ " ");
			if (C2 == 3) {
				C2 = 0;
				C1 = C1 + 1;
				System.out.println(" ");
			}
			else {
				C2 = C2 + 1;
			}
		}
	}
	public static void LerM2 (int [] [] MAT1) {
		int C1=0,C2=0;
		for (int i = 0; i <= 11;i++) {
			System.out.print(MAT1 [C1] [C2]+ " ");
			if (C2 == 2) {
				C2 = 0;
				C1 = C1 + 1;
				System.out.println(" ");
			}
			else {
				C2 = C2 + 1;
			}
		}
	}

}
