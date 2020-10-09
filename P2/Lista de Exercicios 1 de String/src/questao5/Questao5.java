package questao5;
import java.util.Scanner;
public class Questao5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String nome;
		int tam,resp = 0;
		char letra;
		do {
			System.out.print("Digite um nome: ");
			nome = input.nextLine();
			tam = nome.length();
			for (int i = 0; i < tam;i++) {
				letra = nome.charAt(i);
				letra =  Character.toUpperCase(letra);
				if (Character.isLetter(letra) || Character.isSpaceChar(letra)) {
					resp = 0;
				}
				else {
					resp = 1;
					System.out.print("Não são permitidos Simbolos ou números no nome.");
					break;
				}
			}
			nome = nome.toUpperCase();  
	}while (resp == 1);
		System.out.print(nome);
		
}
}
