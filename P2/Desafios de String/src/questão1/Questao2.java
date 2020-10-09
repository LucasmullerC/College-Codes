package questão1;
import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Nome, Nnome;
		int tam;
		boolean valida = false;
		do {
			System.out.print("Digite uma frase: ");
			Nome = input.nextLine();
			tam = Nome.length();
			valida = ValidaNome(Nome, tam);
			if (valida == false) {
				System.out.println("frase inválida, tente novamente.");
			}
		} while (valida == false);
		System.out.println("A palavra tem " +tam+ " letras.");

	}
	public static boolean ValidaNome(String Nome, int tam) {
		char letra;
		boolean valida = true;
		for (int i = 0; i < tam; i++) {
			letra = Nome.charAt(i);
			letra = Character.toLowerCase(letra);
			if (Character.isDigit(letra) == true) {
				valida = false;
				break;
			}
		}
		return valida;
	}

}
