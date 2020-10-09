package lermais;
import java.util.Scanner;
public class ControleDeCadastro {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Livro L;
		CadastroLivros C = new CadastroLivros();
		int Resp;
        String titulo,autor;
		double precoU;
		int qtd;
		do {
			menu();
			Resp = input.nextInt();input.nextLine();
			switch (Resp) {
			case 1:
				System.out.println("Digite o título do Livro:");
				titulo = input.nextLine();
				L = new Livro (titulo);
				System.out.println("Digite o nome do autor:");
				autor = input.nextLine();
				L.setAutor(autor);
				do {
					System.out.println("Digite o preço do livro:");
					precoU = input.nextDouble();
					input.nextLine();	
				}while (precoU < 0);
				L.setPrecoU(precoU);
				do {
					System.out.println("Digite a quantidade em estoque:");
					qtd = input.nextInt();
					input.nextLine();	
				}while (qtd < 0);
				L.setQtd(qtd);
				C.Cadastrar(L);
				break;
			case 2:
				C.exibir();
				break;
			case 3:
				System.out.println("Digite o título do Livro:");
				titulo = input.nextLine();
				C.Buscar(titulo);
		        break;
			case 4:
				System.out.println("Digite o título do Livro:");
				titulo = input.nextLine();
				C.Alterar(titulo);
				break;
			case 5:
				System.out.println("Digite o título do Livro:");
				titulo = input.nextLine();
				C.Remover(titulo);
				break;
			case 6:
				System.out.println("Saindo...");
				break;
			default: 
				System.out.println("Valor inválido.");
				break;
			}		
		}while (Resp != 6);
	}
	public static void menu() {
		System.out.println("Bem-vindo á Livraria Ler Mais:");
		System.out.println("1 - Cadastrar um livro");
		System.out.println("2 - Exibir todos os livros");
		System.out.println("3 - Consultar um livro por Título");
		System.out.println("4 - Alterar preço unitário ou estoque de um livro");
		System.out.println("5 - Remover um livro");
		System.out.println("6 - Sair");
		System.out.println("Digite o número da opção desejada: ");
	}

}
