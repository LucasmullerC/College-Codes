package recu1;
import java.util.Scanner;
public class RECU1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j,k;
		System.out.print("Digite o valor de i: ");
		i = input.nextInt();
		while (i < 1) {
			System.out.print("O valor de i deve ser maior ou igual a 1: ");
			i = input.nextInt();
		}
		System.out.print("Digite o valor de j: ");
		j = input.nextInt();
		while (j < 1 && j > i) {
			System.out.print("O valor de j deve ser maior que 1 e i: ");
			j = input.nextInt();
		}
		System.out.print("Digite o valor de k: ");
		k = input.nextInt();
		while (k < 1) {
			System.out.print("O valor de i deve ser maior ou igual a 1: ");
			k = input.nextInt();
		}
		imprimeSerieInversa (i,j,k);

	}
	public static void imprimeSerieInversa (int i, int j, int k) {
		if (j > 0) {
			System.out.print(j+ " ");
			imprimeSerieInversa (i,j - k,k);
		}
	}

}
