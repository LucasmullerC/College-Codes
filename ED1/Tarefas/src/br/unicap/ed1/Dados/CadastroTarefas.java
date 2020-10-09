package br.unicap.ed1.Dados;
import java.util.Scanner;
import br.unicap.ed1.TiposdeDados.LDEDecrescenteComRepetidos;
public class CadastroTarefas {
	LDEDecrescenteComRepetidos <Tarefa> lista = new LDEDecrescenteComRepetidos();
	Tarefa T;
	public void Cadastro () {
		Scanner input = new Scanner (System.in);
		String Prio,Desc;
		Tarefa aux;
		boolean vef;
		do {
			System.out.print("Digite a prioridade da tarefa: ");
			Prio = input.nextLine();
			vef = VerificarString.VerificarContaNum(Prio);
		}while (vef == false);
		do {
			System.out.print("Digite a descrição da tarefa: ");
			Desc = input.nextLine();
			T = new Tarefa(Desc);
			aux = lista.BuscarObjeto(T);
		} while (aux != null);
		T.setPrioridade(Prio);
		lista.inserir(T);
	}
	public void FilaDePrioridade () {
		Scanner input = new Scanner (System.in);
		String Desc;
		int quant;
		System.out.print("Digite a descrição da tarefa: ");
		Desc = input.nextLine();
		T = new Tarefa(Desc);
		quant = lista.QuantidadeAtéNó(T);
		if (quant == -1) {
			System.out.print("Tarefa não encontrada!");
		}
		else {
			System.out.print("Ainda faltam " +quant+ " Tarefas para serem executadas.");
		}	
	}
	public void ExecutarTarefa () {
		lista.removerNoInicio();
		System.out.print("Tarefa executada!");
	}
	public void CancelarExecucao () {
		Scanner input = new Scanner (System.in);
		String Desc;
		System.out.print("Digite a descrição da tarefa: ");
		Desc = input.nextLine();
		T = new Tarefa(Desc);
		lista.removerNo(T);
		System.out.print("Tarefa cancelada!");
	}
	public void ExibirTodos () {
		lista.exibirTodos();
	}
	public void AlterarPrioridade () {
		Scanner input = new Scanner (System.in);
		String Desc,Prio;
		System.out.print("Digite a descrição da tarefa: ");
		Desc = input.nextLine();
		System.out.print("Digite a nova prioridade da tarefa: ");
		Prio = input.nextLine();
		T = new Tarefa(Desc);
		T.setPrioridade(Prio);
		lista.alterarNo(T, T);
	}
	

}
