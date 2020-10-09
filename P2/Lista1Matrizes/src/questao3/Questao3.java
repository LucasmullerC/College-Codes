package questao3;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] [] MAT1;
		MAT1 = new int [5] [5];
		int [] [] MAT2;
		MAT2 = new int [5] [5];
		int C1=0,C2=0,MaiorM1;
		for (int i = 0; i <= 24;i++) {
			System.out.print("Digite um valor para [" +(C1 + 1)+ ","+(C2 + 1)+ "]: ");
			MAT1 [C1] [C2] = input.nextInt();
			if (C2 == 4) {
				C2 = 0;
				C1 = C1 + 1;
			}
			else {
				C2 = C2 + 1;
			}
		}
		LerM1(MAT1);
		MaiorM1 = MaiorM1(MAT1);
		System.out.println("O maior valor de MAT1 é " +MaiorM1);
		MAT2 = PreencherM2(MAT1,MAT2,MaiorM1);
		LerM1(MAT2);
		

	}
	public static void LerM1 (int [] [] MAT1) {
		int C1=0,C2=0;
		for (int i = 0; i <= 24;i++) {
			System.out.print(MAT1 [C1] [C2]+ " ");
			if (C2 == 4) {
				C2 = 0;
				C1 = C1 + 1;
				System.out.println(" ");
			}
			else {
				C2 = C2 + 1;
			}
		}
	}
	public static int MaiorM1 (int [] [] MAT1) {
		int maior=0,C1=0,C2=0;
		for (int i = 0; i <= 24;i++) {
			if (maior < MAT1 [C1] [C2]) {
				maior = MAT1 [C1] [C2];
			}
			if (C2 == 4) {
				C2 = 0;
				C1 = C1 + 1;
			}
			else {
				C2 = C2 + 1;
			}
		}
		return maior;
	}
	public static int [] [] PreencherM2(int [] [] MAT1,int [] [] MAT2,int MM1) {
		int C1=0,C2=0;
		for (int i = 0; i <= 24;i++) {
			MAT2 [C1] [C2] = MAT1 [C1] [C2] * MM1;
			if (C2 == 4) {
				C2 = 0;
				C1 = C1 + 1;
			}
			else {
				C2 = C2 + 1;
			}
		}
		return MAT2;
	}

}
