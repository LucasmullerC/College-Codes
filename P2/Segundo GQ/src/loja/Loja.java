package loja;
import java.util.Scanner;
public class Loja {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Cliente C;
		Cadastroclientes CC = new Cadastroclientes();
		int resp;
        String CPF,Nome,Email,Fone;
		do {
			menu();
			resp = input.nextInt();input.nextLine();
			switch (resp) {
			case 1:
				System.out.print("Digite o CPF do cliente: ");
				CPF = input.nextLine();
				C = new Cliente (CPF);
				System.out.print("Digite o nome do cliente: ");
				Nome = input.nextLine();
				C.setNome(Nome);
				System.out.print("Digite o E-Mail do cliente: ");
				Email = input.nextLine();
				C.setEmail(Email);
				System.out.print("Digite o Telefone do cliente: ");
				Fone = input.nextLine();
				C.setFone(Fone);
				CC.Cadastrar(C);
				break;
			case 2:
				CC.OrdemDescrescente();
				System.out.print("Cadastro Ordenado.");
				break;
			case 3:
				System.out.print("Digite o CPF do cliente: ");
				CPF = input.nextLine();
				CC.Consultar(CPF);
				break;
			default:
				System.out.print("Valor inválido.");
				break;			
			}
		}while (resp != 0);

	}
	public static void menu () {
		System.out.println("Opções: ");
		System.out.println("1 – Cadastrar um cliente");
		System.out.println("2 – Ordenar decrescente por CPF");
		System.out.println("3 – Consultar um cliente");
		System.out.println("0 – Sair do programa");
		System.out.print("Informe a opção: ");
	}

}
