package questao2;
import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String frase;
		int cont = 0,tam;
		char letra;
		System.out.print("Digite uma frase: ");
		frase = input.nextLine();
		System.out.print("Digite uma letra: ");
		letra = input.next().charAt(0);
		tam = frase.length();
		for (int i = 0; i < tam;i++) {
			if (letra == frase.charAt(i)) {
				cont ++;
			}
		}
		System.out.print("A frase " +frase+ " contém a letra '" +letra+ "' " +cont+ " vezes.");

	}

}
