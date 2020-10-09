package empresa;
import java.util.Scanner;
public class Empresa {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Funcionario F;
		Cadastro C = new Cadastro();
		int Resp;
		String M,N,CG;
		double S,add;
		int A,SS;
		do {
			menu ();
		    Resp = input.nextInt();input.nextLine();
			switch (Resp) {
			case 1:
				System.out.println("Digite a matricula: ");
				M = input.nextLine();
				F = new Funcionario (M);
				System.out.println("Digite o nome do Funcionário: ");
				N = input.nextLine();
				F.setNome(N);
				System.out.println("Digite o cargo do Funcionário: ");
				CG = input.nextLine();
				F.setCargo(CG);
				System.out.println("Digite o salário do Funcionário: ");
				S = input.nextDouble();
				input.nextLine();
				F.setSalario(S);
				System.out.println("Digite o ano de contratação do Funcionário: ");
				A = input.nextInt();
				input.nextLine();
				F.setAno(A);
				C.admitir(F);
				break;
			case 2:
				C.exibir();break;
			case 3:
				System.out.println("Digite a matricula: ");
				M = input.nextLine();
				SS = C.BBuscar(M);
				System.out.println("Funcionário encontrado! ");break;
			case 4:	
				System.out.println("Digite a matricula: ");
				M = input.nextLine();
				System.out.println("Digite o quando deseja adicionar:");
				add = input.nextInt();
				C.addSalario(M,add);break;
			case 5:
				System.out.println("Digite a matricula: ");
				M = input.nextLine();
				C.Busca(M);break;
			case 6:
				System.out.println("Digite a matricula: ");
				M = input.nextLine();
				C.Remover(M);break;
			case 7:
				System.out.println("Saindo...");
				Resp = 7 ; break;
			}
		} while (Resp != 7);
		

	}
	public static void menu() {
		System.out.println("Bem-vindo ao sistema da empresa:");
		System.out.println("1 - Cadastrar um novo funcionário");
		System.out.println("2 - Exibir informações dos funcionários");
		System.out.println("3 - Procurar por um funcionário");
		System.out.println("4 - Aumentar salário");
		System.out.println("5 - Exibir dados de um funcionário");
		System.out.println("6 - Demitir um funcionário");
		System.out.println("7 - Sair");
		System.out.println("Digite o número da opção desejada: ");
	}

}
