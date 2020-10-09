package validaCPF;
import java.util.Scanner;
public class ValidaCPF {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String CPF;
		boolean valid,valid2;
		int resp =0;
		do {
			System.out.println("Validação de CPF!");
			System.out.print("Digite os números do CPF:");
			CPF = input.nextLine();
			valid = Valida1(CPF);
			if (valid == true) {
				valid2 = Valida2(CPF);
				if(valid2 == true) {
					System.out.print("O CPF é válido!");
				}
				else {
					System.out.print("O CPF não é válido.2");
				}
			}
			else {
				System.out.print("O CPF não é válido.1");
			}
			System.out.println("Deseja válidar outro CPF? 1 - SIM , 0 - NÃO");
			resp = input.nextInt();input.nextLine();
			
		}while (resp == 1);

	}
	public static boolean Valida1 (String CPF) {
		int tam = CPF.length();
		boolean valid = true;
		if (tam > 11 && tam < 11) {
			valid = false;
			return valid;
		}
		else {
			for (int i = 0; i < tam;i++) {
				if (Character.isDigit(CPF.charAt(i)) == false) {
					valid = false;
					return valid;
				}
			}
			valid = true;
			return valid;
		}		
	}
	public static boolean Valida2 (String CPF) {
		boolean valid = true;
		int [] num = new int [9];
		int [] num2 = new int [10];
		int N = 10,F = 0,N3 = 11,F2 = 0,N2=0,V1,V2;
		for (int i = 0; i < 9;i++) {
			num [i] = N;
			N = N - 1;
		}
		for (int f = 0; f < 9;f++) {
			N2 = CPF.charAt(f) - '0';
			num [f] = N2 * num [f];
		}
		for (int f = 0; f < 9;f++) {
			F = F + num [f];
		}
		F = F % 11;
		if (F < 2) {
			F = 0;
		}
		else {
			F = 11 - F;
		}
		N2 = 0;
		for (int i = 0; i < 10;i++) {
			num2 [i] = N3;
			N3 = N3 - 1;
		}
		for (int f = 0; f < 10;f++) {
			N2 = CPF.charAt(f) - '0';
			num2 [f] = N2 * num2 [f];
         }
		for (int f = 0; f < 10;f++) {
			F2 = F2 + num2 [f];
		}
		F2 = F2 % 11;
		if (F2 < 2) {
			F2 = 0;
		}
		else {
			F2 = 11 - F2;
		}
		V1 = CPF.charAt(9) - '0';
		V2 = CPF.charAt(10) - '0';
		if (F == V1 && F2 == V2) {
			valid = true;
			return valid;
		}
		else {
			valid = false;
			return valid;
		}
		
		
	}
	
	

}
