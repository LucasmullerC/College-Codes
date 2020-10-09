package questao1;
import java.util.Scanner;
public class Questao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String frase;
		int tam,cont = 0;
		char letra;
		System.out.print("Digite uma frase: ");
		frase = input.nextLine();
		tam = frase.length();
		for (int i = 0; i < tam; i++) {
			letra = frase.charAt(i);
			letra = Character.toLowerCase(letra);
			if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			cont++;
			}
		}
		System.out.println("A frase: " +frase+ " Tem " +cont+ " vogais.");
	}

}
