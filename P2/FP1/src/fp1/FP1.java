package fp1;
import java.util.Scanner;
public class FP1 {
	public static void main(String[] args) {
		Scanner input =  new Scanner (System.in);
		double N1,N2;
		int AL;
		for (AL = 1; AL < 60;AL = AL + 1) {
			System.out.println("Conceito do Aluno Nº " +AL);
			System.out.print("Digite a nota da primeira prova: ");
			N1 = input.nextDouble();
			System.out.print("Digite a nota da segunda prova: ");
			N2 = input.nextDouble();
			ME (N1,N2);
		}
	}
	public static int CONC (double M) {
		int CONC;
		if (M >= 0 && M < 5.0) {
			CONC = 1;
		}
		else if (M >= 5.0 && M < 7.0) {
			CONC = 2;
		}
		else if (M >= 7.0 && M < 9.0) {
			CONC = 3;
		}
		else {
			CONC = 4;
		}
		return CONC;
	}
	public static void ME (double N1, double N2) {
		double M;
		int C;
		M = (N1 + N2) / 2;
		C = CONC (M);
		switch (C) {
		case 1: System.out.println("A sua média é " +M+ " E seu conceito é D");
		        break;
		case 2: System.out.println("A sua média é " +M+ " E seu conceito é C");
		        break;
		case 3: System.out.println("A sua média é " +M+ " E seu conceito é B");
		        break;
		case 4: System.out.println("A sua média é " +M+ " E seu conceito é A");        
		        break;
		}
	}

}
