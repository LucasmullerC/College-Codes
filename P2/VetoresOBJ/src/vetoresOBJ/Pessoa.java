package vetoresOBJ;

public class Pessoa {
private String nome;
private int idade;
private char genero;
private double peso;
private double altura;
private double pesoideal;
public Pessoa (String N) {
	nome = N;
}
public void setNome (String novoNome) {
	this.nome = novoNome;
}
public String getNome () {
	return nome;
}	
public void setIdade (int novoIdade) {
	this.idade = novoIdade;
}
public int getIdade () {
	return idade;
}
public void setGenero (char novoGenero) {
	this.genero = novoGenero;
}
public char getGenero () {
	return genero;
}
public void setPeso (double novoPeso) {
	this.peso = novoPeso;
}
public double getPeso () {
	return peso;
}
public void setAltura (double novoAltura) {
	this.altura = novoAltura;
}
public double getAltura () {
	return altura;
}
public void setPesoideal (double novoPesoideal) {
	this.pesoideal = novoPesoideal;
}
public double getPesoideal () {
	return pesoideal;
}
public String  toString () {
	return " Nome:"+ this.nome + " " +this.idade+ " anos. Seu peso ideal é de  " +pesoideal+ "Kg";
}



}
