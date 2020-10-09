package dados;

public class Produto implements Comparable<Produto> {
	private String descricao;
	final String codigo;
	private double preco;
	private int estoque;

	public Produto(String C) {
		this.codigo = C;
	}
	public String getCodigo() {
		return this.codigo;
	}

	public void setDescricao(String D) {
		this.descricao = D;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setPreco(double P) {
		this.preco = P;
	}

	public double getPreco() {
		return this.preco;
	}

	public void setEstoque(int E) {
		this.estoque = E;
	}

	public int getEstoque() {
		return this.estoque;
	}

	@Override
	public int compareTo(Produto P) {
		return this.codigo.compareTo(P.getCodigo());
	}
	public String toString () {
		return "Código: " +codigo+ " Descrição: " +descricao+ " Preço: " +preco+ " Estoque: " +estoque;
	}

}