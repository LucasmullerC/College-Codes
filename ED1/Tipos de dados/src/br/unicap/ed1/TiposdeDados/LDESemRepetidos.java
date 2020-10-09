package br.unicap.ed1.TiposdeDados;

public class LDESemRepetidos<T extends Comparable<T>> {
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

	public void exibirTodos() {
		LDENode<T> aux;
		aux = this.inicio;
		while (aux != null) {
			System.out.print(aux.getInfo() + " ");
			aux = aux.getProx();
		}
		System.out.println();
	}

	public void Quantidade() {
		LDENode<T> aux;
		aux = this.inicio;
		int cont = 1;
		while (aux != null) {
			System.out.print(cont + " ");
			aux = aux.getProx();
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

	public void inserirNoInicio(T obj) {
		LDENode<T> novo = new LDENode(obj), aux;
		if (this.isEmpty() == true) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			aux = this.buscaSimples(obj);
			if (aux == null) {
				novo.setProx(this.inicio);
				this.inicio.setAnt(novo);
				this.inicio = novo;
				this.qtd++;
			} else {
				System.out.println("Valor repetido!");
			}
		}
	}

	public void inserirNoFinal(T obj) {
		LDENode<T> novo, aux;
		novo = new LDENode(obj);
		if (this.isEmpty() == true) {
			this.inicio = novo;
			this.fim = novo;
			this.qtd++;
			System.out.println("Cadastrado efetuado!");
		} else {
			aux = this.buscaSimples(obj);
			if (aux == null) {
				this.fim.setProx(novo);
				novo.setAnt(this.fim);
				this.fim = novo;
				this.qtd++;
				System.out.println("Cadastrado efetuado!");
			} else {
				System.out.println("Pessoa já cadastrada!");
			}
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

	public void exibirDado(T obj) {
		LDENode<T> aux;
		aux = buscaSimples(obj);
		if (aux == null) {
			System.out.println("Valor não encontrado.");
		} else {
			System.out.println(aux.getInfo());
		}
	}

	public void removerNoFinal() {
		LDENode<T> aux;
		if (this.isEmpty() == true) {
			System.out.println("Lista vazia!");
		} else if (this.inicio.getProx() == null) {
			this.inicio = null;
			this.fim = null;
			this.qtd = 0;
		} else {
			aux = this.fim.getAnt();
			aux.setProx(null);
			this.fim = aux;
			this.qtd--;
		}
	}
}
