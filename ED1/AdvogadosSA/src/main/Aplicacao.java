package main;
import java.util.Scanner;
import dados.CadastroPessoa;
public class Aplicacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		CadastroPessoa C = new CadastroPessoa ();
		do {
			menu();
			System.out.println("Informe a opção: ");
			op = input.nextInt();input.nextLine();
			switch (op) {
			case 1:
				C.Cadastro();
				break;
			case 2:
				C.Cancelar();
				break;
			case 3:
				C.ExibirTodos();
				break;
			case 4:
				C.Verificar();
				break;
			case 5:
				C.quantidade();
				break;
			case 6:
				C.Remover();
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
		System.out.println("1 – Cadastrar Pessoa");
		System.out.println("2 – Cancelar o registro imediato");
		System.out.println("3 – Exibir todos as pessoas");
		System.out.println("4 – Pesquisar Pessoa");
		System.out.println("5 – Quantidade de pessoas no prédio");
		System.out.println("6 – Remover Pessoa");
		System.out.println("0 – Sair do programa");
	}

}
