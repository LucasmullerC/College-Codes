package questao1;
import java.util.Scanner;
public class Questao1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] [] Produtos = new int [5] [10];
		int cont = 0;
		int total;
		System.out.println("Indique a quantidade dos estoques a seguir: ");
		for(int i = 0;i <= 10;i++) {
			if (cont == 5) {
				break;
			}
			System.out.println("Estoque do produto Nº" +(i + 1)+ " no armazém " +(cont + 1)+ ": ");
			Produtos [cont] [i]= input.nextInt();
			if (i == 9) {
				cont++;
				i = -1;
			}
		}
		TotalpArmazem(Produtos);
		TotalpProduto(Produtos);
		total = TotalQuilos(Produtos);
		System.out.println("O total em quilos armazenado: " +total);
	}
	public static void TotalpArmazem(int [] [] Produtos) {
		int [] TotalporArmazem = new int [5];
		int cont = 0;
		int produto = 0;
		for (int i= 0;i <= 10;i++) {
			if (cont == 5) {
				break;
			}
			produto = Produtos [cont] [i] + produto;
			if (i == 9) {
				TotalporArmazem [cont] = produto;
				cont++;
				i = -1;
			}
		}
		System.out.println("Total por armazém:");
		for (int f= 0;f < TotalporArmazem.length;f++) {
			System.out.println("Armazém nº " +(f + 1)+ ": " +TotalporArmazem[f]);
		}
	}
	public static void  TotalpProduto (int [] [] Produtos) {
		int [] TotalporProduto = new int [10];
		int cont = 0;
		int produto = 0;
		for (int i = 0;i <= 5;i++) {
			if (cont == 10 ) {
				break;
			}
			produto = Produtos [i] [cont] + produto;
			if (i == 4) {
				TotalporProduto [cont] = produto;
				cont++;
				i = -1;
			}	
		}
		System.out.println("Total por produto:");
		for (int f= 0;f < TotalporProduto.length;f++) {
			System.out.println("Produto nº " +(f + 1)+ ": " +TotalporProduto[f]);
		}		
	}
	public static int TotalQuilos(int [] [] Produtos) {
		int cont = 0;
		int produto = 0;
		for (int i= 0;i <= 10;i++) {
			if (cont == 5) {
				break;
			}
			produto = Produtos [cont] [i] + produto;
			if (i == 9) {
				cont++;
				i = -1;
			}
		}
		return produto;
	}

}
