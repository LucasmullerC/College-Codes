package main;
import java.util.Scanner;
import dados.*;
public class GerenciaAgenda {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		Agenda A = new Agenda();
		do {
			menu();
			System.out.println("Informe a opção: ");
			op = input.nextInt();input.nextLine();
			switch (op) {
			case 1:
				A.Adicionar();
				break;
			case 2:
				A.RemoverContato();
				break;
			case 3:
				A.ExibirTodos();
				break;
			case 4:
				A.ExibirContato();
				break;
			case 5:
				A.Alterar();
				break;
			case 0:
				System.out.println("Fim do programa!");
				break;
			default:
				System.out.println("Opção inválida!");
			}
		} while (op != 0);

	}
	public static void menu() {
		System.out.println("1 – Adicionar novo contato");
		System.out.println("2 – Remover um contato");
		System.out.println("3 – Exibir todos os contatos da lista");
		System.out.println("4 – Exibir os dados de um contato");
		System.out.println("5 – Alterar informações de contato");
		System.out.println("6 – Copiar agenda");
		System.out.println("0 – Sair do programa");
	}

}
