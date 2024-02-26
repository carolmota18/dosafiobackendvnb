package vainobanco;

public class Conta {
private String nomeDoTitular;
private String cpf;
private double agencia;
private double conta;

public Conta() {
	
}
public Conta(String nomeDoTitular,String cpf,double agencia,double conta) {
	this.nomeDoTitular = nomeDoTitular;
	this.cpf = cpf;
	this.agencia = agencia;
	this.conta = conta;
}
public String getNomeDoTitular() {
	return nomeDoTitular;
}
public void setNomeDoTitular(String nomeDoTitular) {
	this.nomeDoTitular = nomeDoTitular;
}
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public double getAgencia() {
	return agencia;
}
public void setAgencia(double agencia) {
	this.agencia = agencia;
}
public double getConta() {
	return conta;
}
public void setConta(double conta) {
	this.conta = conta;
}
}
