package questao3;
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int linha,coluna;
		int [] [] Matriz;
		System.out.println("Digite a quantidade de linhas: ");
		linha = input.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		coluna = input.nextInt();
		Matriz = new int [linha] [coluna];
		preencher(Matriz,coluna,linha);
	}
	public static void preencher (int [] [] Matriz,int coluna,int linha) {
		Scanner input = new Scanner (System.in);
		int cont=0;
		System.out.println("Informe valores para as linhas e colunas: ");
		for(int i = 0;i <= coluna;i++) {
			if (cont == linha) {
				break;
			}
			System.out.println("Linha Nº" +(i + 1)+ " na Coluna " +(cont + 1)+ ": ");
			Matriz [cont] [i] = input.nextInt();
			if (i == (coluna - 1)) {
				cont++;
				i = -1;
			}	
		}
		somarlinha(Matriz,coluna,linha);
	}
	public static void somarlinha (int [] [] Matriz,int coluna,int linha) {
		int cont = 0,soma = 0;
		int [] SOMARLINHA = new int [linha];
		for(int i = 0;i <= linha;i++) {
			if (cont == coluna) {
				break;
			}
			soma = Matriz [i] [cont] + soma;
			if (i == (linha - 1)) {
				SOMARLINHA [cont] = soma;
				System.out.print(" Linha "+cont+ ": " +SOMARLINHA [cont]);
				soma = 0;
				cont++;
				i = -1;
			}	
		}
		somarcoluna(Matriz,coluna,linha);
	}
	public static void somarcoluna (int [] [] Matriz,int coluna,int linha) {
		int cont = 0,soma = 0;
		int [] SOMARCOLUNA = new int [coluna];
		System.out.println(" ");
		for(int i = 0;i <= coluna;i++) {
			if (cont == linha) {
				break;
			}
			soma = Matriz [cont] [i] + soma;
			if (i == (coluna - 1)) {
				SOMARCOLUNA [cont] = soma;
				System.out.println(" Coluna "+cont+ ": " +SOMARCOLUNA [cont]);
				soma = 0;
				cont++;
				i = -1;
			}	
		}	
	}

}
