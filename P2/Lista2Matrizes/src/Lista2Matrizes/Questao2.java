package questao1;
import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		int [] [] Matriz = new int [4] [4];
		System.out.println("Preencha a matriz abaixo: ");
		Preencher(Matriz);

	}
	public static void Preencher (int [] [] Matriz) {
		Scanner input = new Scanner (System.in);
		int cont = 0;
		for(int i = 0;i <= 3;i++) {
			if(cont == 4) {
				break;
			}
			System.out.println("Insira o valor para [" +(i+1)+ "],["+(cont+1)+"]: ");
			Matriz [cont] [i]= input.nextInt();
			if (i == 3) {
				cont++;
				i = -1;
			}
		}
		int resp = Valida (Matriz);
		if (resp == 1) {
			System.out.println("É um quadrado mágico!");
		}
		else {
			System.out.println("não é um quadrado mágico.");
		}
	}
	public static int Valida (int [] [] Matriz) {
		int resp =0;
		int L=0,C=0,D=0,cont=0;
		for(int i = 0;i <= 3;i++) {
			if (cont == 4) {
				break;
			}
			C = Matriz [cont] [i] + C;
			if (i == 3) {
				cont ++;
				i = 0;
			}
		}
		cont = 0;
		for(int a = 0;a <= 3;a++) {
			if (cont == 4) {
			L = Matriz [a] [cont] + L;
			if (a == 3) {
				cont++;
				a = 0;
			}
			}
		}
		for (int b=0;b<=3;b++) {
			D = Matriz [b] [cont] + L;
			cont++;
		}
		if (L == C && C == D && L == D) {
			resp = 1;
			return resp;
		}
		else {
			resp =0;
			return resp;
		}
		
	}

}
