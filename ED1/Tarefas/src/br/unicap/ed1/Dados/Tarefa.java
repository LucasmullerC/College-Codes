package br.unicap.ed1.Dados;
public class Tarefa implements Comparable<Tarefa>{
	private String descricao,prioridade;
	public Tarefa (String D) {
		this.descricao = D;
	}
	public void setDescricao (String NovaDescricao) {
		this.descricao = NovaDescricao;
	}
	public String getDescricao () {
		return this.descricao;
	}
	public void setPrioridade (String NovaPrioridade) {
		this.prioridade = NovaPrioridade;
	}
	public String getPrioridade () {
		return this.prioridade;
	}

	@Override
	public int compareTo(Tarefa T) {
		return this.prioridade.compareTo(T.getPrioridade());
	}
	public String toString () {
		return "Prioridade: " +prioridade+ " Descrição: " +descricao;
	}
	
	

}
