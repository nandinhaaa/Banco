package Model;

public class Conta {
	private double saldo;
	private String titular;

	public Conta(double saldo, String titular, int numeroConta) {
		this.saldo = saldo;
		this.setTitular(titular);
	}

	public void atualizar(double taxaPercentual) {
		this.saldo *= (1 + taxaPercentual / 100);
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

}
