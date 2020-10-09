package questao8;
import java.util.Scanner;
public class Questao8 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String Conta;
		int tam;
		char Dig;
		System.out.print("Digite o número da conta: ");
		Conta = input.nextLine();	
		tam = Conta.length();
		System.out.print("Digite o número verificador da conta: ");
		Dig = input.next().charAt(0);
		if (tam != 6) {
			System.out.print("Número da conta inválido. Deve conter 6 digitos.");
		}
		else if (VefConta(Conta) == false) {
			System.out.print("Número da conta inválido. Informe somente valores númericos.");
		}
		else {
			if (VefDig(Conta,Dig) == false) {
				System.out.print("Digito verificador inválido.");
			}
			else {
				System.out.print("Digito verificador válido.");
			}
			
		}

	}
	public static boolean VefConta (String Conta) {
		int tam = Conta.length();
		boolean Valid = true;
		for (int i = 0; i < tam;i++) {
			if (Character.isDigit(Conta.charAt(i)) == false) {
				Valid = false;
				break;
			}
			
		}
		return Valid;
	}
	public static boolean VefDig (String Conta, char Dig) {
		int tam = Conta.length();
		double soma = 0,resto;
		int N;
		for (int i = 0; i < tam;i++) {
			N = Conta.charAt(i) - '0';
			soma = soma + N * Math.pow(2,i);
		}
		resto = soma  % 11;
		if (resto >= 0 && resto <= 9) {
			if (Dig - '0' ==  resto) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if (Dig == 'x' || Dig == 'X') {
				return true;
			}
			else {
				return false;
			}
		}		
	}
}
