package lista1ExcOrd;
import java.util.Random;
public class Lista1ExcOrd {
	public static void main(String[] args) {
		int [] vet = new int [100];
		Preencher(vet);
		Ordenar(vet);
		Exibe(vet);
	}
	public static void Preencher(int [] vet) {
		Random random = new Random();
		int i;
		for (i = 0;i<vet.length;i++) {
			vet[i] = random.nextInt(10000)+1;
		}
	}
	public static void Exibe(int[]vet) {
		int i;
		for(i = 0;i<vet.length;i++) {
			System.out.println(vet[i] + " ");
		}
	}
	public static void Ordenar(int[]vet) {
		int i,fim = vet.length - 2,pos = 0, aux;
		boolean troca;
		do {
			troca = false;
			for (i = 0;i<=fim;i++) {
				if(vet[i] < vet [i+1]) {
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
