package controledecadastro;
public class Aluno {
	private String matricula,nome;
	private double media;
	private int qfaltas;
	public Aluno (String M) {
		matricula = M;
	}
	public void setMatricula (String novoMatricula) {
		this.matricula = novoMatricula;
	}
	public String getMatricula () {
		return matricula;
	}
	public void setNome (String novoNome) {
		this.nome = novoNome;
	}
	public String getNome () {
		return nome;
	}
	public void setMedia (double novoMedia) {
		this.media = novoMedia;
	}
	public double getMedia () {
		return media;
	}
	public void setQfaltas (int novoQfaltas) {
		this.qfaltas = novoQfaltas;
	}
	public int getQfaltas() {
		return qfaltas;
	}
	@Override
	public String toString () {
		return "Matricula: " +matricula+ " Nome: " +nome+ " Média: " +media+ " Quantidade de faltas: " +qfaltas;
	}
	public int compareTo (Aluno A) {
		return this.matricula.compareTo(A.matricula);
	}

}
