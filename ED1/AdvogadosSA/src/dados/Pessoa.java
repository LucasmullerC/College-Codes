package dados;
public class Pessoa implements Comparable<Pessoa>{
	private String nome,RG;
	public Pessoa (String R) {
	   this.RG = R;
	}
	public String getRG () {
		return this.RG;
	}
	public void setNome (String novoNome) {
		this.nome = novoNome;
	}
	public String getNome () {
		return this.nome;
	}

	@Override
	public int compareTo(Pessoa P) {
		return this.RG.compareTo(P.getRG());
	}
	public String toString () {
		return "Nome: " +nome+ " RG: " +RG;
	}

}
