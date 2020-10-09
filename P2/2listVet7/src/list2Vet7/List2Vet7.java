package list2Vet7;
import java.util.Scanner;
public class List2Vet7 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] Numeros = new int [25];
		fill (Numeros);

	}
	public static void fill (int [] Numeros) {
		for (int i = 0;i < Numeros.length; i++) {
			Numeros[i] = i;
		}
		int dif = dif (Numeros);
		System.out.println(dif+ " é a maior diferença.");
		
	}
	public static int dif (int [] Numeros) {
		int dif = 0;
		for (int i = 0;i < Numeros.length; i++) {
			dif = Numeros [i] - dif;
		}
		return dif;
	}

}
