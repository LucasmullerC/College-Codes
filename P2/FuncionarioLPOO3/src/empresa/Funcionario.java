package empresa;
public class Funcionario {
	private String matricula,nome,cargo;
	private double salario;
	private int ano;
	public Funcionario (String M) {
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
	public void setCargo (String novoCargo) {
		this.cargo = novoCargo;
	}
	public String getCargo () {
		return cargo;
	}
	public void setSalario (double novoSalario) {
		this.salario = novoSalario;
	}
	public double getSalario () {
		return salario;
	}
	public void setAno (int novoAno) {
		this.ano = novoAno;
	}
	public int getAno () {
		return ano;
	}
	public String toString () {
		return "Matricula: " +this.matricula+ " Nome: " +this.nome+ " Cargo: " +this.cargo+ " Salário: " +this.salario+ " Ano de contratação: " +this.ano;
	}
}
