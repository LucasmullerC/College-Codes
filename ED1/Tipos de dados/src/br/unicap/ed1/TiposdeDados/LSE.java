package br.unicap.ed1.TiposdeDados;
public class LSE<T extends Comparable <T>> { 

    private LSENode<T> inicio;
    private LSENode<T> fim;
    private int qtd;

    public boolean isEmpty() {  
        if (this.qtd == 0) {  
            return true;
        } else {
            return false;
        }
    }

    public void inserirNo(T obj) { 
        LSENode<T> novo;
        novo = new LSENode(obj);
        if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        }
        else {
            novo.setProx (this.inicio);
            this.inicio = novo;
        }
        this.qtd++;
    }
    
    public void inserirNoFinal (T obj) {
    	LSENode<T> novo;
        novo = new LSENode(obj);
    	if (this.isEmpty() == true) {
            this.inicio = novo;
            this.fim = novo;
        }
    	else {
    		this.fim.setProx(novo);
    		this.fim = novo;
    	}
    	this.qtd++;
        
    }
    public void inserirCrescenteComRepetidos (T obj) {
    	LSENode<T> novo = new LSENode (obj);
        LSENode<T> pos, anterior = null, atual;
        if (this.isEmpty() == true) { 
            this.inicio = novo;
            this.fim = novo;
            this.qtd++;
        }
        else { 
            if (obj.compareTo(this.inicio.getInfo()) < 0) { 
                novo.setProx(this.inicio);
                this.inicio = novo;
                this.qtd++;
            }
            else if (obj.compareTo(this.fim.getInfo()) == 0) { 
                this.fim.setProx(novo);
                this.fim = novo;
                this.qtd++;
            }
            else { 
                atual = this.inicio;     
                while (true) {
                    if (atual.getInfo().compareTo(obj) > 0) {
                        anterior.setProx (novo);
                        novo.setProx (atual);
                        this.qtd++;
                        System.out.println("Inserção efetuada");
                        return;
                    }
                    else {
                        anterior = atual;
                        atual = atual.getProx();
                    }                   
                }
            }
        }
    }
    public void removerNoInicio () {
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { // ou if (this.qtd == 1) 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else {
            this.inicio = this.inicio.getProx();
            this.qtd--;           
        }
    }
    public void removerNoFinal () {
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) {
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else {
        	LSENode<T> aux;
            aux = this.inicio;
            while (aux.getProx() != null) {
           	 if (aux.getProx().getProx() == null) {
           		 aux.setProx(null);
           		 this.qtd--;
           		System.out.println("Removido da lista!"); 
           	 }
           	 else {
           		 aux = aux.getProx();
           	 }
            }
        }
    }
    public void alterarNo (T valorN, T valorV) {
    	LSENode<T> aux,aux1;
    	aux = procurarNo(valorV);
    	if (aux == null) {
    		System.out.println("Valor não encontrado.");
    	}
    	else {
    		aux.setInfo(valorN);
    	}
    }
    public LSENode procurarNo (T valor) {
    	 LSENode<T> aux;
    	 int cont=0;
         aux = this.inicio;
         while (aux != null) {
        	 if (aux.getInfo() == valor) {
        		 return aux;
        	 }
        	 else if (cont == qtd) {
        		 return null;
        	 }
        	 else {
        		 aux = aux.getProx();
        		 cont++;
        	 }
         }
         return null;
    }
    
    public void exibirTodos () {
        LSENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }

}
