package aplicação;

import java.util.Scanner;
import Sistema.*;

public class Aplicação {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Conta C;
		CriarConta CC = new CriarConta();
		String NConta;
		int resp;
		double qtd;
		do {
			menu();
			System.out.print("Informe a opção desejada:");
			resp = input.nextInt();
			switch (resp) {
			case 1:
				input.nextLine();
				System.out.println("Informe o número da conta:");
				NConta = input.nextLine();
				C = new Conta(NConta);
				CC.Cadastrar(C);
				break;
			case 2:
				input.nextLine();
				System.out.println("Informe o número da conta:");
				NConta = input.nextLine();
				System.out.println("Informe a quantidade de deposito:");
				qtd = input.nextDouble();
				CC.Depositar(NConta, qtd);
				break;
			case 3:
				input.nextLine();
				System.out.println("Informe o número da conta:");
				NConta = input.nextLine();
				System.out.println("Informe a quantidade de saque:");
				qtd = input.nextDouble();
				CC.Sacar(NConta, qtd);
				break;
			case 4:
				input.nextLine();
				System.out.println("Informe o número da conta:");
				NConta = input.nextLine();
				CC.exibir(NConta);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			}
		} while (resp != 0);

	}

	public static void menu() {
		System.out.println("Banco:");
		System.out.println("1 - Criar Conta");
		System.out.println("2 - Depositar");
		System.out.println("3 - Sacar");
		System.out.println("4 - Exibir informações");
		System.out.println("0 - Sair");
	}

}
