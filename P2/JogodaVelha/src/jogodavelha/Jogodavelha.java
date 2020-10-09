package jogodavelha;
import java.util.Random;
import java.util.Scanner;
public class Jogodavelha {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		char [] [] velha = new char [3] [3];
		int resp,resp2,Dif;
		String Nome,Nome2;
		do {
			System.out.println("Jogo da Velha");
			System.out.println("1 - Jogar");
			System.out.println("2 - Sair");
			System.out.print("Digite sua opção:");
			resp = input.nextInt();
			switch(resp) {
			case 1:
				System.out.println("Jogo da Velha");
				System.out.println("1 - Um jogador");
				System.out.println("2 - Dois jogadores");
				System.out.print("Digite sua opção:");
				resp2 = input.nextInt();input.nextLine();
				switch (resp2) {
				case 1:
					System.out.print("Informe o nome do jogador: ");
					Nome = input.nextLine();
					System.out.println("Nível do jogo");
					System.out.println("1 - Fácil");
					System.out.println("2 - Difícl");
					System.out.print("Digite sua opção:");
					Dif = input.nextInt();input.nextLine();
					switch(Dif) {
					case 1:
						NivelFacil(velha,Nome);
						break;
					case 2:
						NivelDificil(velha,Nome);
						break;
					}
				case 2:
					System.out.print("Informe o nome do jogador Nº1: ");
					Nome = input.nextLine();
					System.out.print("Informe o nome do jogador Nº2: ");
					Nome2 = input.nextLine();
					DoisJogadores(velha,Nome,Nome2);
					break;
				}
			}
		}while (resp != 2);

	}
	public static void DoisJogadores(char [] [] velha,String Nome,String Nome2) {
		Scanner input = new Scanner (System.in);
		Random gerador = new Random();
		int Pjoga,Verif=5,PC1,PC2;
		Pjoga = gerador.nextInt(2);
		System.out.println("X - " +Nome);
		System.out.println("O - " +Nome2);
		System.out.println("Sorteando quem vai começar...");
		if (Pjoga == 0) {
			System.out.println(Nome2+ " começa!");
		}
		else {
			System.out.println(Nome+ " começa!");
		}
		do {
			if (Pjoga ==0) {
				System.out.println(Nome2+" é a sua vez de jogar!");
				do {
					System.out.print("Informe a linha: ");
					PC1 = input.nextInt();
					PC1 = PC1 -1;
					System.out.print("Informe a coluna: ");
					PC2 = input.nextInt();	
					PC2 = PC2 -1;
				}while (velha[PC1] [PC2] == 'O' || velha [PC1] [PC2] == 'X' && Verif != 2);	
				velha [PC1] [PC2] = 'O';
				Pjoga = 1;			
			}
			else {
				System.out.println(Nome+" é a sua vez de jogar!");
				do {
					System.out.print("Informe a linha: ");
					PC1 = input.nextInt();
					PC1 = PC1 -1;
					System.out.print("Informe a coluna: ");
					PC2 = input.nextInt();	
					PC2 = PC2 -1;
				}while (velha[PC1] [PC2] == 'O' || velha [PC1] [PC2] == 'X' && Verif != 2);	
				velha [PC1] [PC2] = 'X';
				Pjoga = 0;
			}
			System.out.println(velha [0] [0]+" "+velha [0] [1]+" "+velha [0] [2]);
			System.out.println("-----");
			System.out.println(velha [1] [0]+" "+velha [1] [1]+" "+velha [1] [2]);
			System.out.println("-----");
			System.out.println(velha [2] [0]+" "+velha [2] [1]+" "+velha [2] [2]);
			Verif = Validajogada(velha,Nome,Nome2);
		}while (Verif != 0 && Verif != 1 && Verif != 2);
	}
	public static void NivelDificil(char [] [] velha,String Nome) {
		Scanner input = new Scanner (System.in);
		Random gerador = new Random();
		int Pjoga,Verif=5,PC1=0,PC2=0,cont = 0;
		Pjoga = gerador.nextInt(2);
		String Nome2 = "Computador";
		System.out.println("X - " +Nome);
		System.out.println("O - Computador");
		System.out.println("Sorteando quem vai começar...");
		if (Pjoga == 0) {
			System.out.println("O computador começa!");
		}
		else {
			System.out.println(Nome+ " começa!");
		}
		do {
			if(Pjoga == 0) {
				System.out.println("Vez do Computador...");
				do {
					for (int i = 0; i <= 1;i++) {
						if ( velha [cont] [i] == 'O' && velha [cont] [i + 1] == 'O') {
							if (i < 1) {
								velha [cont] [i + 2] = 'O';
							}
							else {
								velha [cont] [i - 1] = 'O';
							}
						}
						else {
							PC1 = gerador.nextInt(3);
							PC2 = gerador.nextInt(3);
						}
						if (i == 2) {
							cont++;
							i = 0;
						}
					}
				}while (velha[PC1] [PC2] == 'O' || velha [PC1] [PC2] == 'X');	
				velha [PC1] [PC2] = 'O';
				Pjoga = 1;
			}
			else {
				System.out.println(Nome+" é a sua vez de jogar!");
				do {
					System.out.print("Informe a linha: ");
					PC1 = input.nextInt();
					PC1 = PC1 -1;
					System.out.print("Informe a coluna: ");
					PC2 = input.nextInt();	
					PC2 = PC2 -1;
				}while (velha[PC1] [PC2] == 'O' || velha [PC1] [PC2] == 'X' && Verif != 2);	
				velha [PC1] [PC2] = 'X';
				Pjoga = 0;
			}
			System.out.println(velha [0] [0]+" "+velha [0] [1]+" "+velha [0] [2]);
			System.out.println("-----");
			System.out.println(velha [1] [0]+" "+velha [1] [1]+" "+velha [1] [2]);
			System.out.println("-----");
			System.out.println(velha [2] [0]+" "+velha [2] [1]+" "+velha [2] [2]);
			Verif = Validajogada(velha,Nome,Nome2);
		}while (Verif != 0 && Verif != 1 && Verif != 2);
	}
	public static void NivelFacil (char [] [] velha,String Nome) {
		Scanner input = new Scanner (System.in);
		Random gerador = new Random();
		int Pjoga,Verif=5,PC1=0,PC2=0,cont = 0;
		Pjoga = gerador.nextInt(2);
		String Nome2 = "Computador";
		System.out.println("X - " +Nome);
		System.out.println("O - Computador");
		System.out.println("Sorteando quem vai começar...");
		if (Pjoga == 0) {
			System.out.println("O computador começa!");
		}
		else {
			System.out.println(Nome+ " começa!");
		}
		do {
			if(Pjoga == 0) {
				System.out.println("Vez do Computador...");
				do {
					PC1 = gerador.nextInt(3);
					PC2 = gerador.nextInt(3);
				}while (velha[PC1] [PC2] == 'O' || velha [PC1] [PC2] == 'X');	
				velha [PC1] [PC2] = 'O';
				Pjoga = 1;
			}
			else {
				System.out.println(Nome+" é a sua vez de jogar!");
				do {
					System.out.print("Informe a linha: ");
					PC1 = input.nextInt();
					PC1 = PC1 -1;
					System.out.print("Informe a coluna: ");
					PC2 = input.nextInt();	
					PC2 = PC2 -1;
				}while (velha[PC1] [PC2] == 'O' || velha [PC1] [PC2] == 'X' && Verif != 2);	
				velha [PC1] [PC2] = 'X';
				Pjoga = 0;
			}
			System.out.println(velha [0] [0]+" "+velha [0] [1]+" "+velha [0] [2]);
			System.out.println("-----");
			System.out.println(velha [1] [0]+" "+velha [1] [1]+" "+velha [1] [2]);
			System.out.println("-----");
			System.out.println(velha [2] [0]+" "+velha [2] [1]+" "+velha [2] [2]);
			Verif = Validajogada(velha,Nome,Nome2);
		}while (Verif != 0 && Verif != 1 && Verif != 2);	
	}
	public static int Validajogada (char [] [] velha,String Nome,String Nome2) {
		int Verif = 5,cont=0;
		for(int a = 0; a<=2;a++) {
			if ( velha [cont] [a] == 'X') {
				Verif = 2;
			}
			else if ( velha [cont] [a] == 'O') {
				Verif = 2;
			}
			else if (velha [cont] [a] != 'O' && velha [cont] [a] != 'x') {
				Verif = 5;
				break;
			}
			if (a == 2) {
				cont++;
				a = 0;
			}
		}
		for(int i = 0; i<=2;i++) {
			if (velha [i] [0] == velha [i] [1] && velha [i] [1] == velha [i] [2]) {
				if (velha [i] [0] == 'O' && velha [i] [1] == 'O' && velha [i] [2] == 'O') {
					Verif = 0;
					System.out.print(Nome2+ " ganhou!");
					break;
				}
				else if(velha [i] [0] == 'X' && velha [i] [1] == 'X' && velha [i] [2] == 'X'){
					Verif = 1;
					System.out.print(Nome+ " ganhou!");
					break;
				}
			}
			if (velha [0] [i] == velha [1] [i] && velha [1] [i] == velha [2] [i]) {
				if (velha [0] [i] == 'O' && velha [1] [i] == 'O' && velha [2] [i] == 'O') {
					Verif = 0;
					System.out.print(Nome2+ " ganhou!");
					break;
				}
				else if(velha [0] [i] == 'X' && velha [1] [i] == 'X' && velha [2] [i] == 'X') {
					Verif = 1;
					System.out.print(Nome+ " ganhou!");
					break;
				}
			}
			if (velha [0] [0] == velha [1] [1] && velha [1] [1] == velha [2] [2]) {
				if (velha [0] [0] == 'O' && velha [1] [1] == 'O' && velha [2] [2] == 'O') {
					Verif = 0;
					System.out.print(Nome2+ " ganhou!");
					break;
				}
				else if(velha [0] [0] == 'X' && velha [1] [1] == 'X' && velha [2] [2] == 'X') {
					Verif = 1;
					System.out.print(Nome+ " ganhou!");
					break;
				}
			}
			if (velha [2] [0] == velha [1] [1] && velha [1] [1] == velha [0] [2]) {
				if (velha [2] [0] == 'O' && velha [1] [1] == 'O' && velha [0] [2] == 'O') {
					Verif = 0;
					System.out.print(Nome2+ " ganhou!");
					break;
				}
				else if(velha [2] [0] == 'X' && velha [1] [1] == 'X' && velha [0] [2] == 'X') {
					Verif = 1;
					System.out.print(Nome+ " ganhou!");
					break;
				}
			}			
		}
		return Verif;
	}

}
