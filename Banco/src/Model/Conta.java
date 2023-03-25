package Model;

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public void atualizar(double taxaPercentual) {
		this.saldo *= (1 + taxaPercentual / 100);
	}

	public double getSaldo() {
		return this.saldo;
	}
}
