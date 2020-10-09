package br.unicap.ed1.TiposdeDados;
public class LDE <T extends Comparable <T>> { 

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
    
    public void exibirTodos () {
        LDENode<T> aux;
        aux = this.inicio;
        while (aux != null) {
            System.out.print(aux.getInfo() + " ");
            aux = aux.getProx();
        }
        System.out.println();
    }
    
    public void inserirNoInicio (T obj) {
        LDENode<T> novo = new LDENode (obj);
        if (this.isEmpty() == true) { 
            this.inicio = novo;
	    this.fim = novo;
        }
        else {
            novo.setProx(this.inicio);
	    this.inicio.setAnt(novo);
	    this.inicio = novo;
        }
        this.qtd++;
    }
    
    public void removerNoFinal () {
        LDENode<T> aux;
        if (this.isEmpty () == true) {
            System.out.println("Lista vazia!"); 
        }
        else if (this.inicio.getProx() == null) { 
            this.inicio = null;
            this.fim = null;
            this.qtd = 0;
        }
        else { 
            aux = this.fim.getAnt(); 
            aux.setProx(null);
            this.fim = aux;
            this.qtd--;
        }       
    }
}
