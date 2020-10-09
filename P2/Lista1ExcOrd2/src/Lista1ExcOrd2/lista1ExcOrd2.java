package Lista1ExcOrd2;
import java.util.Scanner;
public class lista1ExcOrd2 {
	public static void main(String[] args) {
		String [] vet = new String [20];
		Preencher(vet);
		Ordenar(vet);
		Exibe(vet);
	}
	public static void Preencher(String [] vet) {
		Scanner input = new Scanner (System.in);
		int i;
		String N;
		for (i = 0;i<vet.length;i++) {
			System.out.print("Digite o " +i+ "º Nome:");
			N = input.nextLine();
			vet[i] = N;
		}
	}
	public static void Exibe(String[]vet) {
		int i;
		for(i = 0;i<vet.length;i++) {
			System.out.println(vet[i] + " ");
		}
	}
	public static void Ordenar(String[]vet) {
		int i,fim = vet.length - 2,pos = 0;
		String aux;
		boolean troca;
		do {
			troca = false;
			for (i = 0;i<=fim;i++) {
				if(vet[i].compareTo(vet[i + 1]) > 0) {
					aux = vet[i+1];
					vet[i+1] = vet[i];
					vet[i] = aux;
					pos = i;
					troca = true;
				}
			}
			fim = pos - 1;
		}while (troca == true);
	}

}
