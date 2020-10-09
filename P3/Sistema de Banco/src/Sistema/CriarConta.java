package Sistema;
public class CriarConta {
	private Conta[]C;
	private int tam;
	private int cont;
	public CriarConta() {
		C = new Conta[100];
	}
	public void Cadastrar(Conta C) {
		tam = C.getConta().length();
		if(tam != 6){
            System.out.println("Número da conta inválido. Informe exatamente 6 caracteres.");
        }
		else if(Ação.VerificarC(C.getConta()) == false){
            System.out.println("Número da conta inválido. Informe somente dígitos numéricos.");
        }
		else{
			this.C[cont] = C;
    		this.cont++;
    		System.out.println("Cadastro efetuado com sucesso!");
        }
		
	}
	public void exibir (String Conta) {
		int vef;
		vef = BuscaBin(Conta);
		if (vef == -1) {
			System.out.println("Número da conta não encontrado.");
		}
		else {
			System.out.println(C[vef]);
		}
	}
	public void Depositar (String Conta,double qtd) {
		int vef;
		vef = BuscaBin(Conta);
		if (vef == -1) {
			System.out.println("Número da conta não encontrado.");
		}
		else {
			qtd = C[vef].getQuant() + qtd;
			C[vef].setQuant(qtd);
			System.out.println("Deposito efetuado com sucesso!");
		}
	}
	public void Sacar (String Conta,double qtd) {
		int vef;
		vef = BuscaBin(Conta);
		if (vef == -1) {
			System.out.println("Número da conta não encontrado.");
		}
		else {
			if (C[vef].getQuant() < qtd) {
				System.out.println("Saldo insuficiente!");
			}
			else {
				qtd = C[vef].getQuant() - qtd;
				C[vef].setQuant(qtd);
				System.out.println("Saque efetuado com sucesso!");
			}
		}
	}
	
	public int BuscaBin (String Conta) {
		int I = 0,M,Fn = cont - 1;
		boolean FD = false;
		do {
			M = (I + Fn) / 2;
			if (C[M].getConta().equalsIgnoreCase(Conta) == true) {
				FD = true;
				break;
			}
			else if (C[M].getConta().compareToIgnoreCase(Conta) > 0) {
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


}
