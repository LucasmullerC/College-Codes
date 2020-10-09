package preçobom;
import java.util.Scanner;
public class PreçoBom {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Produto P;
		final int count = 100;
		Loja L = new Loja(count);
		String codigo, desc, fornece,SF,NC;
		double preco,PC;
		int S = 0, Qest,TA,Nest,Q;
		do {
			menu();
			S = input.nextInt(); input.nextLine();
			switch (S) {
			case 1:
				System.out.println("Digite o código do produto: ");
				codigo = input.nextLine();
				P = new Produto(codigo);
				System.out.println("Digite a descrição do produto: ");
				desc = input.nextLine();
				P.setDesc(desc);
				System.out.println("Digite o fornecedor do produto: ");
				fornece = input.nextLine();
				P.setFornece(fornece);
				System.out.println("Digite o preço do produto: ");
				preco = input.nextDouble();
				input.nextLine();
				P.setPreco(preco);
				System.out.println("Digite a quantidade em estoque: ");
				Qest = input.nextInt();
				input.nextLine();
				P.setQest(Qest);
				L.Cadastro(P);
				break;
			case 2:
				L.exibir();
				break;
			case 3:
				System.out.println("Digite o nome do Fornecedor: ");
				SF = input.nextLine();
				L.fornecedor(SF);
				break;
			case 4:
				System.out.println("Digite o código do produto: ");
				NC = input.nextLine();
				System.out.println("Digite 1 - Aumento / 2 - Desconto");
				TA = input.nextInt();
				System.out.println("Digite o percentual de alteração: ");
				PC = input.nextDouble();
				L.AltP(NC,PC,TA);
				break;
			case 5:
				System.out.println("Digite o código do produto: ");
				NC = input.nextLine();
				System.out.println("Digite o acrescimo do estoque: ");
				Nest = input.nextInt();
				L.Nestoque(NC,Nest);
				break;
			case 6:
				System.out.println("Digite o código do produto: ");
				NC = input.nextLine();
				System.out.println("Digite a quantidade: ");
				Q = input.nextInt();
				L.Venda(NC,Q);
				break;
				
			case 7: 
				System.out.println("Desligando...");
				System.out.println("Desligando..");
				System.out.println("Desligando.");
				S = 6;
				break;
			default: System.out.println("Valor inválido.");break;
			}
		} while (S != 6);

	}

	public static void menu() {
		System.out.println("Bem-vindo a loja Preço Bom!");
		System.out.println("1 - Cadastrar um novo produto");
		System.out.println("2 - Exibir os dados de todos os produtos");
		System.out.println("3 - Exibir os dados de todos os produtos de um certo fornecedor");
		System.out.println("4 - Alterar preço de algum produto");
		System.out.println("5 - Atualizar estoque de algum produto");
		System.out.println("6 - Vender um produto");
		System.out.println("7 - Sair");
		System.out.println("Digite o número da opção desejada: ");
	}

}
