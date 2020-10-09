package dados;
import java.util.Scanner;
import br.unicap.ed1.TiposdeDados.*;
public class CadastroPessoa {
	LDESemRepetidos <Pessoa> lista = new LDESemRepetidos();
	Pessoa P;
	public void Cadastro () {
		Scanner input = new Scanner (System.in);
		String Nome,RG;
		System.out.print("Digite o nome da pessoa: ");
		Nome = input.nextLine();
		System.out.print("Digite o RG da pessoa: ");
		RG = input.nextLine();
		P = new Pessoa(RG);
		P.setNome(Nome);
		lista.inserirNoFinal(P);
	}
	public void Cancelar () {
		lista.removerNoFinal();
	}
	public void ExibirTodos () {
		lista.exibirTodos();
	}
	public void Verificar () {
		Scanner input = new Scanner(System.in);
		String RG;
		System.out.print("Digite o RG da pessoa: ");
		RG = input.nextLine();
		P = new Pessoa(RG);
		lista.exibirDado(P);	
	}
	public void quantidade () {
		lista.Quantidade();
	}
	public void Remover () {
		Scanner input = new Scanner(System.in);
		String RG;
		System.out.print("Digite o RG da pessoa: ");
		RG = input.nextLine();
		P = new Pessoa(RG);
		lista.removerNo(P);
	}
	
	

}
