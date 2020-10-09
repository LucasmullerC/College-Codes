package br.unicap.ed1.Aplicacao;

import java.util.Scanner;
import br.unicap.ed1.Dados.CadastroTarefas;

public class ControleDeTarefa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int op;
		CadastroTarefas C = new CadastroTarefas();
		do {
			menu();
			System.out.println("Informe a opção: ");
			op = input.nextInt();
			input.nextLine();
			switch (op) {
			case 1:
				C.Cadastro();
				break;
			case 2:
			    C.FilaDePrioridade();
			    break;
			case 3:
				C.ExecutarTarefa();
				break;
			case 4:
				break;
			case 5:
				C.ExibirTodos();
				break;
			case 6:
				C.AlterarPrioridade();
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
		System.out.println("1 – Inserir nova Tarefa");
		System.out.println("2 – Ver Fila de execução");
		System.out.println("3 – Executar Tarefa");
		System.out.println("4 – Exibir Tarefa");
		System.out.println("5 – Exibir todas as Tarefas");
		System.out.println("6 – Alterar prioridade de tarefa");
		System.out.println("0 – Sair do programa");
	}

}
