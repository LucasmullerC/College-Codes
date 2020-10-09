package dados;
import java.util.Scanner;
import br.unicap.ed1.TiposdeDados.LSESemRepetidos;
public class Agenda {
	LSESemRepetidos <Contato> lista = new LSESemRepetidos();
	Contato C;
	public void Adicionar () {
		Scanner input = new Scanner (System.in);
		String Nome,email,numero;
		System.out.print("Digite o nome do contato: ");
		Nome = input.nextLine();
		System.out.print("Digite o E-mail do contato: ");
		email = input.nextLine();
		System.out.print("Digite o telefone do contato: ");
		numero = input.nextLine();
		C = new Contato(Nome);
		C.setEmail(email);
		C.setNumero(numero);
		lista.inserirOrdenado(C);
	}
	public void RemoverContato () {
		Scanner input = new Scanner(System.in);
		String Nome;
		System.out.print("Informe nome do contato: ");
		Nome = input.nextLine();
		C = new Contato(Nome);
		lista.removerNo(C);
	}
	public void ExibirTodos () {
		lista.exibirTodos();
	}
	public void ExibirContato () {
		Scanner input = new Scanner(System.in);
		String Nome;
		System.out.print("Informe o Nome do contato: ");
		Nome = input.nextLine();
		C = new Contato(Nome);
		lista.exibirDado(C);
	}
	public void Alterar () {
		Scanner input = new Scanner(System.in);
		String Nome,email,telefone;
		boolean valida;
		System.out.println("Informe o Nome do contato: ");
        Nome = input.nextLine();
        System.out.println("Informe o novo E-mail: ");
        email = input.nextLine();
        System.out.println("Informe o novo telefone: ");
        telefone = input.nextLine();
        C = new Contato (Nome);
        C.setEmail(email);
        C.setNumero(telefone);
        lista.AlterarProduto(C); 
	}

}
