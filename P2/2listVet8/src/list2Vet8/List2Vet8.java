package list2Vet8;
import java.util.Random;
import java.util.Scanner;
public class List2Vet8 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] dado = new int [1000000];
		dado = gerador (dado);
		

	}
	public static int [] gerador (int [] dado) {
		Random random = new Random();
		int um = 0;
		int dois = 0;
		int tres = 0;
		int quatro = 0;
		int cinco = 0;
		int seis = 0;
		int nulo = 0;
		for (int i = 0;i < dado.length; i++) {
			dado [i] = random.nextInt(7);
			switch (dado [i]){
			case 1: um = um + 1; break;
			case 2: dois = dois + 1; break;
			case 3: tres = tres + 1; break;
			case 4: quatro = quatro + 1; break;
			case 5: cinco = cinco + 1; break;
			case 6: seis = seis + 1; break;
			default: nulo = nulo + 1; break;
			}			
		}
		System.out.println("O dado caiu 1 " +um+ " vezes.");
		System.out.println("O dado caiu 2 " +dois+ " vezes.");
		System.out.println("O dado caiu 3 " +tres+ " vezes.");
		System.out.println("O dado caiu 4 " +quatro+ " vezes.");
		System.out.println("O dado caiu 5 " +cinco+ " vezes.");
		System.out.println("O dado caiu 6 " +seis+ " vezes.");
		return dado;
	}
	

}
