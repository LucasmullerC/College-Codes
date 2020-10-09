package questão1;

import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String Nome, Nnome;
		int tam;
		boolean valida = false;
		do {
			System.out.print("Digite um nome: ");
			Nome = input.nextLine();
			tam = Nome.length();
			valida = ValidaNome(Nome, tam);
			if (valida == false) {
				System.out.println("Nome inválido, tente novamente.");
			}
		} while (valida == false);
		Nnome = EB(Nome, tam);
		Nnome = formatar(Nnome);
		System.out.println(Nnome);

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

	public static String formatar(String n) {
		int tam = n.length();
		char[] nome = new char[tam];
		int pos = 0;
		char c;
		String nova;
		while (pos < tam) {
			c = n.charAt(pos);
			nome[pos] = Character.toUpperCase(c);
			pos++;
			if (pos < tam) {
				c = n.charAt(pos);
				while (Character.isLetter(c) == true) {
					nome[pos] = Character.toLowerCase(c);
					pos++;
					if (pos < tam) {
						c = n.charAt(pos);
					} else {
						break;
					}
				}
				if (pos < tam) {
					nome[pos] = c;
					pos++;

				}
			}
		}
		nova = new String(nome);
		return nova;
	}

	public static String EB(String Nome, int tam) {
		char[] nome = new char[tam];
		int pos = 0, posVet = 0;
		char c;
		String nova;
		while (pos < tam) {
			c = Nome.charAt(pos);
			while (Character.isSpaceChar(c) == true) {
				pos++;
				if (pos < tam) {
					c = Nome.charAt(pos);
				} else {
					break;
				}
			}
			if (pos < tam) {
				while (Character.isLetter(c) == true) {
					nome[posVet] = c;
					pos++;
					posVet++;
					if (pos < tam) {
						c = Nome.charAt(pos);
					} else {
						break;
					}
				}
				if (pos < tam) {
					nome[posVet] = c;
					pos++;
					posVet++;
				}
			}
		}
		nova = new String(nome);
		return nova;
	}

}
