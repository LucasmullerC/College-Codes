package main;
import java.util.Scanner;
import dados.*;
public class Aplicacao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		CadastroProdutos C = new CadastroProdutos();
		do {
			menu();
			System.out.println("Informe a opção: ");
			op = input.nextInt();input.nextLine();
			switch (op) {
			case 1:
				C.Cadastro();
				break;
			case 2:
				C.RemoverProduto();
				break;
			case 3:
				C.ExibirTodos();
				break;
			case 4:
				C.ExibirProduto();
				break;
			case 5:
				C.AlterarPreco();
				break;
			case 6:
				C.AlterarEstoque();
				break;
			case 7:
				C.RegistrarVenda();
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
		System.out.println("1 – Inserir novo produto");
		System.out.println("2 – Remover um produto");
		System.out.println("3 – Exibir todos os produtos da lista");
		System.out.println("4 – Exibir os dados de um produto");
		System.out.println("5 – Alterar Preço do produto");
		System.out.println("6 – Alterar estoque do produto");
		System.out.println("7 – Registrar venda");
		System.out.println("0 – Sair do programa");
	}

}
