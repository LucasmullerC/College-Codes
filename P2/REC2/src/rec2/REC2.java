package rec2;
import java.util.Scanner;
public class REC2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i,j,k;
		System.out.print("Digite o valor de i: ");
		i = input.nextInt();
		while (i <= 1) {
			System.out.print("O valor deve ser maior ou igual a 1, Digite novamente: ");
			i = input.nextInt();
		}
		System.out.print("Digite o valor de j: ");
		j = input.nextInt();
		while (j <= 1) {
			System.out.print("O valor deve ser maior ou igual a 1, Digite novamente: ");
			j = input.nextInt();
		}
		System.out.print("Digite o valor de k: ");
		k = input.nextInt();
		while (k <= 1) {
			System.out.print("O valor deve ser maior ou igual a 1, Digite novamente: ");
			k = input.nextInt();
		}
		imprimeSerie (i,j,k);

	}
	public static void imprimeSerie (int i, int j,int k) {
		if (i >= j) {
			System.out.print(j+ " ");
		}
		else {
			System.out.print(i+ " ");
			imprimeSerie (i + k,j,k);
		}
	}

}
