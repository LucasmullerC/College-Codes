package dados;
public class Contato implements Comparable<Contato> {
	private String nome,email,numero;
	public Contato (String N) {
		this.nome = N;
	}
	public String getNome () {
		return this.nome;
	}
	public void setEmail (String Email) {
		this.email = Email;
	}
	public String getEmail () {
		return this.email;
	}
	public void setNumero (String Numero) {
		this.numero = Numero;
	}
	public String getNumero () {
		return this.numero;
	}

	@Override
	public int compareTo(Contato C) {
		return this.nome.compareTo(C.getNome());
	}
	public String toString () {
		return "Nome: " +nome+ " E-mail: " +email+ " Telefone: " +numero;
	}
	

}
