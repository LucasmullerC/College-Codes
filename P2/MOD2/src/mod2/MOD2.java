package mod2;
import java.util.Scanner;
public class MOD2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int X,Y,RP;
		boolean PES;
		do {
			System.out.print("Digite o primeiro número: ");
			X = input.nextInt();
			System.out.print("Digite o segundo número: ");
			Y = input.nextInt();
			PES = PES(X,Y);
			if (PES == true) {
				System.out.println(X+ " e " +Y+ " São primos entre si.");
			}
			else {
				System.out.println(X+ " e " +Y+ " Não são primos entre si.");
			}
			System.out.println("Deseja repetir o processo? ");
			System.out.println("1 - SIM");
			System.out.println("0 - SAIR");
			System.out.print("Opção: ");
			RP = input.nextInt();
		}while (RP == 1);

	}
	public static int MDC (int X,int Y) {
        if (X % Y == 0 ){
        return Y;
        }
        else{
        return MDC(Y,(X % Y));
         } 
	}
	public static boolean PES (int X,int Y) {
		int MDC;
		MDC = MDC(X,Y);
		if (MDC == 1) {
			return true;
		}
		else {
			return false;
		}
	}

}
