package questao6;
import java.util.Scanner;
public class Questao6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [] [] tabela;
		tabela = new double [9] [13];
		double [] medias = new double [12];
		int resp,cont=1,fruta,mes;
		String [] meses = {"janeiro","fevereiro","mar�o","Abril","maio","junho","julho","agosto","setembro","outubro","novembro","dezembro"};
		String [] frutas = {"abacaxi","banana","ma�a","mam�o","melancia","mel�o","tangerina","uva"};
		System.out.println("Preenchimento da tabela de vendas:");
		PTabela (tabela,meses,frutas);
		do {
			menu();
			resp = input.nextInt();
			switch (resp) {
			case 1:
				FatmediaM(tabela);
				for (int i = 0;i <= medias.length;i++) {
					System.out.println(meses [i]+ " = " +medias[i]);
				}
				break;
			case 2:
				System.out.println("Digite o n�mero da fruta que deseja escolher:");
				for (int i = 0;i <= frutas.length;i++) {
					System.out.println(cont+ " - " +frutas[i]);
				}
				fruta = input.nextInt();
				break;
			case 3:
				System.out.println("Digite o n�mero do m�s que deseja escolher:");
				for (int i = 0;i <= meses.length;i++) {
					System.out.println(cont+ " - " +meses[i]);
				}
				mes = input.nextInt();
				break;
			case 4:
				FatAno(tabela);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			}
		}while (resp != 5) ;
		

	}
	public static void PTabela (double [] [] tabela,String [] meses,String  [] frutas) {
		int cont = 0;
		Scanner input = new Scanner (System.in);
		for (int i = 0;i <= 11;i++) {
			if (cont == 8) {
				break;
			}
			System.out.println("Informe o valor arrecadado em " +meses [i]+ " com a venda de " +frutas [cont]+ ": ");
			tabela [cont] [i] = input.nextDouble();
			if (i >= 11) {
				cont++;
				i = -1;
			}
		}
	}
	public static double [] FatmediaM (double [] [] tabela) {
		int cont = 0;
		double [] medias;
		medias = new double [12];
		double media = 0;
		for (int i = 0;i <= 7;i++) {
			if (cont == 11) {
				break;
			}
			media = tabela [i] [cont] + media;
			if (i >= 7) {
				cont++;
				medias [i] = media / 8;
				media = 0;
				i = -1;
			}
		}
		return medias;	
	}
	public static double FatFruta(double [] [] tabela,int fruta) {
		double ano = 0;
		for (int i = 0;i <= 11;i++) {
			ano = tabela [fruta] [i] + ano; 
		}
		return ano;
	}
	public static double FatMes (double [] [] tabela, int mes) {
		double fat = 0;
		for (int i = 0;i <= 7;i++) {
			fat = tabela [i] [mes] + fat;
		}
		return fat;
	}
	public static double FatAno (double [] [] tabela) {
		int cont = 0;
		double ano = 0;
		for (int i = 0;i <= 11;i++) {
			if (cont == 8) {
				break;
			}
			ano = tabela [cont] [i] + ano;
			if (i >= 11) {
				cont++;
				i = -1;
			}
		}
		return ano;
	}
	public static void menu () {
		System.out.println("1 - M�dia de faturamento por m�s");
		System.out.println("2 - Faturamento anual por fruta");
		System.out.println("3 - Faturamento do m�s");
		System.out.println("4 - Faturamento anual");
		System.out.println("5 - Sair");
	}
}
