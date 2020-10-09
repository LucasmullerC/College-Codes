package empresa;
public class Cadastro {
	private Funcionario [] F;
	private int cont = 0;
	public Cadastro () {
		F = new Funcionario [1000];
	}
	public void admitir (Funcionario F) {
		String M1,M2;
		int loc = 0,pos;
		pos = this.cont;
		if (this.cont == 0) {
    		this.F[loc] = F;
    		this.cont++;
    		System.out.println("Cadastro efetuado com sucesso!");
		}
		else if (this.cont < this.F.length) {
			M1 = F.getMatricula();
			M2 = this.F[this.cont-1].getMatricula();
			if (M1.compareToIgnoreCase(M2) > 0) {
				pos = this.cont;
	    		this.F[pos] = F;
	    		this.cont++;
	    		System.out.println("Cadastro efetuado com sucesso!");
			}
			else {
				for (int i = 0;i < this.cont; i++) {
					M2 = this.F[i].getMatricula();
					if (M2.equalsIgnoreCase(M1) == true) {
						System.out.println("O cadastro não pode ser efetuado porque já existe um funcionário com a mesma matricula.");
						return;
					}
					else if (M2.compareToIgnoreCase(M1) >0) {
						loc = i;
						break;
					}
				}
				for (int j = this.cont - 1;j >= loc;j--) {
					this.F[j+1] = this.F[j];
				}
				this.F[loc] = F;
				this.cont++;
				System.out.println("Cadastro efetuado com sucesso!");		
			}
		}
		else {
			System.out.println("Cadastro não efetuado por falta de espaço.");
		}
	}
	public void exibir () {
		for (int i = 0;i < this.cont; i++) {
			System.out.println(F[i]);
		}
	}
	public int BBuscar (String Mat) {
		int I = 0,M,Fn = cont - 1;
		boolean FD = false;
		do {
			M = (I + Fn) / 2;
			if (F[M].getMatricula().equalsIgnoreCase(Mat) == true) {
				FD = true;
				break;
			}
			else if (F[M].getMatricula().compareToIgnoreCase(Mat) > 0) {
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
	}
	public void Busca (String Mat) {
		int Pos = BBuscar(Mat);
		if (Pos == -1) {
			System.out.println("Matricula não existe ");
		}
		else {
			System.out.println(F[Pos]);
		}
	}
	public void addSalario (String M,double add) {
		double newS;
		int Pos = BBuscar(M);
		if (Pos == -1) {
			System.out.println("Matricula não existe ");
		}
		else {
			newS =  F[Pos].getSalario();
			newS = newS + add;
			F[Pos].setSalario(newS);
		}		
	}
	public void Remover (String M) {
		int pos,i;
		if (this.cont == 0) {
			System.out.println("Cadastro vazio! ");
		}
		else {
			pos = this.BBuscar (M);
			if (pos == -1) {
				System.out.println("Funcionário a ser demitido não foi encontrado.");
			}
			else {
				for (i = pos;i < this.cont-1;i++) {
					this.F [i] =  this.F[i + 1];
				}
				this.F[i] = null;
				this.cont--;
				System.out.println("Remoção efetuada!");
			}
		}
	}

}
