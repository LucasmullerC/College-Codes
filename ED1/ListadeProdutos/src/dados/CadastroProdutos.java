package dados;
import java.util.Scanner;
import br.unicap.ed1.TiposdeDados.LSENode;
import br.unicap.ed1.TiposdeDados.LSESemRepetidos;
public class CadastroProdutos {
	LSESemRepetidos <Produto> lista = new LSESemRepetidos();
	Produto P = null;
	
	public void Cadastro () {
		Scanner input = new Scanner(System.in);
		String Codigo, Descricao;
		double preco;
		int op, estoque;
		boolean valida = false;
		System.out.print("Informe o código do produto: ");
		Codigo = input.nextLine();
		System.out.print("Informe a descrição do produto: ");
		Descricao = input.nextLine();
		input.nextLine();
		do {
			System.out.print("Informe o preço do produto: ");
			preco = input.nextDouble();input.nextLine();
			if (preco < 0 ) {
				System.out.print("O preço deve ser maior ou igual a zero!");
			}
			else {
				valida = true;
			}
		} while (valida = false);
		do {
			valida = false;
			System.out.print("Informe o estoque do produto: ");
			estoque = input.nextInt();input.nextLine();
			if (estoque < 1 ) {
				System.out.print("O estoque deve ser maior do que zero!");
			}
			else {
				valida = true;
			}
		}while (valida = false);
		P = new Produto(Codigo);
		P.setDescricao(Descricao);
		P.setPreco(preco);
		P.setEstoque(estoque);
		lista.inserirNoFinal(P);
	}
	public void ExibirTodos () {
		lista.exibirTodos();
	}
	public void RemoverProduto () {
		Scanner input = new Scanner(System.in);
		String Codigo;
		System.out.print("Informe o código do produto: ");
		Codigo = input.nextLine();
		P = new Produto(Codigo);
		lista.removerNo(P);
	}
	public void ExibirProduto () {
		Scanner input = new Scanner(System.in);
		String Codigo;
		System.out.print("Informe o código do produto: ");
		Codigo = input.nextLine();
		P = new Produto(Codigo);
		lista.exibirDado(P);
	}
	public void AlterarPreco () {
		Scanner input = new Scanner(System.in);
		String Codigo;
		double preco;
		boolean valida;
		System.out.println("Informe o Código do produto: ");
        Codigo = input.nextLine();
        do {
        	System.out.println("Informe o novo preço: ");
            preco = input.nextDouble();
            if (preco < 0 ) {
				System.out.print("O preço deve ser maior ou igual a zero!");
			}
			else {
				valida = true;
			}
        } while (valida = false);
        P = new Produto (Codigo);
        P.setPreco(preco);
        lista.AlterarProduto(P); 
	}
	public void AlterarEstoque () {
		Scanner input = new Scanner(System.in);
		String Codigo;
		int estoque1,estoque2;
		System.out.println("Informe o Código do produto: ");
        Codigo = input.nextLine();
        System.out.println("Informe o novo estoque: ");
        estoque2 = input.nextInt();
        estoque1 = P.getEstoque();
        estoque2 = estoque2 + estoque1;
        P = new Produto (Codigo);
        P.setEstoque(estoque2);
        lista.AlterarProduto(P); 
	}
	public void RegistrarVenda () {
		Scanner input = new Scanner(System.in);
		String Codigo;
		int estoque1,estoque2;
		System.out.println("Informe o Código do produto: ");
        Codigo = input.nextLine();
        System.out.println("Quantidade a ser RETIRADA do estoque: ");
        estoque2 = input.nextInt();
        estoque1 = P.getEstoque();
        estoque2 = estoque2 - estoque1;
        P = new Produto (Codigo);
        P.setEstoque(estoque2);
        lista.AlterarProduto(P); 
	}
}

