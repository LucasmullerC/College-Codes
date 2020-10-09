package controledecadastro;
public class CadastroAlunos {
	private Aluno [] A;
	private int cont = 0;
	private boolean flag = false;
	public CadastroAlunos () {
		A = new Aluno [60];
	}
	public void Cadastrar (Aluno A) {
		if (cont == 0) {
			this.A[0] = A;
			cont = 1;
			this.flag = false;
			System.out.println("Cadastro efetuado com sucesso!");
		}
		else {
			for (int i = 0; i <= cont; i++) {
				if(A.getMatricula().equalsIgnoreCase(this.A[i].getMatricula())== true) {
					System.out.println("O cadastro não pode ser efetuado porque já existe um aluno com a mesma matricula.");
					break;
				}
				else {
					this.A[cont] = A;
					this.cont++;
					this.flag = false;
					System.out.println("Cadastro efetuado com sucesso!");
					break;
				}
			}
		}
	}
	public void exibir () {
		for (int i = 0;i < this.cont; i++) {
			System.out.println(A[i]);
		}
	}
	public void OrdemCrescenteMatricula () {
		int i,j;
		String chave;
		int fim = cont - 1;
		for(i = 1;i<=fim;i++) {
			chave = A[i].getMatricula();
			j = i -1;
			while (j >= 0 && A[j].getMatricula().compareTo(chave) > 0) {
				A[j+1] = A[j];
				j = j -1;
			}
			A[j+1].setMatricula(chave);
		}
		this.flag = true;
	}
	public void OrdemDecrescenteMedia () {
		int i, fim, pos;
		double chave;
		boolean troca;
		fim = this.cont - 2; pos = 0;
		do {
		troca = false;
		for (i = 0; i <= fim; i++) {
		if (A[i].compareTo(A[i+1])>0) {
		chave = A[i].getMedia(); 
		A[i].setMedia(A[i+1].getMedia()); 
		A[i+1].setMedia(chave);
		pos = i; troca = true;
		  }
		}
		fim = pos-1;
		} while (troca == true);
		this.flag = false;
	}
	public void OrdemCrescenteFaltas () {
		int i, j, menor;
		int aux;
		int fim = cont - 1;
		for (i = 0; i < fim; i++) {
		menor = i;
		for (j = i + 1; j <= fim ; j++) {
		if (A[j].getQfaltas() < A[menor].getQfaltas()) {
		menor = j;
		  }
		}
		aux = A [i].getQfaltas();
		A [i].setQfaltas(menor);
		A [menor].setQfaltas(aux);
		}
		this.flag = false;
	}
	private void Buscar (String M) {
		int pos;
		if (this.cont == 0) {
			System.out.println("Cadastro vazio! ");
		}
		else if(flag == false) {
			pos = this.BuscaSS(M);
			if(pos == -1) {
				System.out.println("A matricula não foi encontrada.");
			}
			else {
				System.out.println(A[pos]);
			}
		}
		else {
			pos = this.BuscaBin(M);
			if(pos == -1) {
				System.out.println("A matricula não foi encontrada.");
			}
			else {
				System.out.println(A[pos]);
			}
		}
	}
	public void Consultar (String M) {
		Buscar(M);
		
	}
	
	public int BuscaBin (String Mt) {
		int I = 0,M,Fn = cont - 1;
		boolean FD = false;
		do {
			M = (I + Fn) / 2;
			if (A[M].getMatricula().equalsIgnoreCase(Mt) == true) {
				FD = true;
				break;
			}
			else if (A[M].getMatricula().compareToIgnoreCase(Mt) > 0) {
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
            if(this.A[i].getMatricula().equals(M) == true){
                pos = -1;
                break;
            }
        }
        return pos;
	}
			

}
