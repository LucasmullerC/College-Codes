package questao3;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		int [] [] Matriz = new int [4] [4];
		System.out.println("Preencha a matriz abaixo: ");
		Preencher(Matriz);

	}
	public static void Preencher (int [] [] Matriz) {
		int resp;
		int [] [] Matrizb = new int [4] [4];
		Scanner input = new Scanner (System.in);
		int cont = 0;
		for(int i = 0;i <= 3;i++) {
			if(cont == 4) {
				break;
			}
			System.out.println("Insira o valor para [" +(i+1)+ "],["+(cont+1)+"]: ");
			Matriz [cont] [i]= input.nextInt();
			Matrizb [i] [cont] = Matriz [cont] [i];
			if (i == 3) {
				cont++;
				i = -1;
			}
		}
		resp = Semelhante (Matriz,Matrizb);
		if (resp ==1) {
			System.out.println("É simetrica.");
		}
		else {
			System.out.println("não é simetrica.");
		}
	}
	public static int Semelhante (int [] [] Matriz,int [] [] Matrizb) {
		int cont = 0,resp=0;
		for (int i = 0;i <= 3;i++) {
			if (Matriz [i] [cont] == Matrizb [i] [cont] ) {
				resp = 1;
			}
			else {
				resp = 0;
				break;
			}
			if (i == 3) {
				cont++;
				i = -1;
			}
		}
		return resp;
	}

}
