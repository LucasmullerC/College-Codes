package placadecarro;
import java.util.Scanner;
public class Placadecarro {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String Placa;
		int Valido;
		System.out.println("Informe a placa do carro: ");
		Placa = input.nextLine();
		Valido = Valida (Placa);
		if (Valido == 1) {
			System.out.println("A placa deve ter obrigatoriamente 7 caracteres.");
		}
		else if (Valido == 2) {
			System.out.println("A primeira letra deve ser obrigatoriamente ‘N’, ‘O’, ‘P’ ou ‘Q’.");
		}
		else if (Valido == 3) {
			System.out.println("O Formato é inválido.");
		}
		else {
			System.out.println("A placa é válida");
		}

	}
	public static int Valida (String Placa) {
		char letra;
		int valido;
		int tam = Placa.length(),contL=0,contD=0;
		if (tam != 7) {
			valido = 1;
			return valido;
		}
		for (int i = 0;i < tam;i++) {
			letra = Placa.charAt(i);
			letra = Character.toUpperCase(letra);
			if (i < 2) {
				if (Character.isLetter(letra) == true) {
					if (contL > 2) {
						valido = 3;
						return valido;
					}
					if (contL == 0) {
						if (letra != 'N' && letra != 'O' && letra != 'P' && letra != 'Q') {
							valido = 2;
							return valido;
						}	
					}
					contL++;
				}
				else {
					valido = 3;
					return valido;
				}
			}
			
		}
		valido = 4;
		return valido;
	}

}
