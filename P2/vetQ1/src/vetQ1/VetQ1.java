package vetQ1;
import java.util.Scanner;
public class VetQ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double [] vetGanhos = new double [12];
		double [] vetGastos = new double [12];
		double [] vetLucros = new double [12];
		int rep = 0;
		int contG = 0;
		int contO = 0;
		int i = 0;
		do {
			rep = rep + 1;
			contG = contG + 1;
			contO = contO + 1;
			System.out.print("Digite o valor do ganho no " +contG+ " Mês:");
			vetGanhos[i] = input.nextInt();
			System.out.print("Digite o valor do gasto no " +contG+ " Mês:");
			vetGastos[i] = input.nextInt();
			i = i + 1;
		}while (rep != 12);		
		Lucro (vetGanhos,vetGastos,vetLucros);
		double CGA = Calcganho(vetGanhos);
		double CGO = Calcganho(vetGastos);
		double CLU = Calcganho(vetLucros);
		double Total = LucroTotal(CLU);
		System.out.println("O valor do ganho total foi de R$" +CGA);
		System.out.println("O valor do gasto total foi de R$" +CGO);
		System.out.println("O valor do lucro total foi de R$" +CLU);
		System.out.println("A Média de lucro total foi de R$" +Total);
	}
	public static void Lucro (double [] vetGanhos, double [] vetGastos,double [] vetLucros) {
		for(int i = 0;i < vetLucros.length;i++) {
			vetLucros[i] = vetGanhos[i] - vetGastos[i];		
		}
		exibir (vetGanhos,vetGastos,vetLucros);
	}
	public static void exibir (double [] vetGanhos, double [] vetGastos,double [] vetLucros) {
		int rep = 0;
		for (int i = 0; i < vetGanhos.length;i++) {
			rep++;
			System.out.println("O valor do ganho do " +rep+ " mês foi igual a R$" +vetGanhos[i]);
			System.out.println("O valor do gasto do " +rep+ " mês foi igual a R$" +vetGastos[i]);
			System.out.println("O valor do lucro do " +rep+ " mês foi igual a R$" +vetLucros[i]);
		}		
	}
	public static double Calcganho (double [] vetGanhos) {
		double calcGanho = 0;
		for (int i = 0; i < vetGanhos.length;i++) {
			if (i < 12) {
				calcGanho = calcGanho + vetGanhos[i];
			}
		}
		return calcGanho;
}
	public static double LucroTotal (double Tlucro) {
		double total;
		total = Tlucro / 12;
		return total;
	}
}
