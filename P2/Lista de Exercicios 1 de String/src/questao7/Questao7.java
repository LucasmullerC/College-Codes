package questao7;
import java.util.Scanner;
public class Questao7 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String F1,F2;
		int tam,resp = 0;
		char L1,L2;
		System.out.print("Digite uma frase: ");
		F1 = input.nextLine();
		System.out.print("Digite outra frase: ");
		F2 = input.nextLine();
		tam = F1.length();
		for (int i = 0; i < tam;i++) {
			L1 = F1.charAt(i);
			L2 = F2.charAt(i);
			if (L1 != L2) {
				resp = 0;
				break;
			}
			else {
				resp = 1;
			}
		}
		if (resp == 1) {
			System.out.print("As frases são iguais.");
		}
		else {
			System.out.print("As frases são diferentes.");
		}

		
	}

}
