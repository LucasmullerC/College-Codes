package controledecadastro;
import java.util.Scanner;
public class ControleDeCadastro {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Aluno A;
		CadastroAlunos C = new CadastroAlunos();
		int Resp;
		String matricula,nome;
		double media;
		int qfaltas;
		do {
			menu();
			Resp = input.nextInt();input.nextLine();
			switch (Resp) {
			case 1:
				System.out.println("Digite a matricula do aluno:");
				matricula = input.nextLine();
				A = new Aluno (matricula);
				System.out.println("Digite o nome do Aluno:");
				nome = input.nextLine();
				A.setNome(nome);
				System.out.println("Digite a média do Aluno:");
				media = input.nextDouble();
				input.nextLine();
				A.setMedia(media);
				System.out.println("Digite a quantidade de faltas do Aluno:");
				qfaltas = input.nextInt();
				input.nextLine();
				A.setQfaltas(qfaltas);
				C.Cadastrar(A);
				break;
			case 2:
				C.exibir();
				break;
			case 3:
				C.OrdemCrescenteMatricula();
				break;
			case 4:
				C.OrdemDecrescenteMedia();
				break;
			case 5:
				C.OrdemCrescenteFaltas();
				break;
			case 6:
				System.out.println("Digite a média do Aluno:");
				matricula = input.nextLine();
				C.Consultar(matricula);
				break;
			case 0:
				Resp = 0;
				break;
			default:
				System.out.println("Valor inválido!");
				break;
			}		
		}while (Resp != 0);
	}
	public static void menu() {
		System.out.println("Controle de Cadastro de alunos:");
		System.out.println("1 - Cadastrar um aluno");
		System.out.println("2 - Exibir dados de todos os alunos");
		System.out.println("3 - Ordenar crescente por matrícula");
		System.out.println("4 - Ordenar decrescente por média");
		System.out.println("5 - Ordenar crescente por faltas");
		System.out.println("6 - Consultar um aluno");
		System.out.println("0 - Sair");
		System.out.println("Digite o número da opção desejada: ");
	}

}
