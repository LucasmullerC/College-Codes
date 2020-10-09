package lermais;
import java.util.Scanner;
public class CadastroLivros {
	private Livro [] L;
	private int cont = 0;
	public CadastroLivros () {
		L = new Livro [100];
	}
	public void Cadastrar (Livro L) {
		String M1,M2;
		int Loc = 0,pos;
		pos = this.cont;
		if (this.cont == 0) {
			this.L[Loc] = L;
			this.cont++;
			System.out.println("Cadastro efetuado com sucesso!");
		}
		else if (this.cont < this.L.length) {
			M1 = L.getTitulo();
			M2 = this.L[this.cont-1].getTitulo();
			if (M1.compareToIgnoreCase(M2) > 0) {
				pos = this.cont;
				this.L[pos] = L;
				this.cont++;
				System.out.println("Cadastro efetuado com sucesso!");
			}
			else {
				for (int i = 0;i < this.cont; i++) {
					M2 = this.L[i].getTitulo();
					if(M2.equalsIgnoreCase(M1) == true) {
						System.out.println("O cadastro n�o pode ser efetuado porque j� existe um livro com o mesmo t�tulo.");
						return;
					}
					else if (M2.compareToIgnoreCase(M1) > 0) {
						Loc = i;
						break;
					}
				}
				for (int j = this.cont - 1;j >= Loc;j--) {
					this.L[j + 1] = this.L[j];
				}
				this.L[Loc] = L;
				this.cont++;
				System.out.println("Cadastro efetuado com sucesso!");
			}
		}
		else {
			System.out.println("Cadastro n�o efetuado por falta de espa�o.");
		}
	} //Fim do m�todo cadastrar.
	public void exibir () {
		for (int i = 0;i < this.cont; i++) {
			System.out.println(L[i]);
		}
	} //Fim do m�todo Exibir
	public int BuscaBin (String Titulo) {
		int I = 0,M,Fn = cont - 1;
		boolean FD = false;
		do {
			M = (I + Fn) / 2;
			if (L[M].getTitulo().equalsIgnoreCase(Titulo) == true) {
				FD = true;
				break;
			}
			else if (L[M].getTitulo().compareToIgnoreCase(Titulo) > 0) {
				Fn = M - 1;
			}
			else {
				I = M + 1;
			}			
		} while (I <= Fn);
		if (FD == true) {
			return M;
		}
		else {
			return -1;
		}		
	} // Fim do m�todo BuscaBin
	public void Remover (String Titulo) {
		int pos,i;
		if (this.cont == 0) {
			System.out.println("Cadastro vazio! ");
		}
		else {
			pos = this.BuscaBin(Titulo);
			if(pos == -1) {
				System.out.println("O livro n�o foi encontrado.");
			}
			else {
				for (i = pos;i < this.cont-1;i++) {
					this.L[i] = this.L[i +  1];
				}
				this.L[i] = null;
				this.cont--;
				System.out.println("Remo��o efetuada!");
			}
		}
	} //Fim do m�todo Remover
	public void Alterar (String Titulo) {
		Scanner input = new Scanner (System.in);
		int pos,NQ;
		double NP;
		char P,Q;
		if (this.cont == 0) {
			System.out.println("Cadastro vazio! ");
		}
		else {
			pos = this.BuscaBin(Titulo);
			if (pos == -1) {
				System.out.println("O livro n�o foi encontrado.");
			}
			else {
				System.out.println("Livro encontrado!");
				do {
					System.out.println("Deseja editar o pre�o? (Digite S para sim e N para n�o)");
					System.out.print("Op��o: ");
					P = input.next().charAt(0);
					P = Character.toUpperCase(P);		
				   }while (P != 'S' && P != 'N');
				do {
					System.out.println("Deseja editar a quantidade em estoque? (Digite S para sim e N para n�o)");
					System.out.print("Op��o: ");
					Q = input.next().charAt(0);
					Q = Character.toUpperCase(Q);		
				   }while (Q != 'S' && Q != 'N');
				if (P == 'S') {
					do {
						System.out.println("Digite o novo pre�o: ");
						NP = input.nextDouble();					
					}while (NP < 0);
					L[pos].setPrecoU(NP);
					System.out.println("Pre�o alterado!");
				}
				if (Q == 'S') {
					do {
						System.out.println("Digite a nova quantidade : ");
						NQ = input.nextInt();						
					}while (NQ < 0);
					L[pos].setQtd(NQ);
					System.out.println("Quantidade alterada!");
				}
			}
		}
	}//Fim do m�todo Alterar
	public void Buscar (String Titulo) {
		int pos,i;
		if (this.cont == 0) {
			System.out.println("Cadastro vazio! ");
		}
		else {
			pos = this.BuscaBin(Titulo);
			if(pos == -1) {
				System.out.println("O livro n�o foi encontrado.");
			}
			else {
				System.out.println(L[pos]);
			}
	   }
	} //Fim do m�todo Buscar


}
