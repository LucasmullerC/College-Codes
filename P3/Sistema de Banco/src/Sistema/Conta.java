package Sistema;
public class Conta {
	private String Conta;
	private double Quant;
	public Conta (String C) {
		Conta = C;
	}
	public void setConta(String novaConta) {
		this.Conta = novaConta;
	}
	public String getConta() {
		return Conta;
	}
	public void setQuant (double novoQuant) {
		this.Quant = novoQuant;
	}
	public double getQuant() {
		return Quant;
	}
	public String toString () {
		return "Número da Conta: " +Conta+ " Saldo: " +Quant;
	}

}
