package View;

import Model.Conta;
import Model.contaCorrente;
import Model.contaPoupanca;

public class Main {

	public static void main(String[] args) {

		Conta c = new Conta(1000, "Maria", 1);
		contaCorrente cc = new contaCorrente(1000, "Fernanda", 2);
		contaPoupanca cp = new contaPoupanca(1000, "Tulio", 3);

		cc.deposita(430.0);
		cp.deposita(420.0);

		c.atualizar(0.10);
		cc.atualizar(0.10);
		cp.atualizar(0.10);
		System.out.printf("Saldo atual da conta de %s: %.2f%n", c.getTitular(), c.getSaldo());
		System.out.printf("Saldo atual da conta corrente de %s: %.2f%n", cc.getTitular(), cc.getSaldo());
		System.out.printf("Saldo atual da conta poupança de %s: %.2f%n", cp.getTitular(), cp.getSaldo());
	}
}
