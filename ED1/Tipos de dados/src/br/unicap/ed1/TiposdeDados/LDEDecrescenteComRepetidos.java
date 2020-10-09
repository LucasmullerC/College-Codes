package br.unicap.ed1.TiposdeDados;

public class LDEDecrescenteComRepetidos <T extends Comparable <T>> { 

    private LDENode<T> inicio;
    private LDENode<T> fim;
    private int qtd;

    public boolean isEmpty() {  
        if (this.qtd == 0) {  
            return true;
        } else {
            return false;
        }
    }
    
    public void inserir (T obj) {
        LDENode<T> novo = new LDENode (obj); 
        LDENode<T> aux, proximo;
        if (this.isEmpty() == true) { // Caso 1: lista vazia
            this.inicio = novo;
            this.fim = novo;
            this.qtd = 1;
        }
        else { // Caso 2: lista não vazia
            if (obj.compareTo(this.inicio.getInfo()) > 0) { // Caso 2.1: inserção no início
                novo.setProx(this.inicio);
                this.inicio.setAnt(novo);
                this.inicio = novo;
                this.qtd++;
            }
            else if (obj.compareTo(this.fim.getInfo()) <= 0) { // Caso 2.2: inserção no final
                this.fim.setProx (novo);
                novo.setAnt(this.fim);
                this.fim = novo;
                this.qtd++;
            }
            else {  // Caso 2.3: inserção no meio
                aux = this.fim;
                while (aux.getInfo().compareTo(obj) < 0) {
                    aux = aux.getAnt();
                }
                proximo = aux.getProx();
                aux.setProx(novo);
                novo.setAnt(aux);
                novo.setProx(proximo);
                proximo.setAnt(novo);
                this.qtd++;                
            }            
        }      
    }
    public void alterarNo (T valorN, T valorV) {
    	LDENode<T> aux,aux1;
    	aux = buscaSimples(valorV);
    	if (aux == null) {
    		System.out.println("Valor não encontrado.");
    	}
    	else {
    		aux.setInfo(valorN);
    	}
    }
    public int QuantidadeAtéNó (T obj) {
    	LDENode<T> aux,Pesq = null;
    	int cont = 0;
    	aux = buscaSimples(obj);
    	if (aux == null) {
    		return -1;
    	}
    	else {
    		while (Pesq != aux) {
    			if (Pesq.getInfo().compareTo(obj) == 0) {
    				cont++;
    			}
    			Pesq = Pesq.getProx();
    		}
    		return cont;
    	}
    	
    }
    public void removerNo(T Valor) {
		LDENode<T> aux;
		aux = buscaSimples(Valor);
		if (aux == null) {
			System.out.println("Valor não encontrado.");
		} else {
			aux.setInfo(null);
			this.qtd--;
		}
	}
    public void removerNoInicio () {
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else {
            this.inicio = this.inicio.getProx();
            this.qtd--;           
        }
    }
    public T BuscarObjeto(T obj){ 
        LDENode<T> aux;
        aux = this.inicio;
        if (this.isEmpty() == true) {
            return null;
        }
        else {
            while(aux != null){
                if(obj.compareTo(aux.getInfo()) == 0){
                    return aux.getInfo();
                }
                aux = aux.getProx();
            }
            return null;
        }
    }
    private LDENode<T> buscaSimples(T obj) {
		LDENode<T> aux = this.inicio;
		while (aux != null) {
			if (aux.getInfo().compareTo(obj) == 0) {
				return aux;
			}
			aux = aux.getProx();
		}
		return null;
	}
    public void exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
}
