package lermais;
public class Livro {
	private String titulo,autor;
	private double precoU;
	private int qtd;
	public Livro (String T) {
		titulo = T;
	}
	public void setTitulo (String novoTitulo) {
		this.titulo = novoTitulo;
	}
	public String getTitulo () {
		return titulo;
	}
	public void setAutor (String novoAutor) {
		this.autor = novoAutor;
	}
	public String getAutor () {
		return autor;
	}
	public void setPrecoU (double novoPrecoU) {
		this.precoU = novoPrecoU;
	}
	public double getPrecoU () {
		return precoU;
	}
	public void setQtd (int novoQtd) {
		this.qtd = novoQtd;
	}
	public int getQtd () {
		return qtd;
	}
	public String toString () {
		return "Título: " +titulo+ " Autor: " +autor+ " Preço: " +precoU+ " Quantidade em estoque: " +qtd;
	}

}
