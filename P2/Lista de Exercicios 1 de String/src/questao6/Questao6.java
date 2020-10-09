package questao6;
import java.util.Scanner;
public class Questao6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String CPF;
		int tam;
		char letra;
		do {
		    System.out.print("Digite o CPF: ");
			CPF = input.nextLine();
			tam = CPF.length();		
		}while (tam != 11);
		for (int i = 0; i < tam;i++) {
			letra = CPF.charAt(i);
			System.out.print(letra);
			if (i == 2) {
				System.out.print(".");
			}
			else if(i == 5) {
				System.out.print(".");
			}
			else if(i == 8) {
				System.out.print("-");
			}
		}

	}

}
