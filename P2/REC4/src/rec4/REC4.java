package rec4;
import java.util.Scanner;
public class REC4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,j,k,SS,c = 0;
		System.out.print("Digite o valor de i: ");
		i = input.nextInt();
		while (i < 1) {
			System.out.print("O valor de i deve ser maior ou igual a 1: ");
			i = input.nextInt();	
			c = i;
		}
		System.out.print("Digite o valor de j: ");
		j = input.nextInt();
		while (j < i) {
			System.out.print("O valor de j deve ser maior que i: ");
			j = input.nextInt();	
		}
		System.out.print("Digite o valor de k: ");
		k = input.nextInt();
		while (k < 1) {
			System.out.print("O valor de k deve ser maior ou igual a 1: ");
			k = input.nextInt();	
		}
		SS = somaSerie (i,j,k,c);
		System.out.println("A soma dos valores foi de " +SS);
	}
	public static int somaSerie (int i, int j, int k, int c) {
		if (c >= j) {
			return i;
		}
		else { 
			return somaSerie(i + k,j,k,c + 1);
		}
	}

}
