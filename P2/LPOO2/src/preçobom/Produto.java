package pre�obom;
public class Produto {
	private String codigo, desc, fornece;
	private double preco;
	private int Qest;
	public Produto (String code) {
		codigo = code;
	}
	public void setCodigo (String novoCodigo) {
		this.codigo = novoCodigo;
	}
	public String getCodigo () {
		return codigo;
	}	
	public void setDesc (String novoDesc) {
		this.desc = novoDesc;
	}
	public String getDesc () {
		return desc;
	}
	public void setFornece (String novoFornece) {
		this.fornece = novoFornece;
	}
	public String getFornece () {
		return fornece;
	}
	public void setPreco (double novoPreco) {
		this.preco = novoPreco;
	}
	public double getPreco () {
		return preco;
	}
	public void setQest (int novoQest) {
		this.Qest = novoQest;
	}
	public int getQest () {
		return Qest;
	}
	public String toString () {
		return "C�digo do produto: " +this.codigo+ " Descri��o: " +this.desc+ " Fornecedor: " +this.fornece+ " Pre�o: " +this.preco+ " Quantidade em estoque: " +this.Qest; 
	}

}

