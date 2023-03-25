package Model;

public class contaPoupanca extends Conta {
	public contaPoupanca(double saldo, String titular, int numeroConta) {
		super(saldo, titular, numeroConta);
	}

	@Override
	public void atualizar(double taxaPercentual) {
		super.atualizar(3 * taxaPercentual);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor);
	}
}
