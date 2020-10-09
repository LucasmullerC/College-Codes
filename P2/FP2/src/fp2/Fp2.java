package fp2;
import java.util.Scanner;
public class Fp2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int TA,TB,TC,TD;
		System.out.println("Jogo - Brasil X Japão");
		System.out.print("Infome quantos gols o Brasil fez: ");
		TA = input.nextInt();
		while (TA <= 0) {
			System.out.print("A quantidade de gols deve ser maior ou igual a 0, Digite novamente: ");
			TA = input.nextInt();
		}
		System.out.print("Infome quantos gols o Japão fez: ");
		TB = input.nextInt();
		while (TB <= 0 || TB == TA) {
			System.out.print("A quantidade de gols deve ser maior ou igual a 0 e não deve haver impates, Digite novamente: ");
			TB = input.nextInt();
		}
		System.out.println("Jogo - França X Uruguai");
		System.out.print("Infome quantos gols a França fez: ");
		TC = input.nextInt();
		while (TC <= 0) {
			System.out.print("A quantidade de gols deve ser maior ou igual a 0, Digite novamente: ");
			TC = input.nextInt();
		}
		System.out.print("Infome quantos gols o Uruguai fez: ");
		TD = input.nextInt();
		while (TD <= 0 || TD == TC) {
			System.out.print("A quantidade de gols deve ser maior ou igual a 0 e não deve haver impates, Digite novamente: ");
			TD = input.nextInt();
		}
		PLACAR (TA,TB,TC,TD);
	}
	public static int VAL (int TA, int TB) {
		int V;
		if (TA > TB) {
			V = 1;
			return V;
		}
		else {
			V = 2;
			return V;
		}
	}
	public static void PLACAR (int TA, int TB,int TC, int TD) {
		int V1,V2;
		V1 = VAL (TA,TB);	
		V2 = VAL (TC,TD);
		for (int RP = 1; RP <= 2; RP = RP + 1) {
			if (RP == 1) {
				System.out.println("A final será entre: ");
			}
			else {
				System.out.println("A disputa do 3º lugar será entre: ");
			}
			switch (V1) {
			case 1: System.out.print("Brasil X ");
			        V1 = 2;
			        break;
			case 2: System.out.print("Japão X ");
			        V1 = 1;
	                break;        
			}
			switch (V2) {
			case 1: System.out.println("França");
			        V2 = 2;
	                break;
	        case 2: System.out.println("Uruguai");
	                V1 = 1;
	                break;  
			}
			
		}
	}

}
