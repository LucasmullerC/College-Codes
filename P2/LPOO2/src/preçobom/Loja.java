package preçobom;

public class Loja {
	private Produto [] Pvet;
	private int cont;
	public Loja (int size) {
		Pvet = new Produto[size];	
	}
	public void Cadastro (Produto P) {
		int posi = buscar(P);
        if (posi == 1) {
        	try {
        		System.out.println("O cadastro não pode ser efetuado porque já existe um produto com o mesmo código.");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else {
        	
        	int pos = this.cont;
    		this.Pvet[pos] = P;
    		this.cont++;
    		try {
    			System.out.println("Cadastro efetuado com sucesso!");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
        }
	}
	private int buscar(Produto P){ 
		int pos = -1;
        for(int i = 0;i < (cont - 1);i++){
            if(this.Pvet[i].getCodigo().equals(P.getCodigo()) == true){
                pos = 1;
                break;
            }
        }
        return pos;
	}
	public void exibir () {
		for (int i = 0;i < this.cont; i++) {
			System.out.println(Pvet[i]);
		}
	}
	public void fornecedor (String F) {
		for(int i = 0;i < (cont - 1);i++){
            if(this.Pvet[i].getFornece().equals(F) == true){
            	System.out.println(Pvet[i]);
            }
        }
	}
	public void AltP (String C,double PC,int TA) {
		double P = 0,F;
		int i;
		for(i = 0;i < cont;i++){
            if(this.Pvet[i].getCodigo().equals(C) == true){
                P = Pvet[i].getPreco();
                break;
            }
        }
		if (TA == 1) {
			F = P + (PC / 100) * P;
			Pvet[i].setPreco(F);			
		}
		else {
			F = P - (PC / 100) * P;
			Pvet[i].setPreco(F);	
		}
		System.out.println(Pvet[i]);
	}
	public void Nestoque (String C,int Nest) {
		int P = 0;
		int i,F;
		for(i = 0;i < cont;i++){
            if(this.Pvet[i].getCodigo().equals(C) == true){
            	P = Pvet[i].getQest();
                break;
            }
        }
		F = Nest + P;
		Pvet[i].setQest(F);	
		System.out.println(Pvet[i]);
	}
	public void Venda (String C,int Q) {
		int P = 0,F;
		int i;
		double preco,NP;
		for(i = 0;i < cont;i++){
            if(this.Pvet[i].getCodigo().equals(C) == true){
            	P = Pvet[i].getQest();
                break;
            }
		}    
            if (P < Q) {
            	System.out.println("Não temos a quantidade suficiente do produto.");
            }
            else {
            	F = Q - P;
            	Pvet[i].setQest(F);
            	preco = Pvet[i].getPreco();
            	NP = preco * Q;
            	NP = NP - preco;
            	System.out.println("O Total a pagar é de R$" +NP);
            	Pvet[i].setPreco(NP);
            	System.out.println(".");
            	System.out.println(".");
            	System.out.println(".");
            	System.out.println("Volte sempre!");
            }
	}


	
}
