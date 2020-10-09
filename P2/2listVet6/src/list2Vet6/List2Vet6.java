package list2Vet6;
import java.util.Scanner;
public class List2Vet6 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] Numeros = new int [20];
		fill (Numeros);
		

	}
	public static void fill (int [] Numeros) {
		for (int i = 0;i < Numeros.length; i++) {
			Numeros[i] = i;
		}
		int maior = Maior (Numeros);
		int menor = Menor (Numeros);
		System.out.println(+maior+ " é o maior número.");
		System.out.println(+menor+ " é o menor número.");
		
	}
	public static int Maior (int [] Numeros) {
		int maior = 0;
		for (int i = 0;i < Numeros.length; i++) {
			if (Numeros [i] > maior) {
				maior = Numeros [i];
			}
		}
		return maior;
	}
	public static int Menor (int [] Numeros) {
		int maior = 0;
		for (int i = 0;i < Numeros.length; i++) {
			if (Numeros [i] < maior) {
				maior = Numeros [i];
			}
		}
		return maior;
	}

}
