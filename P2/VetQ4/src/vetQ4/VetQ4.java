package vetQ4;
import java.util.Scanner;
public class VetQ4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] VBranco = new int [0];
		int [] VJoao = new int [0];
		int [] VMaria = new int [0];
		int [] VPedro = new int [0];
		int [] VLuis = new int [0];
		int [] VNulo = new int [0];
		int esc;
		int V0 = 0;
		int V1 = 0;
		int V2 = 0;
		int V3 = 0;
		int V4 = 0;
		int VN = 0;
		char resp;
		int VT = 0;
		do {
			VT = VT + 1;
			System.out.println("Escolha um candidato para votar: ");
			System.out.println("0 - Voto em branco");
			System.out.println("1 - Voto em João");
			System.out.println("2 - Voto em Maria");
			System.out.println("3 - Voto em Pedro");
			System.out.println("4 - Voto em Luis");
			System.out.print("Digite o número do seu voto: ");
			esc = input.nextInt();
			switch (esc) {
			case 0: V0 = V0 + 1;
				    VBranco = new int [V0];
				    break;
			case 1:	V1 = V1 + 1;
		            VJoao = new int [V1];
		            break; 
			case 2:	V2 = V2 + 1;
                    VMaria = new int [V2];
                    break; 
			case 3:	V3 = V3 + 1;
                    VPedro = new int [V3];
                    break; 
			case 4:	V4 = V4 + 1;
                    VLuis = new int [V4];
                    break; 
            default:VN = VN + 1;
                    VNulo = new int [VN];
                    break; 
			}
			do {
				System.out.print("Existe outro eleitor para votar? Digite S para SIM / N para NÃO: ");
				resp = input.next().charAt(0);
			}while (resp != 's' && resp != 'S' && resp != 'n' && resp != 'N');
		}while (resp != 'n' && resp != 'N');
		 double VB = Calcvotos (VBranco);
		 double VJ = Calcvotos (VJoao);
		 double VM = Calcvotos (VMaria);
		 double VP = Calcvotos (VPedro);
		 double VL = Calcvotos (VLuis);
		 double VNU = Calcvotos (VNulo);
		 VB = VB / VT;
		 VJ = VJ / VT;
		 VM = VM / VT;
		 VP = VP / VT;
		 VL = VL / VT;
		 System.out.println("A porcentagem de votos em Branco foi de " +VB+ " %");
		 System.out.println("A porcentagem de votos para João foi de " +VJ+ " %");
		 System.out.println("A porcentagem de votos para Maria foi de " +VM+ " %");
		 System.out.println("A porcentagem de votos para Pedro foi de " +VP+ " %");
		 System.out.println("A porcentagem de votos para Luis foi de " +VL+ " %");
		 System.out.println("A porcentagem de votos nulo foi de " +VNU+ " %");
	}
	public static int Calcvotos (int [] votos) {
		int calcGanho = 0;
		for (int i = 0; i < votos.length;i++) {
			calcGanho = i;
		}
		return calcGanho;
}

}
