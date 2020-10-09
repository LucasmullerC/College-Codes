package loja;
public class Cliente {
	private String cpf,nome,email,fone;
	public Cliente (String C) {
		cpf = C;
	}
	public void setCPF (String novoCPF) {
		this.cpf = novoCPF;
	}
	public String getCPF () {
		return cpf;
	}
	public void setNome (String novoNome) {
		this.nome = novoNome;
	}
	public String getNome() {
		return nome;
	}
	public void setEmail(String novoEmail) {
		this.email = novoEmail;
	}
	public String getEmail () {
		return email;
	}
	public void setFone (String novoFone) {
		this.fone = novoFone;
	}
	public String getFone () {
		return fone;
	}
	@Override
	public String toString () {
		return "Nome: " +nome+ " CPF: " +cpf+ " E-Mail: " +email+ " Fone: " +fone;
	}
	public int compareTo (Cliente C) {
		return this.cpf.compareTo(C.cpf);
	}

}
