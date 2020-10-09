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
			System.out.println(M+ " Metros são " +VF+ " Quilômetros.");
			break;
			case 2: VF = HEC (M);
			System.out.println(M+ " Metros são " +VF+ " Hectômetros.");
			break;
			case 3: VF = DEC (M);
			System.out.println(M+ " Metros são " +VF+ " Decâmetros.");
			break;
			case 4: VF = DECI (M);
			System.out.println(M+ " Metros são " +VF+ " Decímetros.");
			break;
			case 5: VF = CEN (M);
			System.out.println(M+ " Metros são " +VF+ " Centímetros.");
			break;
			case 6: VF = MILI (M);
			System.out.println(M+ " Metros são " +VF+ " Milímetros.");
			break;
			case 0: System.out.println("Obrigado! Até a proxima!");
			break;
			default: System.out.println("Opção incorreta, Tente novamente.");
			}
		} while (Menu != 0);
	}
	public static void MENU () {
		System.out.println("Converter Metros para: ");
		System.out.println("1 - Quilômetro");
		System.out.println("2 - Hectômetro");
		System.out.println("3 - Decâmetro");
		System.out.println("4 - Decímetros");
		System.out.println("5 - Centímetros");
		System.out.println("6 - Milímetros");
		System.out.println("0 - Sair");
		System.out.print("Informe a opção que deseja: ");
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
