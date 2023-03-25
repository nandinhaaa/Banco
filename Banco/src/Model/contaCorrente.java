package Model;

public class contaCorrente extends Conta {
	public contaCorrente(double saldo, String titular, int numeroConta) {
		super(saldo, titular, numeroConta);
	}

	@Override
	public void atualizar(double taxaPercentual) {
		super.atualizar(2 * taxaPercentual);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor);
	}
}
