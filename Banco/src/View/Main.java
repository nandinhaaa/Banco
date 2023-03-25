package View;

import Model.Conta;
import Model.contaCorrente;
import Model.contaPoupanca;

public class Main {

	public static void main(String[] args) {
		// criando as contas
		Conta c = new Conta(1000);
		contaCorrente cc = new contaCorrente(1000);
		contaPoupanca cp = new contaPoupanca(1000);

		// atualizando as contas
		c.atualizar(0.10);
		cc.atualizar(0.10);
		cp.atualizar(0.10);

		// imprimindo os saldos atualizados com duas casas decimais
		System.out.printf("Saldo da conta: %.2f\n", c.getSaldo());
		System.out.printf("Saldo da conta corrente: %.2f\n", cc.getSaldo());
		System.out.printf("Saldo da conta poupança: %.2f\n", cp.getSaldo());
	}
}
