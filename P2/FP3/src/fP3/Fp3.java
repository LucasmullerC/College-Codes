package fP3;
import java.util.Scanner;
public class Fp3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double M,VF;
		int Menu;
		do {
			MENU ();
			Menu = input.nextInt();
			System.out.print("Digite o valor em Metros: ");
			M = input.nextDouble();
			switch (Menu) {
			case 1: VF = QUI (M);
			System.out.println(M+ " Metros s�o " +VF+ " Quil�metros.");
			break;
			case 2: VF = HEC (M);
			System.out.println(M+ " Metros s�o " +VF+ " Hect�metros.");
			break;
			case 3: VF = DEC (M);
			System.out.println(M+ " Metros s�o " +VF+ " Dec�metros.");
			break;
			case 4: VF = DECI (M);
			System.out.println(M+ " Metros s�o " +VF+ " Dec�metros.");
			break;
			case 5: VF = CEN (M);
			System.out.println(M+ " Metros s�o " +VF+ " Cent�metros.");
			break;
			case 6: VF = MILI (M);
			System.out.println(M+ " Metros s�o " +VF+ " Mil�metros.");
			break;
			case 0: System.out.println("Obrigado! At� a proxima!");
			break;
			default: System.out.println("Op��o incorreta, Tente novamente.");
			}
		} while (Menu != 0);
	}
	public static void MENU () {
		System.out.println("Converter Metros para: ");
		System.out.println("1 - Quil�metro");
		System.out.println("2 - Hect�metro");
		System.out.println("3 - Dec�metro");
		System.out.println("4 - Dec�metros");
		System.out.println("5 - Cent�metros");
		System.out.println("6 - Mil�metros");
		System.out.println("0 - Sair");
		System.out.print("Informe a op��o que deseja: ");
	}
	public static double QUI (double M) {
		double Q;
		Q = M / 1000;
		return Q;
	}
	public static double HEC (double M) {
		double H;
		H = M / 100;
		return H;
	}
	public static double DEC (double M) {
		double Q;
		Q = M / 10;
		return Q;
	}
	public static double DECI (double M) {
		double Q;
		Q = M * 10;
		return Q;
	}
	public static double CEN (double M) {
		double Q;
		Q = M * 100;
		return Q;
	}
	public static double MILI (double M) {
		double Q;
		Q = M * 1000;
		return Q;
	}
	

}
