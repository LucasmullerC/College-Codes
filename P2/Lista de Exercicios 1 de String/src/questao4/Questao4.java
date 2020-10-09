package questao4;
import java.util.Scanner;
public class Questao4 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String frase;
		int tam;
		char letra;
		System.out.print("Digite uma frase: ");
		frase = input.nextLine();
		tam = frase.length();
		for (int i = 0; i < tam; i++) {
			letra = frase.charAt(i);
			letra = Character.toLowerCase(letra);
			if (letra == 'a') {
				System.out.print("@");
			}
			else if (letra == 'e') {
				System.out.print("$");
			}
			else if (letra == 'i') {
				System.out.print("&");
			}
			else if (letra == 'o') {
				System.out.print("*");
			}
			else if (letra == 'u') {
				System.out.print("#");
			}
			else if (Character.isSpaceChar(letra)) {
				System.out.print(" ");
			}
			else {
				System.out.print(letra);
			}
		}
		
		

	}

}
