package loja;
public class Cadastroclientes {
	private Cliente[] C;
	private int cont;
	private boolean flag;
	public Cadastroclientes() {
		C = new Cliente[2000];
	}

	public void Cadastrar(Cliente C) {
		if (cont == 0) {
			this.C[0] = C;
			cont = 1;
			this.flag = false;
			System.out.println("Cadastro efetuado com sucesso!");
		} else {
			for (int i = 0; i <= cont; i++) {
				if (C.getCPF().equalsIgnoreCase(this.C[i].getCPF()) == true) {
					System.out.println("O cadastro não pode ser efetuado porque já existe um cliente com o mesmo CPF.");
					break;
				} else {
					this.C[cont] = C;
					this.cont++;
					this.flag = false;
					System.out.println("Cadastro efetuado com sucesso!");
					break;
				}
			}
		}
	}

	public void OrdemDescrescente() {
		int i, fim, pos;
		Cliente chave;
		boolean troca;
		fim = this.cont - 2;
		pos = 0;
		do {
			troca = false;
			for (i = 0; i <= fim; i++) {
				if (C[i].compareTo(C[i + 1]) > 0) {
					chave = C[i + 1];
					C[i+1] = C[i];
					C[i] = chave;
					pos = i;
					troca = true;
				}
			}
			fim = pos - 1;
		} while (troca == true);
		this.flag = true;
	}
	private void Buscar (String Cliente) {
		int pos;
		if (this.cont == 0) {
			System.out.println("Cadastro vazio! ");
		}
		else if(flag == false) {
			pos = this.BuscaSS(Cliente);
			if(pos == -1) {
				System.out.println("O cliente não foi encontrado.");
			}
			else {
				System.out.println(C[pos]);
			}
		}
		else {
			pos = this.BuscaBin(Cliente);
			if(pos == -1) {
				System.out.println("A matricula não foi encontrada.");
			}
			else {
				System.out.println(C[pos]);
			}
		}
	}
	public int BuscaBin (String CPF) {
		int I = 0,M,Fn = cont - 1;
		boolean FD = false;
		do {
			M = (I + Fn) / 2;
			if (C[M].getCPF().equalsIgnoreCase(CPF) == true) {
				FD = true;
				break;
			}
			else if (C[M].getCPF().compareToIgnoreCase(CPF) > 0) {
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
	public int BuscaSS (String M) {
		int pos = 1;
        for(int i = 0;i < (cont - 1);i++){
            if(this.C[i].getCPF().equals(M) == true){
                pos = -1;
                break;
            }
        }
        return pos;
	}
	public void Consultar (String Cliente) {
		Buscar(Cliente);
		
	}
}
