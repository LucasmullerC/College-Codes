package mod1;
import java.util.Scanner;
public class MOD1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int MN,X,Y,X1,Y1,XP,YP,RA;
		boolean R,C = false;
		do {
			System.out.println("1 - Ret�ngulo");
			System.out.println("2 - Circulo");
			System.out.println("0 - Sair");
			System.out.print("Op��o: ");
			MN = input.nextInt();
			switch (MN) {
			case 1: System.out.println("Ret�ngulo");
			System.out.println("Digite as coordenadas do v�rtice superior esquerdo: ");
			System.out.print("X: ");
			X = input.nextInt();
			while (X < 0) {
				System.out.print("O valor de X deve ser positivo: ");
				X = input.nextInt();
			}
			System.out.print("Y: ");
			Y = input.nextInt();
			while (Y < 0) {
				System.out.print("O valor de Y deve ser positivo: ");
				Y = input.nextInt();
			}
			System.out.println("Digite as coordenadas do v�rtice inferior direito: ");
			System.out.print("X: ");
			X1 = input.nextInt();
			while (X1 < 0) {
				System.out.print("O valor de X deve ser positivo: ");
				X1 = input.nextInt();
			}
			System.out.print("Y: ");
			Y1 = input.nextInt();
			while (Y1 < 0) {
				System.out.print("O valor de Y deve ser positivo: ");
				Y1 = input.nextInt();
			}
			System.out.println("Digite as coordenadas do ponto: ");
			System.out.print("X: ");
			XP = input.nextInt();
			while (XP < 0) {
				System.out.print("O valor de X deve ser positivo: ");
				XP = input.nextInt();	
			}
			System.out.print("Y: ");
			YP = input.nextInt();
			while (YP < 0) {
				System.out.print("O valor de Y deve ser positivo: ");
				YP = input.nextInt();	
			}
			R = RET(X,Y,X1,Y1,XP,YP);
			if (R == true) {
				System.out.println("O ponto est� dentro do ret�ngulo.");
			}
			else {
				System.out.println("O ponto est� fora do ret�ngulo.");
			}
			break;	
			case 2: System.out.println("Ret�ngulo");
			System.out.println("Digite as coordenadas do centro: ");
			System.out.print("X: ");
			X = input.nextInt();
			while (X < 0) {
				System.out.print("X deve ser positivo: ");
				X = input.nextInt();	
			}
			System.out.print("Y: ");
			Y = input.nextInt();
			while (Y < 0) {
				System.out.print("Y deve ser positivo: ");
				Y = input.nextInt();	
			}
			System.out.print("Digite o comprimento do raio: ");
			RA = input.nextInt();
			while (RA < 0) {
				System.out.print("O valor de R deve ser positivo: ");
				RA = input.nextInt();	
			}
			System.out.println("Digite as coordenadas do ponto: ");
			System.out.print("X: ");
			XP = input.nextInt();
			while (XP < 0) {
				System.out.print("O valor de X deve ser positivo: ");
				XP = input.nextInt();	
			}
			System.out.print("Y: ");
			YP = input.nextInt();
			while (YP < 0) {
				System.out.print("O valor de Y deve ser positivo: ");
				YP = input.nextInt();	
			}
			C = CIR(X,Y,RA,XP,YP);
			if (C == true) {
				System.out.println("O ponto est� dentro do Circulo.");
			}
			else {
				System.out.println("O ponto est� fora do Circulo.");
			}
			break;
			case 0: System.out.println("At� a proxima!");
			break;
			default: System.out.println("Valor inv�lido.");
			}	
			
		} while(MN != 0);

	}
	public static boolean RET (int X,int Y,int X1, int Y1, int XP, int YP ) {
		if (XP <= X && XP <= X1 && YP <= Y && YP <= Y1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean CIR (int X,int Y,int R,int XP, int YP) {
		if (XP < R + R && YP < R + R) {
			return true;
		}
		else {
			return false;
		}
	}

}
