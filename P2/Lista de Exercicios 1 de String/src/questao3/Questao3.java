package questao3;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String frase,simb;
		int contl = 0,tam,num,contd = 0,contb = 0,cont = 0;
		char letra;	
		System.out.print("Digite uma frase: ");
		frase = input.nextLine();
		tam = frase.length();
		for (int i = 0; i < tam;i++) {
			letra = frase.charAt(i);
			letra = Character.toLowerCase(letra);
			if (Character.isLetter(letra)) {
				contl ++;
			}
			else if (Character.isDigit(letra)) {
				contd ++;
			}	
			else if (Character.isSpaceChar(letra)) {
				contb ++;
			}
			else {
			    cont ++;
			}	
		}
		System.out.print("A frase " +frase+ " tem " +contl+ " Letras, " +contd+ " Dígitos, " +contb+ " Espaços em branco e " +cont+ " Simbolos.");
		

	}

}
